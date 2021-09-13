float [] values = new float[1000];

//lav et array med 1000 og put random værdier ind mellem 0 og 10
for (int n = 0; n < 1000; n++) {
  values[n] = random(1, 10);
  println(n+" "+values[n]);
}

//reset array til 0
for (int i = 0; i < values.length; i++) {
  values[i] = 0;
  println(i+" "+values[i]);
}
