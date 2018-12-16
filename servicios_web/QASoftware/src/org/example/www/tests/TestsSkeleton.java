
/**
 * TestsSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.tests;

/**
 * TestsSkeleton java skeleton for the axisService
 */
public class TestsSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param ejecutarTests
	 * @return ejecutarTestsResponse
	 */

	public org.example.www.tests.EjecutarTestsResponse ejecutarTests(
			org.example.www.tests.EjecutarTests ejecutarTests) {

		EjecutarTestsResponse res = new EjecutarTestsResponse();

		// Generamos valores aleatorios para diferentes ejecuciones de test
		int randomPorcentaje = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
		
		// La fecha se autogenera con el current timestamp en la bbdd

		// Para que los resultados sean diversos, vamos a considerar que
		// un porcentaje mayor de 60 es test completado

		res.setPorcentajeCompletado(randomPorcentaje);

		if (randomPorcentaje >= 60) {
			res.setCompletado(true);
			res.setError(false);
			res.setDescripcionError("");
		} else {
			res.setCompletado(false);
			res.setError(true);
			res.setDescripcionError("El test no se ha completado satisfactoriamentes");
		}

		// Almacenamos los resultados del tests en la base de datos
		Database db = new Database();

		db.guardaTest(res);

		return res;
	}

}
