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
    }

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
    
    for (int i = 0; i < DiceCupArray.size(); i++) { // sættes i for fordi vi skal kigge på hver terning objekts øjne.
      Die part = DiceCupArray.get(i); //variable
      
      //if statements for terninger der ruller 1
      if (part.eyes == 1) {
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterOne;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterOne++; 
      }
      
      //if statements for terninger der ruller 2
      else if (part.eyes == 2) {
        if(counterOne == 0){ //hvis ingen terninger har rullet 1 så sæt dig på første række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterTwo;
        yPosDie = 10;
        counterTwo++;
        }
        
        else{ //ellers sæt den på anden række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterTwo;
        yPosDie = 10 + (part.dieSize+part.dieSize/2)*1 ;
        counterTwo++;
        }
      } 
      
      //if statements for terninger der ruller 3
      else if (part.eyes == 3) {
        if(counterOne == 0 && counterTwo == 0){ //hvis ingen terninger har rullet 1 eller 2 så sæt dig på første række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterThree++;
        }
        
        else if(counterOne == 0 && counterTwo > 0 || counterOne > 0 && counterTwo == 0){ //hvis første række er taget og ingen på anden række så sæt dig på anden række
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterThree++;
          }
          
          else{ //ellers sæt dig på trejde række
          xPosDie = -110+(part.dieSize+part.dieSize/2)*counterThree;
          yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
          counterThree++;
          }
      } 
      
      //if statements for terninger der ruller 4
      else if (part.eyes == 4) {
        if(counterOne == 0 && counterTwo == 0 && counterThree == 0){ //hvis ingen terninger har rullet 1, 2 eller 3 så sæt dig på første række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterFour++;
        }
        
        else if((counterOne > 0 && counterTwo == 0 && counterThree == 0) || //hvis første række er taget og ingen på anden række så sæt dig på anden række
                (counterOne == 0 && counterTwo > 0 && counterThree == 0) || 
                (counterOne == 0 && counterTwo == 0 && counterThree > 0) ){
                  
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterFour++;
        }
        
        else if((counterOne > 0 && counterTwo > 0 && counterThree == 0) || //hvis første og anden række er taget så sæt dig på trejde række
                (counterOne > 0 && counterTwo == 0 && counterThree > 0) || 
                (counterOne == 0 && counterTwo > 0 && counterThree > 0) ){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
        counterFour++;
        }
        
        else{
          //ellers sæt dig på fjerde række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFour;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*3;
        counterFour++;
        }
      } 
      
      //if statements for terninger der ruller 5
      else if (part.eyes == 5) {
        if(counterOne == 0 && counterTwo == 0 && counterThree == 0 && counterFour == 0){ //hvis ingen terninger har slået 1,2,3 eller 4 så sæt dig på første række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterFive++;
        }
        
        else if((counterOne > 0 && counterTwo == 0 && counterThree == 0 && counterFour == 0) || //hvis første række er taget og ingen på anden række så sæg dig på anden række
                (counterOne == 0 && counterTwo > 0 && counterThree == 0 && counterFour == 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree > 0 && counterFour == 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree == 0 && counterFour > 0)  )
                {
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterFive++;
        }
        
        else if((counterOne > 0 && counterTwo > 0 && counterThree == 0 && counterFour == 0) || //hvis første og anden række er taget så sæt dig på trejde række
                (counterOne > 0 && counterTwo == 0 && counterThree > 0 && counterFour == 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree == 0 && counterFour > 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree > 0 && counterFour == 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree == 0 && counterFour > 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree > 0 && counterFour > 0) ){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
        counterFive++;
        }
        
        else if((counterOne > 0 && counterTwo > 0 && counterThree > 0 && counterFour == 0) || //hvis første og anden række og trejde række er taget så dig dig på fjerde række
                (counterOne > 0 && counterTwo > 0 && counterThree == 0 && counterFour > 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree > 0 && counterFour > 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree > 0 && counterFour > 0) ){
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*3;
        counterFive++;
        }
        
        else{ //ellers sæt dig på femte række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterFive;
        yPosDie = 610;
        counterFive++;
        }
      }
      
      //if statements for terninger der ruller 6
      else if (part.eyes == 6) {
        if(counterOne == 0 && counterTwo == 0 && counterThree == 0 && counterFour == 0 && counterFive == 0){ //hvis ingen terninger har rullet 1,2,3,4 eller 5 så sæt dig på første række
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 10 +(part.dieSize+part.dieSize/2)*0;
        counterSix++;
        }
        
        else if((counterOne > 0 && counterTwo == 0 && counterThree == 0 && counterFour == 0 && counterFive == 0) || //hvis første række er taget og ingen på anden række så sæg dig på anden række
                (counterOne == 0 && counterTwo > 0 && counterThree == 0 && counterFour == 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree > 0 && counterFour == 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree == 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree == 0 && counterFour == 0 && counterFive > 0) )
                {
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*1;
        counterSix++;
        }
        
        else if((counterOne > 0 && counterTwo > 0 && counterThree == 0 && counterFour == 0 && counterFive == 0) || //hvis første og anden række er taget så sæt dig på trejde række
                (counterOne > 0 && counterTwo == 0 && counterThree > 0 && counterFour == 0 && counterFive == 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree == 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree == 0 && counterFour == 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree > 0 && counterFour == 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree == 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree == 0 && counterFour == 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree > 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree > 0 && counterFour == 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree == 0 && counterFour > 0 && counterFive > 0) ){
                  
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*2;
        counterSix++;
        }
        
        else if((counterOne > 0 && counterTwo > 0 && counterThree > 0 && counterFour == 0 && counterFive == 0) || //hvis første og anden række og trejde række er taget så dig dig på fjerde række
                (counterOne > 0 && counterTwo > 0 && counterThree == 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne > 0 && counterTwo > 0 && counterThree == 0 && counterFour == 0 && counterFive > 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree > 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree > 0 && counterFour == 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree > 0 && counterFour > 0 && counterFive == 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree > 0 && counterFour == 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree == 0 && counterFour > 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo == 0 && counterThree > 0 && counterFour > 0 && counterFive > 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree == 0 && counterFour > 0 && counterFive > 0) ){
                  
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*3;
        counterSix++;
        }
        
        else if((counterOne > 0 && counterTwo > 0 && counterThree > 0 && counterFour > 0 && counterFive == 0) || //hvis første og anden række og trejde række og fjerde række er taget
                (counterOne > 0 && counterTwo > 0 && counterThree > 0 && counterFour == 0 && counterFive > 0) || // så sæt dig på femte række
                (counterOne > 0 && counterTwo > 0 && counterThree == 0 && counterFour > 0 && counterFive > 0) ||
                (counterOne > 0 && counterTwo == 0 && counterThree > 0 && counterFour > 0 && counterFive > 0) ||
                (counterOne == 0 && counterTwo > 0 && counterThree > 0 && counterFour > 0 && counterFive > 0) ){
                  
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*4;
        counterSix++;
        }
        
        else{ //ellers sæt dig på sjette række          
        xPosDie = -110+(part.dieSize+part.dieSize/2)*counterSix;
        yPosDie = 10+ (part.dieSize+part.dieSize/2)*5;
        counterSix++;
        }
      }
    
      xPosDie += part.dieSize + part.dieSize/2;
      part.DrawDie(xPosDie, yPosDie); //part betyder for hvert objekt kør funktionen DrawDie(); hvor xog y koordinater angives
    }
  }
}
