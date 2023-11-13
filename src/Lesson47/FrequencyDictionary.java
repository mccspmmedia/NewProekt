package Lesson47;
import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {
    public static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (!Character.isWhitespace(currentChar) && !Character.isSpaceChar(currentChar)) {
                if (charFrequency.containsKey(currentChar)) {
                    charFrequency.put(currentChar, charFrequency.get(currentChar) + 1);
                } else {
                    charFrequency.put(currentChar, 1);
                }
            }
        }

        return charFrequency;
    }

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("Вхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();
    }
}

