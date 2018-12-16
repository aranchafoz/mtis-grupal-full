
/**
 * CalculosWSDLSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.calculoswsdl;

import java.sql.SQLException;

	/**
     *  CalculosWSDLSkeleton java skeleton for the axisService
     */
    public class CalculosWSDLSkeleton{
    	   
	     /**
	      * Metodo para calcular si se deben desplegar las defensas
	      * @param calculoDefensas
	      * @return
	      */
        public org.example.www.calculoswsdl.CalculoDefensasResponse calculoDefensas(org.example.www.calculoswsdl.CalculoDefensas calculoDefensas)
        {
        	CalculoDefensasResponse result = new CalculoDefensasResponse();
       	 	String granizo = calculoDefensas.localGranizo;
       	 	String intensidad = calculoDefensas.localIntensidad;
       	 	int posSolar = calculoDefensas.localPosSolar;
       	 	int temperatura = calculoDefensas.localTemperatura;

       	 	result.localDefensasActivar = false;
       	 	
       	 	if(granizo.equals("alta")){
       	 		result.localDefensasActivar = true;
       	 	}else if(granizo.equals("media") && temperatura < 25){
       	 		result.localDefensasActivar = true;
       	 	}
       	 
       	 	return result;
        }
     
        /**
         * Metodo para mover el panel arriba o abajo
         * @param calculoMovilidad
         * @return
         */
        public org.example.www.calculoswsdl.CalculoMovilidadResponse calculoMovilidad(org.example.www.calculoswsdl.CalculoMovilidad calculoMovilidad)
        {
        	
        	CalculoMovilidadResponse result = new CalculoMovilidadResponse();
       	 	String granizo = calculoMovilidad.localGranizo;
       	 	String intensidad = calculoMovilidad.localIntensidad;
       	 	int posSolar = calculoMovilidad.localPosSolar;
       	 	int temperatura = calculoMovilidad.localTemperatura;

       	 	result.localMovilidadGrados = posSolar;
       	 	
       	 	if(intensidad.equals("media") || intensidad.equals("alta")){
       	 		
       	 		if(temperatura < 21){
       	 			
       	 			result.localMovilidadGrados = result.localMovilidadGrados - 20;
       	 			
       	 		}else{
       	 			
       	 			result.localMovilidadGrados = result.localMovilidadGrados + 20;
       	 		}
       	 		
       	 	}else{
       	 		
	       	 	if(temperatura < 21){
	   	 			
	   	 			result.localMovilidadGrados = result.localMovilidadGrados + 20;
	   	 			
	   	 		}else{
	   	 			
	   	 			result.localMovilidadGrados = result.localMovilidadGrados - 20;
	   	 		}
       	 	}
       	 	
       	 	if(result.localMovilidadGrados > 360){
       	 		result.localMovilidadGrados = 360;
       	 	}
       	 	
       	 	if(result.localMovilidadGrados < -360){
       	 		result.localMovilidadGrados = -360;
       	 	}
       	 	
       	 	return result;
        }
     
        
        /**
         * Metodo para rotar el panel izquierda o derecha
         * @param calculoRotacion
         * @return
         */
        public org.example.www.calculoswsdl.CalculoRotacionResponse calculoRotacion(org.example.www.calculoswsdl.CalculoRotacion calculoRotacion)
        {
        	CalculoRotacionResponse result = new CalculoRotacionResponse();
       	 	String granizo = calculoRotacion.localGranizo;
       	 	String intensidad = calculoRotacion.localIntensidad;
       	 	int posSolar = calculoRotacion.localPosSolar;
       	 	int temperatura = calculoRotacion.localTemperatura;

       	 	result.localRotacionGrados = posSolar;
       	 	
       	 if(intensidad.equals("media") || intensidad.equals("alta")){
    	 		
    	 		if(temperatura < 21){
    	 			
    	 			result.localRotacionGrados = result.localRotacionGrados - 15;
    	 			
    	 		}else{
    	 			
    	 			result.localRotacionGrados = result.localRotacionGrados + 15;
    	 		}
    	 		
    	 	}else{
    	 		
	       	 	if(temperatura < 21){
	   	 			
	   	 			result.localRotacionGrados = result.localRotacionGrados + 15;
	   	 			
	   	 		}else{
	   	 			
	   	 			result.localRotacionGrados = result.localRotacionGrados - 15;
	   	 		}
    	 	}
    	 	
    	 	if(result.localRotacionGrados > 360){
    	 		result.localRotacionGrados = 360;
    	 	}
    	 	
    	 	if(result.localRotacionGrados < -360){
    	 		result.localRotacionGrados = -360;
    	 	}
       	 	
       	 	
       	 
       	 	return result;
        }
     
    }
    