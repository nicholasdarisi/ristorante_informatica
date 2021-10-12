package View;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafica {

	private JFrame frmRistorante;
	
	public Grafica() {
		frmRistorante = new JFrame();
		frmRistorante.setTitle("Ristorante");
		frmRistorante.setResizable(false);
		frmRistorante.setBounds(100, 100, 1200, 500);
		frmRistorante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRistorante.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1200, 500);
		frmRistorante.getContentPane().add(lblNewLabel);
	}

	public void mostra() {
		frmRistorante.setVisible(true);
	}
}
