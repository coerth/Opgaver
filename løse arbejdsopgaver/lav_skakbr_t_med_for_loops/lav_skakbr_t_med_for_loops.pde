size(640,640);
background(255);

int xPos = 0;
int yPos = 0;
int skakColor = 255;

for(xPos = 0; xPos <=width; xPos += width/8){
  
  for(yPos = 0; yPos <=height; yPos += height/8){
  stroke(0);
  fill(skakColor);  
  square(xPos, yPos, width/8);
   
    if(skakColor == 255){
      skakColor = 0;
      //fill(skakColor);
     }
     
     else if(skakColor == 0){
      skakColor = 255;
      //fill(skakColor);
      }
  }
  
  yPos = 0;
}
