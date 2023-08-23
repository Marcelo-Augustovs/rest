package io.marceloaugustodev.rest.domain.repository;

import io.marceloaugustodev.rest.domain.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
