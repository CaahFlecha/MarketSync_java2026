package com.marketsync.util;

import com.marketsync.dao.CategoriaDao;
import com.marketsync.entidades.Categoria;

public class PruebadeConexion {

	public static void main(String[] args) {
		System.out.println("Iniciando prueba de hibernate 7");
		try {
			CategoriaDao dao = new CategoriaDao();
			
			Categoria categoria = new Categoria();
			categoria.setDescripcion("Categoria de prueba");
			 categoria.setEstado(true);
			 dao.guardar(categoria);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
