package Array;

public class findElement1{
    static int findMax(int arr[], int len){

        //base case
        if(len == 1){
            return arr[0];
        }

        else{
            return Math.max(arr[len - 1], findMax(arr, len - 1));
        }
    }

    static int findMin(int arr[], int len){

        //base case
        if(len == 1){
            return arr[0];
        }

        else{
            return Math.min(arr[len - 1], findMin(arr, len - 1));
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 34, 18, 45, 2};
        int len = arr.length;

        System.out.println("Largest element is: " + findMax(arr, len));
        System.out.println("Smallest element is: " + findMin(arr, len));
    }
}
