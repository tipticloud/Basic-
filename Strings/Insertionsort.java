package Ds.Strings;

public class Insertionsort {
    static void Insertion(int [] a){
        int n = a.length;
        for(int i =1; i<n; i++ ){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                //swap
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1]= temp;
                j--;

            }
        }
    }
    public static void main(String[] args) {
        int [] a = {8,3,6,2,4,5};
        Insertion(a);
        for(int ans: a){
            System.out.print(ans+"");

        }

    }
}