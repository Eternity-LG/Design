package cn.com.agree.abs.wsdlCache;

import java.util.Scanner;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-12-06 14:18
 */
public class test {
    private static final String OPERATION_EXIT = "EXIT";

    public static void main(String[] args) {


        try {
            for (int i = 1000000; i > 0; i--) {
                Utils.getDefinition(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("请开始您的输入，EXIT/E 退出");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String in = scan.next();
            if (OPERATION_EXIT.equalsIgnoreCase(in) || OPERATION_EXIT.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("您成功已退出！");
                break;
            }
            System.out.println("您输入的值：" + in);
        }
    }
}
