package com.java.JFSWE_2.Task2;

import java.util.Scanner;

public class Product {
	double pid;
	int price;
	int quantity;
	
	public Product(double p,int pr,int q) {
		this.pid=p;
		this.price=pr;
		this.quantity=q;
	}	
	
	public static class findProductWithHighestPrice {
		public double found(Product prod[]) {
			double heighestPrice = Double.MIN_VALUE;
			double productPid = -1;
			for(int i=0;i<prod.length;i++) {
				if(prod[i].price > heighestPrice) {
					heighestPrice = prod[i].price;
					productPid = prod[i].pid;
				}
			}
			return productPid;
		}
	}
	
	public static class XYZ{
		public double display(Product prod[]) {
			double total = 0;
			for(int i=0;i<prod.length;i++) {
				double singleProduct =prod[i].price * prod[i].quantity;
				total+=singleProduct;
			}
			return total;
		}
	}	
	
	public static void main(String[] args) {	
		Scanner obj = new Scanner(System.in);
		//we are saving each product information
		Product[] prod = new Product[5];
		for(int i=0;i<prod.length;i++){
			System.out.println("enter the pid");
			double pid = obj.nextDouble();
			System.out.println("enter the price");
			int price = obj.nextInt();
			System.out.println("enter the quantity");
			int quantity = obj.nextInt();
			prod[i] = new Product(pid,price,quantity);
		}
		for(int i=0;i<prod.length;i++) {
            System.out.println(" PID=" + prod[i].pid + ", Price=" + prod[i].price + ", Quantity=" + prod[i].quantity);
		}
		// find highest product price
		findProductWithHighestPrice fh = new findProductWithHighestPrice();
		double highestResult = fh.found(prod);
		System.out.println("Highest price of pid: "+highestResult);
		
		//find the single product
		XYZ xyz = new XYZ();
		double result = xyz.display(prod);
		System.out.println("single product: "+result);
		
	}
}
	
	



