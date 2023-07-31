//check for strong number using recursion


import java.util.Scanner;

public class strongNum{
    static int factorial(int num){
        if(num == 0){
            return 1;
        }

        //find factorial
        else{
            return num * factorial(num - 1);
        }
    }

    static boolean factorialSum(int num){
        int digit;
        int sum = 0;
        int temp = num;

        //find factorial of each digit of given number
        while(temp != 0){
            digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }
        return sum == num;
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        if(factorialSum(num)){
            System.out.print("Number is strong");
        }
        else{
            System.out.print("Number is not strong");
        }
    }
}
