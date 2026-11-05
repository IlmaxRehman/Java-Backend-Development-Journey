import java.util.*;

public class PrintNum {
    static void printNumber(int n){
        if(n > 5){
            return;
        }

        System.out.println(n);

        printNumber(n+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        printNumber(n);

        sc.close();
    }
    
}
