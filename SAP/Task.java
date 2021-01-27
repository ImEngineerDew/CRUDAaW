package com.toadsdewin.SAP;
import java.util.*;

public class Task 
{
		private String description;
		private String dataStart;
		private String dataEnd;
		private List <UserGeneral> responsibleGuy;
		private String create;
		
		public Task()
		{
			description     = " ";
			dataStart       = "01/01/1999";
			dataEnd         = "31/12/1999";			
			create			= "This task";
			responsibleGuy  =  new ArrayList<UserGeneral>();
		}
		
		public Task (String description, String dataStart, String dataEnd, String create, List <UserGeneral> responsibleGuy)
		{
			this.description    = description;
			this.dataStart      = dataStart;
			this.dataEnd        = dataEnd;
			this.responsibleGuy = responsibleGuy;
			this.create         = create;
		}
		
		/*Put the getters*/		
		public String getDataStart()
		{
			return dataStart;
		}
		public String getDataEnd()
		{
			return dataEnd;
		}
		public String getDescription()
		{
			return description;
		}
		public String getCreate()
		{
			return create;
		}		
		public List<UserGeneral> getResponsibleGuy() 
		{
			return responsibleGuy;
		}

		/*Put the setters*/
		public void setDataStart(String dataStart)
		{
			this.dataStart = dataStart;
		}
		public void setDataEnd(String dataEnd)
		{
			this.dataEnd = dataEnd;
		}
		public void setDescription(String description)
		{
			this.description = description;
		}
		public void setCreate(String create)
		{
			this.create = create;
		}
		public void setResponsibleGuy(List<UserGeneral> responsibleGuy) 
		{
			this.responsibleGuy = responsibleGuy;
		}	
}
