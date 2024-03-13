import classes.*;
import fileio.*;
import interfaces.*;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main extends FileReadWriteDemo{

	public static void main (String[]args)
	{
		Scanner in= new Scanner(System.in);
		
		Soldier s1= new Soldier();
		Infantry i1= new Infantry();

		Artillery le1 = new Artillery();
		le1.setLongcourse(92);
		le1.setBrigade("81 Artillery Brigade");
		le1.setRegiment("15th Regiment");

		Support rt1 = new Support();
		rt1.setLongrange("DP-28");
		rt1.setShortrange("UZI");
		rt1.setMedic("M-FAK Mini First Aid Kit , Burntec Burn Dressing ");
		rt1.setRedioman("When Needed and When you are in WAR.");

		Armed ar1 = new Armed();
		ar1.setLongcourse(72);
		ar1.setBrigade("51st Armed Brigade          ++");
		ar1.setRegiment("20th Regiment               ++");

		Assualt a1= new Assualt();
		a1.setPrimary("BD 71 Assualt Rifle  ##");
		a1.setSecondary("P92 Handgun          ##");
		a1.setGadget("HE granade           ##");

		Recon r1= new Recon();
		r1.setPrimary("AWM Sniper Rifle      ##");
		r1.setSecondary("DEGLE Handgun         ##");
		r1.setGadget("Smoke granade         ##");

		Engineer e1= new Engineer();
		e1.setPrimary("UMP 45 SMG            ##");
		e1.setSecondary("RPG rocket launcher   ##");
		e1.setGadget("Radio and Dynamite    ##");

		Heavy h1 = new Heavy();
		h1.setFontline("M4 Abrams              ##");
		h1.setSupport("Sherman Pistol         ##");

		Lite ll1 = new Lite("BRDM                              ++");
		//ll1.setVehicle("BRDM                              ++");

		//FileReadWriteDemo frwd = new FileReadWriteDemo();


		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                      |Welcome to Bangladesh Army Database|                                       |");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("|Welcome soldier! We are glad that you are here. Here are some instructions you need to follow.This database will  |\n|show you in which Regiment, Brigade, Batch No, Divisions you are selected for. To view your details you need to   |\n|enter your scores which you got in the traning session.                                                           | ");
		System.out.println("|	+ Always keep in your mind that you are a soldier & you have trained to handle any situations.             |");
		System.out.println("|	+ Be Confident.                                                                                            |");
		System.out.println("|	+ Be Strong.                                                                                               |");
		System.out.println("|	+ Be clam and cool.                                                                                        |");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                         |Enter The Required Information|                                         |");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");


	
				System.out.print("");
		System.out.print("\t|-------------------------------------------|\n");
		System.out.print("\t| Enter Name        : ");
	    String name=in.nextLine();
		s1.setName(name);

		System.out.print("\t|-------------------------------------------|\n");
		System.out.print("\t| Enter ID          : ");
	    String iD=in.nextLine();
		s1.setID(iD);
		System.out.print("\t|-------------------------------------------|\n");
		System.out.print("\t| Enter Passwoard   : ");
		String pass=in.nextLine();
		System.out.print("\t|-------------------------------------------|\n");
		System.out.print("\t| Enter Age         : ");
		int age=in.nextInt();
		s1.setAge(age);
		String x = in.nextLine();
		System.out.print(x) ;

		System.out.print("\t|-------------------------------------------|\n");
		System.out.print("\t| Enter Joining Year: ");
		int joiningyear=in.nextInt();
		s1.setJoiningyear(joiningyear);
		System.out.print("\t|-------------------------------------------|\n");
		System.out.print("\t| Enter Basic Training Score(Out of 100): ");
		int bts=in.nextInt();
		s1.setBts(bts);
		System.out.print("\t|-------------------------------------------|\n");
		System.out.println("____________________________________________________________________________________________________________________");
		System.out.println("|                                                                                                                  |");

		s1.showSoldier();
		
			if(joiningyear>=2018 && joiningyear <=2020)
		{
			i1.setLongcourse(82);
			i1.setBrigade("71st Infantry Brigade      ++");
			i1.setRegiment("14th Regiment              ++");
		}
		else if(joiningyear>=2015 && joiningyear <=2017)
		{
			i1.setLongcourse(78);
			i1.setBrigade("65th Infantry Brigade");
			i1.setRegiment("21st regiment");
		}
		if(bts>=50 && bts<=70)
		{
			System.out.println("");
			System.out.println("                             >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("                             >>  You have been selected for Infantry Division  >>");
			System.out.println("                             >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
			System.out.println("____________________________________________________________________________________________________________________");
			System.out.println("|                                                                                                                  |");
			System.out.println("                                          +Enter your Advanced training Scores+");
			System.out.println("                                 ---------------------------------------------------");
		
		System.out.print("\tEnter Combat Score    : ");
	    double combat=in.nextDouble();
		i1.setCombat(combat);
		
		System.out.print("\tEnter Endurance Score : ");
	    double endurance=in.nextDouble();
		i1.setEndurance(endurance);
		
		System.out.print("\tEnter Academic Score  : ");
	    double academic=in.nextDouble();
		i1.setAcademic(academic);
		
		if(combat>endurance && combat>academic)
		{
			i1.setA(a1);
			System.out.println("");
			System.out.println("                           |-------------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for ASSUALT CLASS    |");
			System.out.println("                           |-------------------------------------------------------------|"); 
			i1.showIntantry();
			a1.showAssualt();
			System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.print("Input your Name: ");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		System.out.println("Here is the list of all the registered Soldiers :");
    		System.out.println("");
    		frwd.readFromFile();

    		System.out.println("");
			i1.join();
			

		}
		else if(endurance>combat && endurance>academic)    
		{
			i1.setR(r1);
			System.out.println("");
			System.out.println("                           |-----------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for Recon CLASS|");
			System.out.println("                           |-----------------------------------------------------------|");
			r1.showRecon();
			System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.println("Input your Name:");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		frwd.readFromFile();

    		System.out.println("");
			i1.join();
		}
		else if(academic>combat && academic>endurance)
		{
			i1.setE(e1);
			System.out.println("");
			System.out.println("                           |--------------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for Engineer CLASS|");
			System.out.println("                           |--------------------------------------------------------------|");
			e1.showEngineer();
			System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.println("Input your Name:");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		System.out.println("Here is the list of all the registered Soldiers :");

    		System.out.println("");
    		frwd.readFromFile();

    		System.out.println("");
			i1.join();
		}
		System.out.println("                                          -------------GOOD LUCK SOLDIER-------------");
			
		}
		else if(bts>=71 && bts<=80)
		{
			System.out.println("");
			System.out.println("                           |-----------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for ARMORED DIVISIONS|");
			System.out.println("                           |-----------------------------------------------------------|");
			System.out.println("");
			System.out.println("                                             +Enter your Advance Scores+");
			System.out.println("                                 ---------------------------------------------------\n");
			System.out.print("\tEnter your Firing skills score       : ");
			double skill=in.nextDouble();
			System.out.print("\tEnter your Tank Driving Skills Score : ");
			double drive=in.nextDouble();

			if(skill > drive)
			{
				System.out.println("");
			System.out.println("                           |-----------------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for HEAVY ARMORED CLASS|");
			System.out.println("                           |-----------------------------------------------------------------|");
				ar1.showArmed();
				h1.showHeavy();
				System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.println("Input your Name:");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		System.out.println("Here is the list of all the registered Soldiers :");
    		System.out.println("");
    		frwd.readFromFile();
    		System.out.println("");
    		ar1.join();
		System.out.println("                                          -------------GOOD LUCK SOLDIER-------------");
			}

			else
			{
				System.out.println("");
			System.out.println("                           |----------------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for LIGHT ARMORED CLASS|");
			System.out.println("                           |----------------------------------------------------------------|");
				ar1.showArmed();
				ll1.showLite();
				System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.println("Input your Name:");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		System.out.println("Here is the list of all the registered Soldiers :");
    		System.out.println("");
    		frwd.readFromFile();

    		System.out.println("");
    		ar1.join();
		System.out.println("                                          -------------GOOD LUCK SOLDIER-------------");
			}
			
		}
		else if(bts>=81 && bts<=100)
		{
			System.out.println("");
			System.out.println("                           |---------------------------------------------------------------|");
			System.out.println("                           |Congratulations! You have been selected for ARTILLERY DIVISIONS|");
			System.out.println("                           |---------------------------------------------------------------|");
			le1.showArtillery();
			rt1.showSupport();
			System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.println("Input your Name:");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		System.out.println("Here is the list of all the registered Soldiers :");
    		System.out.println("");
    		frwd.readFromFile();
    		System.out.println("");
    		le1.join();

		System.out.println("                                          -------------GOOD LUCK SOLDIER-------------");
		}

		else if (bts<50)
		{
			System.out.println("You have failed your Basic Training Course. Wish you all the best for your future.\n");
			System.out.println("                                          -------------GOOD LUCK SOLDIER-------------");

			System.out.println("");

			System.out.println("                                  +>>Enter your name to register for the Special Forces<<+");
			System.out.println("                                  +---------------------------------------------+");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
    		FileReadWriteDemo frwd = new FileReadWriteDemo();

    		System.out.println("Input your Name:");
    		String s = sc.nextLine();
    		frwd.writeInFile(s);
    		System.out.println("");
    		System.out.println("Your Name is saved in our database:");
    		System.out.println("");
    		System.out.println("Here is the list of all the registered Soldiers :");
    		System.out.println("");
    		frwd.readFromFile();
		}
		
	}
}