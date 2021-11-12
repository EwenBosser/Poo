import java.util.ArrayList;
import java.util.List;

public class Secteur {
    TypeAnimal typeAnimauxDansSecteur;
    List<Animal> animauxDansSecteur;


    public Secteur(TypeAnimal ta) {
        animauxDansSecteur = new ArrayList<Animal>();
        typeAnimauxDansSecteur = ta;
    }

    void ajouterAnimal(Animal a) {
        try {
            if (a.getTypeAnimal() != typeAnimauxDansSecteur) {
                throw new AnimalDansMauvaisSecteurException(a, this);
            }
            animauxDansSecteur.add(a);
        } catch (AnimalDansMauvaisSecteurException e) {
            e.printStackTrace();
        }
    }

    int getNombreAnimaux() {
        return animauxDansSecteur.size();
    }

    TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }

}
