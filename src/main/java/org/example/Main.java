package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] dictionary = {
                "Огонь", "Вода", "Воздух", "Земля", "Лед",
                "Молния", "Огонь", "Молния", "Воздух", "Земля",
                "Вода", "Лед", "Огонь", "Земля", "Воздух",
                "Вода", "Огонь", "Земля", "Воздух", "Лед"
        };

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(dictionary));
        System.out.println("Список уникальных слов: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : dictionary) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Ivanov", "+7(961)123-45-67");
        phoneBook.add("Petrov", "7(961)234-56-78");
        phoneBook.add("Ivanov", "7(961)345-67-89");

        // Получаем номера по фамилии
        System.out.println("Ivanov's numbers: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov's number: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov's number: " + phoneBook.get("Sidorov"));
    }
}
