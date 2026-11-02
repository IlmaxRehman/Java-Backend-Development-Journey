
public class Calculator {
    static int multiply(int a, int b){
        return a*b;
    }

    static int  multiply(int a, int b, int c){
        return a*b*c;
    }

    static double multiply(double a , double b){
        return a*b;
    }

    public static void main(String[] args){
        System.out.println(multiply(28,3));
        System.out.println(multiply(28,3,2));
        System.out.println(multiply(28,3.6));
    }

}
