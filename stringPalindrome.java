//check for palindrome


import java.util.Scanner;

public class stringPalindrome{
    public static void main(String[] args){
        String str, revStr = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = sc.next();

        //iterate through the length of string and reverse them one by one
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(revStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome.");
        }
        else{
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
