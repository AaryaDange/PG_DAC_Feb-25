public class Q1_ArrayOperations {
    
    
    // 1. Check whether two given strings are anagrams of each other. 

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String sentence = "Practice makes a man perfect";
        
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
        System.out.println("Longest word: " + findLongestWord(sentence));
        
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
    
    //2. Identify the longest word in a given sentence. 


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
    
        //3. Count the number of vowels and consonants in the same sentence. 

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