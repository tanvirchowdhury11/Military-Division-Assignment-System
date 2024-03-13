package classes;
import java.lang.*;
import java.io.*;

public class Support
{
    private String longrange;
    private String shortrange;
    private String medic;
    private String redioman;

    public void setLongrange(String longrange)
    {
        this.longrange = longrange;
    }
    public String getLongrange()
    {
        return longrange;
    }

    public void setShortrange(String shortrange)
    {
        this.shortrange = shortrange;
    }
    public String getShortrange()
    {
        return shortrange;
    }

    public void setMedic(String medic)
    {
        this.medic = medic;
    }
    public String getMedic()
    {
        return medic;
    }

    public void setRedioman(String redioman)
    {
        this.redioman = redioman;
    }
    public String getRedioman()
    {
        return redioman;
    }

    public Support()
    {

    }

    public Support(String longrange , String shortrange , String medic , String redioman)
    {
        this.longrange = longrange;
        this.shortrange = shortrange;
        this.shortrange = shortrange;
        this.redioman = redioman;
    }

    public void showSupport()
    {
        System.out.println("");
        System.out.println("                  ################");
        System.out.println("                  # Your Loadout #");
        System.out.println("###############################################################################################################################################################################");
        System.out.println("Required Gun For Longrange                 : " +longrange);
        System.out.println("Required Gun For Shortrange                : " +shortrange);
        System.out.println("Medic Iteams Reserved For Injured Soldiers : " +medic);
        System.out.println("Extra Support                              : " +redioman);
        System.out.println("###############################################################################################################################################################################");
    }
}