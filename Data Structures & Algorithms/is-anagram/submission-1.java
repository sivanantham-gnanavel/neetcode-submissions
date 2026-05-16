class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = toHashMap(s);
        Map<Character, Integer> tMap = toHashMap(t);
        return sMap.equals(tMap);
    }

    public HashMap<Character, Integer> toHashMap(String inp) {
        HashMap<Character, Integer> hashMap = new HashMap();
        for(char c : inp.toCharArray()) {
            hashMap.compute(c, (k, v) -> (v == null) ? 1 : v+1);
        }
        return hashMap;
    }
}
