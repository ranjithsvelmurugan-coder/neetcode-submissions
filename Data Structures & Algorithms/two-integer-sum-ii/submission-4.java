class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int n = numbers[left] + numbers[right];
            if(target == n){
                return new int [] {left+1,right+1};
            }
            else if(target < n){
                right--;
            }
            else{
                left++;
            }
        }
    return new int [] {};
    }
}
