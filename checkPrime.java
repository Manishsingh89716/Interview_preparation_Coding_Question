import java.util.Scanner;

public class checkPrime{
    private static void chkprime(int n){
        int count = 0;

        //negative numbers, 0 and 1 are not prime
        if(n < 2){
            System.out.println("Number is not prime.");
        }

        //checking the number of divisors b/w 1 to n
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                count += 1;
        }

        //if count of divisors greater than 2 then it is not prime
        if(count > 2){
            System.out.println("Number is not prime.");
        }
        else{
            System.out.println("Number is prime.");
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        chkprime(n);
    }
}
