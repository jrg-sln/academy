public class TestMonths {
	public static void main (String [] args){
		System.out.println("Los nombres de los meses son:");
		for (String month : Months.MONTHS_NAME){
			System.out.println(month);
		}

		System.out.println("\nMes elegido:");
		System.out.println(Months.MONTHS_NAME[Months.SEVEN]);
	}
}
