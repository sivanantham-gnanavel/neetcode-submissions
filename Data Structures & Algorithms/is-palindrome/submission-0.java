class Solution {
    public boolean isPalindrome(String s) {
        List<Character> chars = new ArrayList(); 
        for (char c : s.toCharArray()) {
            if(c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') chars.add(c);
        }

        int l = 0, r = chars.size()-1;
        while(l<r) {
            if(Character.toLowerCase(chars.get(l++)) != Character.toLowerCase(chars.get(r--))) {
                return false;
            }
        }
        return true;
    }
}
