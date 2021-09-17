//SP1 C lavet af Casper, Mia og Morten.

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

    java.util.Collections.sort(DiceCupArray); // Sorter Dicene i Cuppen har hentet den ind for at sortere i vores arraylist
    for (Die part : DiceCupArray) {
   //   part.isSorted = true;
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

  public void DrawCup() { //tegner hele cuppen
     DC.dieSort(); //sorter arrayet af Dices i DiceCuppen
    int xPosDie = -110; //hurtig løsning på at ændre den første ternings position mere til venstre og nulstiller værdien hver gang der gnetegnes
    int yPosDie =10;
    int counterOne = 1;
    int counterTwo = 1;
    int counterThree = 1;
    int counterFour = 1;
    int counterFive = 1;
    int counterSix = 1;
   
    //int eyeValue = -1;
    //   for (Die part : DiceCupArray) {//starter med den første Die objekt i ArrayListen, indtil slutningen af ArrayListen og start forfra.
    /*
      if(eyeValue == -1 ){eyeValue = part.eyes;}
     if(part.isSorted && eyeValue != part.eyes){ // forsøg på liste dicene lodret, hvis de er blevet sorteret, men kun en ny række hvis den næste die har et andet antal øjne end den tidligere
     yPosDie = 160;
     //yPosDie += part.dieSize + part.dieSize/2;
     xPosDie = -110;
     }else{
     */

    for (int i = 0; i < DiceCupArray.size(); i++) { // sættes i for fordi vi skal kigge på hver terning objekts øjne.
      Die part = DiceCupArray.get(i); //variable
       int changeRow=1;
      if(part.eyes == 2){
      xPosDie = -110+(part.dieSize+part.dieSize/2)*counterTwo;
      yPosDie = 160;
      counterTwo++;
   changeRow++;
      println(changeRow);
      }
     else if(part.eyes == 3){
       xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
      yPosDie = 310;
   counterThree++;
      println(changeRow);
      }
      else if(part.eyes == 4){
       xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
      yPosDie = 460;
      counterFour++;
      }
      
      else if(part.eyes == 5){
       xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
      yPosDie = 610;
      counterFive++;
      }
      
      else if(part.eyes == 6){
       xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
      yPosDie = 760;
      counterSix++;
      }
   changeRow++;
      println(changeRow);
    
      


      xPosDie += part.dieSize + part.dieSize/2;
      part.DrawDie(xPosDie, yPosDie); //part betyder for hvert objekt kør funktionen DrawDie(); hvor xog y koordinater angives
      
    }
  }
}
