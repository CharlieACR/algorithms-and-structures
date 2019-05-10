package com.designpattern.singleton;

public class creacion {

	public static void main(String[] args) {
		Alumnos alumno1 = Alumnos.getInstanceofAlumnos();
		
		alumno1.setIdAlumno(1);
		alumno1.setNombreAlumno("Charlie");

		System.out.println("ID: " + alumno1.getIdAlumno());
		System.out.println("Nombre: " + alumno1.getNombreAlumno());

		Alumnos alumno2 = Alumnos.getInstanceofAlumnos();
		
		alumno2.setIdAlumno(2);
		alumno2.setNombreAlumno("Carlos");

		System.out.println("ID: " + alumno2.getIdAlumno());
		System.out.println("Nombre: " + alumno2.getNombreAlumno());

		System.out.println("ID: " + alumno1.getIdAlumno());
		System.out.println("Nombre: " + alumno1.getNombreAlumno());

	}

}
