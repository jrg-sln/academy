package flotilla.airplane;

public class Airplane {
	public Motor [] motors;
	public Airplane(){}
	public Airplane(int numMotors){
		motors = new Motor[numMotors];
		for (int cont=0 ; cont<numMotors ; cont++){
			motors[cont] = new Motor();
		}
	}
}
