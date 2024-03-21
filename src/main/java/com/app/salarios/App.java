package com.app.salarios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SalariosConfig.class);
		
		AuxiliarAdministrativo Marta = contexto.getBean("auxiliarAdministrativo", AuxiliarAdministrativo.class);
		JefeAdministrativo Luisa = contexto.getBean("jefeAdministrativo", JefeAdministrativo.class);
		
		System.out.println(Marta.getSalarioBruto());
		System.out.println(Marta.getSalarioNeto());
		
		System.out.println(Luisa.getSalarioBruto());
		System.out.println(Luisa.getSalarioNeto());
		

		contexto.close();
		
	}

}
