class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int currarea = 0;
        int l = 0, r = heights.length - 1;
        while (l < r) {
            currarea = Math.min(heights[l], heights[r]) * (r - l);
            maxarea = Math.max(maxarea, currarea);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }
}
