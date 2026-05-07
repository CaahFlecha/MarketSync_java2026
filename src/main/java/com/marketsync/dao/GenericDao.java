package com.marketsync.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.marketsync.util.HibernateUtil;

public class GenericDao<T> {

	protected Class<T>clase;

	public GenericDao(Class<T>clase) {
		super();
		this.clase = clase;
	}
	
	protected Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public void guardar(T entity) {
		try(Session session= getSession()){
			Transaction transaction =  session.beginTransaction();
			try {
				session.merge(entity);
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null)transaction.rollback();				
				throw e;
			}
		}
	}
	
	
	public void eliminar(T entity) throws Exception {
		try(Session session= getSession()){
			Transaction transaction =  session.beginTransaction();
			try {
				session.remove(session.contains(entity) ? entity : session.merge(entity));
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null)transaction.rollback();				
				throw e;
			}
		}
	}
	
	public T recuperarPorId(Long id) {
		try(Session session = getSession()){
			return session.find(clase, id);
		} 
	}
	
	public List<T>recuperarTodo(){
		try(Session session = getSession()){
			String hql = "FROM"+clase.getName()+"e ORDER BY e.id";
			Query<T>query = session.createQuery(hql, clase);
			return query.getResultList();
		} 
	}
	
	public void truncarTabla(String tabla) {
		try(Session session = getSession()) {
			Transaction transaction = session.beginTransaction();
			try {
				session.createNativeMutationQuery("TRUNCATE TABLE "+tabla+" CASCADE").executeUpdate();
			} catch (Exception e) {
				if (transaction != null)transaction.rollback();				
				throw e;
			}
			
		}
	}
	
	
}
