package cn.com.agree.abs.string2other;

import java.nio.charset.StandardCharsets;

/**
 * @author liugeng
 * @description TODO
 * @date 2022-08-25 16:49
 */
public class String2Bytes {
    public static void main(String[] args) {
        String var1 = "asdfgh";
        final int length = var1.getBytes().length;
        System.out.println(var1.getBytes(StandardCharsets.UTF_8).toString());
        System.out.println(length);

        System.out.println("1、以下测试>:");
        int a = 1, b = 2;
        System.out.println(a > b);
        System.out.println("\n2、以下测试>>:");
        System.out.println("15 >> 2 = " + (15 >> 2));
        System.out.println("\n3、以下测试>>>:");
        for (int i = 0; i < 1; i++){
            final byte b1 = (byte) (length >>> 24 - i * 8);
            final double v = Math.pow(2, 0);
            System.out.println(6>>>24);
            System.out.println(6>>>16);
            System.out.println(6>>>8);
            System.out.println(6>>>0);
            System.out.println(6/Math.pow(2, 0));
        }
    }
}