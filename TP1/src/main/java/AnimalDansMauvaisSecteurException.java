
public class AnimalDansMauvaisSecteurException extends Exception {
    Animal a;
    Secteur s;

    public AnimalDansMauvaisSecteurException(Animal b, Secteur sec) {
        a = b;
        s = sec;
    }

    public String toString() {
        return "L'animal "+a.getNomAnimal()+" est de type "+a.getTypeAnimal()+" et ne peut donc pas être ajouter au secteur de type "+s.typeAnimauxDansSecteur;
    }
}


