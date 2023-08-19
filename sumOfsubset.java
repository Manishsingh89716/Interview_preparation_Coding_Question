//find the sum of given subset


public class sumOfsubset{
    static void susetSum(int arr[], int num){
        int total = 1 << num;

        //Run a loop from  0 to 2^n -1
        for(int i = 0; i < total; i++){
            int sum = 0;

            //Pick all array elements which correspond to 1s in binary representation of ith numbe
            for(int j = 0; j < num; j++){
                if((i & (1 << j)) != 0){
                    sum += arr[j];
                }
            }
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {3, 1, 2};
        susetSum(arr, arr.length);
    }
}
