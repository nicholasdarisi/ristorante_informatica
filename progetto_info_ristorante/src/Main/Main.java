package Main;

import java.io.Serializable;

import Controller.Controller_cucina;
import Controller.Controller_menu;
import Controller.Controller_paga;
import Model.*;
import View.Grafica;
import View.Grafica_cucina;
import View.Grafica_menu;
import View.Grafica_tavoli;

public class Main {
	
	public static void main(String[] args) {
		Cameriere cam = new Cameriere("Cameriere");
		Cucina cuc = new Cucina("Cucina");
		Cassa cas = new Cassa("Cassa");
		Ordine o = new Ordine();
		Grafica_cucina g_c = new Grafica_cucina();
		Grafica_menu g_m = new Grafica_menu();
		Grafica_tavoli g_t = new Grafica_tavoli();
		Controller_paga c_p = new Controller_paga(cam, cuc, cas, o, g_t);
		Controller_cucina c_c = new Controller_cucina(cam, cuc, cas, o, g_c, g_m, g_t);
		Controller_menu c_m = new Controller_menu(cam, cuc, cas, o, g_m, g_c);
		c_p.inizio();
		c_c.inizio();
		c_m.inizio();

	}

}