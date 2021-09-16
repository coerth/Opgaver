//Mit objekt

Die terning1 = new Die(0,255);  //sort-0 OG hvid-255 farve // skal være uden for setup ellers definere jeg først når der kommer et objekt under setup og så kan draw ikke se at jeg vil have et objekt. 
public void settings() {
  size(600, 600);
}
// setup / draw for at bruge en funktion. 
void setup(){

}

// fordi vi gerne vil have at der tegnes en ny terning for den nye værdi hver gang, sættes den i draw. 
void draw(){
terning1.DrawDie(10, 10, 100);
}

// ved tryk på 'a' rulles terning og viser en ny værdi. 
void keyPressed(){
if(key == 'a')
terning1.roll();
}
