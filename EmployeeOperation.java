package test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeOperation {
	
	ArrayList<Employee> emplyeeArray=new ArrayList<Employee>();
	
	
	public void getUserInput() {
		System.out.println("Enter Your Operation:");
		System.out.println("1.Add new Employee \n2.All Employee Details");
		Scanner scan=new Scanner(System.in);
		SwitchOperation(scan.nextLine()); 
	}

	private void SwitchOperation(String option) {
		
		switch (option) {
		case "1": 
			this.getEmployeeDetails();
			break;
		case "2":
			this.DisplayAllEmployeeDetails();
			break;
		default:
			System.out.println("No option Available ,Please Choose Right one...");
			this.getUserInput();
			break;
		}
		
	}

	private void DisplayAllEmployeeDetails() {
		System.out.println("All "+this.emplyeeArray.size()+" Employee Details are Here...");
		
		for(Employee employee:emplyeeArray) {
			
			System.out.println("/******************************Employee Name:"+employee.getEmployee_name()+"****************************"); 
			System.out.println("Employee Id:"+employee.getEmployee_id());
			System.out.println("Emplyee Age:"+employee.getAge());
			System.out.println("Emplyee Designation:"+employee.getDesignation());
			System.out.println("/**********************************************************************/");
		}
		
		this.getUserInput();
		
		
	}

	private void getEmployeeDetails() {
		Employee newemplyee=new Employee();
		System.out.println("Enter Employee Details");
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter employee name:");
		newemplyee.setEmployee_name(scan.nextLine());
		System.out.println("Enter Age:");
		newemplyee.setAge(scan.nextInt());
		System.out.println("Enter employee Designation:");
		newemplyee.setDesignation(scan.next());
		
		scan.close();
		newemplyee.setEmployee_id(emplyeeArray.size()+1);
		
		
		emplyeeArray.add(newemplyee);
		System.out.println("Employee Registerd successfully...");
		this.getUserInput();
		
	}
	
	
	
}
