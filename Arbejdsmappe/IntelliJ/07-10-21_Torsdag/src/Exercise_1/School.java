package Exercise_1;

public class School {
    private String name;
    private Semester semester;

    public School(String name, Semester semester) {
        this.name = name;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
