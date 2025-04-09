public class Q2_StringOperations {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String sentence = "Practice makes a man perfect";
        
        // now we are checking Anagram here ::
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
        
        // for the Longest word
        System.out.println("Longest word: " + findLongestWord(sentence));
        
        // for Vowel and consonant count
        int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
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
    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    
    public static int[] countVowelsAndConsonants(String sentence) {
        int vowels = 0;
        int consonants = 0;
        String lower = sentence.toLowerCase();
        
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
}