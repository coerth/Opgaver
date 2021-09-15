


class Die {
  color eyeColor; 
  color dieColor;
  int eyeValue;

  public  Die(color eyeColor, color dieColor) {
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
    rollDie();
  }


  public  int rollDie() {
    eyeValue = (int) random(1, 7);
    return eyeValue;
  }
  
  void displayDie() {
  rectMode(CENTER);
  stroke(0);
  fill(dieColor);
  
  
  }
}
