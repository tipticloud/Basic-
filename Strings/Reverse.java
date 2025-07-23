package Ds.Strings;
import java.util.Scanner;
public class Reverse {
    static String reverse(String s, int idx){


        //base case
        if(idx==s.length()) return "";

        //recursive wor
        String smallans = reverse(s,idx+1);


        // //self work
        return smallans + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse(s,0));
    }
}
