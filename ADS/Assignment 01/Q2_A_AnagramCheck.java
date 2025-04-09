public class Q2_A_AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
    }
    
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int[] count = new int[26];
        for (char c : s1.toLowerCase().toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s2.toLowerCase().toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0) return false;
        }
        return true;
    }
}