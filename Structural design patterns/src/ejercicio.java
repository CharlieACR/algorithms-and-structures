import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner salida = new Scanner(System.in);
		StringBuffer resultado = new StringBuffer();

		System.out.println((char)(33/27+95));
		System.out.println("Escribe un numero: ");
		int no_excel = salida.nextInt();
		salida.close();
		
		
		if(no_excel/27>0)
			resultado.append((char)(no_excel/27+96));
		resultado.append((char)(no_excel%27+96));
		
		System.out.println(resultado);

	}

}
