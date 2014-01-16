package com.david.sirene.dao;

import java.util.List;

import javax.ejb.Local;


/*
 * @author David Orlando Timaná
 * 
 */

@Local
public interface CrudDAO<T> {	
	
	
	/*
	 * Crea un registro en la base de datos.
	 * 
	 * @param entidad objeto a almacenar.
	 * 
	 * @return resultado verdadero o falso
	 */
	public Boolean crear(T entidad);
	
	
	/*
	 * Modifica un registro en la base de datos.
	 * 
	 * @param entidad
	 * 
	 * @return resultado verdadero o falso.
	 */
	public Boolean editar(T entidad);
	
	
	/*
	 * Elimina un registro en la bse de datos. 
	 * 
	 * @param entidad
	 * 
	 * @return resultado verdadero o falso.
	 */
	public Boolean eliminar(T entidad);
	
	
	/*
	 * Busca un registro en la base de datos por su id
	 * 
	 * @param claseEntidad Nombre simple de la entidad.
	 * @param id Identificador del objeto.
	 * 
	 * @return T objeto buscado.
	 */
	public T buscarxId(Class<T> claseEntidad, Object id);
	
	
	/*
	 * Busca los registros de una entidad.
	 * 
	 * @param claseEntidad Nombre simple de la entidad.
	 *. 
	 * @return List<T> lista de objetos buscados.
	 */
	public List<T> buscarTodos(Class<T> claseEntidad);
	
	
	/*
	 * Numero de registro en una entidad
	 * 
	 * @param claseEntidad Nombre simple de la entidad
	 * 
	 * @return numeroRegistros
	 */
	public Long contar(Class<T> claseEntidad);
	
	
	/*
	 * Busca el ultimo objeto agregado en una entidad.
	 * 
	 * @param claseEntidad Nombre simple de la entidad.
	 * 
	 * @return T ultimo objeto ingresado.
	 */
	public T buscarUltimo(Class<T> claseEntidad);
	
	
	
	

}
