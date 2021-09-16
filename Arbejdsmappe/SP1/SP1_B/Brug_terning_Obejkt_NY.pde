//Mit objekt

Die terning1 = new Die(0, 255);  //sort-0 OG hvid-255 farve // skal være uden for setup ellers definere jeg først når der kommer et objekt under setup og så kan draw ikke se at jeg vil have et objekt. 
DiceCup DC= new DiceCup();


public void settings() {
  size(1200, 800);
}
//vi vil have en tæller for hver af vores 6 værdier. 
int eyeCounterOne;
int eyeCounterTwo;
int eyeCounterThree;
int eyeCounterFour;
int eyeCounterFive;
int eyeCounterSix;



// setup / draw for at bruge en funktion. 
void setup() {
}

// fordi vi gerne vil have at der tegnes en ny terning for den nye værdi hver gang, sættes den i draw. 
void draw() {
  for (Die part : DiceCupArray) {//starter med den første Die objekt i ArrayListen, indtil slutningen af ArrayListen og start forfra.

 /*
 if (part.eyes == 1) {
      eyeCounterOne ++;
    }
  else if(part.eyes ==2){
      eyeCounterTwo ++;
  }
  else if(part.eyes ==3){
      eyeCounterThree ++;
  }
  else if(part.eyes ==4){
      eyeCounterFour ++;
  }
  else if(part.eyes ==5){
      eyeCounterFive ++;
  }
  else if(part.eyes ==6){
      eyeCounterSix ++;
  } 
   
  */

    part.DrawDie(); //part betyder for hvert objekt kør funktionen DrawDie();
    //part.DrawDie(10+dieSize,10,100);
   
  }
}

// ved tryk på 'a' rulles terning og viser en ny værdi. 
void keyPressed() {
  if (key == ENTER) {
    for (Die part : DiceCupArray) { //starter med den første Die objekt i ArrayListen, indtil slutningen af ArrayListen og start forfra.
      part.roll(); //part betyder for hvert objekt kør funktionen roll();
    }
  }
  //når vi klikker b tilføjer vi en terning til vores arraylist, og derefter ændre vi vores xPosition på den næsten terning
  if (key=='b') { 
    
    DC.addDie();
    for (Die part : DiceCupArray) { // samme lykke som oppe i a, som går gennem hver objekt i listen.
    part.xPosDie += part.dieSize + part.dieSize/2; // tilføjer en ny xPos til vores næste Die 
    }
  }
  //terning1.roll();
}
