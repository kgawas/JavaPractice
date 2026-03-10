package String;

import java.util.HashMap;

/**
 * This code gives the last non-repeating character in a given string inputString
 */
public class PrintLastNonRepeatingCharacterInGivenString {
    public static void main(String[] args) {
        String inputString = "The sky is blue";
        int index = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (map.containsKey(ch))
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            else {
                map.put(ch, 1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1 && inputString.indexOf(c) > index) {
                index = inputString.indexOf(c);
            }

        }
        System.out.println("Last Non Repeating char:" + inputString.charAt(index));
    }
}
