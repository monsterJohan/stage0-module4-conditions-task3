package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >= 0 && salary <= 10000) {
            System.out.println((float)0.85 * salary);
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println((float)0.82 * salary);
        } else if (salary > 20000) {
            System.out.println((float)0.80 * salary);
        } else {
            System.out.println("wrong input!");
        }
    }
}
