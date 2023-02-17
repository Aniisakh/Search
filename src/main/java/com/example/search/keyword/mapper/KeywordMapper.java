package com.example.search.keyword.mapper;

import com.example.search.keyword.utils.ParentType;
import com.example.search.keyword.entity.KeywordEntity;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.UUID;

@Component
public class KeywordMapper {
    public KeywordEntity toKeywordEntity(UUID parentId,
                                         ParentType parentType,
                                         String origin,
                                         List<String> keywords) {
        return KeywordEntity.builder()
                .parentId(parentId)
                .parentType(parentType.name())
                .origin(origin)
                .keywords(keywords)
                .build();
    }
}
