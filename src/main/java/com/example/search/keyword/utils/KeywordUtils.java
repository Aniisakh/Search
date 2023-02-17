package com.example.search.keyword.utils;

import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class KeywordUtils {
    public static HashSet<String> generateKeywords(String origin) {
        return handleKeywordsGeneration(origin);
    }

    private static HashSet<String> handleKeywordsGeneration(String origin) {
        HashSet<String> result = new HashSet<>();
        HashSet<String> originSegmentList = new HashSet<>();
        String originSegment = "";
        for (int i = 0; i < origin.length(); i++) {
            for (int j = i; j < origin.length(); j++) {
                originSegment = originSegment.concat(String.valueOf(origin.charAt(j)));
                originSegmentList.add(originSegment);
            }
            result.addAll(originSegmentList);
            originSegmentList.clear();
            originSegment = "";
        }
        return result;
    }
}
