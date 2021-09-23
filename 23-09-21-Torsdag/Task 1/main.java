public class main{

public static void main(String[] args) {
System.out.println("Her står noget");
printEmptyLine();
System.out.println("Her står noget igen");
printAgeAndName("Morten", 32);


}

public static void printEmptyLine() {
  System.out.println();
}

public static void printAgeAndName(String name, int age){

  System.out.println("My name is "+name+" I am "+age+" years old");

}
}
