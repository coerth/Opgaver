Car myCar1;
Car myCar2;

void setup() {
  size(200, 200);

  //initialize Car object
  myCar1 = new Car(color(255, 0, 0), 0, 100, 2);
  myCar2 = new Car(color(0, 0, 255), 0, 10, 1);
}

void draw() {
  background(255);
  // Operate Car object.
  myCar1.move();
  myCar1.display();
  myCar2.move();
  myCar2.display();
}

class Car { //Class

  color c;
  float xPos;
  float yPos;
  float xSpeed;

  Car(color tempC, float tempxPos, float tempyPos, float tempxSpeed) { //Constructor
    c = tempC;
    xPos = tempxPos;
    yPos = tempyPos;
    xSpeed = tempxSpeed;
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
