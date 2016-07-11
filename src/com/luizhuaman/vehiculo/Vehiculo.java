package com.luizhuaman.vehiculo;

public class Vehiculo {
	
	
	//ATRIBTOS
	private String matricula;
	private String marca;
	private String modelo;
	private int    anio;
	
	
	
	public Vehiculo(String matricula, String marca) {
		super();
		setMatricula(matricula);
		this.marca = marca;
	}
	
	

	public Vehiculo(String matricula, String marca, String modelo, int anio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.length() == 5) {
			this.matricula = matricula;
		}else {
			System.out.println("La matricula debe de ser de 5 caracteres");
		}
		
	}

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}



	//METODOS
	//Lower Camel Case
	public void arrancar(){
		System.out.println("El vehiculo arranc�");
	}
	
	public void frenar(){
		System.out.println("El vehiculo freno");
	}
	
	public void reversa(){
		System.out.println("El vehiculo esta de reversa");
	}
	
}
