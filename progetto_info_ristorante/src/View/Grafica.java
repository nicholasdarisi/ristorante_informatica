package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;

public class Grafica {

	private JFrame frmRistorante;
	private JTextField txtMen;
	
	public Grafica() {
		frmRistorante = new JFrame();
		frmRistorante.setTitle("Ristorante");
		frmRistorante.setResizable(false);
		frmRistorante.setBounds(100, 100, 1200, 900);
		frmRistorante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRistorante.getContentPane().setLayout(null);
		
		txtMen = new JTextField();
		txtMen.setHorizontalAlignment(SwingConstants.CENTER);
		txtMen.setText("Men\u00F9");
		txtMen.setEditable(false);
		txtMen.setBounds(179, 39, 116, 22);
		frmRistorante.getContentPane().add(txtMen);
		txtMen.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(162, 116, 52, 22);
		frmRistorante.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(150, 182, 52, 22);
		frmRistorante.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(252, 182, 52, 22);
		frmRistorante.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(243, 246, 52, 22);
		frmRistorante.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(150, 246, 52, 22);
		frmRistorante.getContentPane().add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(162, 304, 52, 22);
		frmRistorante.getContentPane().add(spinner_5);
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setBounds(243, 304, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_1);
		
		JSpinner spinner_5_2 = new JSpinner();
		spinner_5_2.setBounds(318, 304, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_2);
		
		JSpinner spinner_5_3 = new JSpinner();
		spinner_5_3.setBounds(150, 369, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_3);
		
		JSpinner spinner_5_4 = new JSpinner();
		spinner_5_4.setBounds(252, 369, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_4);
		
		JSpinner spinner_5_5 = new JSpinner();
		spinner_5_5.setBounds(346, 369, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_5);
		
		JSpinner spinner_5_6 = new JSpinner();
		spinner_5_6.setBounds(179, 430, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_6);
		
		JSpinner spinner_5_7 = new JSpinner();
		spinner_5_7.setBounds(282, 430, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Grafica.class.getResource("/Img/sfondo.jpg")));
		lblNewLabel.setBounds(0, 0, 1200, 900);
		frmRistorante.getContentPane().add(lblNewLabel);
	}

	public void mostra() {
		frmRistorante.setVisible(true);
	}
}
