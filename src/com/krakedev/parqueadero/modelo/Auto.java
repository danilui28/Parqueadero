package com.krakedev.parqueadero.modelo;

public class Auto extends Vehiculo {
	
	private int numeroPuertas;

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public Auto(String placa, String propetario, int numeroPuertas) {
		super(placa, propetario);
		this.numeroPuertas = numeroPuertas;
	}
	
	@Override
	public double calcularTarifa(int horasPermanencia) {
		double total;
		total = horasPermanencia * 1.50;
		if(horasPermanencia > 4) {
			total = total + 2.00;
		}
		return total;
	}
}
