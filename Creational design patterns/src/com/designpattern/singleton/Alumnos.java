package com.designpattern.singleton;

public class Alumnos {
	private int idAlumno;
	private String nombreAlumno;
	
	private static Alumnos miUnicaInstanciadeAlumno = null;
	
	public static Alumnos getInstanceofAlumnos()
	{
		if(miUnicaInstanciadeAlumno==null)
		{
			miUnicaInstanciadeAlumno = new Alumnos();
		}
		else
		{
			throw new RuntimeException("Exception ocurred in creating singleton instance");
		}
		return miUnicaInstanciadeAlumno;
	}
	
	private Alumnos()
	{
		
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	

}
