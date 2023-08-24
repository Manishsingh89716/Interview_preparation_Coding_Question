package Array;

//finding sum of array element
public class arraySum{
    public static void main(String[] args){
        int arr[] = {3, 4, 7, 9, 6};
        int sum = 0;

        //Run a loop to iterate over the entire array & Set sum = sum + arr[i], which return value as total sum
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum is: " + sum);
    }
}
