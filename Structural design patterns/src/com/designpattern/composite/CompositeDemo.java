package com.designpattern.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		Composite banco = new Composite();
		SectorAdministrativo administrativo = new SectorAdministrativo();
		SectorCajas cajas = new SectorCajas();
		SectorContaduria contaduria = new SectorContaduria();
		SectorGerencia gerencia = new SectorGerencia();
		SectorRRHH rrhh = new SectorRRHH();
		
		banco.agrega(gerencia);
		banco.agrega(contaduria);
		banco.agrega(administrativo);
		banco.agrega(cajas);
		banco.agrega(rrhh);

		Empleado cajero1 = new Empleado("Juan", "Cajero", 2000);
		Empleado cajero2 = new Empleado("Jose", "Cajero", 2000);
		cajas.agrega(cajero1);
		cajas.agrega(cajero2);
		Empleado gerente = new Empleado("Andrea", "Gerente", 5000);
		gerencia.agrega(gerente);
		Empleado selector1 = new Empleado("Luis", "Selectora", 15000);
		rrhh.agrega(selector1);

		Empleado contador = new Empleado("Sara", "Selectora", 15000);
		contaduria.agrega(contador);
		
		System.out.println(banco.getSueldo());
	}

}
