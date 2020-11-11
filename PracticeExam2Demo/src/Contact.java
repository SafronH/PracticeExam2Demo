
/**
 * @
 * Contact list
 */
public class Contact {
	
	private String name;
	private String ssn;
	private String email;
	
public Contact (){
	
	this.name = "";
	this.ssn = "";
	this.email = "";	
	}

/**
 * @param name
 * @param ssn
 * @param email
 */
public Contact(String name, String ssn, String email) {
	super();
	this.name = name;
	this.ssn = ssn;
	this.email = email;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the ssn
 */
public String getSSN() {
	return ssn;
}

/**
 * @param ssn the ssn to set
 */
public void setSsn(String ssn) {
	this.ssn = ssn;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

public String toString()
{
   return "\nName: " + this.getName() + 
          "\nSSN: " + this.getSSN() + 
          "\nEmail: " + this.getEmail();
}


}
