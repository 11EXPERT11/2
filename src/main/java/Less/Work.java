package Less;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;


public class Work {
    private static final String words =
            "Близкий человек " + "Близкий друг " + "Дальний ряд " + "Дальний родственник " + "плохое зрение "
                    + "плохое воспитание ";
    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
}
    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
        map.merge(s, 1, Integer::sum);

        }
        return map;
        }
    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));

        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Сидоров", "Сидоров-номер телефона-8800500600");
        phonebook.add("Малахов", "Малахов-номер телефона-8800500700");
        phonebook.add("Малахов", "8871288000500");
        phonebook.add("Сидоров", "Сидоров-номер телефона-8800500570");
        phonebook.add("Сидоров", "Сидоров-номер телефона-8800500300");
        phonebook.add("Сидоров", "Сидоров-номер телефона-8800500607");
        phonebook.add("Сидоров", "Сидоров-номер телефона-8800500608");
        
        System.out.println("Сидоров-номер телефона: " + phonebook.get("Сидоров"));
        System.out.println("Малахов-номер телефона: " + phonebook.get("Малахов"));

    }
}
