class Solution {
    public void sortColors(int[] nums) {
        int k = 0 ;
        int [] count = new int[3];
        for(int num : nums){
            count[num]++;
        }
        for(int i = 0; i <= 2; i++){
            while(count[i] != 0){
            nums[k++] = i;
            count[i]--;
            }
        }
    }
}