Car myCar1;
Car myCar2;
Car myCar3;

void setup() {
  size(200, 200);

  //initialize Car object
  myCar1 = new Car(color(255, 0, 0), 0, 100, 2);
  myCar2 = new Car(color(0, 0, 255), 0, 10, 1);
  myCar3 = new Car(color(0, 255, 0), 0, 20, 3);
}

void draw() {
  background(255);
  // Operate Car object. lav den visuelle bil og bevæg den
  myCar1.move();
  myCar1.display();
  myCar2.move();
  myCar2.display();
  myCar3.move();
  myCar3.display();
}

class Car { //Class indeholder alt for at lave bilen

  color c;
  float xPos;
  float yPos;
  float xSpeed;

  Car(color tempC, float tempxPos, float tempyPos, float tempxSpeed) { //Constructor så man kan sætte forskellige værdier ind 
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
