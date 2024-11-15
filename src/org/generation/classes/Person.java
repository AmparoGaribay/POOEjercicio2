package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.exceptions.EmailFormatException;
/**
 * clase person abstrascta que define a una persona 
 * No puede instanciarse esta clase solo puede heredarse;
 * abstrac no permite crear objetos persona, solo permite heredar. 
 * 
 */


public abstract class Person {
	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	//propiedad estaitca solo se puede acceder mediante la clase 
	private static int total=0;//estatico 
	
	//overlaing es sobrecargar los metodos y override es sobreescrinbir 
	//con esta puede acceder a la documentacion de javadoc https://www.oracle.com/mx/technical-resources/articles/java/javadoc-tool.html
	/**
	 * clase persona 
	 * @param name  nombre de la persona
	 * @param age de la persona
	 * @param email de la persona
	 * @param rfc de la persona
	 * @param address de la persona
	 */
	public Person(String name, int age, String email, String rfc, String address) {
		this.name=name.toUpperCase();
				this.age=(age<18)?18:age;
				this.email= email.toLowerCase();
				this.rfc=rfc.toUpperCase();
				this.address=address;
				Person.total++;
				id=Person.total;//asigna el id incrementandlo cada vez que una 
				///persona es creada
			
	}//constructor 
	
	public Person (String name, int age, String email) {
		this(name, age, email, "XAXX000000", "Sin direccion");
	}//constructor se permite la sobrecarga en el constructor
	
	public Person(String name) {
		this(name,0, "sincorreo@correo.com");
	}///constructor
	
	/*encapsulacion usando get y set*/
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name= name.toUpperCase();
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=(age<18)?18:age;
	}
	
	public String getEmail() {
		return email;
	}
	/**
	 * Establece el correo electronico para la persona
	 * @param email establece un nuevo coreeo electronico para la persona
	 * @throws EmailFormatException puede lanzar una exception de la clase exception 
	 */
	public void setEmail(String email) throws EmailFormatException {
		this.email= "sincorreo@correo.com";///validacion de correo electronico
		Pattern regex = Pattern.compile("^[a-z_0-9.%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}");
		Matcher matcher = regex.matcher(email);
		if(matcher.matches()) {//si es valido
			this.email= email;
		}else {///si no es valido 
			throw new EmailFormatException ("El correo no tiene un formato valido" + email);
		}
	}
	
	public String getRfc() {
		return rfc;
	}//get

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}//set

	public String getAddress() {
		return address;
	}//get

	public void setAddress(String address) {
		this.address = address;
	}//set

	public int getId() {
		return id;
	}//get solo lectura

	@Override
	public String toString() {//source+ generateto String
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ "]";
	}
	
	
	
	

}//class persona 

