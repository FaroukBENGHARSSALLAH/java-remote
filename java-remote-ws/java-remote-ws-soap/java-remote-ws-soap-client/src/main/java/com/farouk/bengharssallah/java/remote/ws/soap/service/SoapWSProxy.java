package com.farouk.bengharssallah.java.remote.ws.soap.service;

public class SoapWSProxy implements com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS {
  private String _endpoint = null;
  private com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS soapWS = null;
  
  public SoapWSProxy() {
    _initSoapWSProxy();
  }
  
  public SoapWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapWSProxy();
  }
  
  private void _initSoapWSProxy() {
    try {
      soapWS = (new com.farouk.bengharssallah.java.remote.ws.soap.service.SopaWSLocator()).getSoapWSPort();
      if (soapWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapWS != null)
      ((javax.xml.rpc.Stub)soapWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS getSoapWS() {
    if (soapWS == null)
      _initSoapWSProxy();
    return soapWS;
  }
  
  public java.lang.String getMessage() throws java.rmi.RemoteException{
    if (soapWS == null)
      _initSoapWSProxy();
    return soapWS.getMessage();
  }
  
  public java.lang.String getMessageByName(java.lang.String name) throws java.rmi.RemoteException{
    if (soapWS == null)
      _initSoapWSProxy();
    return soapWS.getMessageByName(name);
  }
  
  
}