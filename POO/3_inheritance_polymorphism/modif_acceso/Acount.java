public class Acount {
	private String userName;
	private String password;
	private short age;

	public Acount() {}

	public Acount(String userName, String password, short age) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setAge(age);
	}
	public String getUserName(){
		return userName.trim();
	}
	public String getPassword(){
		return password.trim();
	}
	public short getAge(){
		return age;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setAge(short age){
		if (age > 17 && age < 130) {
			this.age = age;
		}
	}
	public String toString() {
		return "User name=" + getUserName() +
			"\nPassword=********" +
			"\nAge=" + getAge();
	}
}
