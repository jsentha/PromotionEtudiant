import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        Promotion sio2 = new Promotion();
        String nom,nom2;
        String Datenaissance,Datenaissance2;
        String repetition;

        JOptionPane.showMessageDialog(null,"BIENVENU SUR PRONOTE DE WISH !");


     // Introduction saisie de la liste étudiant

    System.out.println("Veuillez Saisir votre liste d'étudiants");
    int nb = Saisie.lire_int("Combien d'étudiants voulez vous listez");

        for (int i=0; i<nb;i++) {
            int nbeleve = i+1;

            if(i ==0){
                nom = Saisie.lire_String("Entrez le nom du "+nbeleve+"er élève");
            }
            else {
                nom  = Saisie.lire_String("Entrez le nom du "+nbeleve+"eme  élève");
            }

           Datenaissance = Saisie.lire_String("Entrez sa date de naissance");

           sio2.AjouterEtudiant(new Etudiants(nom,Datenaissance,0.0));
        }

        sio2.Afficher();
    // Ajout du nouvel élève en cours d'année
        System.out.println("Un nouvel élève viens d'arriver en cours d'année");
        System.out.println("");
        System.out.println("Veuillez l'ajouter à la liste étudiant");
        System.out.println("");

        nom2 =Saisie.lire_String("Veuillez entre le nom du nouvel élève");
        Datenaissance2 = Saisie.lire_String("Veuillez entre sa date de naissance");

        sio2.AjouterEtudiant(new Etudiants(nom2,Datenaissance2,0.0));
        System.out.println("Voici la nouvelle liste des étudiants");
        sio2.Afficher();

        // Modification de la moyenne des élève et affichage de la moyenne général
        System.out.println("C'est la fin du 1er trimèstre ajoutez leurs une moyenne");
        do{

            sio2.Ajoutermoyenne();
            repetition = Saisie.lire_String("Saisir oui si vous voulez modifier d'autre moyenne");
        }
        while(repetition.equals("oui"));

        System.out.println("Voici la moyenne général des étudians ");

        sio2.CalculeMoyenneG();

    }
}
