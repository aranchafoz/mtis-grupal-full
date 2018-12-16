
/**
 * PanelSolarWSDLMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.panelsolarwsdl;

        /**
        *  PanelSolarWSDLMessageReceiverInOut message receiver
        */

        public class PanelSolarWSDLMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        PanelSolarWSDLSkeleton skel = (PanelSolarWSDLSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("activarDefensas".equals(methodName)){
                
                org.example.www.panelsolarwsdl.ActivarDefensasResponse activarDefensasResponse13 = null;
	                        org.example.www.panelsolarwsdl.ActivarDefensas wrappedParam =
                                                             (org.example.www.panelsolarwsdl.ActivarDefensas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.panelsolarwsdl.ActivarDefensas.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activarDefensasResponse13 =
                                                   
                                                   
                                                         skel.activarDefensas(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activarDefensasResponse13, false, new javax.xml.namespace.QName("http://www.example.org/PanelSolarWSDL/",
                                                    "activarDefensas"));
                                    } else 

            if("moverPanel".equals(methodName)){
                
                org.example.www.panelsolarwsdl.MoverPanelResponse moverPanelResponse15 = null;
	                        org.example.www.panelsolarwsdl.MoverPanel wrappedParam =
                                                             (org.example.www.panelsolarwsdl.MoverPanel)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.panelsolarwsdl.MoverPanel.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               moverPanelResponse15 =
                                                   
                                                   
                                                         skel.moverPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), moverPanelResponse15, false, new javax.xml.namespace.QName("http://www.example.org/PanelSolarWSDL/",
                                                    "moverPanel"));
                                    } else 

            if("rotarPanel".equals(methodName)){
                
                org.example.www.panelsolarwsdl.RotarPanelResponse rotarPanelResponse17 = null;
	                        org.example.www.panelsolarwsdl.RotarPanel wrappedParam =
                                                             (org.example.www.panelsolarwsdl.RotarPanel)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.panelsolarwsdl.RotarPanel.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               rotarPanelResponse17 =
                                                   
                                                   
                                                         skel.rotarPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), rotarPanelResponse17, false, new javax.xml.namespace.QName("http://www.example.org/PanelSolarWSDL/",
                                                    "rotarPanel"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.panelsolarwsdl.ActivarDefensas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.panelsolarwsdl.ActivarDefensas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.panelsolarwsdl.ActivarDefensasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.panelsolarwsdl.ActivarDefensasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.panelsolarwsdl.MoverPanel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.panelsolarwsdl.MoverPanel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.panelsolarwsdl.MoverPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.panelsolarwsdl.MoverPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.panelsolarwsdl.RotarPanel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.panelsolarwsdl.RotarPanel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.panelsolarwsdl.RotarPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.panelsolarwsdl.RotarPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.panelsolarwsdl.ActivarDefensasResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.panelsolarwsdl.ActivarDefensasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.panelsolarwsdl.ActivarDefensasResponse wrapactivarDefensas(){
                                org.example.www.panelsolarwsdl.ActivarDefensasResponse wrappedElement = new org.example.www.panelsolarwsdl.ActivarDefensasResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.panelsolarwsdl.MoverPanelResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.panelsolarwsdl.MoverPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.panelsolarwsdl.MoverPanelResponse wrapmoverPanel(){
                                org.example.www.panelsolarwsdl.MoverPanelResponse wrappedElement = new org.example.www.panelsolarwsdl.MoverPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.panelsolarwsdl.RotarPanelResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.panelsolarwsdl.RotarPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.panelsolarwsdl.RotarPanelResponse wraprotarPanel(){
                                org.example.www.panelsolarwsdl.RotarPanelResponse wrappedElement = new org.example.www.panelsolarwsdl.RotarPanelResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.panelsolarwsdl.ActivarDefensas.class.equals(type)){
                
                        return org.example.www.panelsolarwsdl.ActivarDefensas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.panelsolarwsdl.ActivarDefensasResponse.class.equals(type)){
                
                        return org.example.www.panelsolarwsdl.ActivarDefensasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.panelsolarwsdl.MoverPanel.class.equals(type)){
                
                        return org.example.www.panelsolarwsdl.MoverPanel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.panelsolarwsdl.MoverPanelResponse.class.equals(type)){
                
                        return org.example.www.panelsolarwsdl.MoverPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.panelsolarwsdl.RotarPanel.class.equals(type)){
                
                        return org.example.www.panelsolarwsdl.RotarPanel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.panelsolarwsdl.RotarPanelResponse.class.equals(type)){
                
                        return org.example.www.panelsolarwsdl.RotarPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    