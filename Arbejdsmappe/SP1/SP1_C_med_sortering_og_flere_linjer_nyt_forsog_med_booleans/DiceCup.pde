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
    //for (Die part : DiceCupArray) {
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
  //}

  public void DrawCup() { //tegner hele cuppen
    DC.dieSort(); //sorter arrayet af Dices i DiceCuppen
    int xPosDie = -110; //hurtig løsning på at ændre den første ternings position mere til venstre og nulstiller værdien hver gang der gentegnes
    int yPosDie =10;
    int counterOne = 0; //int counter for hver terning som ruller det antal øje
    int counterTwo = 0; //int counter for hver terning som ruller det antal øje
    int counterThree = 0; //int counter for hver terning som ruller det antal øje
    int counterFour = 0; //int counter for hver terning som ruller det antal øje
    int counterFive = 0; //int counter for hver terning som ruller det antal øje
    int counterSix = 0; //int counter for hver terning som ruller det antal øje
    
    boolean isOneRolled = counterOne > 0; // boolean for terningeslag 1
    boolean isTwoRolled = counterTwo > 0; // boolean for terningeslag 2
    boolean isThreeRolled = counterThree > 0; // boolean for terningeslag 3
    boolean isFourRolled = counterFour > 0; // boolean for terningeslag 4
    boolean isFiveRolled = counterFive > 0; // boolean for terningeslag 5
    boolean isSixRolled = counterSix > 0; // boolean for terningeslag 6
    
    
    

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
      //int changeRow=1;
      if (part.eyes == 1) {
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterOne;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterOne++;
        
      }
      
      else if (part.eyes == 2) {
        if(!isOneRolled){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterTwo;
        yPosDie = 10;
        counterTwo++;
        
        }
        else{
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterTwo;
        yPosDie = 10 + (part.dieSize+part.dieSize/2)*1 ;
        counterTwo++;
        //isRowTwoUsed = true;
        }
        
      } 
      else if (part.eyes == 3) {
        if(!isOneRolled && !isTwoRolled){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterThree++;
        }
        else if(!isTwoRolled || !isOneRolled && isTwoRolled){
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterThree++;
          }
          else{
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
          yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
          counterThree++;
          //isRowThreeUsed = true;
          }
          
      } 
      else if (part.eyes == 4) {
        if(!isOneRolled && !isTwoRolled && !isThreeRolled){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterFour++;
        }
        else if(!isTwoRolled && !isThreeRolled || !isOneRolled && !isTwoRolled && isThreeRolled || !isOneRolled && isTwoRolled && !isThreeRolled ){
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterFour++;
        }
        else if( !isThreeRolled ){
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
        counterFour++;
        }
        
        else{
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*3;
        counterFour++;
        //isRowFourUsed = true;
        }
      } 
      else if (part.eyes == 5) {
        if(!isOneRolled && !isTwoRolled && !isThreeRolled && !isFourRolled){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterFive++;
        }
        else if(!isTwoRolled && !isThreeRolled && isFourRolled || 
                !isOneRolled && !isTwoRolled && !isThreeRolled && isFourRolled || 
                !isOneRolled && !isTwoRolled && isThreeRolled && !isFourRolled || 
                !isOneRolled && isTwoRolled && !isThreeRolled && !isFourRolled ){
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterFive++;
        }
        else if(!isThreeRolled && !isFourRolled || isTwoRolled  &&  !isThreeRolled && isFourRolled || isOneRolled && !isThreeRolled && isFourRolled){
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
        counterFive++;
        }
        else if(!isFourRolled){
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*3;
        counterFive++;
        }
        
        else{
        
        
        
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 610;
        counterFive++;
        //isRowFiveUsed = true;
        }
        
        
        
      } 
      else if (part.eyes == 6) {
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 760;
        counterSix++;
      }
      




      xPosDie += part.dieSize + part.dieSize/2;
      part.DrawDie(xPosDie, yPosDie); //part betyder for hvert objekt kør funktionen DrawDie(); hvor xog y koordinater angives
    }
  }
}
