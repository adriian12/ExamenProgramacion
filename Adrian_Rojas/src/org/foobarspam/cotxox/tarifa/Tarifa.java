package org.foobarspam.cotxox.tarifa;
import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {

	//-----------------------------Parametros---------------------------------
	double costeMilla = 1.35; //En euros
	double costeMinuto = 0.35; //En euros
	int costeMinimo = 5; //En euros
	int porcentajeComision = 20; //En porcentaje %
	
	// -------------------- Constructores --------------------
	
	public Tarifa(){
		
	}

	public Tarifa(double costeMilla, double costeMinuto, int costeMinimo, int porcentajeComision) {
		this.costeMilla = costeMilla;
		this.costeMinuto = costeMinuto;
		this.costeMinimo = costeMinimo;
		this.porcentajeComision = porcentajeComision;
	}

	
	
	//-------------------------Getters & Setters---------------------------
	
	public double getCosteMilla() {
		return this.costeMilla;
	}

	public double getCosteMinuto() {
		return this.costeMinuto;
	}

	public int getCosteMinimo() {
		return this.costeMinimo;
	}

	public int getPorcentajeComision() {
		return this.porcentajeComision;
	}
	
	
	
}
