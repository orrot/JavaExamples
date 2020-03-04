package pruebas.operations.mostrar;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TakeWhileVsDropWhile {

    public static void main(String[] args) {

        String[] arrayStrings = {"abdcefghi", "a", "ab", "abc", "abcd", "abcde", "fghi", "fgh", "fg"};
        List<String> strings = Arrays.asList(arrayStrings);

        strings.stream()
                .takeWhile(s -> s.length() < 5)
                .forEach(System.out::println);

    }
}
