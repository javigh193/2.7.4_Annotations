package com.app.salarios;

import org.springframework.beans.factory.annotation.Value;

public class JefeAdministrativo implements Empleado {
	
	@Value("${jefe}")
	private double salarioBruto;
	
	private CalcularSalario salarioNeto;
	
	public JefeAdministrativo(CalcularSalario salarioNeto) {
		this.salarioNeto = salarioNeto;
	}
	
	@Override
	public double getSalarioBruto() {
		return salarioBruto;
	}

	@Override
	public double getSalarioNeto() {
		return salarioNeto.getSalarioNeto(this.getSalarioBruto());
	}

}
