package dev.hygino.calendar.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import dev.hygino.calendar.dto.ContentInsertDTO;
import dev.hygino.calendar.model.Content;
import dev.hygino.calendar.repository.ContentRepository;

@Service
public class ContentService {

	final ContentRepository repository;

	public ContentService(ContentRepository repository) {
		this.repository = repository;
	}

	@Transactional(readOnly = true)
	public List<Content> findAll() {
		return repository.findAll();
	}

	@Transactional
	public Content insert(ContentInsertDTO obj) {
		Content content = new Content(obj);
		content = repository.save(content);
		return content;
	}

	@Transactional(readOnly = true)
	public Content findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Não existe elemento com o id " + id));
	}

	@Transactional
	public Content update(Integer id, ContentInsertDTO obj) {
		Content entity = repository.getReferenceById(id);

		if (entity.getId().equals(null)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não existe elemento com o id " + id);
		}

		entity.setContentType(obj.contentType());
		entity.setDateUpdated(LocalDateTime.now());
		entity.setDescription(obj.desc());
		entity.setTitle(obj.title());
		entity.setUrl(obj.url());

		entity = repository.save(entity);

		return entity;
	}

	public void remove(Integer id) {
		repository.deleteById(id);
	}
}
