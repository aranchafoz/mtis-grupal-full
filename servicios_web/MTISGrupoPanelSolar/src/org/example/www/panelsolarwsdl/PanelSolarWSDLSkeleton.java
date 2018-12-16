
/**
 * PanelSolarWSDLSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.panelsolarwsdl;

import java.sql.SQLException;

/**
     *  PanelSolarWSDLSkeleton java skeleton for the axisService
     */
    public class PanelSolarWSDLSkeleton{
        
         /**
          * Activa o desactiva las defensas
          * @param activarDefensas
          * @return
          */
         public org.example.www.panelsolarwsdl.ActivarDefensasResponse activarDefensas(org.example.www.panelsolarwsdl.ActivarDefensas activarDefensas)
         {
        	 ActivarDefensasResponse result = new ActivarDefensasResponse();
        	 Boolean activar = activarDefensas.localActivar;
        	 
        	 try {
				result.localActivadas = DataBaseMethods.activaDefensas(activar);
			 } catch (SQLException e) {
				result.localActivadas = false;
			 }
        	 
        	 return result;
         }
     
         
         /**
          * Mueve el panel arriba o abajo
          * @param moverPanel
          * @return
          */
         public org.example.www.panelsolarwsdl.MoverPanelResponse moverPanel(org.example.www.panelsolarwsdl.MoverPanel moverPanel)
         {
        	 MoverPanelResponse result = new MoverPanelResponse();
        	 int grados = moverPanel.localGrados;
        	 
        	 try {
 				result.localMovido = DataBaseMethods.moverElPanel(grados);
 			 } catch (SQLException e) {
 				result.localMovido = false;
 			 }
        	 
        	 return result;
         }
     
         
         /**
          * Rota el panel
          * @param rotarPanel
          * @return
          */
         public org.example.www.panelsolarwsdl.RotarPanelResponse rotarPanel(org.example.www.panelsolarwsdl.RotarPanel rotarPanel)
         {
        	 RotarPanelResponse result = new RotarPanelResponse();
        	 int grados = rotarPanel.localGrados;
        	 
        	 try {
  				result.localRotado = DataBaseMethods.rotarElPanel(grados);
  			 } catch (SQLException e) {
  				result.localRotado = false;
  			 }
        	 
        	 return result;
         }
     
    }
    