class Solution {
    public int maxArea(int[] heights) {
        int max = 0, l = 0, r = heights.length - 1;
        for ( int i = 0; i < heights.length-1; i++) {
            for ( int j = i+1; j < heights.length; j++) {
                int area = (Math.min(heights[i], heights[j]) * (j-i));
                max = Math.max(max, area);
            }
        }

        while (l < r) {
            int area = Math.min(heights[l], heights[r]) * (l-r);
            max = Math.max(max, area);

            if(heights[l] < heights[r]) {
                l++;
            } else if(heights[l] > heights[r]) {
                r--;
            } else {
                l++;
                r--;
            }
        }
        return max;
    }
}
