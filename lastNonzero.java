//find the last non-zero number in the factorial


import java.util.Scanner;

public class lastNonzero{

    //finding factorial
    static int factorial(int num){

        //base condition
        if(num == 0 || num == 1){
            return 1;
        }

        else{
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        int fact = factorial(num);

        //when digit lasts with zero, then return last non-zero element
        while(fact % 10 == 0){
            fact /= 10;
        }
        System.out.print("Last non zero digit is: " + fact % 10);
    }
}
