package com.toadsdewin.SAP;
import java.util.*;


public class Sprint 
{
		private List <SprintBacklog> sprintB;									/*Defined like a private access for the composition relation*/
		private Milestone milestones;
		
		public Sprint()
		{
			sprintB = new ArrayList<SprintBacklog>();							/*Linked as a composition relation*/
			milestones = new Milestone();
		}
		public Sprint(List <SprintBacklog> sprintB, Milestone milestones)
		{
			this.sprintB    = sprintB;
			this.milestones = milestones;
		}
		
		/*Getters and setters about the composition relation*/
		public List <SprintBacklog> getSprint() 
		{
			return sprintB;
		}
		public Milestone getMilestone()
		{
			return milestones;
		}
		public void setSprint(List <SprintBacklog> sprintB)
		{
			this.sprintB = sprintB;
		}
		public void setMilestone(Milestone milestones)
		{
			this.milestones = milestones;
		}	
}