//find maximum element in array


public class maxElement{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 23, 12};
        int max = arr[0];

        //iterate till the last element and find maximum element if condition gets satisfied
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out. println("Max element is: " + max);
    }
}
