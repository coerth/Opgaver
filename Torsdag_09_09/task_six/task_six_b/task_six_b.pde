int x = 12; //(int) random(0,30);
int y = 12; //(int) random(0,30);
int z = 6; //(int) random(0,30);
int sum = x+y+z;

if(sum == 30 && x !=10 && x != 20 && x !=30 && y != 10 && y != 20 && y != 30 && z != 10 && z != 20 && z != 30 ){
  println("success! "+"x er "+x+" y er "+y+" z er "+z+" og sum er "+sum);
}

else{
  println("failure! "+"x er "+x+" y er "+y+" z er "+z+" og sum er "+sum);
} 
