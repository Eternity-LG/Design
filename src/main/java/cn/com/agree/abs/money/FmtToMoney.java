package cn.com.agree.abs.money;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author liugeng
 * @description TODO
 * @date 2022-01-19 10:36
 */
public class FmtToMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请准备输入金额");
//        String next = scanner.next();
        byte[] bytes = fmtMoneyToInt("1000".getBytes(), "");
        System.out.println(bytes);
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(s);

    }

    public static byte[] fmtIntToMoney(byte bInt[], String params) {
        if ("".equals(params)||"0".equals(params)){
            return bInt;
        }
        int len = bInt.length;
        int comon = Integer.parseInt(params);
        byte[] bt = null;
        //金额为负数，且金额数加小数点后无整数位
        if (bInt[0] == 45 && len <= comon+1) {
            bt = new byte[comon+1 + 2];
            int NewLen = bt.length;
            bt[0] = 45;
            bt[1] = 48;
            bt[2] = 46;
            for (int i = 3, j = 1; i <= comon+2; i++) {
                if ((len - 1) >= (NewLen - i)) {
                    bt[i] = bInt[j];
                    j++;
                } else {
                    bt[i] = 48;
                }
            }
            //金额数为正数，但是金额加小数点后无整数
        } else if (len <= comon) {
            bt = new byte[comon+2];
            int NewLen = bt.length;
            bt[0] = 48;
            bt[1] = 46;
            for (int i = 2, j = 0; i <= NewLen-1; i++) {
                if (len >= (NewLen - i)) {
                    bt[i] = bInt[j];
                    j++;
                } else {
                    bt[i] = 48;
                }
            }
        } else {
            bt = new byte[len + 1];
            for (int i = len, j = len - 1; i >= 0; i--, j--) {
                if (i == len - comon) {
                    bt[i] = 46;
                    j++;
                } else {
                    bt[i] = bInt[j];
                }
            }
        }
        return bt;
    }

    public static byte[] fmtMoneyToInt(byte bInt[], String params) {
        int len = bInt.length;
        byte[] bt = null;
        int i = 0;
        for (i = 0; i < len - 1; i++) {
            if (bInt[i] != 48 && bInt[i] != 45 && bInt[i] != 46)
                break;
        }
        // System.out.println("len=" + len);
        // System.out.println("i=" + i);
        //当前金额为  “-0.xx”
        if (bInt[0] == 45 && bInt[1] == 48) {
            bt = new byte[len - i + 1];
            bt[0] = 45;
            for (int j = 1, k = i; j < bt.length; j++, k++) {
                if (bInt[k] != 46) {
                    bt[j] = bInt[k];
                } else {
                    j--;
                }
            }
            //当前金额为  “-xx.xx”
        } else if (bInt[0] == 45 && bInt[1] != 48) {
            bt = new byte[len - i];
            bt[0] = 45;
            for (int j = 1, k = i; j < bt.length; j++, k++) {
                if (bInt[k] != 46) {
                    bt[j] = bInt[k];
                } else {
                    j--;
                }
            }
            //当前金额为 0.xx
        } else if (bInt[0] == 48) {
            bt = new byte[len - i];
            for (int j = 0, k = i; j < bt.length; j++, k++) {
                if (bInt[k] != 46) {
                    bt[j] = bInt[k];
                } else {
                    j--;
                }
            }
            //金额类型为 “xx.xx”
        } else {
            bt = new byte[len - i - 1];
            for (int j = 0, k = i; j < bt.length; j++, k++) {
                if (bInt[k] != 46) {
                    bt[j] = bInt[k];
                } else {
                    j--;
                }
            }
        }
        return bt;
    }
}
