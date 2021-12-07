package employeemanager;

import java.util.Scanner;

public class Staff {
   String codeStaff, name, typeOfEmployee;
   double salary;
public Staff(String codeStaff, String name, String typeOfEmployee, double salary) {
	super();
	this.codeStaff = codeStaff;
	this.name = name;
	this.typeOfEmployee = typeOfEmployee;
	this.salary = salary;
}
public String getCodeStaff() {
	return codeStaff;
}
public void setCodeStaff(String codeStaff) {
	this.codeStaff = codeStaff;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTypeOfEmployee() {
	return typeOfEmployee;
}
public void setTypeOfEmployee(String typeOfEmployee) {
	this.typeOfEmployee = typeOfEmployee;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Staff() {
	
}
   public void inputStaff(Scanner sc) {
	   System.out.print("Code staff:");
	   this.codeStaff = sc.nextLine();
	   System.out.print("Name:");
	   this.name = sc.nextLine();
	   System.out.print("Salary:");
	   this.salary = sc.nextDouble();
	   
	   sc.nextLine();
	   
   }
   
   public void outputStaff() {
	   
	   System.out.printf("Code: %-5s name:%-15s type of employee:%-18s salary: %f ", codeStaff, name, typeOfEmployee, salary);
	
	   
   }
  
   

   
}
