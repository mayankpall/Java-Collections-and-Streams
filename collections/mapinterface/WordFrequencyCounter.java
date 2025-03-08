package com.bridgelabz.collectionsandstreams.collections.mapinterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        String text = "Hello world, hello Java!";
        Map<String, Integer> wordCount = new HashMap<>();

        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
