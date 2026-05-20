class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length-1;
        while(left < right){
            int distance = right - left;
            int area = distance*Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
    return maxArea;
    }
}

