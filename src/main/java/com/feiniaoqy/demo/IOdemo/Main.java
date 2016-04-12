package com.feiniaoqy.demo.IOdemo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*System.out.println("==============readFileByFileReader==================");
		System.out.println(InputStreamTest.readFileByFileReader("src/main/java/resource/readme.txt"));
		System.out.println("==============readFileByInputStream==============");
		try {
			System.out.println(InputStreamTest.readFileByInputStream("src/main/java/resource/readme.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("==============createFile==================");
		System.out.println(InputStreamTest.createFile("F:\\createTest.txt")+"++++如果是ture则创建成功，如果是false则创建失败！！！");*/
		
		System.out.println("==============writeFileByFileWriter之后调用readFileByFileReader==================");
		try {
			OutputStreamTest.writeFileByFileWriter("src/main/java/resource/readme.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(InputStreamTest.readFileByFileReader("src/main/java/resource/readme.txt"));
		
		
		System.out.println("==============writeFileByOutputStream之后调用readFileByFileReader==================");
		OutputStreamTest.writeFileByOutputStream("src/main/java/resource/readme.txt");
		System.out.println(InputStreamTest.readFileByFileReader("src/main/java/resource/readme.txt"));
	}

}
