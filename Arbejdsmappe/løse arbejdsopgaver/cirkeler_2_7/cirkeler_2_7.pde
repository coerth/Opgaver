//Array List for cirkeler
ArrayList<Cirkel> cirkelList = new ArrayList<Cirkel>();

//opretter cirkelerne her og andre ting der skal sættes én gang
void setup() {
  size(300, 300, P2D);
  lavCirkeler(20);
  }

//kalder cirkelernes visning og bevægelse i draw da den kører i loop (hvis cirklerne laves her bliver de nulstillet hele tiden)
void draw() {
  background(255);
  cirkelMoveDisplay();
}
