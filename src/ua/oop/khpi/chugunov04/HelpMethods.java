package ua.oop.khpi.chugunov04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HelpMethods {

    public static String[] SplitString(String text) {
        if (ArgumentTaker.isDebug()) {
        	System.out.format("------------------------------------------------");
            System.out.format("\n String text - our text before ~Split Method~))");
            System.out.format("\n String text = "+text);
        }

        List<String> words = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for(char symbol : text.toCharArray()) {
            if((int)symbol == 32 | (int)symbol == 33 |(int)symbol == 58|(int)symbol == 44|(int)symbol == 46) {
                words.add(builder.toString());
                builder = new StringBuilder();
                continue;
            }
            builder.append(symbol);
        }
        if(builder.length() != 0) {
            words.add(builder.toString());
        }
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).length() == 0) {
                words.remove(i);
            }
        }
        String[] output = new String[words.size()];
        for (int i = 0; i < words.size(); i++) {
            output[i] = words.get(i);
        }
        if (ArgumentTaker.isDebug()) {
            System.out.format("\n String text - our text after ~Split Method~))");
            System.out.format("\n String text = ");
            
            for (int i = 0; i < words.size(); i++) {
                System.out.format(output[i]);
            }
            System.out.format("\n------------------------------------------------");
            System.out.println();

        }
        return output;
    }

    public static void PrintResult (String[]words){
        if (ArgumentTaker.isDebug()) {
        	System.out.format("\n------------------------------------------------------------------------------");
            System.out.format("\n String[]words - our text after (split method) that taken to complete the task!");
            System.out.format("\n String[]words = ");
            for (int i = 0; i < words.length; i++) {
                System.out.format(words[i]);
            }
            System.out.format("\n------------------------------------------------------------------------------");
            
            System.out.format("\n A table with 2 colons: "
                            +"\n1) A word - word from our text;"
                            +"\n2) Count - a number of repetitions of a word."
                    );
        }

        System.out.println( "\n=============================");
        System.out.println( "A Word" + "\t\t\t" + "Count");
        System.out.println( "=============================");

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }

        for (String word : wordToCount.keySet()) {
            System.out.println(word + "\t\t\t" + wordToCount.get(word));
        }
        System.out.println( "=============================");
    }
}
