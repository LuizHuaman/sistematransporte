package com.luizhuaman.sistematransporte;

import java.util.ArrayList;

import com.luizhuaman.vehiculo.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipo de dato nombreobjt
		//datos obligatorios
		Vehiculo miVehiculo = new Vehiculo("AAA13","Hiundai");
		
		/*miVehiculo.marca = "Hiundai";
		miVehiculo.modelo = "i10";
		miVehiculo.anio = 2014;*/
		
		/*
		miVehiculo.arrancar();
		miVehiculo.frenar();
		miVehiculo.reversa();
		miVehiculo.arrancar();
		*/
		
		/*
		ArrayList<Integer> miLista = new ArrayList<Integer>();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		
		for(Integer i : miLista){
			System.out.println(i);
		}
		*/
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(miVehiculo);
		vehiculos.add(new Vehiculo("BBER1", "Chevrolet"));
		vehiculos.add(new Vehiculo("CCC12", "Merecedes Benz", "S10", 2014));
		
		for (Vehiculo vehiculo : vehiculos){
			System.out.println(vehiculo.getMatricula());
			System.out.println(vehiculo.getMarca());
			System.out.println(vehiculo.getModelo());
			System.out.println(vehiculo.getAnio());
		}
	}

}
