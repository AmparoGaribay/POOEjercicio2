package org.generation;//esta tiene que ir siempre en la primera linea
import org.generation.classes.Consultant;
import org.generation.classes.Employee;
import org.generation.classes.Person;
import org.generation.exceptions.EmailFormatException;

public class Main {

	public static void main(String[] args) {
		 Employee chayo = new Employee ("Chayo", 22, "chayo@gmail.com", "XXXXXxXXx", "casa","customer",850);
		 Employee monse = new  Employee ("Monse Cervantes", 20, "Monse@gmail.com","XXXXXxXXx", "la casa de su gato","software development", 955);
		 Employee jetsael = new Employee("jetsael Villegas",22, "jetsael2@yahoo.mx", "XXXXXxXXx","domclido", "software development", 780);
		 jetsael.setAge(14);
		 try {
			jetsael.setEmail("jetaseGmmail.con");
		} catch (EmailFormatException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		
		 
		 System.out.println(chayo);/// asi solo devuelve un hascode basado en el contenido del objeto
		 System.out.println(monse);
		 System.out.println(jetsael);
		 
		 chayo.setName("Chayo orozco");
		 System.out.println(chayo);
		 //System.out.println(monse.calculateSalary(29));
		// System.out.println(chayo.calculateSalary(29));
		 //System.out.println(jetsael.calculateSalary(29));
		 
		 Consultant balam = new Consultant("BAC sa de cv","BAC200301",1024);
		 
		 Payroll.printReceipt(chayo);
		 Payroll.printReceipt(monse);
		 Payroll.printReceipt(jetsael);
		 
		 Payroll.printReceipt(balam);

	}
	

}