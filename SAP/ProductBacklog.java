package com.toadsdewin.SAP;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class ProductBacklog 
{
	private List <UserStory> userStoriesList;
	
	public ProductBacklog()
	{
		userStoriesList = new  ArrayList<UserStory>();			/*Linked the composition relation*/  
	}
	public ProductBacklog(List <UserStory> userStoriesList )
	{ 
		this.userStoriesList = userStoriesList;
	}
	
	/*Getters and Setters about the composition relation*/
	public List <UserStory> getUserStoriesList()
	{
		return userStoriesList;
	}	
	public void addUserStory(UserStory userStory)			/*This statement is used for adding the userStories*/
	{
		userStoriesList.add(userStory);
	}
	
	
	public static void main(String[] args) 
	{
		ProductBacklog PBL = new ProductBacklog();		
		UserStory story = new UserStory();		
		Scanner history = new Scanner(System.in);		
		String historia= " ";

		System.out.println("What's your role on that enterprise?:");
		historia = history.nextLine();
		
		story.setStories(historia);
				
		PBL.addUserStory(story);
		
		System.out.println(story.getStories());		
		
		history.close();
	}

}