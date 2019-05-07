package com.ejercicios.parentesis;

import java.util.ArrayList;

public class parentesis {

	public static void main(String[] args) {
		StringBuffer frase = new StringBuffer("(aplica(prim(mi)era)cion)");
		
		ArrayList<StringBuffer> container = new ArrayList<StringBuffer>();
		container.add(new StringBuffer());
		int iCont = 0;

		for(int con=1;con<frase.length();con++)
		{
			if(frase.charAt(con)=='(')
			{
				container.add(new StringBuffer());
				iCont++;
			} 
			else if(frase.charAt(con)==')')
			{
				System.out.print(container.get(iCont) + " ");
				iCont--;
			}
			else if(frase.charAt(con)!='(')
			{
				container.get(iCont).append(frase.charAt(con));				
			}
		}

	}

}
