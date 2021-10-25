package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller_ValueChanged_Cucina;
import Controller.Controller_cucina;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Grafica_cucina {

	private JFrame frmCucina;
	private JTextField txtCucina;
	private JButton btnConsegna;
	private JList<String> listCucina;
	private JScrollPane scrollPaneCucina;
	private JLabel lblSfondo;
	private JTextField txtInfo;
	private DefaultListModel<String> model;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField0;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JTextField textField9;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField__0;
	private JTextField textField__3;
	private JTextField textField__4;
	private JTextField textField__8;
	private JTextField textField__9;
	private JTextField textField__10;
	private JTextField textField__12;
	private JTextField textField__11;
	private JTextField textField__7;
	private JTextField textField__6;
	private JTextField textField__5;
	private JTextField textField__2;
	private JTextField textField__1;
	
	public Grafica_cucina() {
		model = new DefaultListModel<String>();
		frmCucina = new JFrame();
		frmCucina.setIconImage(Toolkit.getDefaultToolkit().getImage(Grafica_cucina.class.getResource("/Img/icona.jpg")));
		frmCucina.setTitle("Cucina");
		frmCucina.setResizable(false);
		frmCucina.setBounds(100, 100, 1250, 670);
		frmCucina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCucina.getContentPane().setLayout(null);
		
		txtCucina = new JTextField();
		txtCucina.setBackground(Color.WHITE);
		txtCucina.setForeground(Color.RED);
		txtCucina.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		txtCucina.setText("Cucina");
		txtCucina.setHorizontalAlignment(SwingConstants.CENTER);
		txtCucina.setEditable(false);
		txtCucina.setColumns(10);
		txtCucina.setBounds(12, 13, 116, 50);
		frmCucina.getContentPane().add(txtCucina);
		
		btnConsegna = new JButton("Consegna");
		btnConsegna.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btnConsegna.setBounds(959, 26, 130, 30);
		frmCucina.getContentPane().add(btnConsegna);

		startModel();

        listCucina = new JList<String>();
        listCucina.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
        listCucina.setModel(model);
		listCucina.setBounds(105, 640, 349, 113);
		
		scrollPaneCucina = new JScrollPane(listCucina);
		scrollPaneCucina.setBounds(12, 76, 217, 543);
		frmCucina.getContentPane().add(scrollPaneCucina);
        scrollPaneCucina.getViewport().setOpaque(false);
		
		txtInfo = new JTextField();
		txtInfo.setText("Scegli un piatto da cucinare");
		txtInfo.setHorizontalAlignment(SwingConstants.CENTER);
		txtInfo.setForeground(Color.BLACK);
		txtInfo.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		txtInfo.setEditable(false);
		txtInfo.setColumns(10);
		txtInfo.setBackground(Color.WHITE);
		txtInfo.setBounds(140, 26, 807, 30);
		frmCucina.getContentPane().add(txtInfo);
		
		textField = new JTextField();
		textField.setText("Antipasti");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(241, 76, 200, 40);
		frmCucina.getContentPane().add(textField);
		
		textField_4 = new JTextField();
		textField_4.setText("Bevande");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.BLUE);
		textField_4.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(241, 450, 200, 40);
		frmCucina.getContentPane().add(textField_4);
		
		textField_17 = new JTextField();
		textField_17.setText("Caff\u00E8");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setForeground(Color.BLACK);
		textField_17.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(797, 503, 100, 30);
		frmCucina.getContentPane().add(textField_17);
		
		textField_14 = new JTextField();
		textField_14.setText("Acqua");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setForeground(Color.BLACK);
		textField_14.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(241, 503, 100, 30);
		frmCucina.getContentPane().add(textField_14);
		
		textField_3 = new JTextField();
		textField_3.setText("Contorni");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.BLUE);
		textField_3.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(797, 250, 200, 40);
		frmCucina.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setText("Dolci e caff\u00E8");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.BLUE);
		textField_5.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(797, 450, 200, 40);
		frmCucina.getContentPane().add(textField_5);
		
		textField_8 = new JTextField();
		textField_8.setText("Ravioli ai porcini e scalogno");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.BLACK);
		textField_8.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(797, 172, 280, 30);
		frmCucina.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("Faraona al coccio");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setForeground(Color.BLACK);
		textField_9.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(241, 303, 190, 30);
		frmCucina.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("Grigliata mista di mare");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(Color.BLACK);
		textField_10.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(241, 346, 230, 30);
		frmCucina.getContentPane().add(textField_10);
		
		textField_15 = new JTextField();
		textField_15.setText("Pepsi Cola");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setForeground(Color.BLACK);
		textField_15.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(241, 546, 130, 30);
		frmCucina.getContentPane().add(textField_15);
		
		textField_18 = new JTextField();
		textField_18.setText("Tiramis\u00F9");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setForeground(Color.BLACK);
		textField_18.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(797, 546, 100, 30);
		frmCucina.getContentPane().add(textField_18);
		
		textField_11 = new JTextField();
		textField_11.setText("Patate al forno");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(Color.BLACK);
		textField_11.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(797, 303, 160, 30);
		frmCucina.getContentPane().add(textField_11);
		
		textField_2 = new JTextField();
		textField_2.setText("Secondi");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.BLUE);
		textField_2.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(241, 250, 200, 40);
		frmCucina.getContentPane().add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Primi");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.BLUE);
		textField_1.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(797, 76, 200, 40);
		frmCucina.getContentPane().add(textField_1);
		
		textField_13 = new JTextField();
		textField_13.setText("Insalata mista");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setForeground(Color.BLACK);
		textField_13.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(797, 383, 150, 30);
		frmCucina.getContentPane().add(textField_13);
		
		textField_6 = new JTextField();
		textField_6.setText("Battilarda con Salumi e piadine farcite");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.BLACK);
		textField_6.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(241, 129, 390, 30);
		frmCucina.getContentPane().add(textField_6);
		
		textField_12 = new JTextField();
		textField_12.setText("Verdure gratinate");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setForeground(Color.BLACK);
		textField_12.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(797, 346, 190, 30);
		frmCucina.getContentPane().add(textField_12);
		
		textField_16 = new JTextField();
		textField_16.setText("Vino rosso");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setForeground(Color.BLACK);
		textField_16.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(241, 589, 130, 30);
		frmCucina.getContentPane().add(textField_16);
		
		textField_7 = new JTextField();
		textField_7.setText("Tagliatelle al rag\u00F9");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.BLACK);
		textField_7.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(797, 129, 190, 30);
		frmCucina.getContentPane().add(textField_7);
		
		textField0 = new JTextField();
		textField0.setText("0");
		textField0.setHorizontalAlignment(SwingConstants.CENTER);
		textField0.setForeground(Color.BLACK);
		textField0.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField0.setEditable(false);
		textField0.setColumns(10);
		textField0.setBackground(Color.WHITE);
		textField0.setBounds(643, 129, 50, 30);
		frmCucina.getContentPane().add(textField0);
		
		textField1 = new JTextField();
		textField1.setText("0");
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setForeground(Color.BLACK);
		textField1.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField1.setEditable(false);
		textField1.setColumns(10);
		textField1.setBackground(Color.WHITE);
		textField1.setBounds(999, 129, 50, 30);
		frmCucina.getContentPane().add(textField1);
		
		textField2 = new JTextField();
		textField2.setText("0");
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setForeground(Color.BLACK);
		textField2.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBackground(Color.WHITE);
		textField2.setBounds(1089, 172, 50, 30);
		frmCucina.getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setText("0");
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setForeground(Color.BLACK);
		textField3.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBackground(Color.WHITE);
		textField3.setBounds(443, 303, 50, 30);
		frmCucina.getContentPane().add(textField3);
		
		textField4 = new JTextField();
		textField4.setText("0");
		textField4.setHorizontalAlignment(SwingConstants.CENTER);
		textField4.setForeground(Color.BLACK);
		textField4.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField4.setEditable(false);
		textField4.setColumns(10);
		textField4.setBackground(Color.WHITE);
		textField4.setBounds(483, 346, 50, 30);
		frmCucina.getContentPane().add(textField4);
		
		textField5 = new JTextField();
		textField5.setText("0");
		textField5.setHorizontalAlignment(SwingConstants.CENTER);
		textField5.setForeground(Color.BLACK);
		textField5.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField5.setEditable(false);
		textField5.setColumns(10);
		textField5.setBackground(Color.WHITE);
		textField5.setBounds(969, 303, 50, 30);
		frmCucina.getContentPane().add(textField5);
		
		textField6 = new JTextField();
		textField6.setText("0");
		textField6.setHorizontalAlignment(SwingConstants.CENTER);
		textField6.setForeground(Color.BLACK);
		textField6.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField6.setEditable(false);
		textField6.setColumns(10);
		textField6.setBackground(Color.WHITE);
		textField6.setBounds(999, 346, 50, 30);
		frmCucina.getContentPane().add(textField6);
		
		textField7 = new JTextField();
		textField7.setText("0");
		textField7.setHorizontalAlignment(SwingConstants.CENTER);
		textField7.setForeground(Color.BLACK);
		textField7.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField7.setEditable(false);
		textField7.setColumns(10);
		textField7.setBackground(Color.WHITE);
		textField7.setBounds(959, 383, 50, 30);
		frmCucina.getContentPane().add(textField7);
		
		textField8 = new JTextField();
		textField8.setText("0");
		textField8.setHorizontalAlignment(SwingConstants.CENTER);
		textField8.setForeground(Color.BLACK);
		textField8.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField8.setEditable(false);
		textField8.setColumns(10);
		textField8.setBackground(Color.WHITE);
		textField8.setBounds(353, 503, 50, 30);
		frmCucina.getContentPane().add(textField8);
		
		textField9 = new JTextField();
		textField9.setText("0");
		textField9.setHorizontalAlignment(SwingConstants.CENTER);
		textField9.setForeground(Color.BLACK);
		textField9.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField9.setEditable(false);
		textField9.setColumns(10);
		textField9.setBackground(Color.WHITE);
		textField9.setBounds(383, 546, 50, 30);
		frmCucina.getContentPane().add(textField9);
		
		textField10 = new JTextField();
		textField10.setText("0");
		textField10.setHorizontalAlignment(SwingConstants.CENTER);
		textField10.setForeground(Color.BLACK);
		textField10.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField10.setEditable(false);
		textField10.setColumns(10);
		textField10.setBackground(Color.WHITE);
		textField10.setBounds(383, 589, 50, 30);
		frmCucina.getContentPane().add(textField10);
		
		textField11 = new JTextField();
		textField11.setText("0");
		textField11.setHorizontalAlignment(SwingConstants.CENTER);
		textField11.setForeground(Color.BLACK);
		textField11.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField11.setEditable(false);
		textField11.setColumns(10);
		textField11.setBackground(Color.WHITE);
		textField11.setBounds(909, 503, 50, 30);
		frmCucina.getContentPane().add(textField11);
		
		textField12 = new JTextField();
		textField12.setText("0");
		textField12.setHorizontalAlignment(SwingConstants.CENTER);
		textField12.setForeground(Color.BLACK);
		textField12.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField12.setEditable(false);
		textField12.setColumns(10);
		textField12.setBackground(Color.WHITE);
		textField12.setBounds(909, 546, 50, 30);
		frmCucina.getContentPane().add(textField12);
		
		textField__0 = new JTextField();
		textField__0.setText("0");
		textField__0.setHorizontalAlignment(SwingConstants.CENTER);
		textField__0.setForeground(Color.BLACK);
		textField__0.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__0.setEditable(false);
		textField__0.setColumns(10);
		textField__0.setBackground(Color.WHITE);
		textField__0.setBounds(705, 129, 50, 30);
		frmCucina.getContentPane().add(textField__0);
		
		textField__3 = new JTextField();
		textField__3.setText("0");
		textField__3.setHorizontalAlignment(SwingConstants.CENTER);
		textField__3.setForeground(Color.BLACK);
		textField__3.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__3.setEditable(false);
		textField__3.setColumns(10);
		textField__3.setBackground(Color.WHITE);
		textField__3.setBounds(505, 303, 50, 30);
		frmCucina.getContentPane().add(textField__3);
		
		textField__4 = new JTextField();
		textField__4.setText("0");
		textField__4.setHorizontalAlignment(SwingConstants.CENTER);
		textField__4.setForeground(Color.BLACK);
		textField__4.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__4.setEditable(false);
		textField__4.setColumns(10);
		textField__4.setBackground(Color.WHITE);
		textField__4.setBounds(545, 346, 50, 30);
		frmCucina.getContentPane().add(textField__4);
		
		textField__8 = new JTextField();
		textField__8.setText("0");
		textField__8.setHorizontalAlignment(SwingConstants.CENTER);
		textField__8.setForeground(Color.BLACK);
		textField__8.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__8.setEditable(false);
		textField__8.setColumns(10);
		textField__8.setBackground(Color.WHITE);
		textField__8.setBounds(415, 503, 50, 30);
		frmCucina.getContentPane().add(textField__8);
		
		textField__9 = new JTextField();
		textField__9.setText("0");
		textField__9.setHorizontalAlignment(SwingConstants.CENTER);
		textField__9.setForeground(Color.BLACK);
		textField__9.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__9.setEditable(false);
		textField__9.setColumns(10);
		textField__9.setBackground(Color.WHITE);
		textField__9.setBounds(443, 546, 50, 30);
		frmCucina.getContentPane().add(textField__9);
		
		textField__10 = new JTextField();
		textField__10.setText("0");
		textField__10.setHorizontalAlignment(SwingConstants.CENTER);
		textField__10.setForeground(Color.BLACK);
		textField__10.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__10.setEditable(false);
		textField__10.setColumns(10);
		textField__10.setBackground(Color.WHITE);
		textField__10.setBounds(443, 589, 50, 30);
		frmCucina.getContentPane().add(textField__10);
		
		textField__12 = new JTextField();
		textField__12.setText("0");
		textField__12.setHorizontalAlignment(SwingConstants.CENTER);
		textField__12.setForeground(Color.BLACK);
		textField__12.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__12.setEditable(false);
		textField__12.setColumns(10);
		textField__12.setBackground(Color.WHITE);
		textField__12.setBounds(969, 546, 50, 30);
		frmCucina.getContentPane().add(textField__12);
		
		textField__11 = new JTextField();
		textField__11.setText("0");
		textField__11.setHorizontalAlignment(SwingConstants.CENTER);
		textField__11.setForeground(Color.BLACK);
		textField__11.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__11.setEditable(false);
		textField__11.setColumns(10);
		textField__11.setBackground(Color.WHITE);
		textField__11.setBounds(969, 503, 50, 30);
		frmCucina.getContentPane().add(textField__11);
		
		textField__7 = new JTextField();
		textField__7.setText("0");
		textField__7.setHorizontalAlignment(SwingConstants.CENTER);
		textField__7.setForeground(Color.BLACK);
		textField__7.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__7.setEditable(false);
		textField__7.setColumns(10);
		textField__7.setBackground(Color.WHITE);
		textField__7.setBounds(1021, 383, 50, 30);
		frmCucina.getContentPane().add(textField__7);
		
		textField__6 = new JTextField();
		textField__6.setText("0");
		textField__6.setHorizontalAlignment(SwingConstants.CENTER);
		textField__6.setForeground(Color.BLACK);
		textField__6.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__6.setEditable(false);
		textField__6.setColumns(10);
		textField__6.setBackground(Color.WHITE);
		textField__6.setBounds(1061, 346, 50, 30);
		frmCucina.getContentPane().add(textField__6);
		
		textField__5 = new JTextField();
		textField__5.setText("0");
		textField__5.setHorizontalAlignment(SwingConstants.CENTER);
		textField__5.setForeground(Color.BLACK);
		textField__5.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__5.setEditable(false);
		textField__5.setColumns(10);
		textField__5.setBackground(Color.WHITE);
		textField__5.setBounds(1031, 303, 50, 30);
		frmCucina.getContentPane().add(textField__5);
		
		textField__2 = new JTextField();
		textField__2.setText("0");
		textField__2.setHorizontalAlignment(SwingConstants.CENTER);
		textField__2.setForeground(Color.BLACK);
		textField__2.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__2.setEditable(false);
		textField__2.setColumns(10);
		textField__2.setBackground(Color.WHITE);
		textField__2.setBounds(1151, 172, 50, 30);
		frmCucina.getContentPane().add(textField__2);
		
		textField__1 = new JTextField();
		textField__1.setText("0");
		textField__1.setHorizontalAlignment(SwingConstants.CENTER);
		textField__1.setForeground(Color.BLACK);
		textField__1.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		textField__1.setEditable(false);
		textField__1.setColumns(10);
		textField__1.setBackground(Color.WHITE);
		textField__1.setBounds(1061, 129, 50, 30);
		frmCucina.getContentPane().add(textField__1);
		
		lblSfondo = new JLabel("");
		lblSfondo.setIcon(new ImageIcon(Grafica_cucina.class.getResource("/Img/cucina.jpg")));
		lblSfondo.setBounds(0, 0, 1244, 635);
		frmCucina.getContentPane().add(lblSfondo);
	}

	public void mostra() {
		frmCucina.setVisible(true);
	}
	

	public void registraController(Controller_cucina controller) {
		btnConsegna.addActionListener(controller);
	}
	
	public void registraValueChanged(Controller_ValueChanged_Cucina c) {
		listCucina.addListSelectionListener(c);
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
	
	public void setList(int qty[]) {
		textField0.setText(qty[0] + "");
		textField1.setText(qty[1] + "");
		textField2.setText(qty[2] + "");
		textField3.setText(qty[3] + "");
		textField4.setText(qty[4] + "");
		textField5.setText(qty[5] + "");
		textField6.setText(qty[6] + "");
		textField7.setText(qty[7] + "");
		textField8.setText(qty[8] + "");
		textField9.setText(qty[9] + "");
		textField10.setText(qty[10] + "");
		textField11.setText(qty[11] + "");
		textField12.setText(qty[12] + "");
	}
	
	public void setQty(int qty[]) {
		textField__0.setText(qty[0] + "");
		textField__1.setText(qty[1] + "");
		textField__2.setText(qty[2] + "");
		textField__3.setText(qty[3] + "");
		textField__4.setText(qty[4] + "");
		textField__5.setText(qty[5] + "");
		textField__6.setText(qty[6] + "");
		textField__7.setText(qty[7] + "");
		textField__8.setText(qty[8] + "");
		textField__9.setText(qty[9] + "");
		textField__10.setText(qty[10] + "");
		textField__11.setText(qty[11] + "");
		textField__12.setText(qty[12] + "");
	}

	public void setLabel(String s) {
		txtInfo.setText(s);
	}

	public void startModel(){
		for(int i = 0; i < 10 ; i++){
			model.add(i,"Tavolo " + i);
		}
	}
}
