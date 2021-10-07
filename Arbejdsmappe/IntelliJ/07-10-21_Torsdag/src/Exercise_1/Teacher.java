package Exercise_1;

public class Teacher {

    private String name;
    private int age;
    private Address teacherAddress;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(Address teacherAddress) {
        this.teacherAddress = teacherAddress;
    }
}
