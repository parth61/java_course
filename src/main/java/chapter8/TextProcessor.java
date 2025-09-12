package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I Love Test Automation University");
    }
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        var message = String.format("Your text contains %d words.", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }
}
