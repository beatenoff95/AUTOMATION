package lesson13;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    public static Map<String, Integer> countWords(String text) {
        // Розділяємо текст на слова за допомогою пробілів
        String[] words = text.split("\\s+");

        // Створюємо карту для підрахунку кількості входжень кожного слова
        Map<String, Integer> wordCounts = new HashMap<>();

        // Підраховуємо кількість входжень кожного слова
        for (String word : words) {
            // Отримуємо поточну кількість входжень слова, якщо воно вже присутнє у карті
            Integer count = wordCounts.getOrDefault(word, 0);
            // Збільшуємо кількість входжень слова на 1 та оновлюємо карту
            wordCounts.put(word, count + 1);
        }

        // Сортуємо карту за ключами (словами) за допомогою TreeMap
        Map<String, Integer> sortedWordCounts = new TreeMap<>(wordCounts);

        return sortedWordCounts;
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. " +
                "Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. " +
                "Praesent mauris. Fusce nec tellus sed augue semper porta. Mauris massa. " +
                "Vestibulum lacinia arcu eget nulla. Class aptent taciti sociosqu ad litora " +
                "torquent per conubia nostra, per inceptos himenaeos.";

        Map<String, Integer> wordCounts = countWords(text);

        // Виводимо відсортовані слова та їхні кількості входжень
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}