package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			
			File file=new File("E:\\Users\\Phoenix\\6jun\\employee'"+i+"'");
			file.delete();
//			try {
//				if(file.createNewFile()) {
//					System.out.println("File Created");
//				}else {
//					System.out.println("File Is Alrady Exist");
//				}
//				
//			}catch(IOException e) {
//				
//				System.out.println(e.getMessage());
//			}
		}
	}
}
