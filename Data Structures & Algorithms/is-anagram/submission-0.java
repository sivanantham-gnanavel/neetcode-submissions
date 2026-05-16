class Solution {
    public boolean isAnagram(String s, String t) {
        s = sort(s);
        t = sort(t);
        return s.equals(t);
    }

    public String sort(String inp) {
        char[] chars = inp.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
