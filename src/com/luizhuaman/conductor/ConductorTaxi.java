package com.luizhuaman.conductor;

import com.luizhuaman.vehiculo.Taxi;

public class ConductorTaxi extends Conductor{
	
	private Taxi taxi;
	
	public ConductorTaxi(String nombre, String tipoLicencia, Taxi taxi) {
		super(nombre, tipoLicencia);
		this.taxi = taxi;
		// TODO Auto-generated constructor stub
	}
	

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}


	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getTaxi().getMatricula());
	}
	
	
	
	
	
}
