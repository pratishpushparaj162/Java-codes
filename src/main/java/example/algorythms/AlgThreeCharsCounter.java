package example.algorythms;

import java.util.HashMap;
import java.util.Map;

public class AlgThreeCharsCounter {
    public static void main(String[] args) {
        String originOne = "banana";
        Map<Character, Integer> result = countCharsInString(originOne);
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey().toString() + ':' + entry.getValue());
        }
        System.out.println("============================================");
        String originTwo = "coconut";
        result = countCharsInStringAdvanced(originTwo);
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey().toString() + ':' + entry.getValue());
        }

    }

    static Map<Character, Integer> countCharsInString(String origin) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < origin.length(); i++ ) {
            if (!result.containsKey(origin.charAt(i))) {
                result.put(origin.charAt(i), 1);
            } else {
                result.put(origin.charAt(i), result.get(origin.charAt(i)) + 1);
            }
        }
        return result;
    }

    static Map<Character, Integer> countCharsInStringAdvanced(String origin) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < origin.length(); i++) {
            result.merge(origin.charAt(i), 1, Integer::sum);
        }
        return result;
    }
}
