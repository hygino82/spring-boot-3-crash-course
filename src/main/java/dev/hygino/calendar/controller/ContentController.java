package dev.hygino.calendar.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hygino.calendar.dto.ContentInsertDTO;
import dev.hygino.calendar.model.Content;
import dev.hygino.calendar.service.ContentService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/content")
@CrossOrigin("*")
public class ContentController {

	final ContentService service;

	public ContentController(ContentService service) {
		this.service = service;
	}

	@GetMapping
	@Tag(name = "Listar todos os conteúdos")
	public ResponseEntity<List<Content>> findAll() {
		List<Content> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	@Tag(name = "Buscar conteúdo por Id")
	public ResponseEntity<Content> findById(@PathVariable Integer id) {
		Content obj = service.findById(id);
		return ResponseEntity.status(200).body(obj);
	}

	@PostMapping
	@Tag(name = "Inserir conteúdo")
	public ResponseEntity<Content> insert(@RequestBody ContentInsertDTO obj) {
		Content content = service.insert(obj);
		return ResponseEntity.status(201).body(content);
	}

	@PutMapping("/{id}")
	@Tag(name = "Atualizar conteúdo")
	public ResponseEntity<Content> update(@PathVariable Integer id, @RequestBody ContentInsertDTO obj) {
		Content content = service.update(id, obj);
		return ResponseEntity.status(200).body(content);
	}
	
	@DeleteMapping("/{id}")
	@Tag(name = "Remover conteúdo por Id")
	public void remove(@PathVariable Integer id) {
		service.remove(id);
	}
}
