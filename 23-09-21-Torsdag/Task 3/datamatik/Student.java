//class for Student
public class Student{
  String name;
  int age;
  boolean isFemale;
  char datamatikerTeam;

//constructor for Student
public Student(String tmpName, int tmpAge, boolean tmpIsFemale, char tmpDatamatikerTeam){
  this.name = tmpName;
  this.age = tmpAge;
  this.isFemale = tmpIsFemale;
  this.datamatikerTeam = tmpDatamatikerTeam;
}

/*
public static void main(String[] args){

  Student Student1 = new Student("Morten", 32, false, 'b');

  System.out.println(Student1.name);
  System.out.println(Student1.age);
  System.out.println(Student1.isFemale);
  System.out.println(Student1.datamatikerTeam);
}
*/

}
