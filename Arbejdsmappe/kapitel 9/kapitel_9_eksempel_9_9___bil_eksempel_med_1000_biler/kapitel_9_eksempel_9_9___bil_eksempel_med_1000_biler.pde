Car[] cars = new Car[100];


void setup() {
  size(200, 200);

  //initialize Car arrays
  for (int i = 0; i < cars.length; i++) {
    cars[i] = new Car(color(i*2), 0, i*2, i);
  }

}

void draw() {
  background(255);
  // Operate Car arrays. lav den visuelle bil og bevæg den
  for (int i = 0; i < cars.length; i++) {
  cars[i].move();
  cars[i].display();
  }
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
