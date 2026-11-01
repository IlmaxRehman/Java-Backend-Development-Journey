import java.util.*;

public class Eligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age :");

        int age = sc.nextInt();
        System.out.print("Is graduated ? (yes/no):");
        String isGraduated = sc.next();

        if(age >= 18 && isGraduated.equalsIgnoreCase("yes")){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}

