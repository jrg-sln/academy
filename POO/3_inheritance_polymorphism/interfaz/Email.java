public class Email extends Account implements ConnectionDB {
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
                return super.toString() + "\nDomain=" + getDomain();
        }

	public Boolean connect(){
		System.out.println("Conectando con la BD...");
		return true;
	}

	public void executeRequest(){
		System.out.println("Se ejectua la consulta.");
	}
	public Boolean close(){
		System.out.println("Cerrando la conexión a la BD...");
		return true;
	}
}
