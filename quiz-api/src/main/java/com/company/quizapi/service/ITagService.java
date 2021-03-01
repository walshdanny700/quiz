package com.company.quizapi.service;

import com.company.quizapi.dto.TagDto;
import com.company.quizapi.entity.Tags;

import java.util.List;

public interface ITagService {

    List<TagDto> getTags();

    TagDto saveTag(TagDto tagDto);

}
