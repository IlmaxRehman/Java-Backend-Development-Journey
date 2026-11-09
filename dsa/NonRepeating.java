import java.util.*;
public class NonRepeating {
    public static void main(String[] args){
        int[] arr = {4,5,1,2,1,4,5,6};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i = 0 ;i<arr.length;i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
                break;
            }

        }
    }
}
