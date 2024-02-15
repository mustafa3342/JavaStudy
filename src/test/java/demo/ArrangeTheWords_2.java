package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrangeTheWords_2 {

    public static void main(String[] args) {

       String sentence2 = "Bu kod parçası, yeniden düzenlenmiş cümleyi birleştirir. Önce, TreeMap'te saklanan kelimeleri uzunluklarına göre sırayla döner. Her uzunluk için, bu uzunluğa sahip olan kelimelerin listesine erişir. Sonra, her bir kelimeyi bu listeden alır ve düzenlenmiş cümleye ekler.";
        String sentence1 = "Bu kod parçası yeniden düzenlenmiş cümleyi birleştirir. Önce TreeMap te saklanan kelimeleri uzunluklarına göre sırayla döner. Her uzunluk için bu uzunluğa sahip olan kelimelerin listesine erişir. Sonra her bir kelimeyi bu listeden alır ve düzenlenmiş cümleye ekler.";

        System.out.println(arrange(sentence1));
        System.out.println(arrange(sentence2));
        System.out.println(arrange("Hata benim suc benimdir."));
    }

    public static String arrange(String sentence){

        String[] words =sentence.split(" ");
        TreeMap<Integer, List<String>> lengthMap = new TreeMap<>();

        for(String word : words){
            int length = word.length();
            word = word.toLowerCase(); // all words converted to lowerCase
            if(word.endsWith(".")){
                word=word.substring(0, word.length()-1);// remove the "." which is end of the sentence
            }

            if (!lengthMap.containsKey(length)) {
                lengthMap.put(length, new ArrayList<>());

            }
            //String wordToLowerCase = word.toLowerCase();
            lengthMap.get(length).add(word);
            //System.out.println(lengthMap.get(length).add(word));

        }
        //Reassemble the rearrange sentence
        StringBuilder rearrangeSentence = new StringBuilder();
        for(Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()){
            List<String> wordList = entry.getValue();
            for(String word : wordList){
                rearrangeSentence.append(word).append(" ");

            }
        }

//        String pattern  = "^[A-Z][a-z ]*\\.$";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(rearrangeSentence);


        //Capitalize the first letter and append period
        rearrangeSentence.setCharAt(0, Character.toUpperCase(rearrangeSentence.charAt(0)));
        rearrangeSentence.setLength(rearrangeSentence.length()-1); // Romove extra space
        rearrangeSentence.append(".");

        return rearrangeSentence.toString();
    }
}
