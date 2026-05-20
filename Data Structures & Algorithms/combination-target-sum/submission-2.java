
class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(nums,target,0,result,temp);
        return result;
    }
    public void dfs(int[] nums, int target,int i, List<List<Integer>> result, List<Integer> temp){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || i == nums.length){
            return;
        }
        temp.add(nums[i]);
        dfs( nums, target - nums[i], i, result, temp);
        temp.remove(temp.size()-1);
        dfs( nums, target, i+1, result, temp);
    } 
}
