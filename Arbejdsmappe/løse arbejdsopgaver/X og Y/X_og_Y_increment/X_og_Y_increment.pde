  int X = 10; //X er sat til 10
  int Y = 5; //Y er sat til 5

void setup(){ // kaldes en gang
 //sætter hastigheden for funktionerne
  frameRate(1); 
}; 

void draw() {
//printer X = tal og Y = tal
  println("X = " + X); 
  println("Y = " + Y) ; 
  
 //incrementer X-værdien og Y-værdien med en hver gang 
  X ++ ; 
  Y ++ ; 
  
}

//public float randowmtal () {
  //float tal = randwom(0,5);
 // return tal;
//}
