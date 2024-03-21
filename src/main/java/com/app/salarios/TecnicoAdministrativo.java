package com.app.salarios;

import org.springframework.beans.factory.annotation.Value;

public class TecnicoAdministrativo implements Empleado {
	
	@Value("${tecnico}")
	private double salarioBruto;
	
	private CalcularSalario salarioNeto;
	
	public TecnicoAdministrativo(CalcularSalario salarioNeto) {
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
