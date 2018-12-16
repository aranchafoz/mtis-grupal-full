
/**
 * SensoresWSDLMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.sensoreswsdl;

        /**
        *  SensoresWSDLMessageReceiverInOut message receiver
        */

        public class SensoresWSDLMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SensoresWSDLSkeleton skel = (SensoresWSDLSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getTemperatura".equals(methodName)){
                
                org.example.www.sensoreswsdl.GetTemperaturaResponse getTemperaturaResponse17 = null;
	                        org.example.www.sensoreswsdl.GetTemperatura wrappedParam =
                                                             (org.example.www.sensoreswsdl.GetTemperatura)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.sensoreswsdl.GetTemperatura.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTemperaturaResponse17 =
                                                   
                                                   
                                                         skel.getTemperatura(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTemperaturaResponse17, false, new javax.xml.namespace.QName("http://www.example.org/SensoresWSDL/",
                                                    "getTemperatura"));
                                    } else 

            if("getIntensidad".equals(methodName)){
                
                org.example.www.sensoreswsdl.GetIntensidadResponse getIntensidadResponse19 = null;
	                        org.example.www.sensoreswsdl.GetIntensidad wrappedParam =
                                                             (org.example.www.sensoreswsdl.GetIntensidad)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.sensoreswsdl.GetIntensidad.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getIntensidadResponse19 =
                                                   
                                                   
                                                         skel.getIntensidad(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getIntensidadResponse19, false, new javax.xml.namespace.QName("http://www.example.org/SensoresWSDL/",
                                                    "getIntensidad"));
                                    } else 

            if("getGranizo".equals(methodName)){
                
                org.example.www.sensoreswsdl.GetGranizoResponse getGranizoResponse21 = null;
	                        org.example.www.sensoreswsdl.GetGranizo wrappedParam =
                                                             (org.example.www.sensoreswsdl.GetGranizo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.sensoreswsdl.GetGranizo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getGranizoResponse21 =
                                                   
                                                   
                                                         skel.getGranizo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getGranizoResponse21, false, new javax.xml.namespace.QName("http://www.example.org/SensoresWSDL/",
                                                    "getGranizo"));
                                    } else 

            if("getPosSolar".equals(methodName)){
                
                org.example.www.sensoreswsdl.GetPosSolarResponse getPosSolarResponse23 = null;
	                        org.example.www.sensoreswsdl.GetPosSolar wrappedParam =
                                                             (org.example.www.sensoreswsdl.GetPosSolar)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.sensoreswsdl.GetPosSolar.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPosSolarResponse23 =
                                                   
                                                   
                                                         skel.getPosSolar(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPosSolarResponse23, false, new javax.xml.namespace.QName("http://www.example.org/SensoresWSDL/",
                                                    "getPosSolar"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetTemperatura param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetTemperatura.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetTemperaturaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetTemperaturaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetIntensidad param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetIntensidad.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetIntensidadResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetIntensidadResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetGranizo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetGranizo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetGranizoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetGranizoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetPosSolar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetPosSolar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.sensoreswsdl.GetPosSolarResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.sensoreswsdl.GetPosSolarResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.sensoreswsdl.GetTemperaturaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.sensoreswsdl.GetTemperaturaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.sensoreswsdl.GetTemperaturaResponse wrapgetTemperatura(){
                                org.example.www.sensoreswsdl.GetTemperaturaResponse wrappedElement = new org.example.www.sensoreswsdl.GetTemperaturaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.sensoreswsdl.GetIntensidadResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.sensoreswsdl.GetIntensidadResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.sensoreswsdl.GetIntensidadResponse wrapgetIntensidad(){
                                org.example.www.sensoreswsdl.GetIntensidadResponse wrappedElement = new org.example.www.sensoreswsdl.GetIntensidadResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.sensoreswsdl.GetGranizoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.sensoreswsdl.GetGranizoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.sensoreswsdl.GetGranizoResponse wrapgetGranizo(){
                                org.example.www.sensoreswsdl.GetGranizoResponse wrappedElement = new org.example.www.sensoreswsdl.GetGranizoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.sensoreswsdl.GetPosSolarResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.sensoreswsdl.GetPosSolarResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.sensoreswsdl.GetPosSolarResponse wrapgetPosSolar(){
                                org.example.www.sensoreswsdl.GetPosSolarResponse wrappedElement = new org.example.www.sensoreswsdl.GetPosSolarResponse();
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
        
                if (org.example.www.sensoreswsdl.GetGranizo.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetGranizo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetGranizoResponse.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetGranizoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetIntensidad.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetIntensidad.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetIntensidadResponse.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetIntensidadResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetPosSolar.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetPosSolar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetPosSolarResponse.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetPosSolarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetTemperatura.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetTemperatura.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.sensoreswsdl.GetTemperaturaResponse.class.equals(type)){
                
                        return org.example.www.sensoreswsdl.GetTemperaturaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    