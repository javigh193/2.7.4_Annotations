package com.app.salarios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.app.salarios")
@PropertySources({
	@PropertySource("classpath:datosEmpleados"),
	@PropertySource("classpath:datosIRPF")
})

public class SalariosConfig {
	
	@Bean
	public CalcularSalario salarioNeto() {
		return new SalarioNeto();
	}
	
	@Bean
	public Empleado auxiliarAdministrativo() {
		return new AuxiliarAdministrativo(salarioNeto());
	}
	
	@Bean
	public Empleado tecnicoAdministrativo() {
		return new TecnicoAdministrativo(salarioNeto());
	}
	
	@Bean
	public Empleado jefeAdministrativo() {
		return new JefeAdministrativo(salarioNeto());
	}
	
}
