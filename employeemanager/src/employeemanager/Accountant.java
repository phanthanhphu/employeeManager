package employeemanager;

import java.util.Scanner;

public class Accountant extends Staff {
	//tientrach nhiem
   private double responsileWage;
   
	public Accountant() {

}
	public Accountant(String codeStaff, String name, double salary, double responsileWage) {
		super(codeStaff, name, "Accountant", salary);
		this.responsileWage = responsileWage;
		
	
	}

	public double getResponsileWage() {
		return responsileWage;
	}
	public void setResponsileWage(double responsileWage) {
		this.responsileWage = responsileWage;
	}
	public void inputAccountant(Scanner sc) {
		super.inputStaff(sc);
		System.out.print("Input salary bouns:");
		responsileWage = sc.nextDouble();
		setTypeOfEmployee("Accountant");
		sc.nextLine();
	}
	public void outputAccount() {
		super.outputStaff();
		double tatolsalary = getSalary() + responsileWage;
		System.out.printf("responsile wage:%f     total sarary:%f",responsileWage,tatolsalary);
		System.out.printf("\n");
	}
	
	
}
