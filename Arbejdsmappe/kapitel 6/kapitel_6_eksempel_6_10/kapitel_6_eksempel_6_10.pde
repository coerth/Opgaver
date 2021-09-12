int x = 100;
int y = 100;
int w = 60;
int h = 60;
int eyeSize = 16;

int xSpeed = 3;
int ySpeed = 1;

void setup() {
  size(200, 200);
}

void draw() {
  //change the lcation of Zoog by speed
  x = x + xSpeed;
  y = y + ySpeed;
  
  if ( (x > width) || (x < 0) ) {
    xSpeed = xSpeed * -1;
  }
  
  if ( (y > height) || (y < 0) ) {
    ySpeed = ySpeed * -1;
  }
  
  background(255);
  ellipseMode(CENTER);
  rectMode(CENTER);
  
  // draw Zoog's arms with a for loop
  for(int i = y +5; i < y + h; i+= 10) {
    stroke(0);
    line(x-w/3, i, x+w/3, i);
  }
  
  //Draw Zoog's body
  stroke(0);
  fill(150);
  rect(x, y, w/6, h*2);
  
  //draw Zoog's head
  fill(255);
  ellipse(x, y-h/2, w, h);
  
  //draw zoog's eyes
  fill(0);
  ellipse(x-w/3, y-h/2, eyeSize, eyeSize*2);
  ellipse(x+w/3, y-h/2, eyeSize, eyeSize*2);
  
  //draw Zoog's legs
  stroke(0);
  line(x-w/12, y+h, x-w/4, y+h+10);
  line(x+w/12, y+h, x+w/4, y+h+10);
}
