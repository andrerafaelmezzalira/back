package back.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import back.domain.entity.Person;
import back.service.PersonService;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonApi {

	@Autowired
	private PersonService service;

	@ApiOperation(value = "Cadastrar uma nova proposta", notes = "Essa operação salva um novo registro com as informações da pessoa.")
	@RequestMapping(value = "/proposta", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void save(@RequestBody Person person) {
		service.save(person);
	}

	@ApiOperation(value = "Listar todas as propostas", notes = "Essa operação irá listar todas as propostas de todas as pessoas.")
	@RequestMapping(value = "/propostas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<Person> findAll() {
		return service.findAll();
	}

	@ApiOperation(value = "Listar todas as propostas por cpf", notes = "Essa operação irá listar todas as propostas de uma pessoa, identificada pelo seu cpf.")
	@RequestMapping(value = "/propostas/{cpf}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<Person> findByCpf(@PathVariable String cpf) {
		return service.findByCpf(cpf);
	}
}