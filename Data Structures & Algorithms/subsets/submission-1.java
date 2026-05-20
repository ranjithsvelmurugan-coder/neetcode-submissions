class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(nums,0,temp,result);
        return result;
    }
    public void dfs(int[] nums, int i, List<Integer> temp ,List<List<Integer>> result){
        if(i == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        dfs(nums,i+1,temp,result);
        temp.remove(temp.size()-1);
        dfs(nums,i+1,temp,result);
    }    
}
