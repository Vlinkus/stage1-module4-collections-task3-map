package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();
        if(!sourceMap.isEmpty())
            sourceMap.forEach((key, value) -> {
                if (newMap.containsKey(value) && newMap.get(value) < key) {
                    newMap.put(value, newMap.get(value));
                } else {
                    newMap.put(value, key);
                }
            });
        return newMap;
    }
}
