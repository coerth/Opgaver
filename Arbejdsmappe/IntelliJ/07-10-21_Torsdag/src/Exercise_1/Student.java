package Exercise_1;

public class Student extends Person {

    public Student(String name, int age, Address address) {
        super(name, age, address);
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += ", Student" +
                '}';
        return s;
    }

}
