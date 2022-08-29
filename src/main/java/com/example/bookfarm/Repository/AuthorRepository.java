package com.example.bookfarm.Repository;

import com.example.bookfarm.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Long> {
}
