package com.toadsdewin.SAP;

import java.util.ArrayList;
import java.util.List;


public class SprintBacklog 
{
		private List <UserStory> removed;
		
		public SprintBacklog()
		{
			removed = new ArrayList<UserStory>(); 			/*Linked the composition relation*/
		}
		
		public SprintBacklog(List <UserStory> removed)
		{
			this.removed = removed;
		}
		
		public List <UserStory> getRemoved()
		{
			return removed;
		}
		
		public void addRemoved(UserStory remove)			/*This statement is used for adding the userStories*/
		{
			removed.add(remove);
		}
		
		public static void main(String[] args)
		{
			SprintBacklog SPRB = new SprintBacklog();
			UserStory	  story= new UserStory();
			
			SPRB.addRemoved(story);
			
			System.out.println("The user story is saved!");
			System.out.println("Story: "+story.getStories());
		}
}