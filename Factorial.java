//finding factorial of a number using iteration


import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        int num;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        for(int i = 2; i <= num; i++){
            fact = fact * i;
        }
        System.out.print("Factorial: " + fact);
    }
}
