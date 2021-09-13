size(640,640);
background(255);

int xPos = 0;
int yPos = 0;
int skakColor = 255;

for(int i = 0; i <= 8; i++){

  for(int j = 0; j <=8; j++){  
   
    if(i%2 == 0 && j%2 == 0){
      skakColor = 255;
      //fill(skakColor);
     }
     
     else if(i%2 == 0 && j%2 != 0){
      skakColor = 0;
      //fill(skakColor);
      }
      
     else if(i%2 !=0 && j%2 == 0){
       skakColor = 0;
     }
     
     else if(i%2 != 0 && j%2 != 0){
       skakColor = 255;
     }
   
   stroke(0);
   fill(skakColor);  
   square(xPos, yPos, width/8); 
   yPos += height/8;
  }
  xPos += width/8;
  yPos = 0;
}
