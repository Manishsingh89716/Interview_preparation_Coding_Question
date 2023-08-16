//find minimum element using recursion in array

public class minElement1{
    static int findMin(int arr[], int len){

        //base case, if size zero return zero
        if(len == 1){
            return arr[0];
        }

        //traverse whole array and find minimum of it.
        else{
            return Math.min(arr[len - 1], findMin(arr, len - 1));
        }
    }

    public static void main(String[] args){
        int arr[] = {8, 7, 1, 3, -3};
        System.out.println("Minimum element is: " + findMin(arr, arr.length));
    }
}
