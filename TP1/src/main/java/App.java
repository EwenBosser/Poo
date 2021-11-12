public class App {
    public static void main(String args[]){
        Zoo zoo = new Zoo(2);
        zoo.ajouterSecteur(TypeAnimal.CHIEN);
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        zoo.nouvelAnimal(new Chien("Didier"));
        zoo.nouvelAnimal(new Chat("Parpaing"));
        try {
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
        } catch (LimiteVisiteurException e) {
            e.printStackTrace();
        }

        zoo.secteursAnimaux.get(0).ajouterAnimal(new Chat("Raoult"));



    }
}
