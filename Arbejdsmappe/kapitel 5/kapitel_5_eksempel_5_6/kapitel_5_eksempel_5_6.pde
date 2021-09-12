int x = 0;
int speed = 1;

void setup() {
  size(200, 200);
}

void draw() {
  background(255);
  x = x + speed;
  
  if ( (x > width) || (x < 0) ) {
    speed = speed * -1;
  }
  
  //display circle at x location
  stroke(0);
  fill(175);
  ellipse(x, 100, 32, 32);
}
  
