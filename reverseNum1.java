//reverse number using recursion

import java.util.Scanner;

public class reverseNum1{
    static int reverse(int num, int rev){
        if(num == 0)
            return rev;

        int rem = num % 10;
        rev = rev * 10 + rem;
        return reverse(num / 10, rev);
    }

    public static void main(String[] args){
        int num, rev = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        System.out.println("Reverse Number: " + reverse(num, rev));
    }
}
