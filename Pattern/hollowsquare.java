package Pattern;

public class hollowsquare {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        for(int i = 1; i<=r; i++){
            for(int j = 1 ; j<=c; j++ ){
                if(i==1 || i==4 || j==1 || j==4 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
