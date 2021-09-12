Zoog zoog;

void setup(){
  size(200, 200);
  zoog = new Zoog(100, 125, 60, 60, 16);
}

void draw(){
  background(255);
  //mouseX position determines speed factor
  float factor = constrain(mouseX/10, 0, 5);
  zoog.jiggle(factor);
  zoog.display();
}

class Zoog { // Class
  // Zoog's variables
  float xPos, yPos, zoogW, zoogH, eyeSize;
  
  // Zoog constructor
  Zoog(float tempxPos, float tempyPos, float tempzoogW, float tempzoogH, float tempeyeSize) {
    xPos = tempxPos;
    yPos = tempyPos;
    zoogW = tempzoogW;
    zoogH = tempzoogH;
    eyeSize = tempeyeSize;
  }
  
  // Move Zoog
  void jiggle(float zoogSpeed) {
    //change the location of Zoog randomly
    xPos = xPos + random(-1, 1) * zoogSpeed;
    yPos = yPos + random(-1, 1) * zoogSpeed;
    
    //constrain Zoog to window
    xPos = constrain(xPos, 0, width);
    yPos = constrain(yPos, 0, height);
  }
  
  //Display Zoog
  void display() {
    //Set ellipses and rects to CENTER mode
    ellipseMode(CENTER);
    rectMode(CENTER);
    
    //Draw Zoog's arms with a for loop
      for (float i = yPos -zoogH/3; i < yPos + zoogH/2; i += 10) {
      stroke(0);
      line(xPos -zoogW/4, i, xPos + zoogW/4, i);
    }
    
    //Draw Zoog's body
    stroke(0);
    fill(175);
    rect(xPos, yPos, zoogW/6, zoogH);
    
    //draw Zoog's head
    stroke(0);
    fill(255);
    ellipse(xPos, yPos - zoogH, zoogW, zoogH);
    
    //draw zoog's eyes
    
   fill(0);
   ellipse(xPos - zoogW/3, yPos - zoogH, eyeSize, eyeSize*2);
   ellipse(xPos + zoogW/3, yPos - zoogH, eyeSize, eyeSize*2);
   
   //draw zoog's legs
   stroke(0);
   line(xPos - zoogW/12, yPos + zoogH/2, xPos - zoogW/4, yPos + zoogH/2 +10);
   line(xPos + zoogW/12, yPos + zoogH/2, xPos + zoogW/4, yPos + zoogH/2 +10);
  }
}
