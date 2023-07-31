//check palindrome using recursion

import java.util.Scanner;

public class checkPalindrome1{
    static int palindrome(int num, int rev){
        //base case
        if(num == 0){
            return rev;
        }
        int rem = num % 10;
        rev = rev * 10 + rem;
        return palindrome(num / 10, rev);
    }

    public static void main(String[] args){
        int num;
        int rev = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        //condition for palindrome
        if(palindrome(num, rev) == num){
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
