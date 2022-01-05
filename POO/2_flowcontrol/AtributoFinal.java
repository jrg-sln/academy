public class AtributoFinal {
	public static final float PI = 3.14159265f;

	public static void main(String [] args){
		final int equis = 2;
		// Una variable final no se puede modificar
		//equis = 5;
		System.out.println(PI*equis);
	}
}
