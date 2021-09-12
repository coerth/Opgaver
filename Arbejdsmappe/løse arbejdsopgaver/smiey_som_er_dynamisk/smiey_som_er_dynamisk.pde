

void setup() {
  size(800, 800);
}

void draw() {
  background(255);
  strokeWeight(10);
  fill(120, 120, 0, 30);

  println(frameCount);
  //hoved
  circle(width/2, height/2, width/5);
  
  // næse
  point(width/2, height/2);
  
  //venstre øje
  point(width/2-width/5/2/2, height/2-height/5/2/2); 
  
  // højre øje
  point(width/2+width/5/2/2, height/2-height/5/2/2); 
  
   //mund
  line(width/2-width/5/2/2, height/2+height/5/2/2, width/2+width/5/2/2, height/2+height/5/2/2);

}
