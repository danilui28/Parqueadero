package com.krakedev.parqueadero.modelo;

import java.time.LocalDateTime;

public abstract class Vehiculo {
	
	private String placa;
	private String propetario;
	private LocalDateTime horaIngreso;
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPropetario() {
		return propetario;
	}

	public void setPropetario(String propetario) {
		this.propetario = propetario;
	}

	public LocalDateTime getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(LocalDateTime horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public Vehiculo(String placa, String propetario) {
		this.placa = placa;
		this.propetario = propetario;
		this.horaIngreso = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		return "Placa= " + placa + ", Propetario= " + propetario + ", Hora de ingreso= " + horaIngreso;
	}
	
	public abstract double calcularTarifa(int horasPermanencia);
}
