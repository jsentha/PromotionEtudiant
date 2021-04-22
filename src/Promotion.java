import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static java.lang.Double.parseDouble;

public class Promotion {


    private ArrayList<Etudiants> Tab;
    private static int NbEtudiants = 0;

    public Promotion() {

        Tab = new ArrayList<Etudiants>(40);
        

    }


    public void Afficher() {
        System.out.println("Voici la liste de vos étudians");
        ListIterator it = Tab.listIterator();

        while (it.hasNext()) {
            Object Obj = it.next();
            Etudiants eleve = (Etudiants) Obj;
            System.out.println("");
            System.out.println( eleve.getNom() + "  né le " + eleve.getDateNaissance()
            );
        }
    }

    public void CalculeMoyenneG() {
        Double moyG = 0.0;
        for (Etudiants students : Tab) {
            moyG = students.getMoyenne() + moyG;
        }
        System.out.println(moyG/NbEtudiants);
    }
    public void AjouterEtudiant(Etudiants students) {

            Tab.add(students);
            NbEtudiants ++;
        }

    public void Ajoutermoyenne(){
        ListIterator it = Tab.listIterator();
       String nom = Saisie.lire_String("Entrez le nom de l'élève");
       String datenaissance = Saisie.lire_String("Entrez sa date de naissance");
        Double premièrenote;
        Double note;
        String choix;
        while (it.hasNext()) {
            Object Obj = it.next();
            Etudiants eleve = (Etudiants) Obj;
            if (nom.equals(eleve.getNom()) && datenaissance.equals(eleve.getDateNaissance())){
                if (eleve.getMoyenne() == 0.0){
                    premièrenote = Saisie.lire_double("L'élève n'a pas de note ajouter lui une note");
                    eleve.ModifierMoyenne(premièrenote);
                    break;
                }else{
                    choix = Saisie.lire_String("Voulez vous changer la moyenne de "+eleve.getNom());
                    if (choix.equals("oui")){
                        note = Saisie.lire_double("Modifiez sa moyenne");
                        eleve.ModifierMoyenne(note);
                    }
                }
            }



        }
    }

    }


