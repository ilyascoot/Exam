import java.util.Scanner;

public class SumOfDigits {
    public static void sum(int n, int sum){
        if(n!=0){
            sum+=n%10;
            sum(n/10, sum);
        }
        else System.out.println(sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        sum(1221, sum);
    }
}
