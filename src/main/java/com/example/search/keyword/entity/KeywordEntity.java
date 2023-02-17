package com.example.search.keyword.entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "keywords")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class KeywordEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private UUID parentId;
    private String parentType;
    private String origin;

    @ElementCollection
    @CollectionTable(name = "keywords_names",
                     joinColumns = {@JoinColumn(name = "keyword_id", referencedColumnName = "id")})
    @LazyCollection(value = LazyCollectionOption.FALSE)
    private List<String> keywords;
}
