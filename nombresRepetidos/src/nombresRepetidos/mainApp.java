package nombresRepetidos;

import java.util.HashMap;

public class mainApp {

	public static void main(String[] args) {
		String frase = "hola,dos,hola,cuatro,dos,tres,cinco,uno,hola,adios";
		HashMap<String, Integer> contador = new HashMap<>();
		for(String item:frase.split(","))
		{
			if(contador.get(item)==null)
			{
				contador.put(item, 1);
			}
			else
			{
				contador.put(item,contador.get(item)+1);
			}
		}
		for(String item:contador.keySet())
		{
			System.out.println(item + " se repite " + contador.get(item) + "  veces.");
		}

	}

}
