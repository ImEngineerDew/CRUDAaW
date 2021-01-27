package com.toadsdewin.SAP;
import java.util.ArrayList;
import java.util.*;

public class Team 
{
	private ArrayList <UserGeneral> userList;
	private Developer    developer;					/*Aggregation variable linked*/
	private ProductOwner productOwner;				/*Aggregation variable linked*/
	private SCRUMMaster  scrumGuy;					/*Aggregation variable linked*/
	
	public Team()
	{
		userList = new ArrayList<UserGeneral>();
	}
	/*The last two parameters are the objects of the Developer, Product	owner and SCRUM Master class*/
	public Team(ArrayList <UserGeneral> userList, Developer developer, ProductOwner productOwner, SCRUMMaster scrumGuy)	
	{
		this.userList     = userList;	
		this.productOwner = productOwner;
		this.developer    = developer;
		this.scrumGuy     = scrumGuy;
	}	
	public List <UserGeneral> getUser()
	{
		return userList;
	}
	public void setUser(ArrayList<UserGeneral> userList)
	{
		this.userList = userList;
	}
	
	/*Getters and setters of the aggregation variables*/
	public Developer getDeveloper() 
	{
		return developer;
	}
	public ProductOwner getProductOwner() 
	{
		return productOwner;
	}
	public SCRUMMaster getSCRUMMaster()
	{
		return scrumGuy;
	}
	public void setDeveloper(Developer developer) 
	{
		this.developer = developer;
	}
	public void setProductOwner(ProductOwner productOwner)
	{
		this.productOwner = productOwner;
	}
	public void setSCRUMMaster (SCRUMMaster scrumGuy)
	{
		this.scrumGuy = scrumGuy;
	}
	
	public static void main(String[] args) 
	{
	    ArrayList <UserGeneral> listado = new ArrayList<UserGeneral>();		
	    
		ArrayList <Developer>    desarrollador = new ArrayList<Developer>();
		ArrayList <ProductOwner> productOwner  = new ArrayList<ProductOwner>();
				
		desarrollador.add(new Developer("John", "Doe", "27", "121890542", "Java", "555-12345"));
		desarrollador.add(new Developer("Jane", "Doe", "27", "123434567", "Python", "555-43251"));
		
		productOwner.add(new ProductOwner("Dewin", "Acosta", "27", "1121890XXX", "SAP", "1-5803030", "Carrera 9 # 115-4"));
		
		System.out.println("List of the SCRUM TEAM: ");
		System.out.println();
		for(Developer dev:	desarrollador)
		{
			
			System.out.println("Name: "+dev.getName()+" Surname: "+dev.getSurN()+" Age: "+dev.getAge()+" Phone: "+dev.getPhoneDev());
		}
		
	}
}
