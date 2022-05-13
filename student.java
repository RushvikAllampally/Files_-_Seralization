package file_Input_output;

import java.io.Serializable;

public class student implements Serializable{
	
	private String Name;
	private double GPA;
	
	
	public student(String name, double gPA) {
		super();
		Name = name;
		GPA = gPA;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public double getGPA() {
		return GPA;
	}


	public void setGPA(double gPA) {
		GPA = gPA;
	}


	
}
