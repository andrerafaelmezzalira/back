package back.service;

import org.springframework.stereotype.Service;

import back.domain.entity.Person;

@Service
public class CreditAnalysisServiceProvider implements CreditAnalysisService {

	@Override
	public void analyze(Person person) {
		person.setResult("Faltou tempo");
		person.setMessage("Faltou tempo");
	}
}