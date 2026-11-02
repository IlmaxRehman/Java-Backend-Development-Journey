
public class Max {
    static int findMaximum(int a, int b, int c){
        if(a >=b && a>=c){
            return a;
        } else if(b >= a && b>=c){
            return b;
        } else {
            return c;
        }
        
    }

    public static void main(String[] args){
        System.out.println(findMaximum(34,45,666));
    }
    
}
