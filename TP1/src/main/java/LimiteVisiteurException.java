public class LimiteVisiteurException extends Exception{
    int nbMax;
    public LimiteVisiteurException(int nb){
        nbMax = nb;
    }

    public String toString(){
        return "Le nombre maximum de visiteurs a été atteint("+nbMax+")";
    }
}
