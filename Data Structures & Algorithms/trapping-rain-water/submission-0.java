class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        int max = 0;
        maxLeft[0] = max; 
        for(int i = 1; i < n; i++) {
            max = Math.max(max, height[i-1]);
            maxLeft[i] = max; 
        }

        max = 0;
        maxRight[n-1] = max; 
        for(int i = n-2; i >= 0; i--) {
            max = Math.max(max, height[i+1]);
            maxRight[i] = max; 
        }

        int output = 0;
        for(int i = 1; i < n-1; i++) {
            int current = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if(current > 0) {
                output = output + current;
            } 
        }
        return output;
    }
}
