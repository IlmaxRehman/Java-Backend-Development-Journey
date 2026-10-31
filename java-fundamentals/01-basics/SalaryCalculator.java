import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("enter salary: ");
     int salary = scanner.nextInt();

     System.out.print("Enter allowence :");
     int allowence = scanner.nextInt();

     System.out.print("enter deduction amount: ");
     int deduction = scanner.nextInt();

     int  finalSalary = (salary + allowence) - deduction;

     System.out.println("final amount : "+ finalSalary);




     scanner.close();
    }
}
