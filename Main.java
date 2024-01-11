package com.java.JFSWE_2.Task2;

public class Main {
	protected String name;
	protected int age;

	// Constructor for Main class
	public Main(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Display method for Main class
	public void displayPerson() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

class Employee extends Main {
	private int employeeID;
	private double salary;

	// Constructor for Employee class using super to initialize Main attributes
	public Employee(String name, int age, int employeeID, double salary) {
		super(name, age);
		this.employeeID = employeeID;
		this.salary = salary;
	}

	// Display method for Employee class
	public void displayEmployee() {
		// Using displayPerson method from the base class
		displayPerson();
		System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("John Doe", 30, 1001, 50000.0);
		employee.displayEmployee();

	}

}
