int input = 20;

if (input > 0) {
  println("input er positiv");
  for (int i = input; i >=0; i--) {
    if (i == 6) {
      String six = "Six";
      println(six);
    } else if (i == input/2 ) {
      println("HALF!");
    } else {
      println(i);
    }
  }
}
if(input < 0){
  println("Input er negativ");
  for (int i = input; i <= 0; i++) {
    if (i == -6) {
      String sixMinus = "Minus Six";
      println(sixMinus);
    } else if (i == input/2 ) {
      println("HALF!");
    } else {
      println(i);
    }
  }
}
