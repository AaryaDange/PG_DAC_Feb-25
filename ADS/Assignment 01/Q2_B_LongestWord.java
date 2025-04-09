public class Q2_B_LongestWord {
    public static void main(String[] args) {
        String sentence = "Practice makes a man perfect";
        System.out.println("Longest word: " + findLongestWord(sentence));
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
}