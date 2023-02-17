package com.example.search.keyword.serviceImpl;

import com.example.search.keyword.mapper.KeywordMapper;
import com.example.search.keyword.utils.KeywordUtils;
import com.example.search.keyword.utils.ParentType;
import com.example.search.keyword.repository.KeywordRepository;
import com.example.search.keyword.service.KeywordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@AllArgsConstructor
public class KeywordServiceImpl implements KeywordService {
    private final KeywordRepository keywordRepository;
    private final KeywordMapper keywordMapper;

    @Override
    public void createKeyword(UUID parentId, ParentType parentType, String origin, String keyword) {
        var keywords = KeywordUtils.generateKeywords(keyword).parallelStream().toList();
        keywordRepository.save(keywordMapper.toKeywordEntity(parentId, parentType, origin, keywords));
    }

    @Override
    public UUID findId(String keyword) {
        return null;
    }

}
