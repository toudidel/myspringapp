package pl.coderion.myspringapp.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderion.myspringapp.model.Person;

@RestController
public class MyController {

  @GetMapping("/myworld")
  public String index() {
    return "Hello world!";
  }

  @GetMapping("/date")
  public String getCurrentDate() {
    return LocalDateTime.now().toString();
  }

  @GetMapping("/person")
  public ResponseEntity<Person> getPerson() {
    //        Person person = new Person();
    //        person.setFirstName("Jan");
    //        person.setLastName("Kowalski");
    //        person.setDateOfBirth(LocalDate.now());

    Person person =
        Person.builder()
            .firstName("Jan")
            .lastName("Kowalski Nowak Wiśniewski")
            .dateOfBirth(LocalDate.now())
            .build();

    return ResponseEntity.ok(person);
  }
}
