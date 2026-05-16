class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int exp = target - nums[i];
            if(map.containsKey(exp)) {
                return new int[] {map.get(exp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
