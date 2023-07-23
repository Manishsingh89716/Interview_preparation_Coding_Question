//Reverse the number

import java.util.Scanner;

public class reverseNum{
    public static void main(String[] args){
        int num;
        int reverse = 0;
        int rem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        while(num != 0){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num/10;
        }
        System.out.println("Reverse Number: " + reverse);
    }
}
