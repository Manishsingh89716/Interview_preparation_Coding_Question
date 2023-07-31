//check for palindrome

import java.util.Scanner;

public class checkPalindrome{
    public static void main(String[] args){
        int num;
        int rev = 0;
        int rem;
        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        //store num in temp
        temp = num;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        //check if reverse is equal to original or not
        if(num == rev){
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("Number is not palindrome.");
        }
    }
}
