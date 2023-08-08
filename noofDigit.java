//check for number of digit present in a integer


import java.util.Scanner;

public class noofDigit{
    public static void main(String[] args){
        int num, digit = 0, last_digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        while(num != 0){
            last_digit = num % 10;
            digit ++;
            num = num/10;
        }
        System.out.print("Total number of digit is: " + digit);
    }
}
