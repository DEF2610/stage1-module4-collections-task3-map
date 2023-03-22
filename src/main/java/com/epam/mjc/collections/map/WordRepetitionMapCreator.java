package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence, ",. ");
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        while (tokenizer.hasMoreElements()) {
            list.add(tokenizer.nextToken());
        }
        for (String str : list) {
            String key = str.toLowerCase();
            int value = 0;
            for (String str1 : list) {
                if (key.equals(str1.toLowerCase())) {
                    value++;
                }
            }
            map.put(str.toLowerCase(), value);
        }
        return map;
    }
}
