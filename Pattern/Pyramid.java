package Pattern;

public class Pyramid {
    public static void main(String[] args) {
        int r = 5;
        for(int i =1; i<=5; i++){
            for(int s = 1; s<=r-i; s++){
                System.out.print(" ");
            }
            // print star

            for(int s1=1; s1<= 2*i -1; s1++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
