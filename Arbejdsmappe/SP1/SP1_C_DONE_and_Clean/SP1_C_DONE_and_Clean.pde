//SP1 C lavet af Casper, Mia og Morten.

//Opretter en class for en terning
class Die implements Comparable<Die> { // min klasse 'die'
  // Comparable gør det muligt for sort() at sammenligne enkle Dies i mod hinanden.
  //implementeringen af interfacet medgøre at der nu kommer en "int compareTo" metode i classen
  color eyeColor;
  color dieColor;
  public int eyes; //min attribut hedder eyes
  int dieSize = 100;
  int dieEdge = 15;
  


  // vores konstruktor som når vi skriver enten eye eller dieColor så sætter den sine classes til det vi har skrevet.
  // f.eks. Vi vil gerne have den i den og den her farve. Grøn terning med røde øjne
  public Die (color eyeColor, color dieColor) {
    this.eyeColor= eyeColor; // man bruger this. når det kommer til at programmere en konstruktør
    this.dieColor= dieColor;
    roll();
  }

  public int roll() { // navngiver min metode roll - Den viser hvad der sker i den her metode - terningen rulles - Der retuneres en int værdi.
    eyes =  (int)random(1, 7);
       return eyes;
  }

  //tegner hele terningen, på x,y
  //Vi retunere ikke en værdi, fordi vi ikke skal bruge en derfor (void)
  void DrawDie(int xPosDie, int yPosDie) {
    fill(dieColor);
    rect(xPosDie, yPosDie, dieSize, dieSize, dieEdge);

    //En switch er en metode hvor vi kan have flere cases i, som kan referes til via en variabel.
    switch(eyes) {

      // tegn øjne på for hvert slag / care 1 - 1 øje, case 2 - 2 øjne osv samt deres placering.
      // Har en default - er der ingen cases tilgængelige cases
      //( f.eks. eyes ikke er sat) skal den pr default "gøre noget/ en specielt ting som vi sætter det til" f.eks her. 1 øje.

    case 1:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      //println("case" +1);   // Der er sat println() for at vise os om den rammer den rigtige case ift øjnene på terningen.
      break;
    case 2:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      break;
    case 3:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      break;
    case 4:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.75, dieSize*0.20);
      break;
    case 5:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      break;
    case 6:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.50, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.50, dieSize*0.20);
      break;

    default:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      break;
    }
  }
  public int compareTo(Die otherDie) { // benyttes af sort metoden, via Comparable sat på classen
    return this.eyes - otherDie.eyes; //udfaldet er negativ hvis denne Die har færre øjne, 0 hvis de er ens og positiv hvis den har flere
    // i forhold til sort betyder negativ at denne Die placeres til venstre og ved 0 eller positiv til højre tror jeg
  }
}
