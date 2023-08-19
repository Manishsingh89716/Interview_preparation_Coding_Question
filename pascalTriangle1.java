//finding nth row in pascal triangle using efficient way


import java.util.Scanner;

public class pascalTriangle1{
    static void getrow(int index){
        int prev = 1;
        System.out.print(prev);

        //Run loop from [1, index], take a variable say curr, and set curr = (prev * (index – i + 1)) / i;
        for(int i = 1; i <= index; i++){
            int curr = (prev * (index - i + 1)) / i;
            System.out.print("," + curr);
            prev = curr;
        }
    }

    public static void main(String[] args){
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        index = sc.nextInt();

        getrow(index);
    }
}
