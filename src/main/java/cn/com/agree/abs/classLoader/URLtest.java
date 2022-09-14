package cn.com.agree.abs.classLoader;

import cn.com.agree.abs.json.JsonTest;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
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
    private static Map map= new HashMap();
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(0);
        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(80);
        scheduledExecutorService.schedule(() -> {
            while (true) {
                loadClass(i);
            }
        },1,TimeUnit.SECONDS);
    }

    private static void loadClass(AtomicInteger i) {
        try {
            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{ new File("D:\\IdeaWorkSpace\\Design\\src\\main\\java\\cn\\com\\agree\\abs\\design\\create").toURI().toURL()}, Thread.currentThread().getContextClassLoader());
            final Class<?> aClass = urlClassLoader.loadClass("cn.com.agree.abs.json.JsonTest");
            map.put(aClass.toString(), aClass.getClassLoader());
            JsonTest o = (JsonTest) aClass.newInstance();
            TimeUnit.MILLISECONDS.sleep(100);
            o.sout(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
