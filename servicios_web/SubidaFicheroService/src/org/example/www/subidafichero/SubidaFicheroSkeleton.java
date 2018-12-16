
/**
 * SubidaFicheroSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.subidafichero;

import java.util.ArrayList;

/**
 * SubidaFicheroSkeleton java skeleton for the axisService
 */
public class SubidaFicheroSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param validarFichero
	 * @return validarFicheroResponse
	 */

	public org.example.www.subidafichero.ValidarFicheroResponse validarFichero(
			org.example.www.subidafichero.ValidarFichero validarFichero) {
		ValidarFicheroResponse response = new ValidarFicheroResponse();
		response.setError("");
		response.setValid(false);
		DBHelper db = new DBHelper();
		
		if (db.existeEmpleado(validarFichero.getIdWorker())) {
			String extension = validarFichero.getExtension();
			
			if (extension.equals("txt") || extension.equals("doc") || extension.equals("pdf")) {
				if (validarFichero.getContent().length() > 0) {
					response.setValid(true);
				} else {
					response.setError("El fichero no puede estar vacío");
				}
			} else {
				response.setError("El formato del fichero es inválido");
			}
		} else {
			response.setError("El empleado no existe en la base de datos");
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param ponerFicheroEnCola
	 * @return ponerFicheroEnColaResponse
	 */

	public org.example.www.subidafichero.PonerFicheroEnColaResponse ponerFicheroEnCola(
			org.example.www.subidafichero.PonerFicheroEnCola ponerFicheroEnCola) {
		PonerFicheroEnColaResponse response = new PonerFicheroEnColaResponse();
		DBHelper db = new DBHelper();
		response.setError("");
		response.setIdDepartment("-1");
		response.setIdOffice("-1");
		
		ArrayList<String> ficheroEncolado = new ArrayList<String>();
		ficheroEncolado = db.encolarFichero(ponerFicheroEnCola.getIdFile(), ponerFicheroEnCola.getIdDepartment(), ponerFicheroEnCola.getIdOffice());
		
		if (ficheroEncolado.isEmpty()) {
			response.setError("No se han encontrado empleados para este departamento u oficina");
		} else {
			response.setIdDepartment(ficheroEncolado.get(0));
			response.setIdOffice(ficheroEncolado.get(1));
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param subidaFichero
	 * @return subidaFicheroResponse
	 */

	public org.example.www.subidafichero.SubidaFicheroResponse subidaFichero(
			org.example.www.subidafichero.SubidaFichero subidaFichero) {
		SubidaFicheroResponse response = new SubidaFicheroResponse();
		DBHelper db = new DBHelper();
		response.setUploaded(false);
		
		if (db.subirFichero(subidaFichero.getIdWorker(), subidaFichero.getContent(), subidaFichero.getExtension(), subidaFichero.getDate())) {
			response.setUploaded(true);
			response.setIdFile(db.obtenerUltimoFichero());
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param envioFichero
	 * @return envioFicheroResponse
	 */

	public org.example.www.subidafichero.EnvioFicheroResponse envioFichero(
			org.example.www.subidafichero.EnvioFichero envioFichero) {
		EnvioFicheroResponse response = new EnvioFicheroResponse();
		DBHelper db = new DBHelper();
		response.setSent(false);
		response.setError("");
		
		if (db.enviarFichero(envioFichero.getIdFile())) {
			response.setSent(true);
		} else {
			response.setError("No hay ningún fichero asociado al id "+envioFichero.getIdFile());
		}
		
		return response;
	}

}
