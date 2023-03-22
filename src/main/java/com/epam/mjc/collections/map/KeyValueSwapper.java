package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<Integer, String> entry1 : sourceMap.entrySet()) {
            for (Map.Entry<Integer, String> entry2 : sourceMap.entrySet()) {
                if (map.containsKey(entry1.getValue())) {
                    break;
                }
                if (entry1.getValue().equals(entry2.getValue()) && Objects.equals(entry1.getKey(), entry2.getKey())) {
                    map.put(entry1.getValue(), entry1.getKey());
                } else if (entry1.getValue().equals(entry2.getValue()) && entry1.getKey() > entry2.getKey()) {
                    map.put(entry1.getValue(), entry2.getKey());
                } else if (entry1.getValue().equals(entry2.getValue())) {
                    map.put(entry1.getValue(), entry1.getKey());
                }
            }
        }
        return map;
    }
}
