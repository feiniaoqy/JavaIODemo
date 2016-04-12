package com.feiniaoqy.demo.IOdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 读取文件中的数据
 * @author asus
 *
 */
public class InputStreamTest {
	
	/**
	 * 读入文件中的数据通过FileReader()
	 * @param fileName 路径+文件名
	 * @return
	 */
	public static String readFileByFileReader(String fileName){
		StringBuffer sb = new StringBuffer();
		String s = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while((s=br.readLine())!=null){
				sb.append(s+"\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件查找异常！！！");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("读取数据字符流出现异常！！！");
			e.printStackTrace();
		}
		return sb.toString();
	}
	/**
	 * 读入文件中的数据通过FileInputStream()
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static String readFileByInputStream(String fileName) throws IOException{
		StringBuffer sb = new StringBuffer();
		String s = "";
		BufferedReader  br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(fileName),"utf-8"));
		while((s=br.readLine())!=null){
			sb.append(s+"\n");
		}
		return sb.toString();
	}
	/**
	 * 创建文件
	 * @param fileName
	 * @return
	 */
	public static boolean createFile(String fileName){
		File f = new File(fileName);
		if(!f.exists()){
			f.mkdirs();
		}
		boolean b = f.exists();
		return b;
	}
}
