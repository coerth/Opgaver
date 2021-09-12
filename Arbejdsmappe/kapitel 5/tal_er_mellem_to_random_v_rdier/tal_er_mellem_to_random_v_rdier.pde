int tal = (int) random(1, 30);
int talHurdle1 = (int) random(1, 30);
int talHurdle2 = (int) random(1, 30);

if(tal > talHurdle1 && tal < talHurdle2 ) {
  println("Tallet "+tal+" er større end talHurdle1 "+talHurdle1+" og mindre end talHurdle2 "+talHurdle2+"!");
}

else if(tal < talHurdle1 && tal > talHurdle2) {
  println("Tallet "+tal+" er mindre end talHurdle1 "+talHurdle1+" og større end talHurdle2 "+talHurdle2+"!");
}

else if(tal > talHurdle1 && tal > talHurdle2){
  println("Tallet "+tal+" er større end talHurdle1 "+talHurdle1+" og større end talHurdle2 "+talHurdle2+"!");
}

else if(tal < talHurdle1 && tal < talHurdle2){
  println("Tallet "+tal+" er mindre end talHurdle1 "+talHurdle1+" og mindre end talHurdle2 "+talHurdle2+"!");
}

else if(tal == talHurdle1 && tal < talHurdle2){
  println("Tallet "+tal+" er lig med talHurdle1 "+talHurdle1+" og mindre end talHurdle2 "+talHurdle2+"!");
}

else if(tal == talHurdle1 && tal > talHurdle2){
  println("Tallet "+tal+" er lig med talHurdle1 "+talHurdle1+" og større end talHurdle2 "+talHurdle2+"!");
}

else if(tal < talHurdle1 && tal == talHurdle2){
  println("Tallet "+tal+" er mindre end talHurdle1 "+talHurdle1+" og lig med talHurdle2 "+talHurdle2+"!");
}

else if(tal > talHurdle1 && tal == talHurdle2){
  println("Tallet "+tal+" er større end talHurdle1 "+talHurdle1+" og lig med talHurdle2 "+talHurdle2+"!");
}

else{
  println("Tallet "+tal+" er lig med talHurdle1 "+talHurdle1+" og talHurdle2 "+talHurdle2+"!");
}
