public class TwoPointer {
    public static void main(String[] args){
        int[] arr = {2,5,6,3,6,8,2,0};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr [right];
            arr[right] = temp;

            left ++;
            right --;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}