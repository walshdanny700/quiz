package com.company.quizapi.service;

import com.company.quizapi.dto.TagDto;
import com.company.quizapi.entity.Tags;
import com.company.quizapi.repository.ITagRepository;
import com.company.quizapi.utils.DtoMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements ITagService{

    private ITagRepository repo;
    private DtoMapper dtoMapper;

    @Autowired
    public TagService(ITagRepository repo, DtoMapper dtoMapper) {

        this.repo = repo;
        this.dtoMapper = dtoMapper;
    }

    @Override
    public List<TagDto> getTags() {

        Iterable<Tags> tagsEntityIter = repo.findAll();

        return dtoMapper.mapList(tagsEntityIter, TagDto.class);

    }

    @Override
    public TagDto saveTag( TagDto tagDto) {


        Tags tagEntityOutput =  repo.save(dtoMapper.convertToEntity(tagDto));

        return dtoMapper.convertToDto(tagEntityOutput);
    }
}
