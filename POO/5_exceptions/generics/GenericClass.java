import java.util.LinkedList;

public class GenericClass <E> {
	LinkedList<E> myList;
	public GenericClass(){
		myList = new LinkedList<E>();
	}

	public void set(E element){
		myList.add(element);
	}

	public E get(int index){
		return myList.get(index);
	}

	public static void main (String [] args){
		GenericClass<String> gc = new GenericClass<String>();
		gc.set(new String("Hello"));
		gc.set(new String("Hola"));
		System.out.println(gc.get(0));
		System.out.println(gc.get(1));
	}
}
