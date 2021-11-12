import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZooTest {



   @Test(expected = LimiteVisiteurException.class)
   public void limiteVisiteurExceptionTest() throws LimiteVisiteurException{
       Zoo zoo = new Zoo(2);
       zoo.nouveauVisiteur();
       zoo.nouveauVisiteur();
       zoo.nouveauVisiteur();

   }

    @Test
    public void animalBienStockTest(){
       Zoo zoo = new Zoo(2);
       zoo.ajouterSecteur(TypeAnimal.CHIEN);
       zoo.ajouterSecteur(TypeAnimal.CHAT);
       Chien ouaf = new Chien("Didier");
       zoo.nouvelAnimal(ouaf);
       assertEquals(zoo.secteursAnimaux.get(0).animauxDansSecteur.get(0), ouaf);
   }





}