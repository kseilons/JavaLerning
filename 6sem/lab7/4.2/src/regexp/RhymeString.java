package regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RhymeString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = rhymningString(in);
        System.out.println(result);
        in.close();
    }

	private static boolean rhymningWord(String last, String next) {
		if (last.length() == 0 || next.length() == 0) {
	        return false;
	        
	    } else if (last.length() > 6 && next.length() > 6) {
	        return last.substring(last.length() - 3).equalsIgnoreCase(next.substring(next.length() - 3));
	        
	    } else {
	        return Character.toLowerCase(last.charAt(last.length() - 1)) == 
	                Character.toLowerCase(next.charAt(next.length() - 1));
	    }
	}
	
	private static String rhymningString(Scanner in) {
	    System.out.println("Введите строки:");
	    
	    List<String> lines = new ArrayList<>();
	    
	    while (true) {
	        String line = in.nextLine().trim();
	        if (line.isEmpty()) {
	            break;
	        }
	        lines.add(line);
	    }
	    
	    if (lines.size() < 2) {
	        return "Недостаточно строк";
	    }
	    
	    String[] lastWords = new String[lines.size()];
	    for (int i = 0; i < lines.size(); i++) {
	        String[] words = lines.get(i).split(" ");
	        lastWords[i] = words[words.length - 1];
	    }
	    
	    StringBuilder result = new StringBuilder();
	    boolean allRhyme = true;
	    
	    for (int i = 0; i < lastWords.length - 1; i++) {
	        boolean rhyme = rhymningWord(lastWords[i], lastWords[i + 1]);
	        
//	        result.append("Строка ").append(i + 1).append(" - Строка ").append(i + 2)
//	              .append(": ").append(lastWords[i]).append(" - ").append(lastWords[i + 1])
//	              .append(" ").append(rhyme).append("\n");
//	        
	        if (!rhyme) {
	            allRhyme = false;
	        }
	    }
	    
	    if (allRhyme) {
	        result.append("\nВсе строки рифмуются");
	    } else {
	        result.append("\nНе все строки рифмуются");
	    }
	    
	    return result.toString();
	}
}

// молоко молочное
// водичка просрочное
