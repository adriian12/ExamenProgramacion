package org.foobarspam.cotxox.conductores;

public class Conductor {
	
	// -------------------- Propiedades --------------------
	
	public String nombre = null;
	public String modelo = null;
	public String matricula = null; //no es int porque paarecen numeros y letras
	public double valoracionMedia = 0d;
	public Conductor valoraciones[] = new Conductores[]; //array de valoraciones del conductor 
	public Boolean ocupado = false; //lo iniciamos en false
}

	//-------------------- Constructores --------------------

	public Conductor(){
		
	}
	