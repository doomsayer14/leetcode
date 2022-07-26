package main;

import java.util.HashMap;
import java.util.Map;


/**
 * Given two arrays of a random chars. Define the common elements.
 * If arrays have common elem, return true, if not, return false.
 *
 * The right solution is: 1) create a hashtable with the first array
 * 2) loop through the second array and check for commons.
 */
public class Main {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};

        char[] array3 = {'a', 'b', 'c', 'x'};
        char[] array4 = {'z', 'y', 'x'};

        System.out.println(compareArraysBruteForce(array1, array2) + ", "
                + compareArraysBruteForce(array3, array4));

        System.out.println(compareArraysHashTable(array1, array2) + ", "
                + compareArraysBruteForce(array3, array4));
    }

    public static boolean compareArraysBruteForce(char[] a, char[] b) {
        for (char c : a) {
            for (char value : b) {
                if (c == value) {
                    return true;
                }
            }
        }
        return false;
        // O(a * b) - Time Complexity
        // O(1) - Space Complexity
    }
    
    public static boolean compareArraysHashTable(char[] a, char[] b) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsValue(a[i])) {
                map.put(i, a[i]);
            }
        }
        for (char c : b) {
            if (map.containsValue(c)) {
                return true;
            }
        }
        return false;
        // O(a + b) - Time Complexity
        // O(a) - Space Complexity
    }
}
