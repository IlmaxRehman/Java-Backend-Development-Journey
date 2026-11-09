import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
       int[] arr = {1,2,3,2,4,5,1,6};
       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }

       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() > 1){
            System.out.println(entry.getKey());
        }
       }
    }
}
