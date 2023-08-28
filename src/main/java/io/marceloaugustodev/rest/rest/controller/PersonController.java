package io.marceloaugustodev.rest.rest.controller;


import io.marceloaugustodev.rest.domain.entities.Person;
import io.marceloaugustodev.rest.exception.ResourceNotFoundException;
import io.marceloaugustodev.rest.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service){
        this.service = service;

    }

    @GetMapping()
    public List<Person> allPerson(){
       return service.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") long id) throws ResourceNotFoundException {
        return service.findById(id);
    }

    @PostMapping()
    public Long create(@RequestBody Person newPerson){
        Person person = service.create(newPerson);
        return person.getId();
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) throws ResourceNotFoundException{
      service.delete(id);
    }

    @PutMapping()
    public void update(@RequestBody Person person){
       service.update(person);
    }
}
