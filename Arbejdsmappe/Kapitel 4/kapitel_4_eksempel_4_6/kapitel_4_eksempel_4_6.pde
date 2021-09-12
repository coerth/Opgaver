float r = 100;
float g = 150;
float b = 200;
float a = 200;

float diam = 20;
float x = 100;
float y = 100;

void setup() {
  size(200, 200);
}

void draw() {
  //use those variables to draw an ellipse
  noStroke();
  fill(r, g, b, a);
  ellipse(x, y, diam, diam);
}
