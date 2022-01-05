public class ForArreglo{
	public static void main (String [] fors){
		int [][] x = new int [3][];
		int i, j;
		x[0] = new int [4];
		x[1] = new int [2];
		x[2] = new int [5];
		for (i = 0 ; i < x.length ; i++){
			for (j = 0 ; j < x[i].length ; j++){
				x[i][j] = i+j+1;
				System.out.print("x["+i+"]["+j+"] = " + x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

