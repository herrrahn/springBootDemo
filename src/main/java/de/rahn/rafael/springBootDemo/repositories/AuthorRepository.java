package de.rahn.rafael.springBootDemo.repositories;

import de.rahn.rafael.springBootDemo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
