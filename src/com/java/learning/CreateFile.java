package com.java.learning;

import java.io.File;
import java.io.IOException;




public class CreateFile {

	public static void main(String[] args)  {
		
           try {
        	   File f = new File("C:\\Users\\Akshay Raj\\OneDrive\\Desktop\\bikku.txt");
        		if(f.createNewFile()) {
    				System.out.println("file creted");
    			}
    			else {
    				System.out.println("file already created");
    			}
        	   
           }
			catch(IOException i) {
				System.out.println("Exception handle");
			}
		
		
	

	}

}
