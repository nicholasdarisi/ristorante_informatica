package Main;

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