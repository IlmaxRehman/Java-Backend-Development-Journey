
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {12,5,8,3,15,1};

        for(int i=0;i<arr.length - 1;i++){
            int minIndex = i;

            for(int j = i+1;j<arr.length;j++){

                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

            }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

           
        }
         for(int num : arr){
                System.out.print(num + " ");
            }
    }

}
