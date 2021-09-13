//starting angle

float theta = 0.0;

void setup() {
  size(200, 200);
}

void draw() {
  background(255);

  //increment theta (try different values for "angular velocity" here)
  theta += 0.02;

  noStroke();
  fill(0);

  float x = theta;

  //a simple way to draw the wave with an ellipse at each location
  for (int i = 0; i <= 20; i++) {

    // calculate y value based off of sine function using map()
    float y = map(sin(10), -1, 1, 0, height);

    // draw an ellipse
    ellipse(i*10, y, 16, 16);

    //move along x-axis
    x += 0.02;
  }
}
