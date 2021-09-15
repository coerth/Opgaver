void lavCirkeler(int antalCirkler) {

  for (int i = 0; i < antalCirkler; i++) { //her sættes hvor mange cirkeler der skal genereres og puttes ind i arraylisten
    //random værdi til RGB
    int randomColorRed = (int) random(255); //random int værdi til rød
    int randomColorGreen = (int) random(255); //random int værdi til grøn
    int randomColorBlue = (int) random(255); //random int værdi til blå

    //parametrene for de cirkeler der skal laves, her bruges ArrayList.add() for at add arraylisten
    cirkelList.add(new Cirkel(width/2, height/2, random(5), random(5), 40, color(randomColorRed, randomColorGreen, randomColorBlue) ) );
  }
}

void cirkelMoveDisplay() {
//enchanced loop hvor at der dynamisk tages hensyn til hvor mange objekter der er i arraylisten
  //her bruges (Class part : ArrayList) hvor den starter med det første objekt og bevæger sig ned i listen så længe den kan
  for (Cirkel part : cirkelList) { 
    part.display(); //part referer til hver cirkels (eller hvor objekts) funktioner
    part.move();    //part referer til hver cirkels (eller hvor objekts) funktioner
  }
}

/*  //"Normalt" loop hvor i referer til hvert objekt for display og move
   for(int i = 0; i > 5; i ++) { 
   cirkelList.get(i).display(); 
   cirkelList.get(i).move();
   }
   */
