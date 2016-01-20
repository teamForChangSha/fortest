/**
 * FCService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cattsoft.fcconnector.service;

public interface FCService extends java.rmi.Remote {
    public java.lang.String updatePerson(com.cattsoft.fcconnector.service.PersonBean arg0) throws java.rmi.RemoteException;
    public java.lang.String getPersonPic(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.cattsoft.fcconnector.service.PersonBean hasPerson(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String createPerson(com.cattsoft.fcconnector.service.PersonBean arg0) throws java.rmi.RemoteException;
    public com.cattsoft.fcconnector.service.FcFatalResultBean[] getFatalResultsList(com.cattsoft.fcconnector.service.FcQueryBean arg0) throws java.rmi.RemoteException;
    public com.cattsoft.fcconnector.service.FcFatalResultBean[] getResultsList(com.cattsoft.fcconnector.service.FcQueryBean arg0) throws java.rmi.RemoteException;
    public java.lang.String updatePersonAc001(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.String addPersonFacePic(com.cattsoft.fcconnector.service.PersonPicBean arg0) throws java.rmi.RemoteException;
}
