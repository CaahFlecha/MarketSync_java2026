package com.marketsync.componentes;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class JMenuItenPersonalizado extends JMenuItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JMenuItenPersonalizado() {
		super();
		setOpaque(false);
	}
	
	@Override
	public void setText(String text) {
		setIcono(text);
		super.setText(text);
	}
	
	private void setIcono(String icono) {
		try {
			URL url = JButonPantallaPrincipal.class.getResource("/Iconos/"+icono.toLowerCase().replace("", "")+"24.png");
			this.setIcon(new ImageIcon(url));
		} catch (Exception e) {
			System.err.println("No se encontro el icono /Iconos/"+icono+"24.png");
			e.printStackTrace();
		}
	
	}
	
	

}
