package dev.hygino.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hygino.calendar.model.Content;

public interface ContentRepository extends JpaRepository<Content,Integer> {


}
