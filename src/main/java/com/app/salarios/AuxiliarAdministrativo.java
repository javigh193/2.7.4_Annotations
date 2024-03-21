package com.app.salarios;

import org.springframework.beans.factory.annotation.Value;

public class AuxiliarAdministrativo implements Empleado {

	@Value("${auxiliar}")
	private double salarioBruto;
	
	private CalcularSalario salarioNeto;
	
	public AuxiliarAdministrativo(CalcularSalario salarioNeto) {
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
