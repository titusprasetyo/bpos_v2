/**
 * ExternalSalesImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.openbravo.ws.externalsales;

public interface ExternalSalesImpl extends java.rmi.Remote {
    public com.openbravo.ws.externalsales.Product[] getProductsCatalog(java.lang.String clientID, java.lang.String organizationId, java.lang.String salesChannel, java.lang.String username, java.lang.String password, java.lang.String lang,java.lang.String wh, java.lang.String stage,java.lang.String role, java.lang.String tax,java.lang.String pricelist,java.lang.String url) throws java.rmi.RemoteException;
    public com.openbravo.ws.externalsales.ProductPlus[] getProductsPlusCatalog(java.lang.String clientID, java.lang.String organizationId, java.lang.String salesChannel, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public boolean uploadOrders(java.lang.String clientID, java.lang.String organizationId, java.lang.String salesChannel, com.openbravo.ws.externalsales.Order[] newOrders, java.lang.String username, java.lang.String password, java.lang.String lang, java.lang.String wh, java.lang.String stage, java.lang.String role, java.lang.String urlstring,  java.lang.String orderDocType) throws java.rmi.RemoteException;
    public com.openbravo.ws.externalsales.Order[] getOrders(java.lang.String clientID, java.lang.String organizationId, com.openbravo.ws.externalsales.OrderIdentifier[] orderIds, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
