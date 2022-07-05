package com.java.learning;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCreateFile {

	public static void main(String[] args) {
		try {
			FileWriter g =  new FileWriter("C:\\Users\\Akshay Raj\\OneDrive\\Desktop\\javafile.txt");
			try {
				g.write("i m boy");
				g.write("u are boy");
			}
			finally {
				g.close();
			}
			System.out.println("data update");
		}
		catch(IOException i) {
			System.out.println("Exception handling");
		}

	}

}
