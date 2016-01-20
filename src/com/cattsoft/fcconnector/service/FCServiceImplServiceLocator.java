/**
 * FCServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cattsoft.fcconnector.service;

public class FCServiceImplServiceLocator extends org.apache.axis.client.Service implements com.cattsoft.fcconnector.service.FCServiceImplService {

    public FCServiceImplServiceLocator() {
    }


    public FCServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FCServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FCServiceImplPort
    private java.lang.String FCServiceImplPort_address = "http://10.72.216.155:9090/fcservice";

    public java.lang.String getFCServiceImplPortAddress() {
        return FCServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FCServiceImplPortWSDDServiceName = "FCServiceImplPort";

    public java.lang.String getFCServiceImplPortWSDDServiceName() {
        return FCServiceImplPortWSDDServiceName;
    }

    public void setFCServiceImplPortWSDDServiceName(java.lang.String name) {
        FCServiceImplPortWSDDServiceName = name;
    }

    public com.cattsoft.fcconnector.service.FCService getFCServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FCServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFCServiceImplPort(endpoint);
    }

    public com.cattsoft.fcconnector.service.FCService getFCServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cattsoft.fcconnector.service.FCServiceImplServiceSoapBindingStub _stub = new com.cattsoft.fcconnector.service.FCServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFCServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFCServiceImplPortEndpointAddress(java.lang.String address) {
        FCServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cattsoft.fcconnector.service.FCService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cattsoft.fcconnector.service.FCServiceImplServiceSoapBindingStub _stub = new com.cattsoft.fcconnector.service.FCServiceImplServiceSoapBindingStub(new java.net.URL(FCServiceImplPort_address), this);
                _stub.setPortName(getFCServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FCServiceImplPort".equals(inputPortName)) {
            return getFCServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "FCServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.fcconnector.cattsoft.com/", "FCServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FCServiceImplPort".equals(portName)) {
            setFCServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
