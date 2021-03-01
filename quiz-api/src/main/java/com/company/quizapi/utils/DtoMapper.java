package com.company.quizapi.utils;

import com.company.quizapi.dto.TagDto;
import com.company.quizapi.entity.Tags;
import com.company.quizapi.service.ITagService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class DtoMapper {

    private ModelMapper modelMapper;

    @Autowired
    public DtoMapper(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;

    }

    public <S, T> List<T> mapList(Iterable<S> source, Class<T> targetClass) {
        return StreamSupport.stream(source.spliterator(), false)
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }

    public TagDto convertToDto(Tags tag) {
        TagDto tagDto = modelMapper.map(tag, TagDto.class);

        return tagDto;
    }

    public Tags convertToEntity(TagDto tagDto){
        Tags tag = modelMapper.map(tagDto, Tags.class);

        return tag;
    }
}
