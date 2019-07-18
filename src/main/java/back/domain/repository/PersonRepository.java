package back.domain.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import back.domain.entity.Person;

public interface PersonRepository extends Repository<Person, Long> {

	List<Person> findAll();

	void save(Person person);

	List<Person> findByCpf(String cpf);

	void deleteAll();
}
