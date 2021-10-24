package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller_cucina;
import Controller.Controller_paga;

import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Toolkit;

public class Grafica_cucina {

	private JFrame frmRistorante;
	private JTextField txtCucina;
	private JButton btnConsegna;
	private JList<String> listCucina;
	private JScrollPane scrollPaneCucina;
	private JLabel lblSfondo;
	
	public Grafica_cucina() {
		frmRistorante = new JFrame();
		frmRistorante.setIconImage(Toolkit.getDefaultToolkit().getImage(Grafica_cucina.class.getResource("/Img/icona.jpg")));
		frmRistorante.setTitle("Cucina");
		frmRistorante.setResizable(false);
		frmRistorante.setBounds(100, 100, 860, 405);
		frmRistorante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRistorante.getContentPane().setLayout(null);
		
		txtCucina = new JTextField();
		txtCucina.setBackground(Color.WHITE);
		txtCucina.setForeground(Color.RED);
		txtCucina.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtCucina.setText("Cucina");
		txtCucina.setHorizontalAlignment(SwingConstants.CENTER);
		txtCucina.setEditable(false);
		txtCucina.setColumns(10);
		txtCucina.setBounds(12, 13, 116, 50);
		frmRistorante.getContentPane().add(txtCucina);
		
		btnConsegna = new JButton("Consegna");
		btnConsegna.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnConsegna.setBounds(679, 26, 130, 30);
		frmRistorante.getContentPane().add(btnConsegna);
        
        listCucina = new JList<String>();
		listCucina.setBounds(105, 640, 349, 113);
		
		scrollPaneCucina = new JScrollPane(listCucina);
		scrollPaneCucina.setBounds(12, 76, 797, 284);
		frmRistorante.getContentPane().add(scrollPaneCucina);
        scrollPaneCucina.getViewport().setOpaque(false);
		
		lblSfondo = new JLabel("");
		lblSfondo.setBackground(Color.GREEN);
		lblSfondo.setIcon(null);
		lblSfondo.setBounds(0, 0, 854, 370);
		frmRistorante.getContentPane().add(lblSfondo);
	}

	public void mostra() {
		frmRistorante.setVisible(true);
	}
	

	public void registraController(Controller_cucina controller) {
		btnConsegna.addActionListener(controller);
	}
	
	public JButton getButton(int type) {
        switch (type) {
        	case 0:
                return btnConsegna;
        }
        return null;
    }
	
	public int getIndex() {
		return listCucina.getSelectedIndex();
	}
	
	public void setList(DefaultListModel<String> d) {
		listCucina.setModel(d);
	}
	
}
