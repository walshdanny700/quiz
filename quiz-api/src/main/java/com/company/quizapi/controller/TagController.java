package com.company.quizapi.controller;

import com.company.quizapi.dto.TagDto;
import com.company.quizapi.links.TagLinks;
import com.company.quizapi.service.ITagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/")
public class TagController {

    ITagService service;



    @Autowired
    public TagController(ITagService service) {

        this.service = service;

    }

    @GetMapping(TagLinks.LIST_TAGS)
    public ResponseEntity<?> getTags() {
        log.info("TagController:  list tags");
        return ResponseEntity.ok( service.getTags());
    }


    @PostMapping(TagLinks.ADD_TAG)
    public ResponseEntity<?> addTag(@RequestBody TagDto tagDto){

        TagDto resource = service.saveTag(tagDto);

        return  ResponseEntity.ok(resource);
    }
}
