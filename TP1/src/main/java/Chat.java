public class Chat extends Animal{
    public Chat(String nom){
        super();
        nomAnimal = nom;
        typeAnimal = TypeAnimal.CHAT;
    }

    public String getNomAnimal(){
        return nomAnimal;
    }
}
