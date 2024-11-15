package org.generation.classes;
/**
 * Interfaz que permite que un elemento sea pagable
 */
public interface Pagable {
	public String getName();
	public String getRfc();
	public String getDepartament();
	public String  calculateSalary(int days);
	public int getId();
}
