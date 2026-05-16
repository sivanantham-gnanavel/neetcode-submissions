class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int p1=0, p2=p1+1;
        while(p2 < nums.length) {
            if(nums[p1] == nums[p2]) {
                return true;
            }
            p1++;
            p2++;
        }
        return false;
    }
}