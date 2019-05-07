package upCasting;

public class main {

	public static void main(String[] args) {
		Persona Luis = (Persona)new Empleado();
		Luis = new Escritor();
		String a = "hola";
		a="hola1";
		if(Luis instanceof Persona)
		{
			System.out.println(Luis.comer());
		}
		//System.out.println(luis.escribit());

	}

}
