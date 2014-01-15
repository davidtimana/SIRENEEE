package com.david.sirene.bo;

import javax.ejb.Local;
import com.david.sirene.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaBO {

	public boolean pruebaBO(Prueba pr);

}
