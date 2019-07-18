package back.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String cpf;

	private String age;

	private String sex;

	private String civilStatus;

	private String state;

	private String dependents;

	private String income;

	private String result;

	private String message;

	public Person() {
	}

	public Person(String name, String cpf, String age, String sex, String civilStatus, String state, String dependents,
			String income) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.sex = sex;
		this.civilStatus = civilStatus;
		this.state = state;
		this.dependents = dependents;
		this.income = income;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setDependents(String dependents) {
		this.dependents = dependents;
	}

	public String getDependents() {
		return dependents;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getIncome() {
		return income;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}
}
