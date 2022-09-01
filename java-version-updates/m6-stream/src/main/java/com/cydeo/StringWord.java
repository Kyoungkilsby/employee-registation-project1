package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringWord {
    public static void main(String[] args) {

        List<String> words
                = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);
    }}