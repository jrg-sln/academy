public strictfp class EstrictoFP{
	public static void main(String[] args){  
		float aFlotante = 0.123456789f;  
		double aDoble = 0.04150553411984792d;  
		double sum = aFlotante + aDoble;  
		float cociente = (float)(aFlotante / aDoble);  
		System.out.println("aFlotante: " + aFlotante);  
		System.out.println("aDoble: " + aDoble);  
		System.out.println("sum: " + sum);  
		System.out.println("cociente: " + cociente);  
	}
}
