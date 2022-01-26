package øvelse2;

public class GætteSpil {

   private final int tal;
   private boolean correct = false;

    public GætteSpil(int tal) {
        this.tal = tal;
    }

    public boolean tur(Spiller spiller)
    {
     if(spiller.gætEtTal(10) == tal){

         correct = !correct;
         return true;
     }
        return false;
    }


    public boolean isCorrect() {
        return correct;
    }


}
