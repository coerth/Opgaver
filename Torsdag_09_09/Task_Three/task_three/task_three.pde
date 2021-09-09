color red = color(255,0,0);
color green = color(0,255,0);
color yellow = color(255,255,0);
color black = color(0,0,0);
color gray = color(128,128,128);
boolean redLight = true;

void setup() {
  size(640,640);
  background(255);
  frameRate(25);
}

void draw() {
  fill(black);
  rect(width/3, height/3, width/3 , height/2);
  
  fill(red);
  circle(width/2, height/2-40, 80);
  
  fill(gray);
  circle(width/2, height/2+60, 80);
  
  fill(gray);
  circle(width/2, height/2+160, 80);
  
  
  if(redLight == true){
    
      fill(gray);
      circle(width/2, height/2-40, 80);
      
      fill(red);
      circle(width/2, height/2-40, 80);

      fill(yellow);
      circle(width/2, height/2+60, 80);
      
 
      fill(gray);
      circle(width/2, height/2+160, 80);
      delay(500);
      
      fill(gray);
      circle(width/2, height/2-40, 80);
  
      fill(gray);
      circle(width/2, height/2+60, 80);
  
      fill(green);
      circle(width/2, height/2+160, 80);
      redLight = false;
  }
/*
  else if(redLight == false){
    
      fill(gray);
      circle(width/2, height/2-40, 80);

      fill(yellow);
      circle(width/2, height/2+60, 80);
      
      fill(gray);
      circle(width/2, height/2+160, 80);
      delay(500);
      
      fill(gray);
      circle(width/2, height/2-40, 80);
  
      fill(gray);
      circle(width/2, height/2+60, 80);
  
      fill(green);
      circle(width/2, height/2+160, 80);
      redLight = true;
    
  }
*/
}
