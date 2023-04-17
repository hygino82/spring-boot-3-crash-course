package dev.hygino.calendar.dto;

import dev.hygino.calendar.model.Status;
import dev.hygino.calendar.model.Type;

public record ContentInsertDTO(
        String title,
        String desc,
        Status status,
        Type contentType,
        String url) {
}
