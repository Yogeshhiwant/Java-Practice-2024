package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeQuestions {
    public static void main(String[] args) {

        /*
        1. Filter Even Numbers
Write a program to filter out all even numbers from a list of integers.
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output: [2, 4, 6, 8, 10]
         */

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        /*
        2. Find the Maximum Number
Use streams to find the maximum number from a list of integers.
Input: [10, 20, 4, 45, 99]
Output: 99
         */
        List<Integer> integers1 = List.of(10, 20, 4, 45, 99);
        Integer i = integers1.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);


        /*
        3. Sum of Numbers in a List
Write a program that calculates the sum of all numbers in a list.
Input: [1, 2, 3, 4, 5]
Output: 15
         */
        List<Integer> integers2 = List.of(1, 2, 3, 4, 5);
        Integer sum = integers2.stream().collect(Collectors.summingInt(x -> x));
        System.out.println(sum);

        /*
        4. Count Occurrences of Each Word
Given a list of words, use streams to count the occurrences of each word.
Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
Output: {apple=3, banana=2, orange=1}
         */
        List<String> apple = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> collect1 = apple.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect1);

        /*
        5. Square and Collect
Create a new list where each number is squared from the original list of numbers.
Input: [1, 2, 3, 4, 5]
Output: [1, 4, 9, 16, 25]
         */

        List<Integer> integers3 = List.of(1, 2, 3, 4, 5);
        List<Integer> collect2 = integers3.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect2);
        /*
        6. Filter and Map
Use streams to filter out all numbers greater than 10 and square them.
Input: [5, 12, 7, 15, 2, 20]
Output: [144, 225, 400] (numbers greater than 10 squared)
         */

        List<Integer> integers4 = List.of(5, 12, 7, 15, 2, 20);
        List<Integer> integers5 = integers4.stream().filter(x -> x > 10).map(x -> x * x).toList();
        System.out.println(integers5);

        /*
        7. FlatMap Example
Given a list of lists of integers, flatten the list using flatMap to create a single list.
Input: [[1, 2], [3, 4], [5, 6]]
Output: [1, 2, 3, 4, 5, 6]
         */
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
        List<Integer> integers6 = lists.stream().flatMap(x -> x.stream()).toList();
        System.out.println(integers6);

        /*
        8. Check if All Numbers are Positive
Write a program to check if all numbers in a list are positive using the allMatch stream method.
Input: [2, 4, 5, 7]
Output: true
         */
        List<Integer> integers7 = List.of(2, 4, 5, 7);
        boolean result = integers7.stream().allMatch(x -> x > 0);
        System.out.println(result);

        /*
        9. Find the Average of Numbers
Write a program to calculate the average of numbers in a list using mapToInt and average.
Input: [1, 2, 3, 4, 5]
Output: 3.0
         */
        List<Integer> integers8 = List.of(1, 2, 3, 4, 5);
//      Double average = integers8.stream().collect(Collectors.averagingInt(x -> x));
//      intSummaryStatistics collect3 = integers8.stream().collect(Collectors.summarizingInt(x -> x));
        Double average = integers8.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println(average);
//      System.out.println(collect3);

        /*
        10. Group By Length
Given a list of strings, group them by their length
Input: ["apple", "banana", "kiwi", "grape", "pear"]
Output: {5=[apple, grape], 6=[banana], 4=[kiwi, pear]}
         */
        List<String> fruits = List.of("apple", "banana", "kiwi", "grape", "pear");
        Map<Integer, List<String>> collect3 = fruits.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect3);

        /*
        11. Find the First Element of a List
Use streams to get the first element from a list, or return a default value if the list is empty.
Input: [10, 20, 30, 40]
Output: 10
         */
        List<Integer> integers9 = List.of(10, 20, 30, 40);
        int i1 = integers9.stream().mapToInt(x -> x).findFirst().orElseGet(() -> 0);
