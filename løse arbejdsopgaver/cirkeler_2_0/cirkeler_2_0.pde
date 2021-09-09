void setup() {
  size(640, 640);
}

void draw() {
  for(int i = 0; i < 5; i++){
    cirkel(random(0,640), random(0,640), random(10,40), color( ((int) random(0,255)), ((int) random(0,255)), (((int) random(0,255))) ));
    println(i);
  }
}

void cirkel(float xPos, float yPos, float diam, color c){
  fill(c);
  circle(xPos, yPos, diam);
}
