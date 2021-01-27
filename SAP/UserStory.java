package com.toadsdewin.SAP;

public class UserStory 
{
		private String stories;
		private UserGeneral asignee;
		private UserGeneral reporter;
		
		public UserStory()
		{
			stories = "As a Scrum Master, I want to manage well my team, for reach the objectives";
		}
		public UserStory(String stories, UserGeneral asignee, UserGeneral reporter)
		{
			this.stories  = stories;				
			this.asignee  = asignee;									/*This is the result of the aggregation relationship*/
			this.reporter = reporter;									/*This is the result of the aggregation relationship*/
		}
		
		/*Put the getters and setters of the userStories class*/		
		public String getStories()
		{
			return stories;
		}
		public void setStories(String stories)
		{
			this.stories = stories;
		}	
		
		/*Put the getters and setters of the aggregation relation*/
		public UserGeneral getAsignee() 
		{
			return asignee;
		}
		public UserGeneral getReporter() 
		{
			return reporter;
		}
		public void setAsignee(UserGeneral asignee) 
		{
			this.asignee = asignee;
		}
		public void setReporter(UserGeneral reporter) 
		{
			this.reporter = reporter;
		}
		
}
