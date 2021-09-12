int xPos;
int yPos;
int xPosNew, yPosNew;
int xSpeed;
int xSpeedNew;
int ySpeed;
int ySpeedNew;
int acceleration;
int accelerationNew;
int direction;
int directionNew;

void setup() {
  size(400, 400);
  xPos=(int) random(0, width);
  yPos=(int) random(0, height);
  xSpeed=1;
  xSpeedNew=2;
  ySpeed=1;
  ySpeedNew=2;
  acceleration=2;
  accelerationNew=4;
  direction=-1;
  directionNew=-1;
  //xPosNew=1;
  xPosNew=(int) random(0, width);
  yPosNew= (int) (random(0, height)+4.3);
}

void draw() {
  background(255);

  //Rød cirkel
  fill(255, 0, 0, 40);
  circle(xPos, yPos, 40);
  xPos = xPos + xSpeed;
  yPos = yPos + ySpeed;


  //Grøn cirkel
  fill(0, 255, 0, 40);
  circle(xPosNew, yPosNew, 40);
  xPosNew = xPosNew + xSpeedNew;
  yPosNew = yPosNew + ySpeedNew;

  //hold dig inden for vinduet på X-aksen
  if (xPos > width || xPos < 0) {
    xSpeed = xSpeed * direction;
  }

  if (xPosNew > width || xPosNew < 0) {
    xSpeedNew = xSpeedNew * directionNew;
  }

  //hold dig indenfor vinduet på Y-aksen
  if (yPos > height || yPos < 0) {
    ySpeed = ySpeed * direction;
  }


  if (yPosNew > height || yPosNew < 0) {
    ySpeedNew = ySpeedNew * directionNew;
  }
}

//acceler når man klikker på musen
void mousePressed() {
  xSpeed = xSpeed * acceleration;
  ySpeed = ySpeed * acceleration;
  xSpeedNew = xSpeedNew * accelerationNew;
  ySpeedNew = ySpeedNew * accelerationNew;
}

//skift retning når man klikker på en tast
void keyPressed() {
  xSpeed = xSpeed * direction;
  ySpeed = ySpeed * direction;
  xSpeedNew = xSpeedNew * directionNew;
  ySpeedNew = ySpeedNew * directionNew;
}
