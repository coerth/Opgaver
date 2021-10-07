package Exercise_3;

public class Salary {

    public int calculateMonthlySalary(int jobSalary){
       int monthlySalary = jobSalary * 37 * 4;

       return monthlySalary;
    }

    public int calculateYearlySalary(int jobSalary){
        int yearlySalary = calculateMonthlySalary(jobSalary) * 12;

        return yearlySalary;
    }
}
