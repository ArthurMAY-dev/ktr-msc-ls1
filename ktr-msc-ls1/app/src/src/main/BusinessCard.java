package src.main;

public class BusinessCard {
	private String name;
	private String companyName;
	private String emailAdress;
	private String telNumber;
	
	
	public BusinessCard() {
		this.name = "";
		this.companyName = "";
		this.emailAdress = "";
		this.telNumber = "";
	}
	
	public BusinessCard(String n,String cn,String ea,String tn) {
		this.name = n;
		this.companyName=cn;
		this.emailAdress=ea;
		this.telNumber=tn;
	}
	
}
