package file_Input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class BasicFileIO {

	public static void main(String[] args) {
		
		 File file = new File("test.txt");
		
		 try {
			PrintWriter output = new PrintWriter(file);
			output.println("I am Rushvik");
			output.println(42);
			output.close();			
		} catch (IOException e) {
			System.out.printf("Error %s \n",e);
		}
		 
		Scanner in;
		try {
			in = new Scanner(file);
			String name = in.nextLine();
			int age = in.nextInt();
			
			System.out.println("name: "+name+"\nage: "+age);
		} catch (FileNotFoundException e) {
			System.out.printf("Error %s \n",e);
		
		}
		
		
		
		
		 
		 
	}

}
