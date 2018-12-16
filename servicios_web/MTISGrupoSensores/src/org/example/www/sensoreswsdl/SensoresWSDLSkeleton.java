
/**
 * SensoresWSDLSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.sensoreswsdl;

import java.sql.SQLException;

/**
     *  SensoresWSDLSkeleton java skeleton for the axisService
     */
    public class SensoresWSDLSkeleton{
        
         
        /**
         * Obtiene la temperatura segun la hora
         * @param getTemperatura
         * @return
         */
         public org.example.www.sensoreswsdl.GetTemperaturaResponse getTemperatura(org.example.www.sensoreswsdl.GetTemperatura getTemperatura)
         {
        	 GetTemperaturaResponse result = new GetTemperaturaResponse();
        	 int hora = getTemperatura.localHora;
        	 
        	 try {
				result.localTemperatura = DataBaseMethods.consultarTemperatura(hora);
			} catch (SQLException e) {
				result.localTemperatura = 0;
			}
        	 
        	 return result;
         }
     
         
         /**
          * Obtiene la intensidad segun la hora
          * @param getIntensidad
          * @return
          */
         public org.example.www.sensoreswsdl.GetIntensidadResponse getIntensidad(org.example.www.sensoreswsdl.GetIntensidad getIntensidad)
         {
        	 GetIntensidadResponse result = new GetIntensidadResponse();
        	 int hora = getIntensidad.localHora;
        	 
        	 try {
 				result.localIntensidad = DataBaseMethods.consultarIntensidad(hora);
 			 } catch (SQLException e) {
 				result.localIntensidad = "baja";
 			 }
        	 
        	 return result;
         }
     
         
         /**
          * Obtiene la probabilidad de granizo segun la hora
          * @param getGranizo
          * @return
          */
         public org.example.www.sensoreswsdl.GetGranizoResponse getGranizo(org.example.www.sensoreswsdl.GetGranizo getGranizo)
         {
        	 GetGranizoResponse result = new GetGranizoResponse();
        	 int hora = getGranizo.localHora;

        	 try {
 				result.localProbabilidad = DataBaseMethods.consultarGranizo(hora);
 			 } catch (SQLException e) {
 				result.localProbabilidad = "baja";
 			 }
        	 
        	 return result;
         }
     
         
         /**
          * Obtiene la posicion solar segun la hora
          * @param getPosSolar
          * @return
          */
         public org.example.www.sensoreswsdl.GetPosSolarResponse getPosSolar(org.example.www.sensoreswsdl.GetPosSolar getPosSolar)
         {
        	 GetPosSolarResponse result = new GetPosSolarResponse();
        	 int hora = getPosSolar.localHora;

        	 try {
 				result.localGrados = DataBaseMethods.consultarPosicionSolar(hora);
 			 } catch (SQLException e) {
 				result.localGrados = 0;
 			 }
        	 
        	 return result;
         }
    }
    