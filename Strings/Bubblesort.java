package Ds.Strings;

public class Bubblesort {
    static void Bubble(int [] a){
        int n = a.length;



        for (int i =0; i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;


                }

            }
        }

    }
    public static void main(String[] args) {
        int [] a = {5,4,7,3,1};
        Bubble(a);
        for(int ans: a){
            System.out.println(ans);
        }
    }
}
