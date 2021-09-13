float [] values = new float[1000];

  //lav et array med 1000 og put random værdier ind mellem 0 og 10
  for(int n = 0; n < 1000; n++) {
    values[n] = random(1,10);
    println(n+" "+values[n]);
  }
  
  //dobbel værdierne i hele arrayet
    for(int i = 0; i < 1000; i++) {
    values[i] = values[i] * 2;
    println(i+" "+values[i]);
  }
