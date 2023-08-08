//check for number of days using switch & case method


import java.util.Scanner;

public class noOfdays1{
    public static void main(String[] args){
        int month, year;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the month: ");
        month = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc2.nextInt();

        switch(month){

            //case for 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

            System.out.println("Number of days are 31");
            break;

            //case for 30 days
            case 4:
            case 6:
            case 9:
            case 11:

            System.out.println("Number of days are 30");
            break;

            //case for 28 days or 28 days
            case 2:
                if((year%400==0) || ((year%100!=0)&&(year%4==0)))
                System.out.println("Number of days is 29");

                else
                    System.out.println("Number of days is 28");
                break;

                //if invalid month
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
