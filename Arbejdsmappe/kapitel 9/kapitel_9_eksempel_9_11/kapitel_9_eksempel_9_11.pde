Ball[] balls = new Ball[1];

void setup() {
  size(200, 200);
  
  //initialize ball index 0
  balls[0] = new Ball(50, 0, 16);
}

void draw() {
  background(100);
  
  //update and display all balls
  for(int i = 0; i < balls.length; i++){
  //  balls[i].gravity();
    balls[i].move();
    balls[i].display();
  }
}

void mousePressed() {
  // a new ball object
  Ball b = new Ball(mouseX, mouseY, 10);
  
  //append to array
  balls = (Ball[]) append(balls, b);
}

class Ball {
  float x;
  float y;
  float speed;
  float w;
  
  Ball(float tempX, float tempY, float tempW) {
    x = tempX;
    y = tempY;
    w = tempW;
    speed = 1;
  }
  
/*
  void gravity() {
    // add gravity to speed
    speed = speed + gravity;
  }
  */
  
  void move() {
    // add speed to y location
    y = y + speed;
    // if square reaches the bottom
    //reverse speed
    if (y > height) {
      speed = speed * -0.95;
      y = height;
    }
  }
  
  void display() {
    // display the circle
    fill(255);
    noStroke();
    circle(x, y, w);
  }
}
