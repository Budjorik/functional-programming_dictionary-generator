import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса словаря
        Dictionary obj = new Dictionary();

        // Создаем список слов с уже известными нам словами аборигенов
        List<String> dictionary = new ArrayList<>();
        dictionary.add("мороз");
        dictionary.add("остаюсь");
        dictionary.add("холодно");

        // Создаем список нескольких листков с текстами, записанными аборигенами
        List<String> texts = Arrays.asList("Однажды в студёную зимнюю пору я из лесу вышел, был сильный мороз.",
                "Однажды в мороз мы гуляли с собакой.",
                "Когда я гуляю зимой, особенно в мороз, я тепло одеваюсь.",
                "Когда на улице холодно, я мерзну.");

        // Получаем список новых слов, отсутствующих в уже имеющемся словаре
        List<String> preDictionary = new ArrayList<>();
        preDictionary = obj.createDictionary(dictionary, texts, obj::checkWord);
        preDictionary.forEach(System.out::println);

    }
}
