package Ds.Strings;

public class Merge {
    static void Bubble(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j+1] <arr[j]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,9,8,3};
        Bubble(arr);
        for(int ans: arr){
            System.out.println(ans);
        }

    }
}
