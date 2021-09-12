float c1 = 0;
float c2 = 255;

float c1Change = 1;
float c2Change = -1;

void setup() {
  size(200, 200);
}

void draw() {
  noStroke();
  
  //draw rectangle of the left
  fill(c1, 0, c2);
  rect(0, 0, 100, 200);
  
  //draw rectangle of the right
  fill(c2, 0, c1);
  rect(100, 0, 100, 200);
  
  // adjust color values
  c1 = c1 + c1Change;
  c2 = c2 + c2Change;
  
  //reverse direction of color change
  if (c1 < 0 || c1 > 255){
    c1Change *= -1;
  }
  
  if(c2 < 0 || c2 > 255){
    c2Change *= -1;
  }
}
