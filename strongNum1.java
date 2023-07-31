//check for strong number using DP



public class strongNum1{
    static int fact[] = new int[10];
    static void find(){
        fact[0] = fact[1] = 1;
        for(int i = 2; i < 10; i++){
            fact[i] = fact[i - 1] * i;
        }
    }

    static boolean strong(int num){
        int sum = 0;
        int temp = num;

        while(temp > 0){
            sum += fact[temp % 10];
            temp = temp / 10;
        }
        return (sum == num);
    }

    public static void main(String[] args){
        find();
        int num = 145;
        if(strong(num)){
            System.out.print("Number is strong");
        }
        else{
            System.out.print("Number is not strong");
        }
    }
}
