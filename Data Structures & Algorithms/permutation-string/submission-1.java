class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];

        //count characters of s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0, right = 0;
        int needed = s1.length();

        while (right < s2.length()) {
            char ch = s2.charAt(right);

            if (count[ch - 'a'] > 0) {
                needed--;
            }
            count[ch - 'a']--;
            right++;

            //window size exceeds s1 length
            if (right - left > s1.length()) {
                char leftChar = s2.charAt(left);

                if (count[leftChar - 'a'] >= 0) {
                    needed++;
                }
                count[leftChar - 'a']++;
                left++;
            }

            if (needed == 0) {
                return true;
            }
        }

        return false;
    }
}