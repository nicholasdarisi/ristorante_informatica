package Main;

import java.io.Serializable;

import Controller.Controller_paga;
import Model.*;
import View.Grafica;

public class Main {
	
	public static void main(String[] args) {
		Amministrazione a;
		Cameriere cam = new Cameriere("Marin");
		Cucina cuc;
		Cassa cas;
		Ordine o = new Ordine();
		Grafica g = new Grafica();
		//Controller_paga c = new Controller_paga(null, null, null, null, null, g);
		//c.inizio();
		int b[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		cam.setOrdini(o);
		cam.receiveOrder(b);
		System.out.println(Menu.menu_price.get("Acqua"));


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