package com.david.sirene.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.david.sirene.dao.CrudDAO;

public class CrudJPADAO<T> implements CrudDAO<T>, Serializable {
	
	private static final long serialVersionUID = 5538673121036121443L;
	
	private final static Logger log = Logger.getLogger(CrudJPADAO.class .getName());
	
	@PersistenceContext(unitName = "sirenePU")
	private EntityManager entityManager;

	@Override
	public Boolean crear(T entidad) {
		try {
			entityManager.persist(entidad);
			entityManager.refresh(entidad);
			log.info("Objeto guardado correctamente.");
			return true;
		} catch (Exception e) {
			log.info("Hubo un error al guardar el objeto el error es el siguiente: "+e.getMessage());
			return false;
		}
	}

	@Override
	public Boolean editar(T entidad) {
		try {
			entityManager.merge(entidad);
			entityManager.refresh(entidad);
			log.info("Objeto actualizado correctamente.");
			return true;
		} catch (Exception e) {
			log.info("Hubo un error al actualizar el objeto el error es el siguiente: "+e.getMessage());
			return false;
		}		
	}

	@Override
	public Boolean eliminar(T entidad) {
		try {
			entityManager.remove(entidad);
			entityManager.refresh(entidad);
			log.info("Objeto actualizado correctamente.");
			return true;
		} catch (Exception e) {
			log.info("Hubo un error al actualizar el objeto el error es el siguiente: "+e.getMessage());
			return false;
		}	
	}

	@Override
	public T buscarxId(Class<T> claseEntidad, Object id) {
		try {		
			return (T)entityManager.find(claseEntidad, id);
		} catch (Exception e) {
			log.info("Hubo un error al actualizar el objeto el error es el siguiente: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> buscarTodos(Class<T> claseEntidad) {
		StringBuilder jpql = new StringBuilder();
		try {			
			jpql.append("SELECT miEntidad FROM ");
			jpql.append(claseEntidad.getSimpleName());
			jpql.append(" miEntidad ");
			Query query = entityManager.createQuery(jpql.toString());
			return (List<T>)query.getResultList();
		} catch (Exception e) {
			log.info("Hubo un error al actualizar el objeto el error es el siguiente: "
					+ e.getMessage());
			return null;
		}
	}

	@Override
	public Long contar(Class<T> claseEntidad) {
		StringBuilder jpql = new StringBuilder();
		try {			
			jpql.append("SELECT COUNT(miEntidad) FROM ");
			jpql.append(claseEntidad.getSimpleName());
			jpql.append(" miEntidad ");
			Query query = entityManager.createQuery(jpql.toString());
			return (Long)query.getSingleResult();
		} catch (Exception e) {
			log.info("Hubo un error al actualizar el objeto el error es el siguiente: "
					+ e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T buscarUltimo(Class<T> claseEntidad) {
		StringBuilder jpql = new StringBuilder();
		try {			
			jpql.append("SELECT MAX(miEntidad) FROM ");
			jpql.append(claseEntidad.getSimpleName());
			jpql.append(" miEntidad ");
			Query query = entityManager.createQuery(jpql.toString());
			return (T)query.getSingleResult();
		} catch (Exception e) {
			log.info("Hubo un error al actualizar el objeto el error es el siguiente: "
					+ e.getMessage());
			return null;
		}
	}

}
