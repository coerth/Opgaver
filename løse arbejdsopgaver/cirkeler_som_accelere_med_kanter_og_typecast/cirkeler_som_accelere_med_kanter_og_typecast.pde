int diameter = 40;

//rød cirkel 
int xPosRed;
int yPosRed;
int xSpeedRed;
int ySpeedRed;
int accelerationRed;
int directionRed;

//grøn cirkel
int xPosGreen, yPosGreen;
int xSpeedGreen;
int ySpeedGreen;
int accelerationGreen;
int directionGreen;

float collision = diameter/2+20;


void setup() {
  size(400, 400);
  xPosRed=(int) random(50,width-50);
  yPosRed=(int) random(50,height-50);
  xSpeedRed=1;
  ySpeedRed=1;
  accelerationRed=2;
  directionRed=-1;

  xPosGreen= (int) random(50,width-50);
  yPosGreen= (int) random(50,height-50);
  xSpeedGreen=2;
  ySpeedGreen=2;
  accelerationGreen=4;
  directionGreen=-1;
}

void draw() {
  background(255);

  //Rød cirkel
  fill(255, 0, 0, diameter);
  circle(xPosRed, yPosRed, diameter);
  xPosRed = xPosRed + xSpeedRed;
  yPosRed = yPosRed + ySpeedRed;


  //Grøn cirkel
  fill(0, 255, 0, diameter);
  circle(xPosGreen, yPosGreen, diameter);
  xPosGreen = xPosGreen + xSpeedGreen;
  yPosGreen = yPosGreen + ySpeedGreen;

  //hold dig inden for vinduet på X-aksen
  if (xPosRed > (width - diameter/2) || xPosRed < (0 + diameter/2)) {
    xSpeedRed = xSpeedRed * directionRed;
  }

  if (xPosGreen > (width - diameter/2) || xPosGreen < (0 + diameter/2)) {
    xSpeedGreen = xSpeedGreen * directionGreen;
  }

  //hold dig indenfor vinduet på Y-aksen
  if (yPosRed > (height - diameter/2) || yPosRed < diameter/2) {
    ySpeedRed = ySpeedRed * directionRed;
  }


  if (yPosGreen > (height - diameter/2) || yPosGreen < diameter/2) {
    ySpeedGreen = ySpeedGreen * directionGreen;
  }

  if (dist(xPosRed, yPosRed, xPosGreen, yPosGreen) <= collision) {
    xSpeedRed = xSpeedRed * directionRed;
    ySpeedRed = ySpeedRed * directionRed;
    xSpeedGreen = xSpeedGreen * directionGreen;
    ySpeedGreen = ySpeedGreen * directionGreen;
  }
}

//acceler når man klikker på musen
void mousePressed() {
  xSpeedRed = xSpeedRed * accelerationRed;
  ySpeedRed = ySpeedRed * accelerationRed;
  xSpeedGreen = xSpeedGreen * accelerationGreen;
  ySpeedGreen = ySpeedGreen * accelerationGreen;
}

//skift retning når man klikker på en tast
void keyPressed() {
  xSpeedRed = xSpeedRed * directionRed;
  ySpeedRed = ySpeedRed * directionRed;
  xSpeedGreen = xSpeedGreen * directionGreen;
  ySpeedGreen = ySpeedGreen * directionGreen;
}
