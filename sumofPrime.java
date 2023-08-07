//Can a number be expressed as a sum of two prime numbers


import java.util.Scanner;

public class sumofPrime{
   public static int checkPrime(int num){
       int var = 1;
       for(int i=2; i<num; i++){
           if(num % i == 0){
               var = 0;
               break;
           }
       }
       return var;
   }

   public static void main(String[] args){
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       num = sc.nextInt();
       int x = 0;

       for(int i=2; i<=num/2; i++){
           if(checkPrime(i) == 1){
               if(checkPrime(num-i) == 1){
                   System.out.println(num + " = " + i + (num-i));
                   x = 1;
               }
           }
       }
       if(x == 0){
           System.out.println(num + "is not expressed");
       }
   }
}
