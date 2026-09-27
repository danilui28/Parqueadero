package com.krakedev.parqueadero.modelo;

public class Motocicleta extends Vehiculo {
	
	private int cilindraje;
	
	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public Motocicleta(String placa, String propetario, int cilindraje) {
		super(placa, propetario);
		this.cilindraje = cilindraje;
	}

	@Override
	public double calcularTarifa(int horasPermanencia) {
		double total;
		if(cilindraje > 250) {
			total = horasPermanencia * 1.00;
		} else {
			total = horasPermanencia * 0.75;
		}
		return total;
	}
}
