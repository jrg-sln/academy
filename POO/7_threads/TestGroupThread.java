public class TestGroupThread {
	public static void main(String[] args) {
		ThreadGroup grupo = new ThreadGroup("Grupo de hilos.");
		GroupThread [] hilos = new GroupThread[5];
		for (int cont=0 ; cont<hilos.length ; cont++) {
			hilos[cont] = new GroupThread(grupo, "Hilo " + (cont+1));
		}

		for (int cont=0 ; cont<hilos.length ; cont++) {
			hilos[cont].start();
		}

		GroupThread.listarHilos(grupo);
	}
}
