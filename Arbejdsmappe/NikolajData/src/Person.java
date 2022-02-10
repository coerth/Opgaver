import java.util.Comparator;

public class Person implements Comparator<Person>
{

    private String navn;
    private Integer skoStørrelse;
    private int højde;

    public Person(String navn, Integer skoStørrelse, int højde) {
        this.navn = navn;
        this.skoStørrelse = skoStørrelse;
        this.højde = højde;
    }


    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", skoStørrelse=" + skoStørrelse +
                '}';
    }

    public String getNavn() {
        return navn;
    }

    public Integer getSkoStørrelse() {
        return skoStørrelse;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.skoStørrelse - o2.skoStørrelse;
    }
}
