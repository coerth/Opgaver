void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";   
    println(output);
  }
  
  
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 3; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here: 
  if(!weekend){
  
    if(weekDay == 0){
      println("It's Monday!");
    }
     if(weekDay == 1){
       println("It's Tuesday!");
    }
     if(weekDay == 2){
       println("It's Wednesday!");
    }
    if(weekDay == 3){
      println("It's Thursday!");
    }
    if(weekDay == 4){
      println("it's Friday!");
    }
  } 
  // Print if it is weekend here:
  if(weekend){
    
    if(weekDay == 5){
      println("It's Saturday!");
    }
     if(weekDay == 6){
       println("It's Sunday!");
    }
    
  }
    
}
