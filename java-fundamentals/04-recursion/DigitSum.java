import java.util.*;

public class DigitSum{

    static int sumNumber(int n ){
        if(n == 0 ){
            return 0;

        }
        int sum = 0;
        sum = sum + n%10;
        n = n/10;

        return sum + sumNumber(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if( n < 0){
            System.out.println("enter natural number only !");
        } else{
            System.out.print("Sum : " + sumNumber(n));

        }

        
        sc.close();
    }
    
}
