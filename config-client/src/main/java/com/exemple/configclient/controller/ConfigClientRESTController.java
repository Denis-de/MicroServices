package com.exemple.configclient.controller;

import com.exemple.configclient.model.Book;
import com.exemple.configclient.service.ConfigClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ConfigClientRESTController {
    private final ConfigClient clientService;

    public ConfigClientRESTController(ConfigClient clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/books")
    List<Book> getAllBooksFromClient() {
        return clientService.getAllBooks();
    }
}
