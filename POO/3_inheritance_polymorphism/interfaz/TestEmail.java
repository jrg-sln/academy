public class TestEmail {
        public static void main (String [] args){
                ConnectionDB mail = new Email("user1", "qwerty", (short)22, "gmail.com");
                System.out.println(mail);
		mail.connect();
		mail.executeRequest();
		mail.close();
        }
}
