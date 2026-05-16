class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, l, r, sum, target;
        List<List<Integer>> res = new ArrayList<>();
        for ( int i = 0; i < n-2; i++) {
            if( i > 0 && nums[i] == nums[i-1] ) continue;
            l = i+1;
            r = n-1;
            target = 0 - nums[i];
            while (l<r) {
                sum = nums[l] + nums[r];
                if ( target > sum ) {
                    l++;
                } else if ( target < sum ) {
                    r--;
                } else {
                    List<Integer> tempRes = new ArrayList<>();
                    tempRes.add(nums[i]);
                    tempRes.add(nums[l]);
                    tempRes.add(nums[r]);
                    res.add(tempRes);
                    l++;
                    r--;
                    while (l<r && nums[l] == nums[l-1]) l++;
                    while (l<r && nums[r] == nums[r+1]) r--;
                }
            }
        }
        return res;
    }
}
