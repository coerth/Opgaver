//arraylist for person objekter med navn PersonArray
ArrayList<Person> PersonArray = new ArrayList<Person>(); 

void setup() {
  //for lavning af nye Person objekter
  for(int i = 0; i < 4; i ++){
  PersonArray.add(new Person("Morten", 32+i, 1.86+i) );
  }
  
  //Hent alder og højde for hvert objekt i arraylisten PersonArray
  for(Person part : PersonArray){
  part.getAlder();
  println(part.getAlder() );
  
  
  part.getHoejde();
  println(part.getHoejde() );
  }

}

class Person {
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
