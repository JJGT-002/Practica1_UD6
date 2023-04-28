package ed.jorge;

public class Instituto {

	private static final int jANYO = 2023;
	private static final String jCICLO_FORMATIVO = "1º DAW";
	private static final String jAPELLIDOS_ALUMNO = "Gregori";
	private static final String jNOMBRE_ALUMNO = "Jorge";

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = jNOMBRE_ALUMNO;
		p.apellidos = jAPELLIDOS_ALUMNO;
		p.cicloFormativo = jCICLO_FORMATIVO;
		p.anyo = jANYO;
		
		System.out.println(p.toString());

	}

}
