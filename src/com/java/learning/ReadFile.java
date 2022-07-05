package com.java.learning;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {

		try {
			FileReader h =  new FileReader("C:\\Users\\Akshay Raj\\OneDrive\\Desktop\\javafile.txt");
			try {
				 int i;
				 while ((i = h.read())!= -1) {
					 
					 System.out.print((char)i);
				 }
			}
			finally {
				h.close();
				System.out.print(" file has closed");
			}
			
		}
		catch(IOException e) {
			System.out.println("Exception handling");
			
		}

	}

}
