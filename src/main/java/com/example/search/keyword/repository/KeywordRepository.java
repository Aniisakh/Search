package com.example.search.keyword.repository;

import com.example.search.keyword.entity.KeywordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface KeywordRepository extends JpaRepository<KeywordEntity, UUID> {
}
