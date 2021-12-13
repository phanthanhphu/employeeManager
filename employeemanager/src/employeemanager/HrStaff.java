package employeemanager;

import java.util.Scanner;

public class HrStaff extends Staff {
	private double salaryBouns;
	public HrStaff(String codeStaff, String name,  double salary, double salaryBonus) {
		super(codeStaff, name, "HR Staff", salary);
		this.salaryBouns= salaryBonus;
		
	}
	public double getSalaryBouns() {
		return salaryBouns;
	}
	public void setSalaryBouns(double salaryBouns) {
		this.salaryBouns = salaryBouns;
	}
	public HrStaff() {
	
	}
	public void inputHrStaff(Scanner sc) {
		super.inputStaff(sc);
		System.out.print("Input salary bouns:");
		salaryBouns = sc.nextDouble();
		setTypeOfEmployee("HR Staff");
		sc.nextLine();
	}
	public void outputHr() {
		super.outputStaff();
		double sumsalary = getSalary() + salaryBouns;
		System.out.printf("salary bouns: %f        total salary: %f",salaryBouns, sumsalary);
	}

	
}
