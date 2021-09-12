void setup() {
  size (500, 500);
  frameRate(30);
  noStroke();
  rectMode(CENTER);
  fill(20);
  rect(height/2, width/2, 150, 350);
  ellipseMode(CENTER);
  fill(90);
  ellipse(height/2, width/2-110, 100, 100);
  ellipse(height/2, width/2, 100, 100);
  ellipse(height/2, width/2+110, 100, 100);
}

void draw() {

  if(frameCount >=0 && frameCount <=100){
    fill(255,0,0);
    ellipse(height/2, width/2-110, 100, 100);
  }

    if(frameCount >=100 && frameCount <=150){
    fill(255,255,0);
    ellipse(height/2, width/2, 100, 100);
  }

    else if(frameCount >150){
      fill(90);
      ellipse(height/2, width/2-110, 100, 100);
      fill(90);
      ellipse(height/2, width/2, 100, 100);
    fill(0,255,0);
    ellipse(height/2, width/2+110, 100, 100);
  }
}
