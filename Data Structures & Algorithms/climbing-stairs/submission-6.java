class Solution {
    int [] t;
    public int cal(int n){
        if(n <=1){
            return 1;
        }
        if(t[n] != -1){
            return t[n];
        }
        return t[n] = (cal(n-1)+cal(n-2));
    }
    public int climbStairs(int n) {
        t = new int [n+1];
        Arrays.fill(t,-1);
        return cal(n);
    }
}
