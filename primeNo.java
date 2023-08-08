//check for prime number between a range


import java.util.Scanner;

public class primeNo{
    public static boolean Prime(int num){
        //0,1 & negative numbers are not prime number
        if(num < 2){
            return false;
        }

        //iterate through 1st to last given range
        else{
            for(int i = 2; i < num/2; i++){

                //if a number completely divides and gives non remainder then this is not prime number.
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int a, b;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        a = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the 2nd number: ");
        b = sc2.nextInt();

        for(int i = a; i <= b; i++){
            if(Prime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
