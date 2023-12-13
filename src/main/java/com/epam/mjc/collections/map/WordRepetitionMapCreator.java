package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> newMap = new HashMap<>();
        if(!sentence.isEmpty()) {
        String[] words = sentence.toLowerCase().split("[,./!?\\s]");
            for (String word : words) {
                int count = 0;
                if(!word.isEmpty()) {
                    for (String s : words) {
                        if (s.equals(word)) {
                            count++;
                        }
                    }

                    newMap.put(word, count);
                }
            }
        }
        return newMap;
    }
}
