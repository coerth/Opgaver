class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");
   }

   System.out.println(sumTwoNumbers(10, 20));                  //Integer.parseInt(args[1] ), Integer.parseInt(args[2] )  kan bruges for at lave string args til int
   System.out.println(makeUpperCase("jeg skriver med småt")); // kan skrive args[0] (for det første argument, det næste skal så være args[1])
                                                              // hvis jeg hellere vil bruge konsolen til at skrive ting med i stedet

   if(firstUpperCase("jeg starter med stort") ){              //hvis min string starter med stort så gør følgende:
     System.out.println("Det starter med stort");
   }
   else{                                                      //hvis det ikke startede med stort
     System.out.println("Det starter ikke med stort");
   }


}


public static boolean iAmHappy()
{
  if(happy){                                                  //hvis happy = true så gør følgende
  return true;
  }

  else{                                                      //ellers så gør følgende
  return false;
  }
}

//task 2 b
public static int sumTwoNumbers(int number1, int number2){  //funktion som tager 2 tal og returnerer en sum
int theSum = number1 + number2;

return theSum;
}

//task 2 c
public static String makeUpperCase(String textToUpperCase){

  return textToUpperCase.toUpperCase();
}


//task 2 d:
  public static boolean firstUpperCase(String textToCheck){
    if(Character.isUpperCase(textToCheck.charAt(0) ) ){ //tjek om det første bogstav er med stort
      return true;
    }
    else{
      return false;
    }


  }
}
