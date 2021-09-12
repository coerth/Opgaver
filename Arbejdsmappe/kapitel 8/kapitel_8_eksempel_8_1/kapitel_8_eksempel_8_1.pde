Car myCar;

void setup(){
  size(200, 200);
  
  //initialize Car object
  myCar = new Car();
}

void draw() {
  background(255);
  // Operate Car object.
  myCar.move();
  myCar.display();
}

class Car { //Class
  
  color c;
  float xPos;
  float yPos;
  float xSpeed;
  
  Car() { //Constructor
    c = color(255);
    xPos = width/2;
    yPos = height/2;
    xSpeed = 1;
  }
  
  void display() {
    //this car is a square
    rectMode(CENTER);
    fill(c);
    rect(xPos, yPos, 20, 10);
  }
  
  void move() {
    xPos = xPos + xSpeed;
    if (xPos > width) {
      xPos = 0;
    }
  }
}

    
