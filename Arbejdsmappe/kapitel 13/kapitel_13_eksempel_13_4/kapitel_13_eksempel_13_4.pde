float time = 0.0;
float increment = 0.01;

void setup() {
size(200,200);
}

void draw() {
background(255);
float n = noise(time) * width;


fill(0);
ellipse(width/2, height/2, n, n);

time += increment;
}
