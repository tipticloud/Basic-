package Ds.Strings;

public class Selection_1 {
    static void insertion(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            int min = i;
            for(int j = 0; j<n-1;j++){
                if (arr[j+1] < arr[j]){
                    min = j;
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {5,4,9,8,3};
        insertion(a);
        for(int ans: a){
            System.out.println(ans);
        }

    }
}
