package com.wisesoft.co.th.lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoLD {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
//        numbers.forEach(System.out::println);
        numbers.stream()
        .filter(i -> i%2 == 0)
        .map(i -> i * 2)
        .forEach(System.out::println);
    }

}
