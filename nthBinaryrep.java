//check for Nth number binary representation


import java.util.Scanner;

public class nthBinaryrep{
    static void binaryRep(String num, int ones, int remPlace){

        //base case
        if(remPlace == 0){
            System.out.print(num + " ");
            return;
        }

        //append 0 and 1 to the partially formed number and recur with one less digit.
        binaryRep(num + "1", ones + 1, remPlace - 1);
        if(ones > 0){
            binaryRep(num + "0", ones - 1, remPlace - 1);
        }
    }

    static void printRes(int num){
        String str = "";
        binaryRep(str, 0, num);
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        printRes(num);
    }
}
