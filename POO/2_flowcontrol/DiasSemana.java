public class DiasSemana{

    	public enum Dia {
        	DOMINGO, LUNES, MARTES, MIERCOLES, 
        	JUEVES, VIERNES, SABADO
    	}

	public void describirDia(Dia diaElegido) {
        	switch (diaElegido) {
            		case LUNES:
                		System.out.println("Inicio de semana.");
                		break;
            		case VIERNES:
                		System.out.println("Inicia fin de semana.");
                		break;
            		case SABADO:
			case DOMINGO:
                		System.out.println("Descanso.");
                		break;
            		default:
                		System.out.println("Los otros dIas son equis.");
                		break;
        	}
    	}
}
