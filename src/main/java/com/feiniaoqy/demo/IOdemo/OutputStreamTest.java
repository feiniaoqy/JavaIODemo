package com.feiniaoqy.demo.IOdemo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {
	/**
	 * 向文件写入数据通过FileWriter
	 * @param fileName
	 * @throws IOException
	 */
	public static void writeFileByFileWriter(String fileName) throws IOException{
		String s = "\n我就是来捣乱的，你能怎么着，嘿嘿！！！！！！\n";
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));//设置true时,想文件插入的数据，是在原有的数据之后添加
		bw.write(s);
		bw.flush();
		bw.close();
	}
	/**
	 * 向文件写入数据通过FileOutputStream
	 * @param fileName
	 */
	public static void writeFileByOutputStream(String fileName){
		String s = "\n我不该来捣乱，我错啦，呜呜呜~~~~~\n";
		byte[] bs = s.getBytes();
		try {
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(fileName,true)));
			bw.write(s);
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*try {
			FileOutputStream fos = new FileOutputStream(fileName);
			fos.write(bs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
