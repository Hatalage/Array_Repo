package com.arrayofobject;

public class Example1of1 {
		
		public static void main(String[] args) {
		       
	        Employee employees[] = new Employee[3];
	        employees[0] = new Employee(100, "Ram", 9000);
	        employees[1] = new Employee(200, "Sham", 60000);
	        employees[2] = new Employee(300, "Dham", 70000);
	        
		
	        for (int i = 0; i < employees.length; i++) {
	            System.out.println("Employee " + (i+1) + ":");
	            System.out.println("ID: " + employees[i].getId());
	            System.out.println("Name: " + employees[i].getName());
	            System.out.println("Salary: " + employees[i].getSalary());
	            System.out.println();
	        
	        }
	            System.out.println("Employees who's salary >10000");
	            for (Employee employee : employees) {
	                if (employee.getSalary() > 10000) {
	                    System.out.println("ID: " + employee.getId());
	                    System.out.println("Name: " + employee.getName());
	                    System.out.println("Salary: " + employee.getSalary());
	                    System.out.println();
	        }
	        }
	    	}
	        }

