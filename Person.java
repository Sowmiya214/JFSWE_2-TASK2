package com.java.JFSWE_2.Task2;

import java.util.Scanner;

public class Person {
	String name;
	final int age = 18;
	
	public void getPersonDetails(String n,int a) {
		this.name=n;
	}
	public void display() {
		System.out.println("NAME: "+name + '\n'+"AGE: "+age);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter your Name and Age");
		p.getPersonDetails(sc.next(), sc.nextInt());
		p.display();
	}

}
