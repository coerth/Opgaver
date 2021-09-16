  //vi vil have en tæller for hver af vores 6 værdier. 
  int eyeCounterOne;
  int eyeCounterTwo;
  int eyeCounterThree;
  int eyeCounterFour;
  int eyeCounterFive;
  int eyeCounterSix;


  // Array List for rullede terninger og så sortede resultater for terninger


  //ArrayList<Die> RolledOneArray = new ArrayList<Die>();
  //ArrayList<Die> RolledTwoArray = new ArrayList<Die>();
  //ArrayList<Die> RolledThreeArray = new ArrayList<Die>();
  //ArrayList<Die> RolledFourArray = new ArrayList<Die>();
  //ArrayList<Die> RolledFiveArray = new ArrayList<Die>();
  //ArrayList<Die> RolledSixArray = new ArrayList<Die>();




  class DiceCup {

    ArrayList<Die> DiceCupArray = new ArrayList<Die>();

    DiceCup() {
    }

    public void addDie() { // Vi henter et parameter af typen Object som vi kalder addDie
      DiceCupArray.add(new Die(0, 255) );
    }
    public void dieSort() { // Funktion for at tælle hvor mange af af hver terning slag vi har.

      java.util.Collections.sort(DiceCupArray); // Sorter Dicene i Cuppen
      for (Die part : DiceCupArray) {
        part.isSorted = true;
      }

      //for (int i = 0; i < DiceCupArray.size(); i++) { // sættes i for fordi vi skal kigge på hver terning objekts øjne. 
      //  Die part = DiceCupArray.get(i);
      //  if (part.eyes == 1) {
      //    RolledOneArray.;
      //    println("terning er tilføjet til 1");

      //  } 

      /*
      else if (part.eyes ==2) {
       RolledTwoArray.clone();
       println("terning er tilføjet til 2");
       
       } else if (part.eyes ==3) {
       RolledThreeArray.clone();
       println("terning er tilføjet til 3");
       
       } else if (part.eyes ==4) {
       RolledFourArray.clone();
       println("terning er tilføjet til 4");
       
       } else if (part.eyes ==5) {
       RolledFiveArray.clone();
       println("terning er tilføjet til 5");
       
       } else if (part.eyes ==6) {
       RolledSixArray.clone();
       println("terning er tilføjet til 6");
       }
       */
      //}
    }

    public void Draw() { //tegner hele cuppen
      int xPosDie = -110; //hurtig løsning på at ændre den første ternings position mere til venstre og nulstiller værdien hver gang der gnetegnes
      int yPosDie =10;
      //int eyeValue = -1; 
      for (Die part : DiceCupArray) {//starter med den første Die objekt i ArrayListen, indtil slutningen af ArrayListen og start forfra.
        //if(eyeValue == -1 ){eyeValue = part.eyes;}
        //if(part.isSorted && eyeValue != part.eyes){ // forsøg på liste dicene lodret, hvis de er blevet sorteret, men kun en ny række hvis den næste die har et andet antal øjne end den tidligere 
        //  yPosDie += part.dieSize + part.dieSize/2;
        //  xPosDie = -110;
        //}else{
          xPosDie += part.dieSize + part.dieSize/2;
        //}
        part.DrawDie(xPosDie, yPosDie); //part betyder for hvert objekt kør funktionen DrawDie(); hvor xog y koordinater angives
      }
    }
  }
