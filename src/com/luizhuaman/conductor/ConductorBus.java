package com.luizhuaman.conductor;

import com.luizhuaman.vehiculo.Bus;

public class ConductorBus extends Conductor{

	private Bus bus;
	
	public ConductorBus(String nombre, String tipoLicencia,Bus bus) {
		super(nombre, tipoLicencia);
		this.bus = bus;
		// TODO Auto-generated constructor stub
	}
	

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}


	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getBus().getMarca());
	}
	
	
	
}
