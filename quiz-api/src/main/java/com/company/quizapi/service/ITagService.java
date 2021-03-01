package com.company.quizapi.service;

import com.company.quizapi.dto.TagDto;

import java.util.List;

public interface ITagService {

    List<TagDto> getTags();

    TagDto saveTag(TagDto tagDto);

}
