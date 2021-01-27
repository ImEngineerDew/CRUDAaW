package com.toadsdewin.SAP;

public class Developer extends UserGeneral
{
	private String languageRequired;
	private String phoneDeveloper;
	
	public Developer()
	{
		super();
		this.languageRequired = " ";
		this.phoneDeveloper   = " ";
	}
	public Developer(String name, String surN, String age, String DNI, String languageRequired, String phoneDeveloper) 
	{
		super(name,surN,age,DNI);
		this.languageRequired = languageRequired;
		this.phoneDeveloper   = phoneDeveloper;
	}
	/*
	public Developer(String languageRequired, String phoneDeveloper)
	{
		this.languageRequired = languageRequired;
		this.phoneDeveloper   = phoneDeveloper;
	}
	*/
	/*Getters*/
	public String getPhoneDev()
	{
		return phoneDeveloper;
	}
	public String getLanguage()
	{
		return languageRequired;
	}
	
	/*Setters*/
	public void setPhoneDev(String phoneDeveloper)
	{
		this.phoneDeveloper = phoneDeveloper;
	}
	public void setLanguage(String languageRequired)
	{
		this.languageRequired = languageRequired;
	}	
}