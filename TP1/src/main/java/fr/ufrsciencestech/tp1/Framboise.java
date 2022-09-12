package fr.ufrsciencestech.tp1;

import java.io.*;

/**
 *
 * @author roudet
 */
public class Framboise {
    private double prix;
    private String origine;

    public Framboise()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="France";
    }

    public Framboise(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Framboise";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Framboise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Framboises sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Framboise or = (Framboise) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Framboise a des pepins
        return false;
    }


    public static void main (String[] args){
        Framboise o = new Framboise(1.0, "Rance");
        if(o.getPrix() == 1.0)
        {
            System.out.println("Prix Correct");
        }
        else
        {
            System.out.println("Prix Incorrect");
        }

        if(o.getOrigine() == "Rance")
        {
            System.out.println("Origine Correcte");
        }
        else
        {
            System.out.println("Origine Incorrecte");
        }
   }
}
