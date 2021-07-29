package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import one.digitalinnovation.personapi.dto.MessagePersonDTO;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessagePersonDTO createPerson(@RequestBody Person person){

        return personService.createPerson(person);
    }
}
