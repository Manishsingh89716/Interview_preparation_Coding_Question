package Array;

//finding array sum with recursion
public class arraySum1{
    static int findSum(int arr[], int i, int len){

        //base case
        if(i == len - 1){
            return arr[i];
        }

        else{
            return arr[i] + findSum(arr, i + 1, len);
        }
    }

    public static void main(String[] args){
        int arr[] = {2, 3, 6, 5};
        int len = arr.length;

        System.out.println("Sum is: " + findSum(arr, 0, len));
    }
}
