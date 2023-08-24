package Array;

//find second minimum element
public class secondMin{
    static int secMin(int arr[], int len){
        int min = arr[0];

        //finding first minimum
        for(int i = 0; i < len; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        //finding second minimum
        int secondmin = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){
            if(min != arr[i] && secondmin > arr[i]){
                secondmin = arr[i];
            }
        }
        return secondmin;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int len = arr.length;
        System.out.println("Second minimum element is: " + secMin(arr, len));
    }
}
