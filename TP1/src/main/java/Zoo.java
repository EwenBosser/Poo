import java.util.ArrayList;
import java.util.List;

public class Zoo {
    int visiteurs;
    int nbVisiteurMaxParSecteur;
    List<Secteur> secteursAnimaux;

    Zoo(int nb) {
        secteursAnimaux = new ArrayList<Secteur>();
        visiteurs = 0;
        nbVisiteurMaxParSecteur = nb;
    }

    void ajouterSecteur(TypeAnimal ta) {
        secteursAnimaux.add(new Secteur(ta));
    }

    void nouveauVisiteur() throws LimiteVisiteurException {


            if ((visiteurs+1) > getLimiteVisiteur()){
                throw new LimiteVisiteurException(getLimiteVisiteur());
            }
            visiteurs++;


    }

    int getLimiteVisiteur() {
        return nbVisiteurMaxParSecteur;
    }

    void nouvelAnimal(Animal a) {
        boolean insere = false;
        int i = 0;
        while (!insere && i < secteursAnimaux.size()) {
            if (secteursAnimaux.get(i).typeAnimauxDansSecteur == a.typeAnimal) {
                secteursAnimaux.get(i).ajouterAnimal(a);
                insere = true;
            }
            i++;
        }
    }

    int nombreAnimaux() {
        int total = 0;
        for (Secteur s : secteursAnimaux) {
            total += s.getNombreAnimaux();
        }
        return total;
    }

}
