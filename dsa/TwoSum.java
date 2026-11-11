
import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j = 0;j<arr.length;j++){
            int num = target - arr[j];
            if(map.containsKey(num)){
                System.out.print(arr[j] + " + " + num + " = " + target);
            } else {
                map.put(arr[j],j);
            }

        
        }
    
    }
}
