package ejercicios;

import ejercicios.Persona.TipoDocumento;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * A. Crear una clase Persona con los siguientes campos (con sus respectivos
 * getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) NroDocumento - Integer Nombre -
 * String Apellido - String FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia de
 * la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en
 * consola (crear método main e imprimir valores)
 * 
 * @author examen
 *
 */
public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Persona p = new Persona(TipoDocumento.DNI, 37815875, "Julieta", "Chaparro",
				new SimpleDateFormat("yyyy-MM-dd").parse("1994-09-03"));
	System.out.println("Tipo Documento: "+p.getTipoDocumento()+"\nNroDocumento: "+p.getNroDocumento()+"\nNombre: "+p.getNombre()+
			"\nApellido: "+p.getApellido()+"\nFecha Nacimiento: "+new SimpleDateFormat("dd/MM/yyyy").format(p.getFechaNacimiento()));
	}

}
