package ua.oop.khpi.wrongpackage;
import java.util.ArrayList;
import java.util.List;


public class TestHelper  {
	
	 public static String[] SplitString(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int count = 0;
        char symbol;
        while (count < text.length()) {
          for (int i = count; i < text.toCharArray().length; i++)
          {
            symbol = text.toCharArray()[i];
            if((int)symbol == 32 | (int)symbol == 33 |(int)symbol == 58|(int)symbol == 44|(int)symbol == 46) {
                    count++;
              break;
            }
            builder.append(symbol);
            count++;
          }
          words.add(builder.toString());
          builder = new StringBuilder();
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
        return output;
	
	 }
}
