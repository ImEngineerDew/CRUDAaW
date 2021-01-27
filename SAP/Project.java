package com.toadsdewin.SAP;
import java.util.*;

public class Project 
{
		private String nameP;
		private String typeP;
		private String description;
		private Team team;						/*Aggregation variable linked*/
		private List <ProductBacklog> productBacklog;
		private Sprint sprint;	
		
		public Project()
		{
			nameP       = "Office";
			typeP       = "Software Development";
			description = "This is an offimatic suite";
			productBacklog = new ArrayList<ProductBacklog>();
			sprint  = new Sprint();
		}
		public Project (String nameP, String typeP, String description, Team team, List <ProductBacklog> productBacklog, Sprint sprint)
		{		
			this.nameP       	= nameP;
			this.typeP       	= typeP;
			this.description 	= description;
			this.team        	= team;
			this.productBacklog = productBacklog;
			this.sprint      	= sprint;
		}
		
		/*Put the getters*/		
		public String getnameP()
		{
			return nameP;
		}
		public String getTypeP()
		{
			return typeP;
		}
		public String getDescription()
		{
			return description;
		}
		
		/*Put the setters*/
		public void setNameP(String nameP)
		{
			this.nameP = nameP;
		}
		public void setTypeP(String typeP)
		{
			this.typeP = typeP;
		}
		
		/*Getters and setters of the aggregation relation*/
		public Team getTeam() 
		{
			return team;
		}
		public void setTeam(Team team) 
		{
			this.team = team;
		}
		
		/*Put the getters and setters of the composition relation*/		
		public List<ProductBacklog> getProductBacklog() {
			return productBacklog;
		}
		public void setProductBacklog(List<ProductBacklog> productBacklog) {
			this.productBacklog = productBacklog;
		}
		public Sprint getSprint()
		{
			return sprint;
		}		
		public void setSprint(Sprint sprint) {
			this.sprint = sprint;
		}	
		
		public static void main(String[] args) 
		{
			Project nombre = new Project();
			Project tipo   = new Project();
			Team    equipo = new Team();
			ProductBacklog PBL = new ProductBacklog();
			
			UserStory story = new UserStory();
			
			story.setStories("I am the best");
			nombre.setNameP("Office");
			tipo.setTypeP("Software");
			PBL.addUserStory(story);	
			
			System.out.println(story.getStories());
			System.out.println(nombre.getnameP());
			System.out.println(tipo.getTypeP());
			System.out.println(story.getStories());
			System.out.println(equipo.getUser());
			
		}
}
