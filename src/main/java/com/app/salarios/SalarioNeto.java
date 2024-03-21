package com.app.salarios;

import org.springframework.beans.factory.annotation.Value;

public class SalarioNeto implements CalcularSalario {
	
	@Value("${topes}")
	private String[] topesIRPF;
	
	@Value("${retencion}")
	private String[] retencionesIRPF;
	
	@Override
	public double getSalarioNeto(double salariobruto) {
		return salariobruto * (100.00 - this.getTramoIRPF(salariobruto)) / 100;
	}

	@Override
	public double getTramoIRPF(double salariobruto) {
		for (int i = 0; i < this.topesIRPF.length; ++i) {
			if (salariobruto <= Double.parseDouble(topesIRPF[i])) {
				return Double.parseDouble(retencionesIRPF[i]);
			}
		}
		return 0;
	}

}
