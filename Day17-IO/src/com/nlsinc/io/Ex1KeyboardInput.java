package com.nlsinc.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex1KeyboardInput {

	public static void main(String[] args) {
		// 1. read from keyboard
		
/*		InputStream is = System.in;
		int data = is.read();
		System.out.println(data);
*/
		
		//2. reading a word or line or sentence from keyboard
		
	/*	DataInputStream dis = new DataInputStream(System.in);
		@Deprecated
		@SuppressWarnings("deprecation")
		String line = dis.readLine();
		int lines=1;
		while(lines <=5){
			 
		System.out.println("You have entered>>"+ line);
        if(lines !=5){
		line = dis.readLine();
		 lines++;
		}else
		{
			break;
			}
		}
		*/
		// 3 read from a file and print on console
		// the following try with - it means we need not close the stream explicitly
		 try(FileInputStream fis = new FileInputStream("C:\\Users\\Anil\\workspace\\night12_1\\Day17-IO\\src\\com\\nlsinc\\io\\Shape.java")){
		// for byte streams the eof is -1
		int data =fis.read();
		 while(data !=-1){
			 
			      System.out.print((char)data);
                   data = fis.read();			 
		 }
		 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}		
		
	}

}
