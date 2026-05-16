class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> store = new HashSet<>();
        for (int i : nums) {
            if(store.contains(i)) {
                return true;
            }
            store.add(i);
        }
        return false;
    }
}