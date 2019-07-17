package back.person;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Long> {

	List<Person> findAll();

	void save(Person person);

}
