
public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = { 50,50,40,30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i = 0;i< arr.length; i++){
            if(arr[i] >  largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
                
            } else if(arr[i] < largest && arr[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if(arr[i] < secondLargest && arr[i] > thirdLargest){
                thirdLargest = arr[i];
            }

        }

        if(thirdLargest == Integer.MIN_VALUE){
            System.out.print("no third largest element in array");
        } else {
            System.out.print("third Largest : "+ thirdLargest);
        }
    }
}

