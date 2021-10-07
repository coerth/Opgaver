package Exercise_1;

import java.util.ArrayList;

public class Semester {

    private String name;
    private Teacher teacher;
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public Semester(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", studentArrayList=" + studentArrayList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void addStudent(Student student){
        studentArrayList.add(student);
    }
}
