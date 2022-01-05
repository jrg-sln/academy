public class GroupThread extends Thread {

	public GroupThread(ThreadGroup group, String name){
		super(group, name);
	}

	public void run(){
		for (int i = 0 ; i < 10 ; i++){
			System.out.print("\t" + getName() + "\t");
		}
	}

	public static void listarHilos(ThreadGroup group) {
		int number;
		Thread [] list;
		number = group.activeCount();
		list = new Thread[number];
		group.enumerate(list);
		System.out.println("\nHilos activos en el grupo= " + number);
		for (int i = 0 ; i < number ; i++) {
			System.out.println("Hilo: " + list[i].getName());
		}
	}
}
