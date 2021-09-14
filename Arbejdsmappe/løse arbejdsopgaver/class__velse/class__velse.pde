Name mitNavn;
Name martin;
Name jens;

class Name {
  String name;
  int age;
  int oldage;

  Name(String name, int age) {

    this.name = name;
    println("your name is "+name);
    this.age = age;
    this.oldage = age+30;
  }

  public String nameLength() {
    return name+" Your name is "+name.length()+" characters long.";
  }
  String yourAge() {
    return "Your age is "+age+" and your old age is "+oldage;
  }

  public int getAge() {
    return this.age;
  }
  
 public void setAge(int newAge) {
    this.age = newAge;
  }
}

void setup() {
  mitNavn = new Name("Morten", 10);
  println( mitNavn.getAge() );
  mitNavn.setAge(20);
  println ( mitNavn.getAge() );
}

void draw() {
 println( mitNavn.getAge() ); //funktioner kan kaldes i flere steder
}


void keyPressed() {
println(mitNavn.getAge() ); //funktioner kan kaldes i flere steder
}
