package src.main;

public class User {
	private String username;
	private char[] password;
	
	private String name;
	private String companyName;
	private String emailAdress;
	private String telNumber;
	
	
	public User() {
		this.username="";
	}
	
	public User(String un, char[] pw) {
		this.username = un;
		this.password = pw;
	}
	
	public BusinessCard getUserBusinessCard() {
		BusinessCard bc = new BusinessCard(this.name,this.companyName,this.emailAdress,this.telNumber);
		return bc;
	}
	
	public String getUsername() {
		return this.username;
	}
}
