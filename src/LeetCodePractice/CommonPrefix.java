package LeetCodePractice;

public class CommonPrefix {

    public static void main(String[] args){

        String[] strs = {"flower","flow","flight"};

        if(strs == null || strs.length == 0){
            System.out.println("No Prefix!");
        }

        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }

        System.out.println("Common Prefix: "+pre);
    }
}
