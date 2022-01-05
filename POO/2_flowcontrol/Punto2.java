public class Punto2 {
	int x , y ;
	static int numPuntos = 0;

	public void iniciarPunto (int equis , int ye) {
		x = equis; 
		y = ye;
		numPuntos++ ;
	}

	static int getNumPuntos() {
		return numPuntos;
	}
}
