//SP1 C lavet af Casper, Mia og Morten.

//Mit objekt

DiceCup DC= new DiceCup();

public void settings() {
  size(1200, 1200);
}

// setup / draw for at bruge en funktion.
void setup() {
  println("Tryk på 'b' for at tilføje terninger");
  println("Tryk på 'Enter' for at rulle terningerne igen");
  println("Tryk på 'c' for at sortere terningerne");
}

// fordi vi gerne vil have at der tegnes en ny terning for den nye værdi hver gang, sættes den i draw.
void draw() {
  background(255);
  DC.DrawCup(); // medføre gentegning af hele DiceCuppen
}

// ved tryk på 'a' rulles terning og viser en ny værdi.
void keyPressed() {
  if (key == ENTER) {
    println("Antal Terninger: "+DC.DiceCupArray.size() );

    for (Die part : DC.DiceCupArray) { //starter med den første Die objekt i ArrayListen, indtil slutningen af ArrayListen og start forfra.
      part.roll(); //part betyder for hvert objekt kør funktionen roll();
    }
  }
  //når vi klikker b tilføjer vi en terning til vores arraylist, og derefter ændre vi vores xPosition på den næsten terning
  if (key=='b') {
    DC.addDie();
  }
}
