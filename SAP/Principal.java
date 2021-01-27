package com.toadsdewin.SAP;
import java.util.*;

public class Principal 
{
	/******The main of the program*******/
	public static void main(String[] args) 
	{
		int tipoEmpleado;
		int sizeDev=0;
				
		Scanner readData = new Scanner (System.in);			/*Reading the data while's typing on the keyboard*/
		Scanner opcion   = new Scanner (System.in);			/*That line can choose the case into the switch*/
		Scanner tamanho  = new Scanner (System.in);			/*Those bit of code can define the array size*/	
		Scanner findData = new Scanner (System.in);			/*That issue is used only by the position of the array, to edit the developers quantity*/
		
		boolean salir = false;		
		
		UserStory    storiesPRO  = new UserStory();
		UserStory    storiesDEV[]  = new UserStory[sizeDev];
		UserStory    storiesSCM  = new UserStory();
		
		ProductOwner usersPro    = new ProductOwner();  		/*Heritage of the userGeneral class, with the ProductOwner class*/
		SCRUMMaster  userSCRUM[] = new SCRUMMaster[1];		    /*Heritage of the userGeneral class, with the SCRUMMaster class*/
		Developer    usersDev[]  = new Developer[sizeDev];      /*Heritage of the userGeneral class, with the Developer class*/
				
		ProductBacklog PBL = new ProductBacklog();
		
		String nombre   = " ";
		String apellido = " ";
		String edad     = " ";
		String cedula   = " ";
		
		String companhia = " ";
		String telefono  = " ";
		String direccion = " ";
		
		String lenguajeProg = " ";
		String telefonoProg = " ";	
		
		String objetivo= " ";
		String historia= " ";
		
		while(salir != true)
		{
		System.out.println("Welcome to the agile management projects system! ");
		System.out.println();
		System.out.println("Select the options 1, 2, and 3 for create the roles");
		System.out.println();
		System.out.println("1. Product owner ");
		System.out.println("2. Developer ");
		System.out.println("3. Scrum master");
		System.out.println("4. View");
		System.out.println("5. Edit");
		System.out.println("6. Delete");
		System.out.println("7. Show the product backlog");
		System.out.println("8. Exit!");
		System.out.println();
		System.out.print("Please choose an option!: ");
	
		tipoEmpleado = opcion.nextInt();		
				
		switch (tipoEmpleado)
		{	
			/*This issue is about of the Product owner*/
			case 1:				
			System.out.print("You're been selected as Product Owner, please type your data!: ");
			System.out.println();
			System.out.print("Type your name: ");         													nombre   = readData.nextLine();
			System.out.print("Type your surname: ");      													apellido = readData.nextLine();
			System.out.print("Type your age: ");		  													edad     = readData.nextLine();
			System.out.print("Type your DNI: ");		  													cedula   = readData.nextLine();
				
			System.out.print("Type your company: ");      													companhia = readData.nextLine();
			System.out.print("Type your phone comp: ");   													telefono  = readData.nextLine();
			System.out.print("Type your address: ");	  													direccion = readData.nextLine();
				
			usersPro = new ProductOwner(nombre, apellido, edad, cedula, companhia, telefono, direccion);			/*Applying the heritage*/			
						
			System.out.println("Please write the user story: ");											historia = readData.nextLine();
			System.out.println("Data saved!");																storiesPRO.setStories(historia);			
			System.out.println();																			PBL.addUserStory(storiesPRO);
			break;																	
			
			/*This issue is about of the Developer role*/
			case 2:
				
			System.out.println("Please write the developers quantity: ");
			sizeDev= tamanho.nextInt();			
			usersDev= new Developer[sizeDev];
					
			System.out.print("You're been selected as Developer, please type your data: ");
			System.out.println();
			for (int i=0; i<usersDev.length; i++)
			{
				System.out.println();
				System.out.println("DEVELOPER #: "+(i+1));
				System.out.println();
				System.out.print("Type your name: ");       													nombre   = readData.nextLine();
				System.out.print("Type your surname: ");    													apellido = readData.nextLine();
				System.out.print("Type your age: ");															edad     = readData.nextLine();
				System.out.print("Type your DNI: ");															cedula   = readData.nextLine();
				
				System.out.print("Type your language of programmation skill: ");    							lenguajeProg = readData.nextLine();
				System.out.print("Type your phone: ");                              							telefonoProg  = readData.nextLine();
								
				usersDev[i] = new Developer(nombre, apellido, edad, cedula, lenguajeProg, telefonoProg);
				System.out.println("Please write the user story: ");											historia = readData.nextLine();															
				System.out.println("Data saved!");																storiesDEV[i].setStories(historia);
				System.out.println();																			PBL.addUserStory(storiesDEV[i]);
			}
			break;
			
			/*This issue is about of the SCRUM Master role*/
			case 3:			
			System.out.print("You're been selected as SCRUM Master, please type your data: ");
			System.out.println();
			for (int i=0; i<userSCRUM.length; i++)
			{
				System.out.print("Type your name: ");       													nombre   = readData.nextLine();
				System.out.print("Type your surname: ");    													apellido = readData.nextLine();
				System.out.print("Type your age: ");															edad     = readData.nextLine();
				System.out.print("Type your DNI: ");															cedula   = readData.nextLine();
				System.out.print("Type your main goal: ");  													objetivo = readData.nextLine();
				
				userSCRUM[i] = new SCRUMMaster(nombre, apellido, edad, cedula, objetivo);
				System.out.println("Please write the user story: ");											historia = readData.nextLine();
				storiesSCM.setStories(historia);
				System.out.println("Data saved!");
				System.out.println();			
			}
			break;
			
			/*This choice must to see the saved information*/
			case 4:
			System.out.print("Select your saved data: ");
			System.out.println();
			tipoEmpleado= opcion.nextInt();
			
			if(tipoEmpleado == 1)
			{
				System.out.println();
				System.out.println("Name: "+usersPro.getName());
				System.out.println("Surname: "+usersPro.getSurN());
				System.out.println("Age: "+usersPro.getAge());
				System.out.println("DNI: "+usersPro.getDNI());
					
				System.out.println("Company: "+usersPro.getNComp());
				System.out.println("Phone: "+usersPro.getPhComp());
				System.out.println("Address: "+usersPro.getAdComp());
				System.out.print  ("Story user: "+storiesPRO.getStories());
				System.out.println();
			}
			else if(tipoEmpleado == 2)
			{	
				for(int i=0; i<usersDev.length;i++)
				{
					System.out.println();
					System.out.println("DEVELOPER #: "+(i+1));
					System.out.println();
					System.out.println("Name: "+usersDev[i].getName());
					System.out.println("Surname: "+usersDev[i].getSurN());
					System.out.println("Age: "+usersDev[i].getAge());
					System.out.println("DNI: "+usersDev[i].getDNI());
				
					System.out.println("Language of programation: "+usersDev[i].getLanguage());
					System.out.println("Phone: "+usersDev[i].getPhoneDev());
					System.out.print  ("Story user: "+storiesDEV[i].getStories());
					System.out.println();
				}
			}
			else if(tipoEmpleado==3)
			{
				for (int i=0; i<userSCRUM.length; i++)
				{
					System.out.println();
					System.out.println("Name: "+userSCRUM[i].getName());
					System.out.println("Surname: "+userSCRUM[i].getSurN());
					System.out.println("Age: "+userSCRUM[i].getAge());
					System.out.println("DNI: "+userSCRUM[i].getDNI());
					System.out.println("Main goal: "+userSCRUM[i].getSCRUM());
					System.out.print  ("Story user: "+storiesSCM.getStories());
					System.out.println();	
				}
			}
			else
			{
				System.out.println("The data doesn't exist anymore!");
				System.out.println();
			}
			break;
			
			case 5:
			/*This issue is for edit and update the information*/
			System.out.print("Select your data for edit: ");
			tipoEmpleado= opcion.nextInt();
			System.out.println();
			
			if(tipoEmpleado==1)
			{				
				System.out.println();
				System.out.println("Product Owner" );
				System.out.println();
				System.out.print("Type your new name: ");       						nombre   = readData.nextLine();				usersPro.setName(nombre);
				System.out.print("Type your new surname: ");    						apellido = readData.nextLine();				usersPro.setSurN(apellido);
				System.out.print("Type your new age: ");								edad     = readData.nextLine();				usersPro.setAge(edad);
				System.out.print("Type your new DNI: ");								cedula   = readData.nextLine();				usersPro.setDNI(cedula);	
				System.out.print("Type your new company: ");      						companhia = readData.nextLine();			usersPro.setNComp(companhia);
				System.out.print("Type your new phone comp: ");   						telefono  = readData.nextLine();			usersPro.setPhComp(telefono);
				System.out.print("Type your new address: ");	  						direccion = readData.nextLine();			usersPro.setAdComp(direccion);
				System.out.print("Type your new user story: ");     					historia  = readData.nextLine();            storiesPRO.setStories(historia);
				System.out.println("Data updated!");
				System.out.println();
			}
			else if(tipoEmpleado==2)
			{				
				/*usersDev[size]*/			
				for(int i=0; i<usersDev.length;i++)
				{
					System.out.println("Dev: "+(i+1)+"\tName: "+usersDev[i].getName()+"\tSurname: "+usersDev[i].getSurN()+"\tAge: "+usersDev[i].getAge()+"\tDNI: "+usersDev[i].getDNI()+"\tLanguage skill: "+usersDev[i].getLanguage());				
				}
				
				System.out.println();
				System.out.print("Which developer do you want to edit?: ");
				int position = findData.nextInt();
				
				System.out.println();
				System.out.println("DEVELOPER #: "+(position));
				System.out.println();
				System.out.print("Type your new name: ");       						nombre   = readData.nextLine();				usersDev[position-1].setName(nombre);
				System.out.print("Type your new surname: ");    						apellido = readData.nextLine();				usersDev[position-1].setSurN(apellido);
				System.out.print("Type your new age: ");								edad     = readData.nextLine();				usersDev[position-1].setAge(edad);
				System.out.print("Type your new DNI: ");								cedula   = readData.nextLine();				usersDev[position-1].setDNI(cedula);				
				System.out.print("Type your new language of programmation skill: ");    lenguajeProg = readData.nextLine();			usersDev[position-1].setLanguage(lenguajeProg);
				System.out.print("Type your new phone: ");                              telefonoProg  = readData.nextLine();		usersDev[position-1].setPhoneDev(telefonoProg);
				System.out.print("Type your new user story: "); 						historia	  = readData.nextLine();		storiesDEV[position-1].setStories(historia);
				System.out.println("Data updated!");
				System.out.println();
			}				
			else if(tipoEmpleado==3)
			{
				System.out.println();
				System.out.print("Type your new name: ");       						nombre   = readData.nextLine();				userSCRUM[0].setName(nombre);
				System.out.print("Type your new surname: ");    						apellido = readData.nextLine();				userSCRUM[0].setSurN(apellido);
				System.out.print("Type your new age: ");								edad     = readData.nextLine();				userSCRUM[0].setAge(edad);
				System.out.print("Type your new DNI: ");								cedula   = readData.nextLine();				userSCRUM[0].setDNI(cedula);		
				System.out.print("Type your new main goal, as a SCRUM: ");          	objetivo = readData.nextLine();				userSCRUM[0].setDNI(cedula);				
				System.out.println("Data updated!");
				System.out.println();
			}
			else
			{
			    System.out.println("The data doesn't exist anymore!");
			}
			break;
			
			case 6:
			System.out.print("Warning!, select your data to erase: ");
			tipoEmpleado= opcion.nextInt();
			
			if(tipoEmpleado==1)
			{
				nombre     = null;					usersPro.setName(nombre);
				apellido   = null;					usersPro.setSurN(apellido);
				edad  	   = null;					usersPro.setAge(edad);
				cedula     = null;					usersPro.setDNI(cedula);
				companhia  = null;					usersPro.setNComp(companhia);
				telefono   = null;					usersPro.setPhComp(telefono);
				direccion  = null;					usersPro.setAdComp(direccion);		
				
				System.out.println("The data of the product owner has been erased!");
				System.out.println();
			}
			else if(tipoEmpleado==2)
			{
				for(int i=0; i<usersDev.length;i++)
				{
					System.out.println("Dev: "+(i+1)+"\tName: "+usersDev[i].getName()+"\tSurname: "+usersDev[i].getSurN()+"\tAge: "+usersDev[i].getAge()+"\tDNI: "+usersDev[i].getDNI()+"\tLanguage skill: "+usersDev[i].getLanguage());				
				}				
				System.out.println();
				System.out.print("Which developer do you want to erase?: ");
				int position = findData.nextInt();
				
				System.out.println();
				System.out.println("DEVELOPER #: "+(position));
				System.out.println();
				
				nombre   		= null;				usersDev[position-1].setName(nombre);
				apellido 		= null;				usersDev[position-1].setSurN(apellido);
				edad     		= null;				usersDev[position-1].setAge(edad);
				cedula   		= null;				usersDev[position-1].setDNI(cedula);
				lenguajeProg 	= null;				usersDev[position-1].setLanguage(lenguajeProg);
				telefonoProg    = null;				usersDev[position-1].setPhoneDev(telefonoProg);				
				
				System.out.println("The data of the developer has been erased!");
				System.out.println();
			}
			else if(tipoEmpleado==3)
			{
				System.out.println();
				nombre   = null;					userSCRUM[0].setName(nombre);
				apellido = null;					userSCRUM[0].setSurN(apellido);
				edad     = null;					userSCRUM[0].setAge(edad);
				cedula   = null;					userSCRUM[0].setDNI(cedula);		
				objetivo = null;					userSCRUM[0].setSCRUM(objetivo);
				
				System.out.println("The data of the SCRUM has been erased!");
				System.out.println();
			}
			break;
			case 7:
				System.out.println(storiesPRO.getStories());
				System.out.println(storiesSCM.getStories());
			break;
			
			case 8:
			salir = true;
			System.out.println("Good bye!");
			break;
		    }
		}
		readData.close();
		opcion.close();
		tamanho.close();
		findData.close();
	}
}