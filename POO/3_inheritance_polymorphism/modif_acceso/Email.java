public class Email extends Acount{
	private String domain;

	public Email(){}

	public Email(String userName, String password, short age, String domain){
		super (userName, password, age);
		this.setDomain(domain);
	}
	public void setDomain(String domain){
		this.domain = domain;
	}
	public String getDomain(){
		return domain;
	}
	public String toString(){
		return super.toString() +
			"\nDomain=" + getDomain();
	}
}
