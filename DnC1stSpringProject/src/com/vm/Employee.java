package com.vm;
public class Employee {  
	private int id;  
	private String name; 
	private Address address;//Aggregation  


	public Employee() {System.out.println("default cons");}  

	public Employee(int id) {
		System.out.println("integer constructor");
		this.id = id;}  

	public Employee(String name) {  
		this.name = name;
		System.out.println("string constructor");
	}  

	public Employee(int id, String name) {  
		System.out.println("2 param constructor called");
		this.id = id;  
		this.name = name;  
	}  
	
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}

	public void show(){  
		System.out.println(id+" "+name); 
	    System.out.println(address.toString());  

	}  

}  