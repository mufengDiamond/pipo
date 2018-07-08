package hik.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class StudentDto {
	
	@NotNull(message = "field is null")
	private String name;
	
	@NotNull(message = "field is null")
	@Max(100)
	private int age;
	
	@NotNull(message = "field is null")
	private boolean sexuality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSexuality() {
		return sexuality;
	}

	public void setSexuality(boolean sexuality) {
		this.sexuality = sexuality;
	}
	
	

}
