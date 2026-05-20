class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1 , zeros = 0;

        for(int num : nums){
            if(num!=0){
                prod *= num;
            }
            else{
                zeros++;
            }
        }
        if(zeros>1){
            return new int [nums.length];
        }

        int arr [] = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(zeros>0){
                if(nums[i] == 0){
                    arr[i] = prod;
                }else{
                    arr[i] = 0;
                }
            }
            else{
                arr[i] = prod/nums[i];
            }
        }
        return arr;
    }
}  
