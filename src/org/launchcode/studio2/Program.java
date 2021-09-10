package org.launchcode.studio2;

import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        CharacterCounter counter = new CharacterCounter(scanner.nextLine());
        Map<Character, Integer> result = counter.count();

        for(Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
        }
    }
}
