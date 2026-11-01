import java.util.*;

public class NumberGuessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 345;
        int guess;

        do {
            System.out.print("Guess the number :");
             guess = sc.nextInt();

            if(guess ==  num){
                System.out.println("Congratulation! You guess it right.");
            } else if(guess > num){
                System.out.println("Too high!");
            } else{
                System.out.println("Too low!");
            }

            
        } while (guess != num);

        

        sc.close();
    }
}