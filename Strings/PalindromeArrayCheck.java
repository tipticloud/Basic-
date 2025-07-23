package Ds.Strings;

import java.util.Scanner;

public class PalindromeArrayCheck {
    static boolean isPalindrome(int[] arr, int l, int r) {
        if (l >= r) return true;

        return (arr[l] == arr[r] && isPalindrome(arr, l + 1, r - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalindrome(arr, 0, n - 1));
    }
}
