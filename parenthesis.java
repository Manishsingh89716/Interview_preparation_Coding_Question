//check for balanced parenthesis


import java.util.ArrayList;
import java.util.Scanner;

public class parenthesis{
    static void balParen(int num, int open, int close, String str, ArrayList res){
        //base case

        if(open == num && close == num){
            res.add(str);
            return;
        }

        //If the count of opening bracket is less than n then call the function
        if(open < num){
            balParen(num, open + 1, close, str + "{", res);
        }

        //If the count of opening bracket is greater than count of closing bracket then call the function
        if(close < open){
            balParen(num, open, close + 1, str + "}", res);
        }
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        ArrayList<String> res = new ArrayList<>();
        balParen(num, 0, 0, "", res);

        //count the string and return as result
        for(String str : res){
            System.out.println(str);
        }
    }
}
