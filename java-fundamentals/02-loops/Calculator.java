import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        System.out.print("Enter Operator (+,-,*,/) : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' ->{
                if(b==0){
                    System.out.println("cannot divide by zero");
                } else{
                    System.out.println((double)a/b);
                }
            }
            default -> System.out.println("invalid operator");

        }
         


        


        sc.close();
    }
}