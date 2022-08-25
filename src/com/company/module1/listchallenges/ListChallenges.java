package com.company.module1.listchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListChallenges {

    // Get the names NOT starting with a vowel (a, e, i, o, u)
    public static void filterChallenge(){
        List<String> names = Arrays.asList("Alex", "Chris", "Electra", "Ian", "Oppa", "Upton", "Will");
        // solution below
        final List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        List<String> filteredNames = names.stream()
                .filter((name) -> !vowels.contains(name.substring(0, 1).toLowerCase()))
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }

    // Apply an additional 20% increase to each rate
    public static void mapChallenge(){
        List<Double> rates = Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5);
        // solution below
        List<Double> newRates = rates.stream()
                .map((rate) -> rate * 1.2)
                .collect(Collectors.toList());
        System.out.println(newRates);
    }

    // sum the numbers
    public static void reduceChallenge(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // solution below
        Integer sum = numbers.stream()
                .reduce(0, (previous, current) -> previous + current);
        System.out.println(sum);
    }

    // Return a single string of the the animals that have more than 3 chars in their name. Append a dash and the number of chars in their name
    public static void methodChainingChallenge(){
        List<String> animals = Arrays.asList("Baboon", "Cat", "Whale", "Dog", "Rhino", "Parrot"); // should return "Baboon-6 Whale-5 Rhino-5 Parrot-6" (no space at the end)
        // solution below
        String transformedAnimals = animals.stream()
                .filter((animal) -> animal.chars().count() > 3)
                .map((animal) -> animal + "-" + animal.chars().count())
                .reduce("", (previous, current) -> previous + " " + current)
                .trim();
        System.out.println(transformedAnimals);



    }
}
