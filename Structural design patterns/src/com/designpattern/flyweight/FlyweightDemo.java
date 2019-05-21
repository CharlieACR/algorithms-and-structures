package com.designpattern.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		double promedioDelAlumno = 6;
		
		String nombres[] = {"Juan", "Maxi", "Pedro"};
		String apellidos[] = {"Perez", "Lopez", "Maxima"};
		double promedios[] = {6, 7 ,9};
		
		Alumno alumno = new Alumno(promedioDelAlumno);
		for(int con = 0;con<nombres.length;con++)
		{
			alumno.setNombre(nombres[con]);
			alumno.setApellido(apellidos[con]);
			alumno.setPromedio(promedios[con]);
			System.out.println(nombres[con] + ": " + alumno.compara());
		}

	}

} 
