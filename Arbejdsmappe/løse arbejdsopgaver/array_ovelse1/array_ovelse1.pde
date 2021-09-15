/*
int random = (int) random(1, 9);

float[] floatArrayRandom = new float [random];
int[]   intArrayRandom = new int [floatArrayRandom.length];

for (int i = 0; i < floatArrayRandom.length; i++) {
  floatArrayRandom[i] = random(1, 9);
}

for (int j = 0; j <= intArrayRandom.length-1; j++) {
  intArrayRandom[j] = (int) floatArrayRandom[j];
}


println(floatArrayRandom);
println(" ");
println(intArrayRandom);

*/
Person[] johns = new Person [5];

void setup() {
  
Person Morten;
  Morten = new Person("Morten", 32, 1.85);

println(Morten.getAlder() );
println(Morten.getHoejde() );
johns[0] = Morten; 
Morten.setAlder(20);
Morten.setHoejde(2.50);

println(Morten.getAlder() );
println(Morten.getHoejde() );


println(johns[0].getAlder() );
}

class Person {
 Person[] personArray = new Person[0];
 String navn;
 int alder;
 float hoejde;
 
public Person(String navn, int alder, float hoejde) {
 this.navn = navn;
 this.alder = alder;
 this.hoejde = hoejde;
 
 }
 public int getAlder() {
 return alder;
 }
 
 public void setAlder(int alder) {
 this.alder = alder;
 }
 
 public float getHoejde() {
 return hoejde;
 }
 
 public void setHoejde(float hoejde) {
 this.hoejde = hoejde;
 }
}
