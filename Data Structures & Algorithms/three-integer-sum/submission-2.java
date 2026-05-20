class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        //Sort the array
        Arrays.sort(nums);

        for( int i = 0; i < len-2; i++){
            int target = -nums[i] ;
            int left = i+1;
            int right = len - 1 ;

            while(left < right ){
                int n = nums[left] + nums[right];
                if( n == target){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(-target);
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    
                    if(!list.contains(tempList)){
                        list.add(tempList);
                    }
                    left++;
                    right--;
                }
                else if( n > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return list;
    }
}
