package web.practicas.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuarios extends Base {

	@Column(name = "email", unique = true)
	String email;
	@Column(name = "username", unique = true)
	String username;
	@Column(name = "password")
	String pass;

	public Usuarios(String email, String pass, String username) {
		super();
		this.username = username;
		this.email = email;
		this.pass = pass;
	}

	public Usuarios() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
