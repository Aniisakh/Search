package com.example.search.keyword.service;

import com.example.search.keyword.utils.ParentType;

import java.util.UUID;

public interface KeywordService {
    void createKeyword(UUID parentId, ParentType parentType, String origin, String keyword);
    UUID findId(String keyword);
}
