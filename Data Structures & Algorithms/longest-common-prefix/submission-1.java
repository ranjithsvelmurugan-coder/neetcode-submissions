class Solution {
    public static Boolean PrefixCheck(int n, char c,String[] strs){
        for(int i = 1;i<strs.length;i++){
            if(strs[i].length() <= n){
                return false;
            }
            if(strs[i].charAt(n) != c){
                return false;
            }
        }
    return true;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char [] check = strs[0].toCharArray();
        for(int i =0; i < check.length; i++){
            if(PrefixCheck(i,check[i],strs)){
                sb.append(check[i]);
            }
            else break;
        }
        return sb.toString();
    }
}