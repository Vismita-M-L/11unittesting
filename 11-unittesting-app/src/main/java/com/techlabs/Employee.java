package com.techlabs;

public class Employee {
	private int id;
	private String name;
	private double basic;
	private double hra;
	private double da;
	private double ta;
	
	
	public Employee(int id, String name, double basic, double hra, double da, double ta) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
	}
	


	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getBasic() {
		return basic;
	}



	public void setBasic(double basic) {
		this.basic = basic;
	}



	public double getHra() {
		return hra;
	}



	public void setHra(double hra) {
		this.hra = hra;
	}



	public double getDa() {
		return da;
	}



	public void setDa(double da) {
		this.da = da;
	}



	public double getTa() {
		return ta;
	}



	public void setTa(double ta) {
		this.ta = ta;
	}



	public double CalculateMonthlySalary() {
		 basic=20000;
	
		 
		 hra=(basic*20)/100;
		
		 
		 da=(basic*15)/100;
		 
		 
		 ta=(basic*10)/100;
		  
		   double total = basic+hra+da+ta;
		   return total;
		   
		
		
	}
	public double CalculateYearlySalary() {
		return CalculateMonthlySalary() *12;
		
		
	}

}
