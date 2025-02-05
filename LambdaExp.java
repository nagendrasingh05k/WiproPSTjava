package Assignment5;

import java.util.*;


@FunctionalInterface
interface StringProcessor{
    String process(String str);
}

public class LambdaExp {
    
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("banana", "apple", "orange", "grape", "mangeo");

        // Sorting in reverse alphabet...

        words.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted in reverse alphabetical order:");
        words.forEach(System.out::println);


        // Implementing the functional interface using lambda expression

        StringProcessor toUpperCaseProcessor = String::toUpperCase;

        System.out.println("\nUppercase version of words: ");

        words.forEach(word -> System.out.println(toUpperCaseProcessor.process(word)));

    }
}
