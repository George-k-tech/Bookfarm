package com.example.bookfarm.Repository;

import com.example.bookfarm.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {

}
