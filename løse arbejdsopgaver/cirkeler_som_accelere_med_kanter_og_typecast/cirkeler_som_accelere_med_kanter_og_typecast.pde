int diameter = 40;

//rød cirkel 
int xPos;
int yPos;
int xSpeed;
int ySpeed;
int acceleration;
int direction;
float xPosCollision = xPos;
float yPosCollision = yPos;

//grøn cirkel
int xPosNew, yPosNew;
int xSpeedNew;
int ySpeedNew;
int accelerationNew;
int directionNew;
float xPosNewCollision = xPosNew;
float yPosNewCollision = yPosNew;

float collision = diameter/2+5;


void setup() {
  size(400, 400);
  xPos=200;
  yPos=200;
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
  fill(255, 0, 0, diameter);
  circle(xPos, yPos, diameter);
  xPos = xPos + xSpeed;
  yPos = yPos + ySpeed;


  //Grøn cirkel
  fill(0, 255, 0, diameter);
  circle(xPosNew, yPosNew, diameter);
  xPosNew = xPosNew + xSpeedNew;
  yPosNew = yPosNew + ySpeedNew;

  //hold dig inden for vinduet på X-aksen
  if (xPos > (width - diameter/2) || xPos < (0 + diameter/2)) {
    xSpeed = xSpeed * direction;
  }

  if (xPosNew > (width - diameter/2) || xPosNew < (0 + diameter/2)) {
    xSpeedNew = xSpeedNew * directionNew;
  }
  
  if(dist(xPos, yPos, xPosNew, yPosNew) <= collision){
    xSpeed = xSpeed * direction;
    xSpeedNew = xSpeedNew * directionNew;
    ySpeed = ySpeed * direction;
    ySpeedNew = ySpeedNew * directionNew;
  }
  
 

  //hold dig indenfor vinduet på Y-aksen
  if (yPos > (height - diameter) || yPos < diameter) {
    ySpeed = ySpeed * direction;
  }


  if (yPosNew > (height - diameter) || yPosNew < diameter) {
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
