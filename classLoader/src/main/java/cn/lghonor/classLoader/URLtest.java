package cn.lghonor.classLoader;

import sun.misc.ClassLoaderUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liugeng
 * @description TODO
 * @date 2022-09-05 17:45
 */
public class URLtest {

    static Object jarTestInstance = null;
    static ClassLoader myClassLoader1;
    static Class<?> jarTest;
    static Class<?> jarTest2;

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        AtomicInteger i = new AtomicInteger(0);
        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(80);
//        scheduledExecutorService.schedule(() -> {
//            while (true) {
//                loadClass(i);
//            }
//        },1,TimeUnit.SECONDS);

        while (true){
            System.out.println("befor laod jar");
            run();
            System.out.println("laod jar");
            loadJar();
            System.out.println("after load jar");
            loadClassAndRun();
            System.out.println("start unload jar");
//        unLoad2();
            System.out.println("after unload jar");
            run();
            System.out.println("laod jar");
            loadJar();
            System.out.println("after load jar");
            loadClassAndRun();
        }
    }

    private static void loadClassAndRun() {
        if (myClassLoader1 == null) {
            myClassLoader1 = URLtest.class.getClassLoader();
        }
        try {
            jarTest = myClassLoader1.loadClass("cn.lghonor.classLoader.JarLoaderTest");
//            jarTest2 = myClassLoader1.loadClass("com.alibaba.fastjson.JSON");
//            final Object o = jarTest2.newInstance();
            jarTestInstance = jarTest.newInstance();
            for (Method method : jarTest.getMethods()) {
                try {
                    method.invoke(jarTestInstance);
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void run() {
        try {
            jarTest = myClassLoader1.loadClass("cn.lghonor.classLoader.JarLoaderTest");
            jarTestInstance = jarTest.newInstance();
            for (Method method : jarTest.getMethods()) {
                try {
                    method.invoke(jarTestInstance);
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void loadJar() throws MalformedURLException {
        final URL[] urls = new URL[5];
        urls[0] = new File("D:\\IdeaWorkSpace\\Design\\out\\artifacts\\Design_classLoader_jar\\fastjson-1.2.83.jar").toURI().toURL();
        urls[1] = new File("D:\\IdeaWorkSpace\\Design\\out\\artifacts\\Design_classLoader_jar\\mybatis-3.5.5.jar").toURI().toURL();
        urls[2] = new File("D:\\IdeaWorkSpace\\Design\\out\\artifacts\\Design_classLoader_jar\\redisson-3.11.2.jar").toURI().toURL();
        urls[3] = new File("D:\\IdeaWorkSpace\\Design\\out\\artifacts\\Design_classLoader_jar\\mysql-connector-java-8.0.27.jar").toURI().toURL();
        urls[4] = new File("D:\\IdeaWorkSpace\\Design\\out\\artifacts\\Design_classLoader_jar\\Design.classLoader.jar").toURI().toURL();
        myClassLoader1 = new URLClassLoader(urls);
    }

    // 卸载jar包的代码如下：
    public static void unLoad() {

        if (null != myClassLoader1 && myClassLoader1 instanceof URLClassLoader) {
            System.out.println("unload URLClassLoader ");
            URLClassLoader loader = (URLClassLoader) myClassLoader1;
            try {
                // 关注下这里，这里一会儿要改
                ClassLoaderUtil.releaseLoader(loader);
                loader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void unLoad2() {
        if (null != myClassLoader1 && myClassLoader1 instanceof URLClassLoader) {
            System.out.println("unload URLClassLoader ");
            URLClassLoader loader = (URLClassLoader) myClassLoader1;
            try {
                jarTest = null;
                jarTestInstance = null;
                myClassLoader1 = null;
                System.gc();
//                Thread.sleep(2000);
                ClassLoaderUtil.releaseLoader(loader);
                loader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void loadClass(AtomicInteger i) {
        try {
            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new File("D:\\IdeaWorkSpace\\Design\\out\\artifacts\\Design_classLoader_jar").toURI().toURL()}, Thread.currentThread().getContextClassLoader());
            final Class<?> aClass = urlClassLoader.loadClass("cn.lghonor.classLoader.JarLoaderTest");
            JarLoaderTest o = (JarLoaderTest) aClass.newInstance();
            TimeUnit.MILLISECONDS.sleep(100);
            o.run1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
