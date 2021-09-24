//SP1 C lavet af Casper, Mia og Morten.

class DiceCup {

  ArrayList<Die> DiceCupArray = new ArrayList<Die>();

  DiceCup() {
  }

  public void addDie() { // Vi henter et parameter af typen Object som vi kalder addDie
    DiceCupArray.add(new Die(0, 255) );
  }

  public void dieSort() { // Funktion for at tælle hvor mange af af hver terning slag vi har.

    java.util.Collections.sort(DiceCupArray); // Sorter Dicene i Cuppen har hentet den ind for at sortere i vores arraylist
    //for (Die part : DiceCupArray) {
    
  }

  public void DrawCup() { //tegner hele cuppen
    DC.dieSort(); //sorter arrayet af Dices i DiceCuppen
    int xPosDieStart = 40; //hurtig løsning på at ændre den første ternings position mere til venstre og nulstiller værdien hver gang der gnetegnes
    int yPosDieStart = 10;

    int xFactor = 0; //til at gå hen af x-aksen
    int yFactor = 0; //til at gå ned af y-aksen
    if (DiceCupArray.size() > 0) {
      DiceCupArray.get(0).DrawDie(xPosDieStart, yPosDieStart); //da de er sorteret skal den første altid placeres i toppen

      for (int i = 1; i < DiceCupArray.size(); i++) { //vi kigger derefter på nr 2's plads (altså array[1]) og sammenligner øjne på terningerne
        Die part = DiceCupArray.get(i);
        if (part.eyes > DiceCupArray.get(i-1).eyes) { //hvis øjne på denne terning er mere end den tidligere så gør følgende
          yFactor++; //forøg yFactor så vi starter en række længere nede
          xFactor = 0; //reset xFactor så vi starter til venstre
        } else {
          xFactor++; //hvis ikke øjne er større så forøg xFactor så vi bevæger os en mod højre
        }

        int xPosDie = xPosDieStart + (part.dieSize+part.dieSize/2)*xFactor;
        int yPosDie = yPosDieStart + (part.dieSize+part.dieSize/2)*yFactor;
        part.DrawDie(xPosDie, yPosDie);
      }
    }
  }
}
