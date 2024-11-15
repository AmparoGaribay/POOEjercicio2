package org.generation;

import java.util.Date;

import org.generation.classes.Employee;
import org.generation.classes.Pagable;

public class Payroll {
	public static void printReceipt(Pagable emp) {//imprimir recibo
		System.out.println("+==================+");
		System.out.println("| Recbo de pago de" + emp.getName());
		System.out.println("| RFC"+ emp.getRfc());
		System.out.println("| Departament "+emp.getDepartament());
		System.out.println("| por la cantidad de MNX $"+ emp.calculateSalary(30));
		System.out.println("| Numero emplead "+ emp.getId() );
		System.out.println("| fecha "+ (new Date()));
		System.out.println("+==================+");
		
	}//print
}
