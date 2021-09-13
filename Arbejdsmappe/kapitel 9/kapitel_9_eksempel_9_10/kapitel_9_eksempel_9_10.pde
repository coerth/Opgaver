Stripe[] stripes = new Stripe[10];

void setup() {
  size(200, 200);
  for (int i = 0; i < stripes.length; i++) {
    stripes[i] = new Stripe();
  }
}

void draw() {
  background(100);

  //move and display all stripes
  for (int i = 0; i < stripes.length; i++) {
    stripes[i].rollover(mouseX, mouseY);
    stripes[i].move();
    stripes[i].display();
  }
}

class Stripe {          //class
  float xPos;                //horizontal location of stripe
  float speed;               //speed of stripe
  float w;                   // width of stripe
  boolean mouse;            //is the mouse over the stripe?
  
  Stripe() {          //constructor
    xPos = 0;                //all stripes start at 0
    speed = random(1);        //all stripes have a random positive speed
    w = random(10,30);
    mouse = false;
  }
  
  void display() {
    if(mouse) {
      fill(255);
    }
    else {
      fill(255,100);
    }
    noStroke();
    rect(xPos, 0, w, height);
  }
  
  void move() {
    xPos += speed;
    if(xPos < width+20) {
    xPos = -20;
    }
  }
  
  void rollover(int mx, int my) {
    //left edge is xPos, right edge is xPos + w
    if (mx < xPos && mx < xPos + w) {
    mouse = true;
    }
    else{
      mouse = false;
    }
  }
}

    
  
  
