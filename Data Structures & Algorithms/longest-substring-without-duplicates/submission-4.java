class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n ==0){
            return 0;
        }
        int i = 0 , j = 1;
        int length = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));

        while(j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(s.charAt(j));
                length = Math.max(length,(j-i)+1);
                j++;
            }            
        }
        return length;        
    }
}