//      int i2 = integers9.stream().mapToInt(x -> x).findFirst().orElse(0);
        System.out.println(i1);

        /*
        12. Sort a List of Strings by Length
Sort a list of strings by the length of each string using streams.
Input: ["apple", "kiwi", "banana", "pear"]
Output: ["kiwi", "pear", "apple", "banana"]
         */
        List<String> apple1 = List.of("apple", "kiwi", "banana", "pear");
        List<String> collect4 = apple1.stream().sorted((x, y) -> x.length() - y.length()).collect(Collectors.toList());
        List<String> collect5 = apple1.stream().sorted((x, y) -> y.length() - x.length()).collect(Collectors.toList());
        System.out.println(collect4);
        System.out.println(collect5);

        /*
        13. Collect to a Set
Given a list of integers, use streams to collect only unique elements in a set.
Input: [1, 2, 2, 3, 4, 4, 5]
Output: {1, 2, 3, 4, 5}
         */
        List<Integer> integers10 = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> collect6 = integers10.stream().collect(Collectors.toSet());
        System.out.println(collect6);

        /*
        14. Create a Map of Squares
Given a list of integers, create a map where the key is the number and the value is the square of that number.
Input: [1, 2, 3, 4]
Output: {1=1, 2=4, 3=9, 4=16}
         */
        List<Integer> integers11 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Integer, Integer> collect7 = integers11.stream().collect(Collectors.toMap(x -> x, x -> x * x));
        System.out.println(collect7);
        /*
        15. Find Duplicate Elements
Given a list of strings, use streams to find the duplicates.
Input: ["apple", "banana", "apple", "orange", "banana"]
Output: ["apple", "banana"]
         */
        List<String> apple2 = List.of("apple", "banana", "apple", "orange", "banana");
        List<String> duplicates = apple2.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicates);

        /*
        16.Find the First Non-Duplicate Element
        Write a program that finds the first element in a list that does not appear more than once.
Input: ["apple", "banana", "apple", "orange", "banana"]
Output: orange
         */
        List<String> apple3 = List.of("apple", "banana", "apple", "orange", "banana");
        String key = apple3.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() <= 1)
                .findFirst().get().getKey();
        System.out.println(key);
        /*
        17.Merge Two Lists and Remove Duplicates
Given two lists of integers, merge them and remove duplicates using streams.
Input:
List 1: [1, 2, 3, 4]
List 2: [3, 4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]
         */
        List<Integer> integers12 = List.of(1, 2, 3, 4);
        List<Integer> integers13 = List.of(3, 4, 5, 6);
        List<Integer> integers14 = Stream.concat(integers12.stream(), integers13.stream()).distinct().toList();
        System.out.println(integers14);
        /*
        18.Sort Strings in Reverse Alphabetical Order
Sort a list of strings in reverse alphabetical order using streams.
Input: ["apple", "banana", "orange", "kiwi", "pear"]
Output: ["pear", "kiwi", "orange", "banana", "apple"]
         */
        List<String> apple4 = List.of("apple", "banana", "orange", "kiwi", "pear");
        List<String> list = apple4.stream().sorted((x, y) -> y.compareTo(x)).toList();
        System.out.println(list);

        /*
        19.Find Words with Specific Length
Given a list of words, use streams to find all words with more than 4 characters.
Input: ["apple", "banana", "kiwi", "orange", "pear"]
Output: ["apple", "banana", "orange"]
         */
        List<String> list1 = apple4.stream().filter(x -> x.length() > 4).toList();
        System.out.println(list1);
        /*
        20.Calculate Product of Numbers
Given a list of integers, use streams to calculate the product of all numbers.
Input: [2, 3, 4, 5]
Output: 120
         */
        List<Integer> integers15 = List.of(2, 3, 4, 5);
//      int asInt = integers15.stream().mapToInt(x -> x).reduce((x, y) -> x * y).getAsInt();
        Integer product = integers15.stream().reduce(1, (x, y) -> x * y);
