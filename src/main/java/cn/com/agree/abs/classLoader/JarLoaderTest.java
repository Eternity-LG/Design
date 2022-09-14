package cn.com.agree.abs.classLoader;

public class JarLoaderTest {
    static {
        System.out.println("I am JarTest's static code");
    }

    public static void run() {
        System.out.println("I am JarTest's static method");
    }

    public void run1() {
        System.out.println("I am JarTest's  method>>>" + this);
    }
}
