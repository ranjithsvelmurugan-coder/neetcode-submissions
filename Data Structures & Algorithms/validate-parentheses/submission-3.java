class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        if(n<2){
            return false;
        }
        for(int i = 0 ; i<n ; i++){
            char c = s.charAt(i);
            if(c == '['|| c =='(' ||c == '{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char a = stack.pop();
                if(c == ']' && a!= '['){
                    return false;
                }
                if(c == '}' && a!= '{'){
                    return false;
                }
                if(c == ')' && a!= '('){
                    return false;
                }               
            }
        }
    return stack.isEmpty(); 
    }
}
