package com.exercises.fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStreamExamples {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> evens = listOfIntegers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println(evens);

        String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        Function<Integer, Predicate<String>> createLengthTest = minLength -> {
            return str -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = createLengthTest.apply(3);

        Predicate<String> isLessThan5Characters = s -> s.length() < 5;

        List<String> lessThanFiveChars = words
                .stream()
                .filter(isLessThan5Characters)
                .collect(Collectors.toList());

        System.out.println(lessThanFiveChars);

        List<String> longerWords = words
                .stream()
                .filter(createLengthTest.apply(5))
                .collect(Collectors.toList());

        System.out.println(longerWords);

        List<String> longerThan3Chars = words
                .stream()
                .filter(isLongerThan3)
                .collect(Collectors.toList());

        System.out.println(longerThan3Chars);

    }
}
