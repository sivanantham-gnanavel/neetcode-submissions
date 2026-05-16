class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap();
        int diff;
        for ( int i=0; i < nums.length; i++) {
            diff = target - nums[i];
            if ( store.containsKey(diff) ) {
                return new int[]{store.get(diff), i};
            }
            store.put(nums[i],i);
        }
        return new int[2];
    }
}
