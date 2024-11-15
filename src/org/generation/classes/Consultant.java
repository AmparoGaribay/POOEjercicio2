package org.generation.classes;
/**
 * Clase consultor, representa a un consultor externo.
 */

public class Consultant implements Pagable{
	private String razonSocial;
	private String RFC;
	private double costoHora;
	
	//1.constructor
	//2.get y set
	//3.to String
	
	/**
	 * Constructor de la clase constultante externo que implementa pagable 
	 * @param razonSocial razon social de la empresa
	 * @param rFC Registro federal de contribuyentes de la persona moral 
	 * @param costoHora el costo por hora trabajado 
	 */
	
	public Consultant(String razonSocial, String rFC, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		RFC = rFC;
		this.costoHora = costoHora;
	}//constructor
	public String getRazonSocial() {
		return razonSocial;
	}//get
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}//set
	public String getRFC() {
		return RFC;
	}//get
	public void setRFC(String rFC) {
		RFC = rFC;
	}//set
	public double getCostoHora() {
		return costoHora;
	}//get
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}//set
	@Override
	public String toString() {
		return "Consultant [razonSocial=" + razonSocial + ", RFC=" + RFC + ", costoHora=" + costoHora + "]";
	}//tostring
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return razonSocial;
	}
	@Override
	public String getRfc() {
		// TODO Auto-generated method stub
		return RFC;
	}
	@Override
	public String getDepartament() {
		// TODO Auto-generated method stub
		return "Consultor EXternop";
	}

	@Override
	public String calculateSalary(int days) {
		// TODO Auto-generated method stub
		return String.format("%.2f", costoHora*8);
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 10000;
	}
	

	
	
	
	

}//consultant
