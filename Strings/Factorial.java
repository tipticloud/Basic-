package Ds.Strings;
import java.util.Scanner;
public class Factorial {
    static int Facto(int n){
        //base case
        if(n==0){
            return 1;
        }
        int smallans = Facto(n-1);
        return n * smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        int n = sc.nextInt();
        int result = Facto(n);
        System.out.println("Factorial of " + n + "Result" + result);


    }
}
