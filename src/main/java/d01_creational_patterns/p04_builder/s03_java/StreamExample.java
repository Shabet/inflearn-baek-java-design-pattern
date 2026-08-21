package d01_creational_patterns.p04_builder.s03_java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder().add("keesun").add("whiteship").build();
        names.forEach(System.out::println);
    }
}
