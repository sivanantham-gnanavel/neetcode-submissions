class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {   
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            String sorted = sort(s);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());        
    }

     public String sort(String inp) {
        char[] chars = inp.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
