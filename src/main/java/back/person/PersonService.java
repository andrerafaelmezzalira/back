package back.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	@ApiOperation(value = "Cadastrar uma nova pessoa", notes = "Essa operação salva um novo registro com as informações de pessoa.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna um ResponseModel com uma mensagem de sucesso"),
			@ApiResponse(code = 500, message = "Caso tenhamos algum erro vamos retornar um ResponseModel com a Exception")

	})
	@RequestMapping(value = "/proposal", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void save(@RequestBody Person person) {
		this.personRepository.save(person);
	}

	@RequestMapping(value = "/proposals", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<Person> findAll() {
		return this.personRepository.findAll();
	}
}