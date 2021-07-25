package com.epam.Third;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author sburch
 * @mentor Roman Mysiuk
 */

public class Streamer {
    public static void main(String[] args) {
        //
        Collection<String> collection = Arrays.asList("j", "a", "v", "a");
        Stream<String> streamOfCollection = collection.stream();
        //
        String[] arr = new String[] { "Roman", "Mysiuk", "Olena", "Bufan" };
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 3, 4);
        //
        Stream<String> streamBuilder = Stream.<String>builder().add("<").add("e").add("p").add("a").add("ma").add(">")
                .build();
        //
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(5);
        //
        Stream<Integer> streamIterated = Stream.iterate(33, n -> n + 2).limit(20);
        //
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        //
        IntStream streamOfChars = "jdk".chars();
        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("j, d, k");
        //
        Stream<String> stream = Stream.of("q", "a").filter(element -> element.contains("a"));
        Optional<String> anyElement = stream.findAny();

    }

}
