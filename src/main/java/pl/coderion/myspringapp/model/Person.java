package pl.coderion.myspringapp.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
