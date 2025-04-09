public class Q2_C_VowelConsonantCount {
    public static void main(String[] args) {
        String sentence = "Practice makes a man perfect";
        int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
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