package classes;
import java.lang.*;
import java.io.*;

public class Soldier {
	
	private String name;
	private int age;
	private String ID;
	private int joiningyear;//x
	private int bts;//x
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getJoiningyear() {
		return joiningyear;
	}
	public void setJoiningyear(int joiningyear) {
		this.joiningyear = joiningyear;
	}
	public int getBts() {
		return bts;
	}
	public void setBts(int bts) {
		this.bts = bts;
	}
	
	public Soldier()
	{
		
	}
	public Soldier (String name, int age, String iD, int joiningyear, int bts)
	{
		this.name=name;
		this.age=age;
		this.ID=iD;
		this.joiningyear=joiningyear;
		this.bts=bts;
		
	}
	
	public void showSoldier()
	{
		System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
		System.out.println("|ID  : " + ID +"                                                                   Name         : " + name +"              |");
		System.out.println("|Age : " + age +"                                                                           Joining Year : " + joiningyear +"            |");
		System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
		System.out.println("|__________________________________________________________________________________________________________________|");
		System.out.println("");
		System.out.println("                                     >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("                                     >>  Basic training score : " + bts + "  >>");
		System.out.println("                                     >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("");
	}
	

}