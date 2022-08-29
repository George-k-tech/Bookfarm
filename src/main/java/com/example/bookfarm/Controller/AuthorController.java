package com.example.bookfarm.Controller;

import com.example.bookfarm.Model.Author;
import com.example.bookfarm.Repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    //aggregate root
    @GetMapping("/authors")
    List<Author> allAuthors() {
        return authorRepository.findAll();
    }

    //end ::get-aggregate-root[]

    @GetMapping("/authors/{id}")
    Optional<Author> oneAuthor (@PathVariable Long id){
     return authorRepository.findById(id);
    }

    @PostMapping("/authors")

    Author newAuthor(@RequestBody Author newAuthor){
        return authorRepository.save(newAuthor);
    }
}
