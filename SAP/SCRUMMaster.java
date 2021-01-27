package com.toadsdewin.SAP;

public class SCRUMMaster extends UserGeneral
{
		private String mission;
		
		/*That's a constructor without parameters what uses an super() for calling the parameters
		 * of the userGeneral Class */
		public SCRUMMaster()
		{
			super();
			this.mission = " ";
		}		
		/*That's a constructos with parameters what uses a super(name,surN,age,DNI) for calling
		 * the parameters of the userGeneralClass*/
		public SCRUMMaster (String name, String surN, String age, String DNI, String mission)
		{
			super(name,surN,age,DNI);
			this.mission = mission;			
		}
		/*
		public SCRUMMaster(String mission)
		{
			this.mission = mission;
		}
		*/
		
		/*Put the getters and setters*/		
		public String getSCRUM()
		{
			return mission;
		}
		public void setSCRUM(String mission)
		{
			this.mission = mission;
		}
}