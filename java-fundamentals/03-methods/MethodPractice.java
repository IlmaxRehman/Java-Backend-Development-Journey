

public class MethodPractice {

    static void greet(){
        System.out.println("Wellcome");

    }

    static int add(int a, int b){
        return a+b;
        }
    
    static boolean  isEven(int num){

        if(num%2 == 0){
            return true;

        } else{
            return false;
        }
    }

    public static void main(String[] args) {
       greet();
       System.out.println(add(10,49));
       System.out.println(isEven(3));

    }
}
