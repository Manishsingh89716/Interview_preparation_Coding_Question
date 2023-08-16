//find length of string using recursion

import java.util.Scanner;

public class stringLength1{
    static int findLength1(String str){

        //base case, if strings empty
        if(str.equals("")){
            return 0;
        }

        //find length and increment by 1 after traversing each element
        else{
            return findLength1(str.substring(1)) + 1;
        }
    }

    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = sc.next();

        System.out.print("Length is: " + findLength1(str));
    }
}