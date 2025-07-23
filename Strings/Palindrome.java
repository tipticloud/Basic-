package Ds.Strings;
import java.util.Scanner;
public class Palindrome {
    static String palindrome(String s, int idx){
        //base case
        if(idx==s.length()) return "";


        //recursive work
        String smallans = palindrome(s,idx+1);
        //self work
        return  s.charAt(idx) + smallans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String rev = (palindrome(s,0));
        if(rev.equals(s)){
            System.out.println("palindrome");

        }else{
            System.out.println("NOt a palindrome");
        }
    }
}
