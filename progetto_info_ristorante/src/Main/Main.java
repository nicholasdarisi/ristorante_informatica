package Main;

import java.io.Serializable;

import Controller.Controller;
import Model.Amministrazione;
import Model.Cameriere;
import Model.Cucina;
import Model.Ordine;
import View.Grafica;
import Model.Cassa;

public class Main {
	
	public static void main(String[] args) {
		Amministrazione a;
		Cameriere cam;
		Cucina cuc;
		Cassa cas;
		Ordine o;
		Grafica g = new Grafica();
		Controller c = new Controller(null, null, null, null, null, g);
		c.inizio();
	}

}

/*MAIN
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		//Scrittura di oggetti


}
*/

/*OGGETTO
import java.io.Serializable;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome;
	}
	
}

 */