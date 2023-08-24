package Array;

//finding second minimum in array with efficient approach
public class seondMin1{
    static int secMinm(int arr[], int len){

        //initialise first and sec min with temporary value
        int first_min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;

        for(int i = 0; i < len; i++){

            //for first minimum
            if(first_min > arr[i]){
                sec_min = first_min;
                first_min = arr[i];
            }

            //for second minimum
            else if(sec_min > arr[i]){
                sec_min = arr[i];
            }
        }
        return sec_min;
    }

    public static void main(String[] args){
        int arr[] = {2, 4, 7, 3};
        int len = arr.length;

        System.out.println("Second minimum element is: " + secMinm(arr, len));
    }
}
