package my.rahul.springbootplayground.dao;

import my.rahul.springbootplayground.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();

        return insertPerson(id, person);
    }

    List<Person> getAllPeople();
}
