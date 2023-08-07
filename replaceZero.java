//replace zero to one ex:- 201340 change as 211341


import java.util.Scanner;

public class replaceZero{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        String str = Integer.toString(num);
        String str1 = "";

        //replace 0 with 1
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                str1 = str1 +  '1';
            }
            else{
                str1 = str1 + str.charAt(i);
            }
        }

        System.out.println(str1);
    }
}
