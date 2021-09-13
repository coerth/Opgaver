Cell[] [] grid;

int cols = 10;
int rows = 10;

void setup() {
  size(640, 640);
  grid = new Cell[cols][rows];
  for (int i = 0; i < cols; i++) {
    for (int j = 0; j < rows; j++) {
      //initialize each object
      grid[i][j] = new Cell(i*width/10, j*height/10, width/10, height/10, i+j);
    }
  }
}

void draw() {
  background(0);
  for (int i = 0; i < cols; i++) {
    for (int j = 0; j < rows; j++) {
      //Oscillate and display each object
      grid[i][j].oscillate();
      grid[i][j].display();
    }
  }
}

class Cell {
  float x;
  float y;
  float w;
  float h;
  
  float angle;
  
  Cell(float tempX, float tempY, float tempW, float tempH, float tempAngle) {
    x = tempX;
    y = tempY;
    w = tempW;
    h = tempH;
    angle = tempAngle;
  }
  
  void oscillate() {
  angle += 0.02;
  }
  
  void display() {
  stroke(255);
  
  float bright = map(sin(angle), -1, 1, 0, 255);
  fill(bright);
  rect(x, y, w, h);
  }
}
