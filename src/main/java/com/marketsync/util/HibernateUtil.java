package com.marketsync.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//esta clase se encarga de configurar y mantener una unica conexion global para toda nuestra aplicacion (SessionFactory)

public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
			//Crea la SessionFactory a partir del archivo Hibernate.cfg
			//.configure() buscar automaticamente el archivo en src/main/resources
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			//Muestra un error si es que no consigue
			System.err.println("Error al inicializar la SessionFactory" + e);
			throw new ExceptionInInitializerError();
		}
	}

	//Metodo para obtener la session en nuestro DAO
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
	//metodo opcional para cerrar la fabrica al salir de la aplicacion
	public static void shutdown() {
		getSessionFactory().close();
	}
	
}
