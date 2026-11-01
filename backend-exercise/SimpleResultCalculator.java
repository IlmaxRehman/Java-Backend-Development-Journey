import java.util.*;

public class SimpleResultCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subject 1 marks:");
        int s1 = sc.nextInt();

        System.out.print("Enter subject 2 marks:");
        int s2 = sc.nextInt();

        System.out.print("Enter subject 3 marks:");
        int s3 = sc.nextInt();

        int totalMarks = s1 + s2 + s3;
        double avgMarks = totalMarks/3;

        if(avgMarks >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        

        sc.close();
    }
}