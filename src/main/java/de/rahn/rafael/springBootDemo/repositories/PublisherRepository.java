package de.rahn.rafael.springBootDemo.repositories;

import de.rahn.rafael.springBootDemo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
