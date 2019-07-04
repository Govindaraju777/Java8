package com.example.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author govindaraju.v
 *
 */
public class FileReadWrite {
	public static void main(String[] args) {
		//java6BufferReader();
		//java7BufferReader();
		//fileReader();
		
		//readFileUsingScanner();
		
		//Reading the whole file in a List:
		//readFileIntoList();
		
		
		//Write
		writeToFile();
	}

	private static void writeToFile() {
		String myText1 = "Hello";
		String myText2 = "Goutham";
		
		//FileWriter fileWriter;
		//fileWriter = new FileWriter("output.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
			bw.write(myText1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//writer new file. do not append
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
			bw.write(myText2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//append to file
		try(BufferedWriter bw = new BufferedWriter( new FileWriter("output.txt",true) )) {
			bw.write("|"+myText2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("write file to output");
		
	}

	private static void readFileIntoList() {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get("test.txt"), StandardCharsets.UTF_8);
			
			Iterator<String> it = lines.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(lines);
	}

	private static void readFileUsingScanner() {
		File file = new File("test.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void fileReader() {
		try(FileReader fileReader = new FileReader("test.txt")){
			int i;
			while((i=fileReader.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void java6BufferReader() {
		File file = new File("test.txt");
		BufferedReader br = null;
		// Java-6
		try {

			//1.
			/*
			 The Java BufferedReader class (java.io.BufferedReader) provides buffering to your Reader instances. 
			 Buffering can speed up IO quite a bit. Rather than read one character at a time from the network or disk, 
			 	the BufferedReader reads a larger block at a time. This is typically much faster, especially for disk access and larger data amounts.
			 
			 The Java BufferedReader is similar to the BufferedInputStream but they are not exactly the same. 
			 The main difference between BufferedReader and BufferedInputStream is that BufferedReader reads characters (text),
			  whereas the BufferedInputStream reads raw bytes.
 			*/
			
			br = new BufferedReader(new FileReader(file));
			String text = br.readLine();
			System.out.println(text);
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void java7BufferReader() {
		/*
		 This try-with-resources example shows how to open a Java FileInputStream inside a try-with-resources block, 
		 read some data from the FileInputStream, and have the FileInputStream closed automatically 
		 	once execution leaves the try-with-resources block (not explicitly visible).
		*/
//		File file = new File("test.txt");
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt")) ) {
			String line = "";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
