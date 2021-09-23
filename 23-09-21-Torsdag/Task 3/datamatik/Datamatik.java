public class Datamatik{

public static void main(String[] args) {
  Student studentMorten = new Student("Morten", 32, false, 'b');  //nyt Student objekt der hedder studentMorten og dens værdier
  Student studentCasper = new Student("Casper", 26, false, 'b');  //nyt Student objekt der hedder studentCasper og dens værdier
  Teacher teacherWilliam = new Teacher("William", 30, false);     //nyt Teacher objekt der hedder teacherWilliam og dens værdier

  //vis værdierne for studentMorten
  System.out.println(studentMorten.name);
  //System.out.println(studentMorten.age);
  //System.out.println(studentMorten.isFemale);
  System.out.println(studentMorten.datamatikerTeam);

  //vis værdierne for studentCasper
  System.out.println(studentCasper.name);
  //System.out.println(studentCasper.age);
  //System.out.println(studentCasper.isFemale);
  System.out.println(studentCasper.datamatikerTeam);

  //vis værdierne for teacherWilliam
  System.out.println(teacherWilliam.name);
  //System.out.println(teacherWilliam.age);
  //System.out.println(teacherWilliam.isFemale);

}


}
