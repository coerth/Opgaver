void setup() {
  size(600, 600); // Set the size of the window
}

void draw() {
  background(255) ; // Draw a white background

//Set ellipses and rectangles to CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);

// Draw Zoog's body
  stroke(0);
  fill(150);
  rect(mouseX, mouseY, 20, 100);

// Draw Zoog's head
  fill(255);
  ellipse(mouseX, mouseY-30, 60, 60);

// Draw Zoog's eyes
  fill(0);
  ellipse(mouseX-19, mouseY-30, 16, 32);
  ellipse(mouseX+19, mouseY-30, 16, 32);

// Draw Zoog's legs
  stroke(0);
  line(mouseX-10, mouseY+50, pmouseX-10,pmouseY +60);
  line(mouseX+10, mouseY+50, pmouseX+10, pmouseY + 60);
}
void mousePressed() {
  println("Take me to your leader!");
}
