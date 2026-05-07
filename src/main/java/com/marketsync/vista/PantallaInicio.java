package com.marketsync.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import com.marketsync.componentes.JPanelPantallaPrincipal;
import com.marketsync.componentes.JButonPantallaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Insets;
import com.marketsync.componentes.JMenuItenPersonalizado;

public class PantallaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelPantallaPrincipal contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio frame = new PantallaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaInicio() {
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(this);
		setTitle("MarketSync");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1536, 1024);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registros");
		mnNewMenu.setMargin(new Insets(5, 10, 5, 10));
		menuBar.add(mnNewMenu);
		
		JMenuItenPersonalizado mntnprsnlzdCliente = new JMenuItenPersonalizado();
		mntnprsnlzdCliente.setText("Categoria");
		mnNewMenu.add(mntnprsnlzdCliente);
		
		JMenuItenPersonalizado mntnprsnlzdCliente_1 = new JMenuItenPersonalizado();
		mntnprsnlzdCliente_1.setText("Clientes");
		mnNewMenu.add(mntnprsnlzdCliente_1);
		
		JMenuItenPersonalizado mntnprsnlzdCliente_1_1 = new JMenuItenPersonalizado();
		mntnprsnlzdCliente_1_1.setText("Funcionarios");
		mnNewMenu.add(mntnprsnlzdCliente_1_1);
		
		JMenuItenPersonalizado mntnprsnlzdCliente_1_2 = new JMenuItenPersonalizado();
		mntnprsnlzdCliente_1_2.setText("Marcas");
		mnNewMenu.add(mntnprsnlzdCliente_1_2);
		
		JMenuItenPersonalizado mntnprsnlzdCliente_1_3 = new JMenuItenPersonalizado();
		mntnprsnlzdCliente_1_3.setText("Proveedor");
		mnNewMenu.add(mntnprsnlzdCliente_1_3);
		
		JMenuItenPersonalizado mntnprsnlzdCliente_1_3_1 = new JMenuItenPersonalizado();
		mntnprsnlzdCliente_1_3_1.setText("Usuario");
		mnNewMenu.add(mntnprsnlzdCliente_1_3_1);
		
		JMenu mnNewMenu_1 = new JMenu("Transacciones");
		mnNewMenu_1.setMargin(new Insets(5, 10, 5, 10));
		menuBar.add(mnNewMenu_1);
		
		JMenuItenPersonalizado mntnprsnlzdVentas = new JMenuItenPersonalizado();
		mntnprsnlzdVentas.setText("Ventas");
		mnNewMenu_1.add(mntnprsnlzdVentas);
		
		JMenuItenPersonalizado mntnprsnlzdCompras = new JMenuItenPersonalizado();
		mntnprsnlzdCompras.setText("Compras");
		mnNewMenu_1.add(mntnprsnlzdCompras);
		
		JMenu mnNewMenu_2 = new JMenu("Listados");
		mnNewMenu_2.setMargin(new Insets(5, 10, 5, 10));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Informes");
		mnNewMenu_3.setMargin(new Insets(5, 10, 5, 10));
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Utilidades");
		mnNewMenu_4.setMargin(new Insets(5, 10, 5, 10));
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanelPantallaPrincipal();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButonPantallaPrincipal btnpntlprncplCliente = new JButonPantallaPrincipal();
		btnpntlprncplCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpntlprncplCliente.setText("compras");
		btnpntlprncplCliente.setBounds(47, 71, 160, 99);
		contentPane.add(btnpntlprncplCliente);
		
		JButonPantallaPrincipal btnpntlprncplProductos = new JButonPantallaPrincipal();
		btnpntlprncplProductos.setText("Producto");
		btnpntlprncplProductos.setBounds(47, 218, 160, 99);
		contentPane.add(btnpntlprncplProductos);
		
		JButonPantallaPrincipal btnpntlprncplVenta = new JButonPantallaPrincipal();
		btnpntlprncplVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpntlprncplVenta.setText("ventas");
		btnpntlprncplVenta.setBounds(47, 356, 167, 93);
		contentPane.add(btnpntlprncplVenta);
		
		JButonPantallaPrincipal btnpntlprncplCliente_1 = new JButonPantallaPrincipal();
		btnpntlprncplCliente_1.setText("clientes");
		btnpntlprncplCliente_1.setBounds(285, 71, 160, 99);
		contentPane.add(btnpntlprncplCliente_1);

	}
}
