public class SentenceAnalyzer {
    public static void main(String[] args) {

        String sentence = "Java Programming is FUN and Powerful!";

        int length = sentence.length();

        String lowerCaseSentence = sentence.toLowerCase();

        String replacedSentence = sentence.replace(" ", "_");

        boolean containsJava = sentence.contains("Java");

        int startIndex = sentence.indexOf("FUN");
        String funLower = "";
        if (startIndex != -1) {
            String extractedFUN = sentence.substring(startIndex, startIndex + 3);
            funLower = extractedFUN.toLowerCase();
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("1. Number of characters: " + length);
        System.out.println("2. Lowercase sentence: " + lowerCaseSentence);
        System.out.println("3. Spaces replaced with underscores: " + replacedSentence);
        System.out.println("4. Contains 'Java'? " + containsJava);
        System.out.println("5. 'FUN' in lowercase: " + funLower);
    }
}
