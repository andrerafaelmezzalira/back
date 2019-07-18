package back.service;

import org.springframework.stereotype.Service;

import back.domain.entity.Person;

@Service
public class CreditAnalysisServiceProvider implements CreditAnalysisService {

	@Override
	public void analyze(Person person) {
		person.setResult("Aprovado");
		person.setMessage("Limite de 500 a 2000");
	}

}