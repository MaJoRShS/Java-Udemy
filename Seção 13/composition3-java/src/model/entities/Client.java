package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	//Aqui ele mesmo já fez com que a data de aniversario do cara ficasse formatado
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private Date birthDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	//Aqui ele mesmo colocou para retornar o cliente já formatado eu não tinha feito isso.
	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
 	}
}
