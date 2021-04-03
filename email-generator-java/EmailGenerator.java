package emailGenerator;

public class EmailGenerator {

	private String firstName;
	private String lastName;
	private int dob;
	
	
	// parameterized Constructor
	public EmailGenerator(String firstName,String lastName, int dob)
	{
		this.firstName= firstName;
		this.lastName = lastName;
		this.dob=dob;
	}
    
	
   // getters and setters	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	// method to generate new mail Id;
	public String newMail()
	{
        // + operator is also used to concatenate two strings.
		// required mail format => john.nielsen.1508@javatutor.com
		// where john is firstName, nielsen is lastName , and 1508 is birthdate
		
		String mail = firstName+"."+lastName+"."+dob+"@javatutor.com"; 
		return mail;
	}
}
