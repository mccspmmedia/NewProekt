package Lesson47;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        // Удаляем знаки препинания и приводим к нижнему регистру
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Разделяем текст на отдельные слова
        String[] words = text.split(" ");

        // Создаем Map для хранения частоты слов
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Подсчитываем частоту каждого слова
        for (String word : words) {
            if (word.trim().isEmpty()) {
                continue; // Пропускаем пустые строки
            }

            if (wordFrequency.containsKey(word)) {
                // Если слово уже встречалось, увеличиваем счетчик
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                // Иначе добавляем слово в Map
                wordFrequency.put(word, 1);
            }
        }

        return wordFrequency;
    }

    public static void main(String[] args) {
        String text = "Пример текста для подсчета частоты слов Пример текста для подсчета";

        Map<String, Integer> frequencyMap = countWordFrequency(text);

        // Выводим результат
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
