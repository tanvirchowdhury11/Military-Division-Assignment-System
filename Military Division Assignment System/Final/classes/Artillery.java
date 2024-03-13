package classes;
import interfaces.*;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Artillery extends Soldier implements Comando
{
	private int longcourse;
	private String Brigade;
	private String Regiment;
	private double combat;
	private double endurance;
	private double academic;

	private Support s;

	public void setLongcourse(int longcourse)
	{
		this.longcourse = longcourse;
	}
	public int getLongcourse()
	{
		return longcourse;
	}

	public void setBrigade(String brigade)
	{
		this.Brigade = brigade;
	}
	public String getBrigade()
	{
		return Brigade;
	} 

	public void setRegiment(String Regiment)
	{
		this.Regiment = Regiment;
	}
	public String setRegiment()
	{
		return Regiment;
	}

	public void setCombat(double combat)
	{
		this.combat = combat;		
	}
	public double getCombat()
	{
		return combat;
	}

	public void setEndurance(double endurance)
	{
		this.endurance =endurance;
	}
	public double getEndurance()
	{
		return endurance;
	}

	public void setAcademic(double academic)
	{
		this.academic = academic;
	}
	public double getAcademic()
	{
		return academic;
	}

	public void setS(Support s)
	{
		this.s = s;
	}
	public Support getS()
	{
		return s;
	}

	public Artillery()
	{
		
	}
	
	public Artillery(String name, int age, String ID, int joiningyear , int bts, int longcourse, String Brigade, String Regiment)
	
	{
		super(name,age,ID,joiningyear,bts);
		this.longcourse=longcourse;
		this.Brigade=Brigade;
		this.Regiment=Regiment;
		
	}

	public void enterScore(double combat,double endurance, double academic) 
	{
		this.combat=combat;
		this.endurance=endurance;
		this.academic=academic;
	}

	public void showArtillery()
	{
		//super.showSoldier();
		System.out.println("");
		System.out.println("            +++++++++++++++++++++++++");
		System.out.println("            + Your Division Details +"); 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Longcourse :" + longcourse +"                            ++");
		System.out.println("Brigade    :" + Brigade);
		System.out.println("Regiment   :" + Regiment);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	}

	public void join()
    {
    	Scanner in= new Scanner(System.in);
        System.out.println("                         >>Soldier! Give a simple test and apply for commando training<<"); 
        System.out.println("                         ---------------------------------------------------------------");
    	System.out.println("");
    	System.out.print("What is your ID? ---> ");
        String id = in.nextLine();
        System.out.println("");
        System.out.print("1. How many sectors are there in Bangladesh?  ---> ");
        int sec = in.nextInt();
        System.out.println("");
        System.out.print("2. How many brigade are there in Bangladesh?  ---> ");
        int bri = in.nextInt();

        if( id == id && sec == 11 && bri == 3)
        {
        	System.out.println("");
        	System.out.println("                         |-------------------------------------------------------------|");
        	System.out.println("                         |-----------------------Bravo!! You passed.-------------------|");
        	System.out.println("                         |-------------------------------------------------------------|");
        	System.out.println("                         |Your training schedule will announce after 20th of September.|");
        	System.out.println("                         |-------------------------------------------------------------|");
        	System.out.println("                         | We have another opportunity for you because you passed the  |");
        	System.out.println("                         |                         'simple test'                       |");
        	System.out.println("                         |-------------------------------------------------------------|");
        	System.out.println("");
        	System.out.println("                          |-----------------------------------------------------------|");
        	System.out.println("                          |        |Want to go to Special Security Force(SSF)|        |");
        	System.out.println("                          |-----------------------------------------------------------|");
        	System.out.println("                          |    If you want to go, enter '1' for not to go enter '0'   |");
        	System.out.println("                          |-----------------------------------------------------------|");
        	if((sec+bri) == 14)
        	{
        		System.out.println("");
        		System.out.print("You are sure? ---> ");
        		int sure = in.nextInt();
        		if(sure == 1)
        		{
        			System.out.println("                         |-------------------------------------------------------------|");
        			System.out.println("                         |                     Your Name is registered.                |");
        			System.out.println("                         |Your training schedule will announce after 20th of September.|");
        			System.out.println("                         |-------------------------------------------------------------|");
        		}
        		else
        		{
        			System.out.println("                         |----------------------------------------------------------------------|");
        			System.out.println("                         |Your commando training schedule will announce after 20th of September.|");
        			System.out.println("                         |----------------------------------------------------------------------|");
        		}
        	}
        }
        else if( id == id &&  sec != 11 || bri == 3)
        {
        	System.out.println("");
        	System.out.println("                                      Question - 1, Ans is incorrect");
        	System.out.println("                                      -----You are disqualified-----");
        	System.out.println("");
        }
        else if( id == id &&  sec == 11 || bri != 3)
        {
        	System.out.println("");
        	System.out.println("                                      Question - 2, Ans is incorrect");
        	System.out.println("                                      -----You are disqualified-----");
        	System.out.println("");
        }
        else
        {
        	System.out.println("");
        	System.out.println("                                        Sorry! you are disqualified");
       		System.out.println("");
        }
    }

}