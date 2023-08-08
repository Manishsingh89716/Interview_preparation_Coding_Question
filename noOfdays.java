//check for number of days in a given month


import java.util.Scanner;

public class noOfdays{
    public static void main(String[] args){
        int month, year;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the month: ");
        month = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc2.nextInt();

        //check for leap year
        if((month == 2) && ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0)))){
            System.out.println("Number of days are 29");
        }

        //when month is february then number of days are 28
        else if (month == 2){
            System.out.println("Number of days are 28");
        }

        //when month are january, march, may, july, august, october and december then number of days are 31
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("Number of days are 31");
        }

        else{
            System.out.print("Number  of days are 30");
        }
    }
}
