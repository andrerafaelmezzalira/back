package back;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;

import back.domain.entity.Person;
import back.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackApplicationTests {

	@Autowired
	private PersonService service;

	@Before
	public void setUp() throws Exception {

		service.deleteAll();

		service.save(new Person("Lucas", "1", "28", "M", "solteiro", "SC", "0", "2500"));

	}

	@Test
	public void listByCpf() throws JsonProcessingException {

		List<Person> persons = service.findByCpf("1");
		
		assertThat(persons.size(), is(1));

	}
}
