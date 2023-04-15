package dev.hygino.calendar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/calendar")
public class CalendarController {

    @GetMapping
    public String menssagem() {
        return "Olá mundo";
    }
}
