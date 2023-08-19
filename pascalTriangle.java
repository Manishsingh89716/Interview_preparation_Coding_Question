//find the Nth row in pascal's triangle using recursion


import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriangle{
    static ArrayList getRow(int N){
        ArrayList <Integer> currRow = new ArrayList<>();
        currRow.add(1);

        //base case
        if(N == 0){
            return currRow;
        }

        //last element of every row is 1 so again push 1 to curr_row
        ArrayList <Integer> prevRow = getRow(N - 1);
        for(int i = 1; i < prevRow.size(); i++){
            int curr = prevRow.get(i - 1) + prevRow.get(i);
            currRow.add(curr);
        }
        currRow.add(1);
        return currRow;
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row index: ");
        n = sc.nextInt();

        ArrayList arr = getRow(n);
        for(int i = 0; i < arr.size(); i++){
            if(i == arr.size() - 1){
                System.out.println(arr.get(i));
            }

            else{
                System.out.print(arr.get(i) + ",");
            }
        }
    }
}
