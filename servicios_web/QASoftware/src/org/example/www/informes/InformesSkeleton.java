
/**
 * InformesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.informes;

/**
 * InformesSkeleton java skeleton for the axisService
 */
public class InformesSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param generarInforme
	 * @return generarInformeResponse
	 */

	public org.example.www.informes.GenerarInformeResponse generarInforme(
			org.example.www.informes.GenerarInforme generarInforme) {
		
		GenerarInformeResponse informe = new GenerarInformeResponse();
		Database db = new Database();
		
		// Guardamos el informe recibido
		db.guardaInforme(generarInforme);
		
		// Seteamos las variables de la respuesta
		informe.setIdInforme(generarInforme.getIdInforme());
		
		int randomInt = (int) Math.floor(Math.random()*(100-1+1)+1);
		informe.setPosicionCola(randomInt);
		
		return informe;
	}

}
