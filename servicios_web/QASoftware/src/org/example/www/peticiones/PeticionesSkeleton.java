
/**
 * PeticionesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.peticiones;

/**
 * PeticionesSkeleton java skeleton for the axisService
 */
public class PeticionesSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param validarPeticion
	 * @return validarPeticionResponse
	 */

	public org.example.www.peticiones.ValidarPeticionResponse validarPeticion(
			org.example.www.peticiones.ValidarPeticion validarPeticion) {
		
		ValidarPeticionResponse validar = new ValidarPeticionResponse();
		
		// Guardamos los datos del input
		String comentarios = validarPeticion.getComentarios();
		boolean valida = validarPeticion.getValida();
		

		// Si no hay parámetros nulos, rellenamos la respuesta
		if(comentarios != null){
			if(valida){
				validar.setValida(valida);
				validar.setComentarios(comentarios);
			}
		}

		return validar;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param recibirPeticion
	 * @return recibirPeticionResponse
	 */

	public org.example.www.peticiones.RecibirPeticionResponse recibirPeticion(
			org.example.www.peticiones.RecibirPeticion recibirPeticion) {
		
		RecibirPeticionResponse validar = new RecibirPeticionResponse();
		
		// Guardamos parámetros requeridos
		String idPeticion = recibirPeticion.getIdPeticion();
		String categoria = recibirPeticion.getCategoria();
		String coments = recibirPeticion.getDescripcion();
		
		// Comprobamos si se han establecido los parámetros principales
		
		if (idPeticion != null){
			validar.setValida(true);
			validar.setComentarios(coments);
		}
		
		return validar;
	}

}
