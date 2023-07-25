//Fibonacci seq using recursion


import java.util.Scanner;

public class Fibonacci1{
    static int a = 0, b = 1, next;
    static void fib(int num){
        if(num > 0){

            //store value into next after addition of 1st and second term
            next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");
            fib(num - 1);
        }
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        System.out.print(a + " " + b + " ");
        //print number after 0 & 1
        fib(num - 2);
    }
}
