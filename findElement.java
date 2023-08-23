package Array;

//find smallest and largest element in array
public class findElement{
    public static void main(String[] args){
        int arr[] = {1, 34, 18, 45, 2};
        int min = arr[0];
        int max = arr[0];

        //Iterate through the length of array and check with initial value with each value for smallest and largest value
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Smallest Element is:" + min);
        System.out.println("Largest Element is:" + max);
    }
}
