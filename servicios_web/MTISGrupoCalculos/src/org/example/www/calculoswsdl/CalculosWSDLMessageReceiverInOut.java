
/**
 * CalculosWSDLMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.calculoswsdl;

        /**
        *  CalculosWSDLMessageReceiverInOut message receiver
        */

        public class CalculosWSDLMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CalculosWSDLSkeleton skel = (CalculosWSDLSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("calculoDefensas".equals(methodName)){
                
                org.example.www.calculoswsdl.CalculoDefensasResponse calculoDefensasResponse13 = null;
	                        org.example.www.calculoswsdl.CalculoDefensas wrappedParam =
                                                             (org.example.www.calculoswsdl.CalculoDefensas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.calculoswsdl.CalculoDefensas.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               calculoDefensasResponse13 =
                                                   
                                                   
                                                         skel.calculoDefensas(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), calculoDefensasResponse13, false, new javax.xml.namespace.QName("http://www.example.org/CalculosWSDL/",
                                                    "calculoDefensas"));
                                    } else 

            if("calculoMovilidad".equals(methodName)){
                
                org.example.www.calculoswsdl.CalculoMovilidadResponse calculoMovilidadResponse15 = null;
	                        org.example.www.calculoswsdl.CalculoMovilidad wrappedParam =
                                                             (org.example.www.calculoswsdl.CalculoMovilidad)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.calculoswsdl.CalculoMovilidad.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               calculoMovilidadResponse15 =
                                                   
                                                   
                                                         skel.calculoMovilidad(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), calculoMovilidadResponse15, false, new javax.xml.namespace.QName("http://www.example.org/CalculosWSDL/",
                                                    "calculoMovilidad"));
                                    } else 

            if("calculoRotacion".equals(methodName)){
                
                org.example.www.calculoswsdl.CalculoRotacionResponse calculoRotacionResponse17 = null;
	                        org.example.www.calculoswsdl.CalculoRotacion wrappedParam =
                                                             (org.example.www.calculoswsdl.CalculoRotacion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.calculoswsdl.CalculoRotacion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               calculoRotacionResponse17 =
                                                   
                                                   
                                                         skel.calculoRotacion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), calculoRotacionResponse17, false, new javax.xml.namespace.QName("http://www.example.org/CalculosWSDL/",
                                                    "calculoRotacion"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.calculoswsdl.CalculoDefensas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.calculoswsdl.CalculoDefensas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.calculoswsdl.CalculoDefensasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.calculoswsdl.CalculoDefensasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.calculoswsdl.CalculoMovilidad param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.calculoswsdl.CalculoMovilidad.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.calculoswsdl.CalculoMovilidadResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.calculoswsdl.CalculoMovilidadResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.calculoswsdl.CalculoRotacion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.calculoswsdl.CalculoRotacion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.calculoswsdl.CalculoRotacionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.calculoswsdl.CalculoRotacionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.calculoswsdl.CalculoDefensasResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.calculoswsdl.CalculoDefensasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.calculoswsdl.CalculoDefensasResponse wrapcalculoDefensas(){
                                org.example.www.calculoswsdl.CalculoDefensasResponse wrappedElement = new org.example.www.calculoswsdl.CalculoDefensasResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.calculoswsdl.CalculoMovilidadResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.calculoswsdl.CalculoMovilidadResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.calculoswsdl.CalculoMovilidadResponse wrapcalculoMovilidad(){
                                org.example.www.calculoswsdl.CalculoMovilidadResponse wrappedElement = new org.example.www.calculoswsdl.CalculoMovilidadResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.calculoswsdl.CalculoRotacionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.calculoswsdl.CalculoRotacionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.calculoswsdl.CalculoRotacionResponse wrapcalculoRotacion(){
                                org.example.www.calculoswsdl.CalculoRotacionResponse wrappedElement = new org.example.www.calculoswsdl.CalculoRotacionResponse();
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
        
                if (org.example.www.calculoswsdl.CalculoDefensas.class.equals(type)){
                
                        return org.example.www.calculoswsdl.CalculoDefensas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.calculoswsdl.CalculoDefensasResponse.class.equals(type)){
                
                        return org.example.www.calculoswsdl.CalculoDefensasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.calculoswsdl.CalculoMovilidad.class.equals(type)){
                
                        return org.example.www.calculoswsdl.CalculoMovilidad.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.calculoswsdl.CalculoMovilidadResponse.class.equals(type)){
                
                        return org.example.www.calculoswsdl.CalculoMovilidadResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.calculoswsdl.CalculoRotacion.class.equals(type)){
                
                        return org.example.www.calculoswsdl.CalculoRotacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.calculoswsdl.CalculoRotacionResponse.class.equals(type)){
                
                        return org.example.www.calculoswsdl.CalculoRotacionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    