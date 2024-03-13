package classes;

import java.lang.*;
import java.io.*;

public class Lite
{
	private String vehicle;

	public void setVehicle(String vehicle)
	{
		this.vehicle = vehicle;
	}
	public String getVehicle()
	{
		return vehicle;
	}

	/*Lite()
	{

	}*/

	public Lite(String vehicle)
	{
		this.vehicle = vehicle;
	}

	public void showLite()
	{
		System.out.println("");
		System.out.println("            +++++++++++++++++++++++++");
		System.out.println("            + Your Division Details +"); 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++  Required Vehicles : " +vehicle);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}