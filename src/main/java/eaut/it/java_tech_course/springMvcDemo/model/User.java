package eaut.it.java_tech_course.springMvcDemo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
	@NotBlank(message = "Username không được để trống")
	private String username;
	@Size(min = 6, message = "Password phải ít nhất 6 ký tự")
	private String password;
	@NotEmpty(message = "Hãy chọn giới tính")
	private String gender;
	private boolean termsAccepted;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isTermsAccepted() {
		return termsAccepted;
	}

	public void setTermsAccepted(boolean termsAccepted) {
		this.termsAccepted = termsAccepted;
	}

}
