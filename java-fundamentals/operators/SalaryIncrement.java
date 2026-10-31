import java.util.*;

public class SalaryIncrement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary :");

        int salary = sc.nextInt();
        int newSalary = salary + (salary*10)/100;

        System.out.print("Updated salary after 10% increment : " + newSalary);

        sc.close();
    }
}
