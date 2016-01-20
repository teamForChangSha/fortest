package com.cattsoft.fcconnector.service;

public class FCServiceProxy implements com.cattsoft.fcconnector.service.FCService {
  private String _endpoint = null;
  private com.cattsoft.fcconnector.service.FCService fCService = null;
  
  public FCServiceProxy() {
    _initFCServiceProxy();
  }
  
  public FCServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFCServiceProxy();
  }
  
  private void _initFCServiceProxy() {
    try {
      fCService = (new com.cattsoft.fcconnector.service.FCServiceImplServiceLocator()).getFCServiceImplPort();
      if (fCService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fCService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fCService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fCService != null)
      ((javax.xml.rpc.Stub)fCService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cattsoft.fcconnector.service.FCService getFCService() {
    if (fCService == null)
      _initFCServiceProxy();
    return fCService;
  }
  
  public java.lang.String updatePerson(com.cattsoft.fcconnector.service.PersonBean arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.updatePerson(arg0);
  }
  
  public java.lang.String getPersonPic(java.lang.String arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.getPersonPic(arg0);
  }
  
  public com.cattsoft.fcconnector.service.PersonBean hasPerson(java.lang.String arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.hasPerson(arg0);
  }
  
  public java.lang.String createPerson(com.cattsoft.fcconnector.service.PersonBean arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.createPerson(arg0);
  }
  
  public com.cattsoft.fcconnector.service.FcFatalResultBean[] getFatalResultsList(com.cattsoft.fcconnector.service.FcQueryBean arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.getFatalResultsList(arg0);
  }
  
  public com.cattsoft.fcconnector.service.FcFatalResultBean[] getResultsList(com.cattsoft.fcconnector.service.FcQueryBean arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.getResultsList(arg0);
  }
  
  public java.lang.String updatePersonAc001(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.updatePersonAc001(arg0, arg1);
  }
  
  public java.lang.String addPersonFacePic(com.cattsoft.fcconnector.service.PersonPicBean arg0) throws java.rmi.RemoteException{
    if (fCService == null)
      _initFCServiceProxy();
    return fCService.addPersonFacePic(arg0);
  }
  
  
}