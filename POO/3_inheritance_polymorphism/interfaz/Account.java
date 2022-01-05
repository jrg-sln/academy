public class Account {
        private String userName;
        private String password;
        private short age;

	public Account() {}

        public Account(String userName, String password, short age) {
                this.setUserName(userName);
                this.setPassword(password);
                this.setAge(age);
        }
        public String getUserName(){
                return userName;
        }
        public String getPassword(){
                return password;
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
                        "\nPassword=********" + "\nAge=" + getAge();
        }

}

