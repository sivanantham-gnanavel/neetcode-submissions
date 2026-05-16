class Solution {
    public boolean isPalindrome(String s) {
        List<Character> chars = new ArrayList(); 
        for (char c : s.toCharArray()) {
            if(c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') chars.add(Character.toLowerCase(c));
        }

        int l = 0, r = chars.size()-1;
        while(l<r) {
            if(chars.get(l++) != chars.get(r--)) {
                return false;
            }
        }
        return true;
    }
}
