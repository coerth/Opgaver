color red = color(255, 0, 0);
color green = color(0, 255, 0);
color yellow = color(255, 255, 0);
color black = color(0, 0, 0);
color gray = color(128, 128, 128);
int state = 0;

void setup() {
  size(640, 640);
  background(255);
  frameRate(100);
}

void draw() {
  if (state == 0) {
    fill(black);
    rect(width/3, height/3, width/3, height/2);

    fill(red);
    circle(width/2, height/2-40, 80);

    fill(gray);
    circle(width/2, height/2+60, 80);

    fill(gray);
    circle(width/2, height/2+160, 80);
    
    state = 1;
    //println(state);
    delay(500);
  }

  else if (state == 1) {

    fill(red);
    circle(width/2, height/2-40, 80);

    fill(yellow);
    circle(width/2, height/2+60, 80);

    fill(gray);
    circle(width/2, height/2+160, 80);
    state = 2;
    delay(500);
    //println(state);
  }

  else if (state == 2) {
    fill(gray);
    circle(width/2, height/2-40, 80);

    fill(gray);
    circle(width/2, height/2+60, 80);

    fill(green);
    circle(width/2, height/2+160, 80);
    state = 3;

    //println(state);
    delay(500);
  }

  else if (state == 3) {

    fill(gray);
    circle(width/2, height/2-40, 80);

    fill(yellow);
    circle(width/2, height/2+60, 80);

    fill(gray);
    circle(width/2, height/2+160, 80);
    //println(state);
    state = 0;
    delay(500);
  }
}
