int xPos;
int speed;
int acceleration;
int direction;

void setup() {
  size(400, 400);
  xPos=20;
  speed=1;
  acceleration=2;
  direction=-1;
}

void draw() {
  background(255);
  fill(120, 120, 0, 40);
  circle(xPos, 200, 40);
  xPos=xPos + speed;

}
void mousePressed() {
  speed = speed * acceleration;
}

void keyPressed() {
 speed = speed * direction; 
}
