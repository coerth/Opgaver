Person Morten;

void setup() {
Morten = new Person("Morten", 32, 1.85);

println(Morten.getAlder() );
println(Morten.getHoejde() );

Morten.setAlder(20);
Morten.setHoejde(2.50);

println(Morten.getAlder() );
println(Morten.getHoejde() );


}

class Person {
  String navn;
  int alder;
  float hoejde;
  
  Person(String navn, int alder, float hoejde) {
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
