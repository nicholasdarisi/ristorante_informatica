package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingConstants;

import Controller.Controller_paga;

import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Grafica_tavoli {

	private JFrame frmTavoli;
	private JTextField txtTavoli;
	private JButton btnPaga;
	private JTextField txtPagamento;
	private JList<String> listTavoli;
	private JScrollPane scrollPaneTavoli;
	private JLabel lblSfondo;
	
	public Grafica_tavoli() {
		frmTavoli = new JFrame();
		frmTavoli.setIconImage(Toolkit.getDefaultToolkit().getImage(Grafica_tavoli.class.getResource("/Img/icona.jpg")));
		frmTavoli.setTitle("Tavoli");
		frmTavoli.setResizable(false);
		frmTavoli.setBounds(100, 100, 860, 405);
		frmTavoli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTavoli.getContentPane().setLayout(null);
		
		txtTavoli = new JTextField();
		txtTavoli.setBackground(Color.WHITE);
		txtTavoli.setForeground(Color.RED);
		txtTavoli.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtTavoli.setText("Tavoli");
		txtTavoli.setHorizontalAlignment(SwingConstants.CENTER);
		txtTavoli.setEditable(false);
		txtTavoli.setColumns(10);
		txtTavoli.setBounds(12, 13, 116, 50);
		frmTavoli.getContentPane().add(txtTavoli);
		
		btnPaga = new JButton("Paga");
		btnPaga.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnPaga.setBounds(679, 26, 130, 30);
		frmTavoli.getContentPane().add(btnPaga);
		
		txtPagamento = new JTextField();
		txtPagamento.setText("Importo da pagare: $0.00");
		txtPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		txtPagamento.setForeground(Color.BLACK);
		txtPagamento.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtPagamento.setEditable(false);
		txtPagamento.setColumns(10);
		txtPagamento.setBackground(Color.WHITE);
		txtPagamento.setBounds(140, 26, 527, 30);
		frmTavoli.getContentPane().add(txtPagamento);
		
		listTavoli = new JList<String>();
		listTavoli.setBounds(105, 640, 349, 113);
		
		scrollPaneTavoli = new JScrollPane(listTavoli);
		scrollPaneTavoli.setBounds(12, 76, 797, 284);
		frmTavoli.getContentPane().add(scrollPaneTavoli);
        scrollPaneTavoli.getViewport().setOpaque(false);
		
		lblSfondo = new JLabel("");
		lblSfondo.setBackground(Color.CYAN);
		lblSfondo.setIcon(null);
		lblSfondo.setBounds(0, 0, 854, 370);
		frmTavoli.getContentPane().add(lblSfondo);
	}

	public void mostra() {
		frmTavoli.setVisible(true);
	}
	
	public void registraController(Controller_paga controller) {
		btnPaga.addActionListener(controller);
	}
	
	public JButton getButton(int type) {
        switch (type) {
            case 0:
                return btnPaga;
        }
        return null;
    }
	
	public int getIndex() {
		return listTavoli.getSelectedIndex();
	}
	
	public void setList(DefaultListModel<String> d) {
		listTavoli.setModel(d);
	}
	
	public void setImporto(float i) {
		txtPagamento.setText("Importo da pagare: " + i + "$");
	}
	
}