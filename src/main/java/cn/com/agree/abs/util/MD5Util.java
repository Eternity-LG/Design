package cn.com.agree.abs.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 提供文件与byte[]的MD5运算
 * 
 * @author PuYun &lt;pu.yun@agree.com.cn&gt; 2014年1月24日 上午9:32:33
 * @author lisj
 */
public class MD5Util {
	private MD5Util() {
	}

	public static String md5(File file) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// impossible
			return null;
		}
		byte[] buf = new byte[4096];
		int len;
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));) {
			// 使用流式计算资源文件md5值，避免计算大文件时OOM
			while ((len = bis.read(buf)) > 0) {
				md.update(buf, 0, len);
			}
		} catch (IOException e) {
			return null;
		}
		byte[] result = md.digest();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			String s = Integer.toHexString(0xff & result[i]);
			if (s.length() < 2) {
				sb.append('0');
			}
			sb.append(s);
		}
		return sb.toString();
	}

	public static String md5(byte[] content) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// impossible
			return null;
		}
		byte[] result = md.digest(content);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			String s = Integer.toHexString(0xff & result[i]);
			if (s.length() < 2) {
				sb.append('0');
			}
			sb.append(s);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		File file1 = new File("C:\\Users\\123\\Desktop\\https\\keystore");
		File file2 = new File("C:\\Users\\123\\Desktop\\https\\test\\keystore");
		File file3 = new File("C:\\Users\\123\\Desktop\\http\\keystore");
		String s = MD5Util.md5(file1);
		String s1 = MD5Util.md5(file2);
		String s2 = MD5Util.md5(file3);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}
