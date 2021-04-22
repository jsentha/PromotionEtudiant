import java.util.ListIterator;
import java.util.ArrayList;

public class Etudiants {

    private String Nom;
    private String DateNaissance;
    private Double Moyenne;

    public Etudiants(){}
    public Etudiants(String Nom,String DateNaissance,Double Moyenne){
        this.Nom = Nom;
        this.DateNaissance = DateNaissance;
        this.Moyenne = Moyenne;
    }

    public String getNom(){
        return Nom;
    }
    public String getDateNaissance(){return DateNaissance;}
    public Double getMoyenne(){return Moyenne;}

    public void setNom(String Nom){
        this.Nom = Nom;
    }

    public void SetDateNaissance(){
        this.DateNaissance = DateNaissance;
    }

    public void SetMoyenne(){
        this.Moyenne = Moyenne;
    }

    public void Affiche(){
     System.out.println("Voici la moyenne de l'étudiant "+Moyenne);
    }

    public void ModifierMoyenne(Double Moyenne){
        this.Moyenne = Moyenne;
    }

    public void Saisiretudiants(){


    }

}
