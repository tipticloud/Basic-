package Ds.Strings;

import java.util.ArrayList;

public class getSSQ {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }


        char curr = s.charAt(0);
        ArrayList<String> smallans = getSSQ(s.substring(1));

        for(String ss: smallans){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(getSSQ("abc"));

    }
}
