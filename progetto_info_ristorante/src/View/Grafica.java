package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;

public class Grafica {

	private JFrame frmRistorante;
	private JTextField txtMen;
	private JTextField txtCucina;
	private JTextField txtTavoli;
	private JTextField txtAntipasti;
	private JTextField txtPrimi;
	private JTextField txtSecondi;
	private JTextField txtContorni;
	private JTextField txtBevande;
	private JTextField txtDolciECaff;
	private JTextField txtBattilardaConSalumi;
	
	public Grafica() {
		frmRistorante = new JFrame();
		frmRistorante.setTitle("Ristorante");
		frmRistorante.setResizable(false);
		frmRistorante.setBounds(100, 100, 1200, 900);
		frmRistorante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRistorante.getContentPane().setLayout(null);
		
		txtMen = new JTextField();
		txtMen.setForeground(Color.RED);
		txtMen.setFont(new Font("Kristen ITC", Font.PLAIN, 40));
		txtMen.setHorizontalAlignment(SwingConstants.CENTER);
		txtMen.setText("Men\u00F9");
		txtMen.setEditable(false);
		txtMen.setBounds(542, 13, 120, 50);
		frmRistorante.getContentPane().add(txtMen);
		txtMen.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(415, 133, 52, 30);
		frmRistorante.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(118, 540, 52, 22);
		frmRistorante.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(243, 550, 52, 22);
		frmRistorante.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(94, 483, 52, 22);
		frmRistorante.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(482, 512, 52, 22);
		frmRistorante.getContentPane().add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(398, 483, 52, 22);
		frmRistorante.getContentPane().add(spinner_5);
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setBounds(523, 565, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_1);
		
		JSpinner spinner_5_2 = new JSpinner();
		spinner_5_2.setBounds(315, 512, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_2);
		
		JSpinner spinner_5_3 = new JSpinner();
		spinner_5_3.setBounds(94, 626, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_3);
		
		JSpinner spinner_5_4 = new JSpinner();
		spinner_5_4.setBounds(468, 626, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_4);
		
		JSpinner spinner_5_5 = new JSpinner();
		spinner_5_5.setBounds(353, 686, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_5);
		
		JSpinner spinner_5_6 = new JSpinner();
		spinner_5_6.setBounds(222, 607, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_6);
		
		JSpinner spinner_5_7 = new JSpinner();
		spinner_5_7.setBounds(353, 607, 52, 22);
		frmRistorante.getContentPane().add(spinner_5_7);
		
		txtCucina = new JTextField();
		txtCucina.setForeground(Color.RED);
		txtCucina.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtCucina.setText("Cucina");
		txtCucina.setHorizontalAlignment(SwingConstants.CENTER);
		txtCucina.setEditable(false);
		txtCucina.setColumns(10);
		txtCucina.setBounds(683, 511, 116, 50);
		frmRistorante.getContentPane().add(txtCucina);
		
		txtTavoli = new JTextField();
		txtTavoli.setForeground(Color.RED);
		txtTavoli.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtTavoli.setText("Tavoli");
		txtTavoli.setHorizontalAlignment(SwingConstants.CENTER);
		txtTavoli.setEditable(false);
		txtTavoli.setColumns(10);
		txtTavoli.setBounds(154, 683, 116, 50);
		frmRistorante.getContentPane().add(txtTavoli);
		
		txtAntipasti = new JTextField();
		txtAntipasti.setForeground(Color.BLUE);
		txtAntipasti.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtAntipasti.setText("Antipasti");
		txtAntipasti.setHorizontalAlignment(SwingConstants.CENTER);
		txtAntipasti.setEditable(false);
		txtAntipasti.setColumns(10);
		txtAntipasti.setBounds(25, 80, 200, 40);
		frmRistorante.getContentPane().add(txtAntipasti);
		
		txtPrimi = new JTextField();
		txtPrimi.setForeground(Color.BLUE);
		txtPrimi.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtPrimi.setText("Primi");
		txtPrimi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrimi.setEditable(false);
		txtPrimi.setColumns(10);
		txtPrimi.setBounds(502, 76, 200, 40);
		frmRistorante.getContentPane().add(txtPrimi);
		
		txtSecondi = new JTextField();
		txtSecondi.setForeground(Color.BLUE);
		txtSecondi.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtSecondi.setText("Secondi");
		txtSecondi.setHorizontalAlignment(SwingConstants.CENTER);
		txtSecondi.setEditable(false);
		txtSecondi.setColumns(10);
		txtSecondi.setBounds(958, 80, 200, 40);
		frmRistorante.getContentPane().add(txtSecondi);
		
		txtContorni = new JTextField();
		txtContorni.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtContorni.setForeground(Color.BLUE);
		txtContorni.setText("Contorni");
		txtContorni.setHorizontalAlignment(SwingConstants.CENTER);
		txtContorni.setEditable(false);
		txtContorni.setColumns(10);
		txtContorni.setBounds(25, 281, 200, 40);
		frmRistorante.getContentPane().add(txtContorni);
		
		txtBevande = new JTextField();
		txtBevande.setForeground(Color.BLUE);
		txtBevande.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtBevande.setText("Bevande");
		txtBevande.setHorizontalAlignment(SwingConstants.CENTER);
		txtBevande.setEditable(false);
		txtBevande.setColumns(10);
		txtBevande.setBounds(502, 281, 200, 40);
		frmRistorante.getContentPane().add(txtBevande);
		
		txtDolciECaff = new JTextField();
		txtDolciECaff.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtDolciECaff.setForeground(Color.BLUE);
		txtDolciECaff.setText("Dolci e caff\u00E8");
		txtDolciECaff.setHorizontalAlignment(SwingConstants.CENTER);
		txtDolciECaff.setEditable(false);
		txtDolciECaff.setColumns(10);
		txtDolciECaff.setBounds(958, 281, 200, 40);
		frmRistorante.getContentPane().add(txtDolciECaff);
		
		txtBattilardaConSalumi = new JTextField();
		txtBattilardaConSalumi.setText("Battilarda con Salumi e piadine farcite");
		txtBattilardaConSalumi.setHorizontalAlignment(SwingConstants.CENTER);
		txtBattilardaConSalumi.setForeground(Color.BLACK);
		txtBattilardaConSalumi.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtBattilardaConSalumi.setEditable(false);
		txtBattilardaConSalumi.setColumns(10);
		txtBattilardaConSalumi.setBounds(25, 133, 390, 30);
		frmRistorante.getContentPane().add(txtBattilardaConSalumi);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Grafica.class.getResource("/Img/sfondo.jpg")));
		lblNewLabel.setBounds(0, 0, 1200, 900);
		frmRistorante.getContentPane().add(lblNewLabel);
	}

	public void mostra() {
		frmRistorante.setVisible(true);
	}
}
