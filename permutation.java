//find permutation of a string using recursion

import java.util.Scanner;

public class permutation{
    static void findPerm(String str, String res){

        //base case
        if (str.length() == 0){
            System.out.print(res + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++){

            //ith character of str
            char chr = str.charAt(i);

            //Rest of the string after excluding the ith character; (0,i):- left part & (i+1):- right part
            String rest = str.substring(0, i) + str.substring(i + 1);
            findPerm(rest, res + chr);
        }
    }

    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = sc.next();
        findPerm(str, "");
    }
}
