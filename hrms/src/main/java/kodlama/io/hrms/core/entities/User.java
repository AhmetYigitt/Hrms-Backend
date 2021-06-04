package kodlama.io.hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private int userId;
	
	
	@Email
	@NotBlank
	@NotNull
	@Column(name = "Email")
	private String email;
	
	@NotBlank
	@NotNull
	@Column(name = "Password")
	private String password;

	public User() {}
	public User(int userId, @Email @NotBlank @NotNull String email, @NotBlank @NotNull String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return userId;
	}
	public void setId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
