class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s);
            sb.append('.');
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++ ){
            if(str.charAt(i) == '.'){
                list.add(sb.toString());
                sb.setLength(0);  
            }else{
            sb.append(str.charAt(i));

            }
        }
        return  list;
    }
}
