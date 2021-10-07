package Exercise_1;

public class Main {

    public static void main(String[] args) {

        Address studentAddress1 = new Address("Street1",1,0.0f,2860,"Denmark");
        Address studentAddress2 = new Address("Street2",2,1.0f,2960,"Denmark");
        Address studentAddress3 = new Address("Street3",3,3.2f,3060,"Denmark");

        Address teacherAddress1 = new Address("Street4",4,4.3f,2760,"Denmark");

        Student student1 = new Student("Morten",32);
        student1.setStudentAddress(studentAddress1);

        Student student2 = new Student("Casper", 26);
        student2.setStudentAddress(studentAddress2);

        Student student3 = new Student("Mia", 30);
        student3.setStudentAddress(studentAddress3);

        Teacher teacher1 = new Teacher("Jesper",340);
        teacher1.setTeacherAddress(teacherAddress1);

        Semester semester1 = new Semester("Datamatiker", teacher1);
        semester1.addStudent(student1);
        semester1.addStudent(student2);
        semester1.addStudent(student3);

        School school1 = new School("CPH Business", semester1);

        System.out.println(school1.getSemester().getStudentArrayList().size());


    }
}
