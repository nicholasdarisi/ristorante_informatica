package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Amministrazione;
import Model.Cameriere;
import Model.Cassa;
import Model.Cucina;
import Model.Ordine;
import View.Grafica_cucina;

public class Controller_cucina implements ActionListener{
	Amministrazione a;
	Cameriere cam;
	Cucina cuc;
	Cassa cas;
	Ordine o;
	Grafica_cucina g;
	String check;
	
	public Controller_cucina(Amministrazione a, Cameriere cam, Cucina cuc, Cassa cas, Ordine o, Grafica_cucina g) {
		this.a = a;
		this.cam = cam;
		this.cuc = cuc;
		this.cas = cas;
		this.o = o;
		this.g = g;
		g.registraController_cucina(this);
	}
	
	public void inizio() {
		g.mostra();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//cucina
		if (e.getSource() == g.getButton(0)) {
			//check = cuc.cookOrder(g.ordine());
		}
		
		
	}

}
