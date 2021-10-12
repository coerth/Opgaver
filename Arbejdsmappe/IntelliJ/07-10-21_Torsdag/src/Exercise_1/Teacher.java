package Exercise_1;

public class Teacher extends Person {


    public Teacher(String name, int age, Address address) {
        super(name, age, address);
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Teacher" +
                '}';
        return s;
    }

}
