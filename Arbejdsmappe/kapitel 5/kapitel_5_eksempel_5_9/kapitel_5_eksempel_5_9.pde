float x = 100; // x location of square
float y = 0; //y location of square

float speed = 0; // speed of square
float gravity = 0.1;

void setup() {
  size(200, 200);
}

void draw() {
  background(255);
  
  //draw the ball
  fill(0);
  noStroke();
  ellipse(x, y, 10, 10);
  
  y = y + speed;
  speed = speed + gravity;
  
  //bounce it back up!
  if (y > height) {
    speed = speed * -0.95;
    
    
    
    y = height;
  }
}
