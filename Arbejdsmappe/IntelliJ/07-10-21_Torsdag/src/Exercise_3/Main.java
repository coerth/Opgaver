package Exercise_3;

public class Main {

    public static void main(String[] args) {
        Job itSupporter = new Job("IT-Supporter",165);
        Job poder = new Job("Poder", 220);
        Job pædagog = new Job("Pædagog",140);

        Person morten = new Person("Morten",32,new Job("Studerende",40));
        Person mia = new Person("Mia", 30, poder);
        Person kristoffer = new Person("Kristoffer",31,itSupporter);

        Salary salary1 = new Salary();

        System.out.println(morten.getName());
        System.out.println(salary1.calculateMonthlySalary(morten.getJob().getSalary()));
        System.out.println(salary1.calculateYearlySalary(morten.getJob().getSalary()));

        System.out.println(mia.getName());
        System.out.println(salary1.calculateMonthlySalary(mia.getJob().getSalary()));;
        System.out.println(salary1.calculateYearlySalary(mia.getJob().getSalary()));

        System.out.println(kristoffer.getName());
        System.out.println(salary1.calculateMonthlySalary(kristoffer.getJob().getSalary()));
        System.out.println(salary1.calculateYearlySalary(kristoffer.getJob().getSalary()));


    }
}
