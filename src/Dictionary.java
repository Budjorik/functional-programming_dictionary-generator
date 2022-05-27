import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dictionary {

    public <T, R extends Comparable<? super R>> List<R> createDictionary(
            List<T> dictionary, List<T> words, Function<T, R> func) {
        List<R> result = new ArrayList<>();
        result = words.stream()
                .map(value -> value.toString())
                .map(value -> value.split(" "))
                .flatMap(Arrays::stream)
                .map(value -> func.apply((T) value))
                .distinct()
                .filter(value -> !dictionary.contains(value))
                .sorted(Comparator.<R>naturalOrder())
                .collect(Collectors.toList());
        return result;
    }

    public String checkWord(String text) {
        return text.chars()
                .filter(i -> Character.isLetterOrDigit(i))
                .mapToObj(i -> String.valueOf((char) i))
                .map(String::toLowerCase)
                .collect(Collectors.joining());
    }

}

