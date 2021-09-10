package org.launchcode.studio2;

import java.util.*;

public class CharacterCounter {
    private final Map<Character, Integer> count = new TreeMap<>();
    private final String input;

    public CharacterCounter(String input) {
        this.input = input;
    }

    public Map<Character, Integer> count() {
        count.clear();

        char[] characters = input.toCharArray();
        for(var i = 0; i < characters.length; i++) {
            char character = characters[i];
            if (!Character.isAlphabetic(character)) {
                continue;
            }
            // approach #1
            /*
            int existingCount = 0;
            if (count.containsKey(character)) {
                existingCount = count.get(character);
            }
            existingCount = existingCount + 1;
            count.put(character, existingCount);
             */
            // approach #2
            /*
            int existingCount = count.getOrDefault(character, 0);
            count.put(character, existingCount + 1);
             */
            // approach #3
            count.merge(Character.toUpperCase(character), 1, Integer::sum);
        }

        return count;
    }
}
