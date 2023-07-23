//sum of digit using recursion

import java.util.Scanner;

public class sumofDigit1{
    static int findSum(int num, int sum){
        //base case
        if(num == 0)
            return sum;

        //store remainder each time after separation
        sum += num % 10;
        return findSum(num / 10, sum);
    }

    public static void main(String[] args){
        int num;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Sum: " + findSum(num, sum));
    }
}
