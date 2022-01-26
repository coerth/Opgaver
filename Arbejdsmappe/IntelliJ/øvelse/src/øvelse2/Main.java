package øvelse2;

public class Main {

    public static void main(String[] args) {
        Spiller menneske = new MenneskeSpiller();
        Spiller computer = new ComputerSpiller();
        GætteSpil gætteSpil= new GætteSpil(6);

        while (!gætteSpil.isCorrect()){
            gætteSpil.tur(computer);
            gætteSpil.tur(menneske);
        }




    }
}
