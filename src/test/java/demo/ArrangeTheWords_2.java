package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/*
* Arrange the Words 

Arrange the Words
Description
A sentence is defined as a string of space-separated words that starts with a capital letter followed by lowercase letters and spaces, and ends with a period. That is, it satisfies the regular expression ^[A-Z][a-z ]*\.$. Rearrange the words in a sentence while respecting the following conditions :

1. Each word is ordered by length, ascending.
2. Words of equal length must appear in the same order as in the original sentence.
3. The rearranged sentence must be formatted to satisfy the regular expression ^[A-Z][a-z ]*\.$

Example
sentence = Cats and hats.

Order the sentence by word's length and keep the original order for the words with the same length.
* Length 3: {and}
* Length 4: {Cats, hats}
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period.
The result is 'And cats hats.'

Function Description
Complete the function arrange in the editor below.

arrange has the following parameter(s):
    string sentence:  a well formed sentence string
Returns:
    string: an formatted, rearranged sentence string

Constraints
* 1 ≤ length of sentence < 105

Input Format for Custom Testing

Sample Case 0
Sample Input 0
STDIN     Function -----     -------- The lines are printed in reverse order. →  sentence = 'The lines are printed in reverse order.'
Sample Output 0
In the are lines order printed reverse.

Explanation 0
Order the sentence by the lengths of the words and keep the original order for the words with the same length.
* Length 2: {in}
* Length 3: {the, are} . same length, keep the original order.
* Length 5: {lines, order}. same length, keep the original order.
* Length 7: {printed, reverse}. same length, keep the original order.
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period.
The result is ' In the are lines order printed reverse.'

 */

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
