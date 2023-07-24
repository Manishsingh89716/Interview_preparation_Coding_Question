//check for armstrong number

import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        int num = 1634;
        int armstrong = 0;
        int rem;
        int temp;

        //storing original number
        temp = num;

        while (num != 0){
            rem = num % 10;

            //multiply with remainder as the length of number and add with current armstrong number
            armstrong = (rem * rem * rem * rem)+ armstrong;
            num = num/10;
        }
        if(temp == armstrong){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
