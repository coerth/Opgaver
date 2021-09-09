int xPos;
int xPosNew, yPosNew;
int speed;
int acceleration;
int direction;

void setup() {
  size(400, 400);
  xPos=20;
  speed=1;
  acceleration=2;
  direction=-1;
  xPosNew=1;
  yPosNew= (int) (random(0,height)+4.3);
}

void draw() {
  background(255);
  fill(120, 120, 0, 40);
  circle(xPos, 200, 40);
  circle(xPos, yPosNew, 40);
  xPos=xPos + speed;

  if(xPos > width || xPos < 0) {
    speed = speed * direction;
  }
  
}
void mousePressed() {
  speed = speed * acceleration;
}

void keyPressed() {
 speed = speed * direction; 
}
