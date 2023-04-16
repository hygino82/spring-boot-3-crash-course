package dev.hygino.calendar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hygino.calendar.model.Content;
import dev.hygino.calendar.repository.ContentRepository;

@RestController
@RequestMapping("/api/v1/content")
public class ContentController {

    final ContentRepository repository;

    public ContentController(ContentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Content> menssagem() {
        return this.repository.findAll();
    }

    @PostMapping
    public Content insert(@RequestBody Content obj){
        return this.repository.insert(obj);
    }
}
