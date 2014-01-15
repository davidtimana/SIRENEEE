package com.david.sirene.dao;

import javax.ejb.Local;

import com.david.sirene.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaDAO {

	public boolean pruebaDAO(Prueba pr);

}
