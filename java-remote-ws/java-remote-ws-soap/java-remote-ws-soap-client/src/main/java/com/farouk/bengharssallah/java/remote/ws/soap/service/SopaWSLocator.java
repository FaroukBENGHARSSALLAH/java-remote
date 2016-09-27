/**
 * SopaWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.farouk.bengharssallah.java.remote.ws.soap.service;

@SuppressWarnings("serial")
public class SopaWSLocator extends org.apache.axis.client.Service implements com.farouk.bengharssallah.java.remote.ws.soap.service.SopaWS {

    public SopaWSLocator() {
    }


    public SopaWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SopaWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapWSPort
    private java.lang.String SoapWSPort_address = "http://localhost:8585/";

    public java.lang.String getSoapWSPortAddress() {
        return SoapWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapWSPortWSDDServiceName = "SoapWSPort";

    public java.lang.String getSoapWSPortWSDDServiceName() {
        return SoapWSPortWSDDServiceName;
    }

    public void setSoapWSPortWSDDServiceName(java.lang.String name) {
        SoapWSPortWSDDServiceName = name;
    }

    public com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS getSoapWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapWSPort(endpoint);
    }

    public com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS getSoapWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWSPortBindingStub _stub = new com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWSPortBindingStub(portAddress, this);
            _stub.setPortName(getSoapWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapWSPortEndpointAddress(java.lang.String address) {
        SoapWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWSPortBindingStub _stub = new com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWSPortBindingStub(new java.net.URL(SoapWSPort_address), this);
                _stub.setPortName(getSoapWSPortWSDDServiceName());
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
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, @SuppressWarnings("rawtypes") Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SoapWSPort".equals(inputPortName)) {
            return getSoapWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soap.ws.remote.java.bengharssallah.farouk.com/", "sopaWS");
    }

    @SuppressWarnings("rawtypes")
	private java.util.HashSet ports = null;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soap.ws.remote.java.bengharssallah.farouk.com/", "SoapWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapWSPort".equals(portName)) {
            setSoapWSPortEndpointAddress(address);
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
