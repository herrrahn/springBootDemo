package de.rahn.rafael.springBootDemo.repositories;

import de.rahn.rafael.springBootDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
