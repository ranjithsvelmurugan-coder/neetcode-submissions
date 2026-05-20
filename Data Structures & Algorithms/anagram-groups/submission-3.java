class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] chr = s.toCharArray();
            Arrays.sort(chr);
            String key = new String(chr);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
