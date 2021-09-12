int tal = (int) random(1, 30);

if(tal > 5 && tal < 10 ) {
  println("Tallet "+tal+" er større end 5 og mindre end 10!");
}

else if(tal > 10 && tal < 20) {
  println("Tallet "+tal+" er større end 10 og mindre end 20!");
}

else if(tal > 20 && tal <=30){
  println("Tallet "+tal+" er større end 20 og mindre eller lig med 30!");
}

else{
  println("Tallet "+tal+" er mindre end 5!");
}
