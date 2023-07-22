//Sum of digit using brute force

import java.util.Scanner;

public class sumofDigit{
    public static void main(String[] args){
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        num = sc.nextInt();

        while (num != 0){
            sum += num % 10;
            num = num /10;
        }

        System.out.println("Sum: " + sum);
    }
}
