public class EmployeeSalary {
    public static void main(String[] args) {
        int employeeId = 456;
        String name = "akshat bewakoof"; 
        int salary = 45000;
        int allowence = 10000;
        int taxPercentage = 5;
        boolean isEmployee = true;

        int grossSalary = salary + allowence;
        int deduction = (grossSalary * taxPercentage)/100;
        int netSalary = grossSalary - deduction;

        System.out.println("gross salary : " + grossSalary);
        System.out.println("neet salary : " + netSalary);
    }
}
