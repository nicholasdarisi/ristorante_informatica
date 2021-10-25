package Main;

import java.io.Serializable;

import Controller.*;
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
		Ordine o1 = new Ordine();
		Ordine o2 = new Ordine();
		cam.setOrdini(o);
		cuc.setOrder(o1);
		cas.setOrder(o2);
		Grafica_cucina g_c = new Grafica_cucina();
		Grafica_menu g_m = new Grafica_menu();
		Grafica_tavoli g_t = new Grafica_tavoli();
		Controller_paga c_p = new Controller_paga(cas, g_t);
		Controller_cucina c_c = new Controller_cucina(cuc,g_c);
		Controller_menu c_m = new Controller_menu(cam,g_m);
		Controller_ValueChanged_Menu controller_valueChanged_menu = new Controller_ValueChanged_Menu(cam,g_m);
		Controller_ValueChanged_Cucina controller_valueChanged_cucina = new Controller_ValueChanged_Cucina(cuc,g_c);
		Controller_ValueChanged_Paga controller_valueChanged_paga = new Controller_ValueChanged_Paga(cas,g_t);
		c_p.inizio();
		c_c.inizio();
		c_m.inizio();

	}

}