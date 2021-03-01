package com.company.quizapi.repository;

import com.company.quizapi.entity.Tags;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITagRepository extends CrudRepository<Tags, Long> {
}
