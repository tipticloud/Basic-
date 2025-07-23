package Ds.Strings;

public class Insert_1 {
    static void Sort(int [] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;

            }



        }

    }
    public static void main(String[] args) {
        int [] arr = {5,4,9,8,3};
        Sort(arr);
        for(int ans: arr){
            System.out.println(ans+"");
        }
    }
}
