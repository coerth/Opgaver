int eyeR = 100;
int eyeG = 200;
int eyeB = 0;

void setup() {
  size(400, 400);
}

void draw() {
  background(255);
  strokeWeight(10);
  fill(120, 120, 0, 30);

  
  //hoved
  circle(mouseX, mouseY, 200);
  
  // næse
  point(mouseX, mouseY);
  
  //venstre øje
  point(mouseX-25, mouseY-25); 
  
  // højre øje
  point(mouseX+25, mouseY-25); 
  
   //mund
  line(mouseX-25, mouseY+25, mouseX+25, mouseY+25);

}
