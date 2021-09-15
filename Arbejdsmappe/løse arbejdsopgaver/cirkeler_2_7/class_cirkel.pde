//Selve class'en som indeholder variabler, funktioner(bevægelse og selve cirklen) som vil være gældende for hver cirkel
class Cirkel {
  float xPos;
  float yPos;
  float xSpeed;
  float ySpeed;
  float xDirection;
  float yDirection;
  float diam;
  color c;

  //constructoren som gør at vi kan lave flere cirkler og forbinde de værdier med class'ens værdier
 public Cirkel(float xPos, float yPos, float xSpeed, float ySpeed, float diam, color c) {    
    this.xPos = xPos;
    this.yPos = yPos;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
    this.diam = diam;
    this.c = c;
  }

  //tegn cirkel
 public void display() {
    fill(c);
    circle(xPos, yPos, diam);
  }

  //bevægelse til cirkelen
 public void move() {
    xPos = xPos + xSpeed;
    yPos = yPos + ySpeed;
    xDirection = -1;
    yDirection = -1;

    //skift retning når x-værdien rammer udenfor
    if (xPos > width - diam/2 || xPos < 0 + diam/2) {
      xSpeed = xSpeed * xDirection;
    }

    //skift retning når y-værdien rammer udenfor
    if (yPos > height - diam/2 || yPos < 0 + diam/2) {
      ySpeed = ySpeed * yDirection;
    }
  }
}
