float eyeR;
float eyeG;
float eyeB;

void setup() {
  size(800,800);

}

void draw() {
  background(255);
  
  //Set ellipses and rects to CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  
  translate(mouseX, mouseY); //shapes after translate is relavtive to mouse position
  
  //Draw Zoog's body
  stroke(0);
  fill(150);
  rect(0, 0, 20, 100);
  
  //Draw Zoog's head
  stroke(0);
  fill(255);
  ellipse(0, -30, 60, 60);
  
  //Draw Zoog's eyes
  eyeR = random(255);
  eyeG = random(255);
  eyeB = random(255);
  fill(eyeR, eyeG, eyeB);
  ellipse(-19, -30, 16, 32);
  ellipse(19, -30, 16, 32);
  
  //Draw Zoog's legs
  stroke(150);
  line(-10, 50, -20, 60);
  line(10, 50, 20, 60);

}
