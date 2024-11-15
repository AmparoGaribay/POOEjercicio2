package org.generation.classes;

/**
 * clase Empleado que hereda de la clase person y representa a un empleado dentro de la empresa
 */

public class Employee extends Person implements Pagable {

	private String departament;
	private double salary;
	/**
	 * Constructor de la clase empleado
	 * @param name nombre del empleado 
	 * @param age edad del empleado
	 * @param email email del empleado
	 * @param rfc del empleado
	 * @param address direccion fisica del empleado
	 * @param departament del empleado
	 * @param salary del empleado
	 */
	public Employee(String name, int age, String email, String rfc, String address, String departament, double salary) {
		super(name, age, email, rfc, address);
		this.departament = departament;
		this.salary = salary;
	}//constructor
	
	//intefaz
	/**
	 * calcula el salario basado en el numero de dias
	 * @param days numero de dias trabajados 
	 */
	public String  calculateSalary(int days) {
		double total =0;
		total =(this.salary*days)*1.16;
		return String.format("%.2f", total);//ve el format en la documentacion de jdk : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax
	}//salary calc

	public String getDepartament() {
		return departament;
	}//get

	public void setDepartament(String departament) {
		this.departament = departament;
	}//set

	public double getSalary() {
		return salary;
	}///get

	public void setSalary(double salary) {
		this.salary = salary;
	}//set

	@Override
	public String toString() {
		return "Employee [departament=" + departament + ", salary=" + salary + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + ", getRfc()=" + getRfc() + ", getAddress()="
				+ getAddress() + ", getId()=" + getId() + "]";
	}//to string




	
	
	
}//clase
