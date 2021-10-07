package Exercise_2;

public class Driver {
    private String name;
    private int age;
    private String driverSkillLevel;
    private float driverWeight;
    private boolean isWearingSunGlasses;
    private int guldKæder;


    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
