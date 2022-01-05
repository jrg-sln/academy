public class ClaseStringBuffer {
	public static void main(String [] args){
                StringBuffer sb = new StringBuffer("Somos o no somos");
                sb.reverse();
                System.out.println(sb);
                sb.append(8.5f);
                System.out.println(sb);
                sb.insert((int)(sb.length()/2),"lol");
                System.out.println(sb);
	}
}
