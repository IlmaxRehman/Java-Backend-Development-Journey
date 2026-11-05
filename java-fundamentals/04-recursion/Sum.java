import java.util.*;

public class Sum{

    static int sumNumber(int n ){
        if(n == 0 ){
            return 0;

        }

        return n + sumNumber(n-1);
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
