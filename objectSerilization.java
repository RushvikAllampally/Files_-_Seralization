package file_Input_output;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class objectSerilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("student.txt");
		ArrayList<student> students = new ArrayList<student>();
		students.add(new student("jenny",8.6));
		students.add(new student("krish",7.6));
		students.add(new student("sunil",9.4));
		
		//seriliaze the collection of students
		
		
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream output = new ObjectOutputStream(fo);
			for(student s : students) {
				
				output.writeObject(s);
			
			}
			output.close();
			fo.close();
		
		
		//de serialize file into the collection
	
		FileInputStream fl = new FileInputStream(file);
		ObjectInputStream input = new ObjectInputStream(fl);
		ArrayList<student> students2 = new ArrayList<student>();
		try {
		while(true) {
			
			student s = (student)input.readObject();
			students2.add(s);
		}
		}
		catch(EOFException ex) {
			System.out.println("eof");
		}
		
		for(student s : students2) {
			
			System.out.println(s.getName());
			System.out.println(s.getGPA());
			
		}
		
		
	}

}
