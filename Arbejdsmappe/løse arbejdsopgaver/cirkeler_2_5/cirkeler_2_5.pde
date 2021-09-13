Cirkel roedCirkel1;
Cirkel blaaCirkel1;


void setup() {
  size(300, 300);
  roedCirkel1 = new Cirkel(51, 200, 2, 2, 40, color(255, 0, 0));
  blaaCirkel1 = new Cirkel(100, 50, 3, 3, 30, color(0, 0, 255));
}

void draw() {
  background(255);

  roedCirkel1.display();
  roedCirkel1.move();
  blaaCirkel1.display();
  blaaCirkel1.move();
  collisionDetection();
  
}
//Selve class'en som indeholder variabler, bevægelse og selve cirklen
class Cirkel{
  float xPos;
  float yPos;
  float xSpeed;
  float ySpeed;
  float xDirection;
  float yDirection;
  float diam;
  color c;
  
  //constructoren som gør at vi kan lave flere cirkler og forbinde de værdier med class'ens værdier
  Cirkel(float tempxPos, float tempyPos, float tempxSpeed, float tempySpeed, float tempdiam, color tempC) {
    xPos = tempxPos;
    yPos = tempyPos;
    xSpeed = tempxSpeed;
    ySpeed = tempySpeed;
    diam = tempdiam;
    c = tempC;
  }
  
  //tegn cirkel
  void display() {
    fill(c);
    circle(xPos, yPos, diam);
  }
  
  //bevægelse til cirkelen
  void move() {
    xPos = xPos + xSpeed;
    yPos = yPos + ySpeed;
    xDirection = -1;
    yDirection = -1;
    
    //skift retning når x-værdien rammer udenfor
    if(xPos > width - diam/2 || xPos < 0 + diam/2) {
      xSpeed = xSpeed * xDirection;
    }
    
    //skift retning når y-værdien rammer udenfor
    if(yPos > height - diam/2 || yPos < 0 + diam/2){
      ySpeed = ySpeed * yDirection;
    } 
    
  }
}

void collisionDetection(boolean hit, boolean delayHit) {
  
  if(dist(roedCirkel1.xPos, roedCirkel1.yPos, blaaCirkel1.xPos, blaaCirkel1.yPos) <= 30){

    hit = true;
    delayHit = true;
  }
    
    else if(dist(roedCirkel1.xPos, roedCirkel1.yPos, blaaCirkel1.xPos, blaaCirkel1.yPos) > 30){
      
      hit = false;
      delayHit = false;
    }
}

void changeDir() {
    
  if(collisionDetection.hit && !collisionDetection.delayHit); {
    roedCirkel1.xSpeed = roedCirkel1.xSpeed * roedCirkel1.xDirection;
    roedCirkel1.ySpeed = roedCirkel1.ySpeed * roedCirkel1.yDirection;
    blaaCirkel1.xSpeed = blaaCirkel1.xSpeed * blaaCirkel1.xDirection;
    blaaCirkel1.ySpeed = blaaCirkel1.ySpeed * blaaCirkel1.yDirection;
  }
  
  
}
