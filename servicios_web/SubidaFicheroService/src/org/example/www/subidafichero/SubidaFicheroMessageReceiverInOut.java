
/**
 * SubidaFicheroMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.subidafichero;

        /**
        *  SubidaFicheroMessageReceiverInOut message receiver
        */

        public class SubidaFicheroMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SubidaFicheroSkeleton skel = (SubidaFicheroSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("validarFichero".equals(methodName)){
                
                org.example.www.subidafichero.ValidarFicheroResponse validarFicheroResponse17 = null;
	                        org.example.www.subidafichero.ValidarFichero wrappedParam =
                                                             (org.example.www.subidafichero.ValidarFichero)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.subidafichero.ValidarFichero.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarFicheroResponse17 =
                                                   
                                                   
                                                         skel.validarFichero(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarFicheroResponse17, false, new javax.xml.namespace.QName("http://www.example.org/SubidaFichero/",
                                                    "validarFichero"));
                                    } else 

            if("ponerFicheroEnCola".equals(methodName)){
                
                org.example.www.subidafichero.PonerFicheroEnColaResponse ponerFicheroEnColaResponse19 = null;
	                        org.example.www.subidafichero.PonerFicheroEnCola wrappedParam =
                                                             (org.example.www.subidafichero.PonerFicheroEnCola)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.subidafichero.PonerFicheroEnCola.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               ponerFicheroEnColaResponse19 =
                                                   
                                                   
                                                         skel.ponerFicheroEnCola(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), ponerFicheroEnColaResponse19, false, new javax.xml.namespace.QName("http://www.example.org/SubidaFichero/",
                                                    "ponerFicheroEnCola"));
                                    } else 

            if("subidaFichero".equals(methodName)){
                
                org.example.www.subidafichero.SubidaFicheroResponse subidaFicheroResponse21 = null;
	                        org.example.www.subidafichero.SubidaFichero wrappedParam =
                                                             (org.example.www.subidafichero.SubidaFichero)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.subidafichero.SubidaFichero.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               subidaFicheroResponse21 =
                                                   
                                                   
                                                         skel.subidaFichero(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), subidaFicheroResponse21, false, new javax.xml.namespace.QName("http://www.example.org/SubidaFichero/",
                                                    "subidaFichero"));
                                    } else 

            if("envioFichero".equals(methodName)){
                
                org.example.www.subidafichero.EnvioFicheroResponse envioFicheroResponse23 = null;
	                        org.example.www.subidafichero.EnvioFichero wrappedParam =
                                                             (org.example.www.subidafichero.EnvioFichero)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.subidafichero.EnvioFichero.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               envioFicheroResponse23 =
                                                   
                                                   
                                                         skel.envioFichero(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), envioFicheroResponse23, false, new javax.xml.namespace.QName("http://www.example.org/SubidaFichero/",
                                                    "envioFichero"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.ValidarFichero param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.ValidarFichero.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.ValidarFicheroResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.ValidarFicheroResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.PonerFicheroEnCola param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.PonerFicheroEnCola.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.PonerFicheroEnColaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.PonerFicheroEnColaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.SubidaFichero param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.SubidaFichero.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.SubidaFicheroResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.SubidaFicheroResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.EnvioFichero param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.EnvioFichero.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.subidafichero.EnvioFicheroResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.subidafichero.EnvioFicheroResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.subidafichero.ValidarFicheroResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.subidafichero.ValidarFicheroResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.subidafichero.ValidarFicheroResponse wrapValidarFichero(){
                                org.example.www.subidafichero.ValidarFicheroResponse wrappedElement = new org.example.www.subidafichero.ValidarFicheroResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.subidafichero.PonerFicheroEnColaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.subidafichero.PonerFicheroEnColaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.subidafichero.PonerFicheroEnColaResponse wrapPonerFicheroEnCola(){
                                org.example.www.subidafichero.PonerFicheroEnColaResponse wrappedElement = new org.example.www.subidafichero.PonerFicheroEnColaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.subidafichero.SubidaFicheroResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.subidafichero.SubidaFicheroResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.subidafichero.SubidaFicheroResponse wrapSubidaFichero(){
                                org.example.www.subidafichero.SubidaFicheroResponse wrappedElement = new org.example.www.subidafichero.SubidaFicheroResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.subidafichero.EnvioFicheroResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.subidafichero.EnvioFicheroResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.subidafichero.EnvioFicheroResponse wrapEnvioFichero(){
                                org.example.www.subidafichero.EnvioFicheroResponse wrappedElement = new org.example.www.subidafichero.EnvioFicheroResponse();
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
        
                if (org.example.www.subidafichero.EnvioFichero.class.equals(type)){
                
                        return org.example.www.subidafichero.EnvioFichero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.EnvioFicheroResponse.class.equals(type)){
                
                        return org.example.www.subidafichero.EnvioFicheroResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.PonerFicheroEnCola.class.equals(type)){
                
                        return org.example.www.subidafichero.PonerFicheroEnCola.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.PonerFicheroEnColaResponse.class.equals(type)){
                
                        return org.example.www.subidafichero.PonerFicheroEnColaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.SubidaFichero.class.equals(type)){
                
                        return org.example.www.subidafichero.SubidaFichero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.SubidaFicheroResponse.class.equals(type)){
                
                        return org.example.www.subidafichero.SubidaFicheroResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.ValidarFichero.class.equals(type)){
                
                        return org.example.www.subidafichero.ValidarFichero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.subidafichero.ValidarFicheroResponse.class.equals(type)){
                
                        return org.example.www.subidafichero.ValidarFicheroResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    