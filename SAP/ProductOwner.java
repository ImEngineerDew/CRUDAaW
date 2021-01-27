package com.toadsdewin.SAP;

public class ProductOwner extends UserGeneral
{
		private String  nameCompany;
		private String 	phoneCompany;
		private String  addressCompany;
		
		/*That's a constructor without parameters what uses an super() for calling the parameters
		 * of the userGeneral Class */
		public ProductOwner()
		{
			super();
			this.nameCompany    = " ";
			this.phoneCompany   = " ";
			this.addressCompany = " ";
		}
		
		/*That's a constructor with parameters what uses a super(name,surN,age,DNI) for calling
		 * the parameters of the userGeneralClass*/
		public ProductOwner(String name, String surN, String age, String DNI, String nameCompany, String phoneCompany, String addressCompany)
		{
			super(name,surN,age,DNI);
			this.nameCompany    = nameCompany;
			this.phoneCompany   = phoneCompany;
			this.addressCompany = addressCompany;
		}
		
		/*
		public ProductOwner(String nameCompany, String phoneCompany, String addressCompany)
		{
			this.nameCompany    = nameCompany;
			this.phoneCompany   = phoneCompany;
			this.addressCompany = addressCompany; 
		}
		*/
		
		/*Put the getters*/		
		public String getNComp()
		{
			return nameCompany;
		}
		public String getPhComp()
		{
			return phoneCompany;
		}
		public String getAdComp()
		{
			return addressCompany;
		}
		
		/*Put the setters*/
		public void setNComp(String nameCompany)
		{
			this.nameCompany = nameCompany;
		}
		public void setPhComp(String phoneCompany)
		{
			this.phoneCompany = phoneCompany;
		}
		public void setAdComp(String addressCompany)
		{
			this.addressCompany = addressCompany;
		}
}