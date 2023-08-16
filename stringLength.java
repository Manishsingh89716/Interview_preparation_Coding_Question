//find length of string

import java.util.Scanner;

public class stringLength{
    public static void main(String[] args){
        String str;

        //Initialize length of string with 0
        int len = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = sc.next();

        //Iterate through the all character present in the string and increment length by 1.
        for(int i = 0; i < str.length(); i++){
            len ++ ;
        }

        System.out.print("Length of string is: " + len);
    }
}
