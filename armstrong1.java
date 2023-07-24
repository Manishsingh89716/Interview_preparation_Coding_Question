//checking armstrong using recursion with a given range


import java.util.Scanner;

public class armstrong1{
    static int Order(int num){
        int len = 0;
        while (num != 0){
            len++;
            num = num/10;
        }
        return len;
    }

    static int Armstrongsum(int num, int order){
        if(num == 0){
            return 0;
        }
        int digit = num % 10;
        return (int) Math.pow(digit, order) + Armstrongsum(num/10, order);
    }

    public static void main(String[] args){
        int low;
        int high;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range: ");
        low = sc.nextInt();

        System.out.println("Enter the higher range: ");
        high = sc.nextInt();
        System.out.println("Armstrong number between " + low + " and " + high + " :");

        //iterate from lower range to till higher range
        for(int i = low; i <= high; i++){
            int len = Order(i);
            if(i == Armstrongsum(i, len)){
                System.out.print(i + " ");
            }
        }
    }
}
