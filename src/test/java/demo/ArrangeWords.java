package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrangeWords {

    public static void main(String[] args) {
        String sentence = "The lines are printed in reverse order.";
        String rearrangedSentence = arrange(sentence);
        System.out.println(rearrangedSentence);
    }

    public static String arrange(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a TreeMap to store words based on their lengths
        TreeMap<Integer, List<String>> lengthMap = new TreeMap<>();

        // Populate the lengthMap with words
        for (String word : words) {
            int length = word.length();
            word = word.toLowerCase(); // all words converted to lowerCase
            if(word.endsWith(".")){
                word=word.substring(0, word.length()-1);// remove the "." which is end of the sentence
            }
            if (!lengthMap.containsKey(length)) {
                lengthMap.put(length, new ArrayList<>());
            }
            lengthMap.get(length).add(word);
        }

        // Reassemble the rearranged sentence
        StringBuilder rearrangedSentence = new StringBuilder();
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()) {
            List<String> wordList = entry.getValue();
            for (String word : wordList) {
                rearrangedSentence.append(word).append(" ");
            }
        }

        // Capitalize the first letter and append period
        rearrangedSentence.setCharAt(0, Character.toUpperCase(rearrangedSentence.charAt(0)));
        rearrangedSentence.setLength(rearrangedSentence.length() - 1); // Remove extra space
        rearrangedSentence.append(".");

        return rearrangedSentence.toString();
    }
}
