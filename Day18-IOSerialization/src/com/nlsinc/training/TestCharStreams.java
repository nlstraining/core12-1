package com.nlsinc.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestCharStreams {

	public static void main(String[] args) throws FileNotFoundException,IOException {
        // (char)
		/*//1 reading data from a string array and writing to a file.
		try(FileWriter writer = new FileWriter("sample.txt",true)){
			//1. creates if doesnot exist
			//2. if exists it overwrites the contents
			
			String words = "An apple a day keeps the Doctor away";
			String[] wordsArray = words.split(" ");
			for(String word: wordsArray)
				writer.write(word);
			
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
*/
		//2 reading data from a file and writing to a file - copying files
		/*// FileReader/Writer - read and write one byte or char at a time n*n trips to file system
				try(FileWriter writer = new FileWriter("sample.txt"); 
						FileReader reader = 
						new FileReader("C:\\Users\\Anil\\workspace\\night12_1\\Day18-IOSerialization\\source.txt")){
					 int data = reader.read();
					 while( data != -1){
						       writer.write(data);
						       data = reader.read();
						 
					 }
					
					
				}catch(IOException e){
					
					e.printStackTrace();
				}

*/       
		//3. Buffered streams for efficiency FileReader/Writer - read and write one byte or char at a time n*n trips to file system
	/*	try(BufferedWriter buffWriter = new BufferedWriter(new FileWriter("sample.txt",true)); 
				BufferedReader reader = new BufferedReader( 
				new FileReader("C:\\Users\\Anil\\workspace\\night12_1\\Day18-IOSerialization\\source.txt"))){
			 String data = reader.readLine();
			 while( data != null){
				       buffWriter.write(data);
				       data = reader.readLine();
			 }
		
		}catch(IOException e){
			
			e.printStackTrace();
		}
*/
		//4 writing an object to a file  ObjectOutputStream
		 Employee emp = new Employee(101,"John Doe");
		 
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
		 oos.writeObject(emp);
		 oos.close();
		 
		 
		 
	}

}
