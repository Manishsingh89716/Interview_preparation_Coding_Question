//factorial using recursion


import java.util.Scanner;

public class factorial1{
    static int fact(int num){
        //base case
        if(num == 0){
            return 1;
        }
        else{
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        System.out.print("Factorial:" + fact(num));
    }
}
