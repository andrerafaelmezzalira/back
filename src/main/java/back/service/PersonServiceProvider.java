package back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import back.domain.entity.Person;
import back.domain.repository.PersonRepository;

@Service
public class PersonServiceProvider implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private CreditAnalysisService creditAnalysisService;

	@Override
	public void save(Person person) {

		creditAnalysisService.analyze(person);

		personRepository.save(person);
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public List<Person> findByCpf(String cpf) {
		return personRepository.findByCpf(cpf);
	}

	@Override
	public void deleteAll() {
		personRepository.deleteAll();
	}

}