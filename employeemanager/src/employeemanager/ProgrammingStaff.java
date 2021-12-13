package employeemanager;

import java.util.Scanner;

public class ProgrammingStaff extends Staff {
    private double yearOfExperience;
	public ProgrammingStaff() {
	
	}
	public Double getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(double yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public ProgrammingStaff(String codeStaff, String name, double salary,  double yearOfExperience) {
		super(codeStaff, name, "Programming Staff", salary);
		
		this.yearOfExperience = yearOfExperience;
		
	}

	public void inputProgrammingStaff(Scanner sc) {
		super.inputStaff(sc);
		System.out.print("Input year of experience:");
		yearOfExperience = sc.nextDouble();
		setTypeOfEmployee("Programming Staff");
		sc.nextLine();
		
	}
	public void outputProgrammingStaff() {
		double Sumraly = 0;
		if(yearOfExperience > 2) {
			Sumraly = getSalary()* 1.5;
		}else {
			Sumraly = getSalary();
		}
		super.outputStaff();
	
		
		System.out.printf("year of experience: %f total salary: %f ", yearOfExperience, Sumraly);
		System.out.printf("\n");
	}

}
