package com.david.sirene.boimpl;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;
import com.david.sirene.bo.PruebaBO;
import com.david.sirene.dao.PruebaDAO;
import com.david.sirene.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Stateless
public class PruebaBOImpl implements PruebaBO, Serializable {

	private static final long serialVersionUID = -4987639425366667404L;
	@Inject
	private PruebaDAO pruebaDAO;

	@Override
	public boolean pruebaBO(Prueba pr) {
		return pruebaDAO.pruebaDAO(pr);
	}

}
