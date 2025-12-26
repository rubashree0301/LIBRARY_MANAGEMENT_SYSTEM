package libpackage;

public class Customer {
	private int customerId;
	private String name;
	private String email;
	private String phoneNo;
	private String password;
	private int bookTaken;

	public int getBookTaken() {
		return bookTaken;
	}


	public void setBookTaken(int bookTaken) {
		this.bookTaken = bookTaken;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Customer(int customerId, String name, String email,String password, String phoneNo) {
		this.password=password;
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.bookTaken=0;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return this.name;
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


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}