//      System.out.println(asInt);
        System.out.println(product);


        /*
        21.Create a Map with Word Lengths
Create a map where the key is the word and the value is the length of that word.
Input: ["apple", "banana", "kiwi", "grape"]
Output: {apple=5, banana=6, kiwi=4, grape=5}
         */
        Map<String, Integer> collect8 = apple4.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
        System.out.println(collect8);
        /*
        22.Find the Smallest Element in a List
Find the smallest element in a list of integers using streams.
Input: [10, 5, 3, 8, 7]
Output: 3
         */
        List<Integer> integers16 = List.of(10, 5, 3, 8, 7);
        Integer smallest = integers16.stream().sorted().findFirst().get();
        System.out.println(smallest);
        /*
        23.Check if Any Number is Even
Use streams to check if any number in a list is even.
Input: [3, 5, 7, 9, 10]
Output: true (since 10 is even)
         */
        List<Integer> integers17 = List.of(3, 5, 7, 9, 10);
        boolean present = integers17.stream().filter(x -> x % 2 == 0).findAny().isPresent();
        System.out.println(present);
        /*
        24.Join List of Strings into a Single String
Given a list of strings, use streams to join them into a single string, separated by commas.
Input: ["apple", "banana", "orange", "kiwi"]
Output: "apple,banana,orange,kiwi"
         */
        String collect9 = apple4.stream().collect(Collectors.joining(","));
        System.out.println(collect9);
        /*
        25.Remove Empty Strings from a List
Given a list of strings, remove all empty strings using streams.
Input: ["apple", "", "banana", "", "kiwi"]
Output: ["apple", "banana", "kiwi"]
         */
        List<String> apple5 = List.of("apple", "", "banana", "", "kiwi");
        List<String> list2 = apple5.stream().filter(x -> !x.isEmpty()).toList();
        System.out.println(list2);
        /*
        26.Find the Longest Word
Find the longest word in a list of strings using streams.
Input: ["apple", "banana", "kiwi", "orange", "grape"]
Output: "banana"
         */
        String s = apple4.stream().sorted((x, y) -> y.length() - x.length()).findFirst().get();
        System.out.println(s);
        /*
        27.Filter Strings by Prefix
Given a list of strings, filter out those that start with the letter "b".
Input: ["apple", "banana", "blueberry", "cherry", "blackberry"]
Output: ["banana", "blueberry", "blackberry"]
         */
        List<String> apple6 = List.of("apple", "banana", "blueberry", "cherry", "blackberry");
        List<String> list3 = apple6.stream().filter(x -> x.startsWith("b")).toList();
        System.out.println(list3);
        /*
        28.Sum of Squared Odd Numbers
Given a list of integers, use streams to calculate the sum of the squares of all odd numbers.
Input: [1, 2, 3, 4, 5, 6]
Output: 35
         */
        List<Integer> integers18 = List.of(1, 2, 3, 4, 5, 6);
        int sumOfSqaures = integers18.stream().filter(x -> x % 2 != 0).mapToInt(x -> x * x).sum();
        System.out.println(sumOfSqaures);

        /*
        29. Concatenate Lists of Strings
Given two lists of strings, concatenate them into a single list using streams.
Input:
List 1: ["apple", "banana"]
List 2: ["orange", "kiwi"]
Output: ["apple", "banana", "orange", "kiwi"]
         */
        List<String> apple7 = List.of("apple", "banana");
        List<String> apple8 = List.of("orange", "kiwi");
        List<String> list4 = Stream.concat(apple7.stream(), apple8.stream()).toList();
        System.out.println(list4);
        /*
        30.Find the Number of Unique Elements
Given a list of integers, use streams to find the number of unique elements.
Input: [1, 2, 2, 3, 3, 4, 5]
Output: 5 (since the unique elements are {1, 2, 3, 4, 5})
         */
        List<Integer> integers19 = List.of(1, 2, 2, 3, 3, 4, 5);
        long count = integers19.stream().collect(Collectors.toSet()).stream().count();
        long count1 = integers19.stream().distinct().count();
        System.out.println(count);
        System.out.println(count1);
        /*
        31.Create a List of Squares for Even Numbers
Create a list of squares of only even numbers from a given list of integers.
Input: [1, 2, 3, 4, 5, 6]
Output: [4, 16, 36]
         */
        List<Integer> integers20 = integers18.stream().filter(x -> x % 2 == 0).map(x -> x * x).toList();
        System.out.println(integers20);
        /*
        32.Check if All Numbers are Positive
Use streams to check if all numbers in a list are positive.
Input: [1, 2, 3, -4, 5]
Output: false (because -4 is negative)
         */
        List<Integer> integers21 = List.of(1, 2, 3, -4, 5);
        boolean isPositive = integers21.stream().allMatch(x -> x > 0);
        System.out.println(isPositive);

        /*
        33.Group Words by First Letter
Given a list of words, group them by their first letter.
Input: ["apple", "banana", "kiwi", "cherry", "avocado"]
Output: {a=[apple, avocado], b=[banana], k=[kiwi], c=[cherry]}
         */
        List<String> apple9 = List.of("apple", "banana", "kiwi", "cherry", "avocado");
        Map<Character, List<String>> collect10 = apple9.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.toList()));
        System.out.println(collect10);
        /*
        34.Create a List of Integers from a Range
Use streams to generate a list of integers from 1 to 10.
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         */
        List<Integer> list5 = Stream.iterate(1, x -> x + 1).limit(10).toList();
        System.out.println(list5);
        /*
        35.Find the Frequency of Each Character in a String
Given a string, use streams to find the frequency of each character.
Input: "abracadabra"
Output: {a=5, b=2, r=2, c=1, d=1}
         */
        String input = "abracadabra";
        Map<Character, Long> collect11 = input.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect11);
    }
}
