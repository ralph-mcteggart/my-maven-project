package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(Arrays.asList("Hello", "World"));
        System.out.println(list);
    }
}
