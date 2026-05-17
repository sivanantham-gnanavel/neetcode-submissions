class Solution {

    int search(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int curr = start + (end - start) / 2;
        if ( nums[curr] >  target) {
            return search (nums, target, start, curr-1);
        } else if (nums[curr] <  target) {
            return search (nums, target, curr+1, end);
        } else {
            return curr;
        }
    }

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
}
