class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0, right = nums.length;
        while(left < right){
            if(nums[left] == val){
                for(int i = left; i < right-1 ;i++){
                    nums[i] = nums[i+1];
                }
                right--;
            }
            else{
                left++;
            }
        }
        return left;
    }
}