package dev.hygino.calendar.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import dev.hygino.calendar.model.Content;

@Repository
public class ContentRepository {

    private final List<Content> contents = new ArrayList<>();

    public ContentRepository() {
    }

    public List<Content> findAll() {
        return contents;
    }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public Content insert(Content obj) {
        contents.add(obj);
        return obj;
    }
}
