//find minimum element in an array

import java.util.Scanner;

public class minElement{
    public static void main(String[] args){
        int arr[] = {8, 3, 7, 10, 1};

        //At first suppose minimum element at index 0
        int min = arr[0];

        //iterate through the all element
        for(int i = 0; i < arr.length; i++){

            //Every time check minimum element and store it into min
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
