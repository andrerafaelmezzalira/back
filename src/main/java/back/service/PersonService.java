package back.service;

import java.util.List;

import back.domain.entity.Person;

public interface PersonService {

	void save(Person person);

	List<Person> findAll();

	List<Person> findByCpf(String cpf);

	void deleteAll();
}