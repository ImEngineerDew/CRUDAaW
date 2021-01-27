package com.toadsdewin.SAP;

public class UserGeneral 
{
	private String name;					/*Atributes of the userGeneral class*/
	private String surN;
	private String age;
	private String DNI;
	
	/*Constructor without parameters*/
	public UserGeneral()
	{
		this.name = "John";
		this.surN = "Doe";
		this.age  = "35";
		this.DNI  = "1123456789";
	}
	
	/*Constructor with parameters*/
	public UserGeneral(String name, String surN, String age, String DNI)
	{
		this.name = name;
		this.surN = surN;
		this.age  = age;
		this.DNI  = DNI;
	}
	
	/*Setters*/
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSurN(String surN)
	{
		this.surN = surN;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public void setDNI(String DNI)
	{
		this.DNI = DNI;
	}
		
	/*Getters*/
	public String getName()
	{
		return name;
	}
	public String getSurN()
	{
		return surN;
	}
	public String getAge()
	{
		return age;
	}
	public String getDNI()
	{
		return DNI;
	}
}
	/***********************************************
	public static void main(String[] args)
	{
			UserGeneral name = new UserGeneral();
			UserGeneral surn = new UserGeneral();
			UserGeneral age  = new UserGeneral();
			UserGeneral dni	 = new UserGeneral();
			
			System.out.println(name.getName());
			System.out.println(surn.getSurN());
			System.out.println(age.getAge());
			System.out.println(dni.getDNI());
	}
}
	*************************************************/