Spiller Morten;
Spiller Casper;

void setup() {
  Morten = new Spiller("Morten");
  println(Morten.baeger);
  Casper = new Spiller("Casper");
  println(Casper.baeger);
}

class Spiller {
  int[] baeger = new int [6] ;
  String spillerNavn;

  Spiller(String spillerNavn) {
    this.spillerNavn = spillerNavn;
    startTerninger();
  }

  void startTerninger() {
    for (int i = 0; i <= this.baeger.length-1; i++) {
      this.baeger[i] = (int) random(1, 6);
    }
  }
}  
