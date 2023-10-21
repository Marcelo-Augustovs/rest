package io.marceloaugustodev.rest.domain.repository;

import io.marceloaugustodev.rest.domain.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
