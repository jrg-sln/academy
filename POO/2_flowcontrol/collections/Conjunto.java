import java.util.Set;
import java.util.HashSet;

public class Conjunto {
        public static void main(String[] args) {
                Set c = new HashSet();
                c.add("uno");
                c.add("segundo");
                c.add("3ro");
                c.add(new Integer(4));
                c.add(new Float(5.0F));
                c.add("segundo"); // duplicado
                c.add(new Integer(4)); // duplicado
                System.out.println(c);
        }
}
