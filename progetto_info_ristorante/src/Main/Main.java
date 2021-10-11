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
		Amministrazione a = new Amministrazione();
		Cameriere cam = new Cameriere();
		Cucina cuc = new Cucina();
		Cassa cas = new Cassa();
		Ordine o = new Ordine();
		Grafica g = new Grafica();
		Controller c = new Controller(a, cam, cuc, cas, o, g);
		c.inizio();
	}

}
