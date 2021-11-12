public class Chien extends Animal{
    public Chien(String nom){
        super();
        nomAnimal = nom;
        typeAnimal = TypeAnimal.CHIEN;
    }

    public String getNomAnimal(){
        return  nomAnimal;
    }
}
