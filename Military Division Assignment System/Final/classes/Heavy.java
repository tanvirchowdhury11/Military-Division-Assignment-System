package classes;

import java.lang.*;
import java.io.*;

public class Heavy
{
	private String fontline;
	private String support;

	public void setFontline(String fontline)
	{
		this.fontline = fontline;
	}
	public String getFontline()
	{
		return fontline;
	}

	public void setSupport(String support)
	{
		this.support = support;
	}
	public String getSupport()
	{
		return support;
	}

	public Heavy()
	{

	}

	public Heavy(String fontline , String support)
	{
		this.fontline = fontline;
		this.support = support;
	}

	public void showHeavy()
	{
		System.out.println("");
		System.out.println("              ################");
		System.out.println("              # Your Loadout #");
		System.out.println("##############################################");
		System.out.println("##  Fontline Gun   : " +fontline);
		System.out.println("##  Supporting Gun : " +support);
		System.out.println("##############################################");
	}
}