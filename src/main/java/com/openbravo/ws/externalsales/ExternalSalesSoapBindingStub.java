/**
 * ExternalSalesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.openbravo.ws.externalsales;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.tools.ant.taskdefs.War;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ExternalSalesSoapBindingStub extends org.apache.axis.client.Stub
		implements com.openbravo.ws.externalsales.ExternalSalesImpl {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[4];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getProductsCatalog");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ClientID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "organizationId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "salesChannel"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "username"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "password"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_Product"));
		oper.setReturnClass(com.openbravo.ws.externalsales.Product[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getProductsCatalogReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getProductsPlusCatalog");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ClientID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "organizationId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "salesChannel"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "username"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "password"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_ProductPlus"));
		oper.setReturnClass(com.openbravo.ws.externalsales.ProductPlus[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getProductsPlusCatalogReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("uploadOrders");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ClientID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "organizationId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "salesChannel"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "newOrders"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://localhost:8180/openbravo/services/ExternalSales",
						"ArrayOf_tns1_Order"),
				com.openbravo.ws.externalsales.Order[].class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "username"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "password"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		oper.setReturnClass(boolean.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"uploadOrdersReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getOrders");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "ClientID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "organizationId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orderIds"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://localhost:8180/openbravo/services/ExternalSales",
						"ArrayOf_tns1_OrderIdentifier"),
				com.openbravo.ws.externalsales.OrderIdentifier[].class, false,
				false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "username"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "password"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_Order"));
		oper.setReturnClass(com.openbravo.ws.externalsales.Order[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getOrdersReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[3] = oper;

	}

	public ExternalSalesSoapBindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public ExternalSalesSoapBindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public ExternalSalesSoapBindingStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"BPartner");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.BPartner.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Category");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Category.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Order");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Order.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"OrderIdentifier");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.OrderIdentifier.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"OrderLine");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.OrderLine.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Payment");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Payment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Product");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Product.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"ProductPlus");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.ProductPlus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/ExternalSales", "Tax");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Tax.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_Order");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Order[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Order");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_OrderIdentifier");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.OrderIdentifier[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"OrderIdentifier");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_OrderLine");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.OrderLine[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"OrderLine");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_Payment");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Payment[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Payment");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_Product");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.Product[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"Product");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/ExternalSales",
				"ArrayOf_tns1_ProductPlus");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.externalsales.ProductPlus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/ExternalSales",
				"ProductPlus");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	}

	protected org.apache.axis.client.Call createCall()
			throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
					_call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses
								.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
								.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories
									.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
					"Failure trying to get the Call object", _t);
		}
	}

	public com.openbravo.ws.externalsales.Product[] getProductsCatalog(
			java.lang.String clientID, java.lang.String organizationId,
			java.lang.String salesChannel, java.lang.String username,
			java.lang.String password, java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String tax,
			java.lang.String pricelist, java.lang.String url) throws java.rmi.RemoteException {
		/*
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://externalSales.ws.erpCommon.openbravo.org",
				"getProductsCatalog"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { clientID, organizationId,
							salesChannel, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.externalsales.Product[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.externalsales.Product[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.openbravo.ws.externalsales.Product[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
		*/
		
		Product[] ret = getProductsCatalogWs(clientID,organizationId,salesChannel,username,password,lang,wh,stage,role,tax,pricelist,url);
		return ret;
	}
	
	com.openbravo.ws.externalsales.Product[] getProductsCatalogWs(
			java.lang.String clientID, java.lang.String organizationId,
			java.lang.String salesChannel, java.lang.String username,
			java.lang.String password, java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String taxs,
			java.lang.String pricelist, java.lang.String urlstring) {
		Product[] products = null;
		Product product = null;
		Category category = null;
		Tax tax = null;
        try {

            String soapXml = 
            		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:adin=\"http://3e.pl/ADInterface\"> "+
					"   <soapenv:Header/> "+
					"   <soapenv:Body> "+
					"      <adin:queryData>"+
					"         <adin:ModelCRUDRequest>"+
					"            <adin:ModelCRUD>"+
					"               <adin:serviceType>QueryProduct</adin:serviceType>"+
					"               <adin:TableName>M_Product_WS_VT</adin:TableName>"+
					"               <adin:RecordID>0</adin:RecordID>"+
					"               <adin:Action>Read</adin:Action>"+
					"               <adin:filter>AD_Client_ID</adin:filter>"+
					"               <!--Optional:-->"+
					"               <adin:DataRow>"+
					"                  <!--Zero or more repetitions:-->"+
					"                  <adin:field column=\"AD_Client_ID\">"+
					"                     <adin:val>"+clientID+"</adin:val>"+
					"                  </adin:field>"+
					"                  <adin:field column=\"C_Tax_ID\">"+
                    " 				   	<adin:val>"+taxs+"</adin:val>"+
                    "				   </adin:field>"+
                    "				   <adin:field column=\"M_PriceList_Version_ID\">"+
                    "						<adin:val>"+pricelist+"</adin:val>"+
                    "				   </adin:field>"+
					"               </adin:DataRow>"+
					"            </adin:ModelCRUD>"+
					"            <adin:ADLoginRequest>"+
					"               <adin:user>"+username+"</adin:user>"+
					"               <adin:pass>"+password+"</adin:pass>"+
					"               <adin:lang>"+lang+"</adin:lang>"+
					"               <adin:ClientID>"+clientID+"</adin:ClientID>"+
					"               <adin:RoleID>"+role+"</adin:RoleID>"+
					"               <adin:OrgID>"+organizationId+"</adin:OrgID>"+
					"               <adin:WarehouseID>"+wh+"</adin:WarehouseID>"+
					"               <adin:stage>"+stage+"</adin:stage>"+
					"            </adin:ADLoginRequest>"+
					"         </adin:ModelCRUDRequest>"+
					"      </adin:queryData>"+
					"   </soapenv:Body>"+
					"</soapenv:Envelope>";

            java.net.URL url = new java.net.URL(urlstring+"ModelADService");
            URLConnection conn = url.openConnection();
            //((HttpsURLConnection) conn).setSSLSocketFactory(sslSocketFactory);
            
            // Set the necessary header fields
            conn.setRequestProperty("SOAPAction", urlstring+"ModelADService");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
            conn.setDoOutput(true);
            
            // Send the request
            java.io.OutputStreamWriter wr = new java.io.OutputStreamWriter(conn.getOutputStream());
            wr.write(soapXml);
            wr.flush();
            
            // Read the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String xmlString = "";
            while ((line = rd.readLine()) != null) {
                //System.out.println(line);
            	xmlString += line;
            }
            //parse(xmlString);
            
            //parse
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xmlString));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("DataRow");
            NodeList count = doc.getElementsByTagName("WindowTabData");
            Element elementCount = (Element) count.item(0);
            int arrSize = Integer.parseInt(elementCount.getAttributeNode("TotalRows").getNodeValue());
            products = new Product[arrSize];
            
            for (int i = 0; i < nodes.getLength(); i++) {
                Element element = (Element) nodes.item(i);

                NodeList name = element.getElementsByTagName("field");
                
                product = new Product();
                category = new Category();
                tax = new Tax();
                
                for (int j=0;j<name.getLength();j++){
                    Element lines = (Element) name.item(j);
             
                    Node column = lines.getAttributeNode("column");
                    Node value = lines.getAttributeNode("lval");
                    
                    if ("CATEGORY_DESC".equalsIgnoreCase(column.getNodeValue())){
                    	category.setDescription(value.getNodeValue());	
                    }
                    if ("Category".equalsIgnoreCase(column.getNodeValue())){
                    	category.setName(value.getNodeValue());	
                    }   
                    if ("M_Product_Category_ID".equalsIgnoreCase(column.getNodeValue())){
                    	category.setId(value.getNodeValue());	
                    }    
                    if ("M_Product_ID".equalsIgnoreCase(column.getNodeValue())){
                    	product.setId(value.getNodeValue());	
                    }                     
                    if ("Description".equalsIgnoreCase(column.getNodeValue())){
                    	product.setDescription(value.getNodeValue());	
                    }
                    if ("ImageURL".equalsIgnoreCase(column.getNodeValue())){
                    	product.setImageUrl(value.getNodeValue());	
                    }
                    if ("Name".equalsIgnoreCase(column.getNodeValue())){
                    	product.setName(value.getNodeValue());	
                    }
                    if ("Value".equalsIgnoreCase(column.getNodeValue())){
                    	product.setNumber(value.getNodeValue());	
                    }
                    if ("UPC".equalsIgnoreCase(column.getNodeValue())){
                    	product.setEan(value.getNodeValue());	
                    }
                    if ("PriceList".equalsIgnoreCase(column.getNodeValue())){
                    	product.setListPrice(Double.parseDouble(value.getNodeValue()));	
                    }
                    if ("PriceStd".equalsIgnoreCase(column.getNodeValue())){
                    	product.setPurchasePrice(Double.parseDouble(value.getNodeValue()));	
                    }
                    if ("TAX".equalsIgnoreCase(column.getNodeValue())){
                    	tax.setName(value.getNodeValue());	
                    }
                    if ("Rate".equalsIgnoreCase(column.getNodeValue())){
                    	tax.setPercentage(Double.parseDouble(value.getNodeValue()));	
                    }
                    if ("c_tax_id".equalsIgnoreCase(column.getNodeValue())){
                    	tax.setId(value.getNodeValue());	
                    }
                    
                    product.setCategory(category);
                    product.setTax(tax);
                }
                //System.out.println("-------------------");
                products[i] = product;
             }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

	public com.openbravo.ws.externalsales.ProductPlus[] getProductsPlusCatalog(
			java.lang.String clientID, java.lang.String organizationId,
			java.lang.String salesChannel, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://externalSales.ws.erpCommon.openbravo.org",
				"getProductsPlusCatalog"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { clientID, organizationId,
							salesChannel, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.externalsales.ProductPlus[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.externalsales.ProductPlus[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.openbravo.ws.externalsales.ProductPlus[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public boolean uploadOrders(java.lang.String clientID,
			java.lang.String organizationId, java.lang.String salesChannel,
			com.openbravo.ws.externalsales.Order[] newOrders,
			java.lang.String username, java.lang.String password, java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String urlstring, 
			java.lang.String orderDocType)
			throws java.rmi.RemoteException {
		/*
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://externalSales.ws.erpCommon.openbravo.org",
				"uploadOrders"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientID, organizationId, salesChannel, newOrders,
					username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return ((java.lang.Boolean) _resp).booleanValue();
				} catch (java.lang.Exception _exception) {
					return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
							.convert(_resp, boolean.class)).booleanValue();
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
		*/
		OrderLine[] lines = null;
		for (Order ord : newOrders){
			int ordId = uploadOrderHeader(ord, clientID, organizationId, username, password, lang, wh, stage, role, urlstring, orderDocType);
			if (ordId != 0){
				lines = ord.getLines();
				for (OrderLine orderLine : lines){
					uploadOrderLine(orderLine, ordId, clientID, organizationId, username, password, lang, wh, stage, role, urlstring, orderDocType);
				}
			}else{
				return false;
			}
			
		}
		return true;
	}
	
	private int uploadOrderHeader(Order ord, java.lang.String clientID, 
			java.lang.String organizationId, java.lang.String username,
			java.lang.String password, java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String urlstring, 
			java.lang.String orderDocType){
		int recordId = 0;
		try{
            String soapXml = 
            		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:adin=\"http://3e.pl/ADInterface\"> " +
            			"   <soapenv:Header/>                                                                                               " +
            			"   <soapenv:Body>                                                                                                  " +
            			"      <adin:createData>                                                                                            " +
            			"         <adin:ModelCRUDRequest>                                                                                   " +
            			"            <adin:ModelCRUD>                                                                                       " +
            			"               <adin:serviceType>CreateOrderHeader</adin:serviceType>                                              " +
            			"               <adin:TableName>C_Order</adin:TableName>                                                            " +
            			"               <adin:RecordID>0</adin:RecordID>                                                                    " +
            			"               <adin:Action>Create</adin:Action>                                                                   " +
            			"               <!--Optional:-->                                                                                    " +
            			"               <adin:DataRow>                                                                                      " +
            			"                  <adin:field column=\"C_BPartner_ID\">                                                            " +
            			"                     <adin:val>"+ord.getBusinessPartner().getId()+"</adin:val>                                     " +
            			"                  </adin:field>                                                                                    " +
            			"                  <adin:field column=\"DocumentNo\">                                                               " +
            			"                     <adin:val>"+ord.getOrderId().getDocumentNo()+"</adin:val>                                     " +
            			"                  </adin:field>                                                                                    " +
            			"                  <adin:field column=\"C_DocTypeTarget_ID\">                                                       " +
            			"                     <adin:val>"+orderDocType+"</adin:val>                                                         " +
            			"                  </adin:field>                                                                                    " +
            			"               </adin:DataRow>                                                                                     " +
            			"            </adin:ModelCRUD>                                                                                      " +
            			"            <adin:ADLoginRequest>                                                                                  " +
            			"               <adin:user>"+username+"</adin:user>                                                                 " +
            			"               <adin:pass>"+password+"</adin:pass>                                                                 " +
            			"               <adin:lang>"+lang+"</adin:lang>                                                                     " +
            			"               <adin:ClientID>"+clientID+"</adin:ClientID>                                                         " +
            			"               <adin:RoleID>"+role+"</adin:RoleID>                                                                 " +
            			"               <adin:OrgID>"+organizationId+"</adin:OrgID>                                                         " +
            			"               <adin:WarehouseID>"+wh+"</adin:WarehouseID>                                                         " +
            			"               <adin:stage>"+stage+"</adin:stage>                                                                  " +
            			"            </adin:ADLoginRequest>                                                                                 " +
            			"         </adin:ModelCRUDRequest>                                                                                  " +
            			"      </adin:createData>                                                                                           " +
            			"   </soapenv:Body>                                                                                                 " +
            			"</soapenv:Envelope>	                                                                                            ";

            java.net.URL url = new java.net.URL(urlstring+"ModelADService");
            URLConnection conn = url.openConnection();
            //((HttpsURLConnection) conn).setSSLSocketFactory(sslSocketFactory);
            
            // Set the necessary header fields
            conn.setRequestProperty("SOAPAction", urlstring+"ModelADService");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
            conn.setDoOutput(true);
            
            // Send the request
            java.io.OutputStreamWriter wr = new java.io.OutputStreamWriter(conn.getOutputStream());
            wr.write(soapXml);
            wr.flush();
            
            // Read the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String xmlString = "";
            while ((line = rd.readLine()) != null) {
                //System.out.println(line);
            	xmlString += line;
            }
            //parse(xmlString);
            
            //parse
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xmlString));

            Document doc = db.parse(is);
            NodeList count = doc.getElementsByTagName("StandardResponse");
            Element elementCount = (Element) count.item(0);
            recordId = Integer.parseInt(elementCount.getAttributeNode("RecordID").getNodeValue());
		}catch(Exception e){
			return 0;
		}
		return recordId;
	}
	
	private int uploadOrderLine(OrderLine ordLine, int orderID, java.lang.String clientID, 
			java.lang.String organizationId, java.lang.String username,
			java.lang.String password, java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String urlstring, 
			java.lang.String orderDocType){
		int recordId = 0;
		try{
            String soapXml = 
            		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:adin=\"http://3e.pl/ADInterface\"> " +
            				"   <soapenv:Header/>                                                                                                   " +
            				"   <soapenv:Body>                                                                                                      " +
            				"      <adin:createData>                                                                                                " +
            				"         <adin:ModelCRUDRequest>                                                                                       " +
            				"            <adin:ModelCRUD>                                                                                           " +
            				"               <adin:serviceType>CreateOrderLine</adin:serviceType>                                                    " +
            				"               <adin:TableName>C_OrderLine</adin:TableName>                                                            " +
            				"               <adin:RecordID>0</adin:RecordID>                                                                        " +
            				"               <adin:Action>Create</adin:Action>                                                                       " +
            				"               <!--Optional:-->                                                                                        " +
            				"               <adin:DataRow>                                                                                          " +
            				"				  <adin:field column=\"C_Order_ID\">                                                                    " +
            				"                     <adin:val>"+orderID+"</adin:val>                                                                      " +
            				"                  </adin:field>                                                                                        " +
            				"                  <adin:field column=\"M_Product_ID\">                                                                 " +
            				"                     <adin:val>"+ordLine.getProductId()+"</adin:val>                                                                          " +
            				"                  </adin:field>                                                                                        " +
            				"                  <adin:field column=\"C_Tax_ID\">                                                                     " +
            				"                     <adin:val>"+ordLine.getTaxId()+"</adin:val>                                                                          " +
            				"                  </adin:field>                                                                                        " +
            				"                  <adin:field column=\"PriceEntered\">                                                                 " +
            				"                     <adin:val>"+ordLine.getPrice()+"</adin:val>                                                                           " +
            				"                  </adin:field>                                                                                        " +
            				"                  <adin:field column=\"QtyOrdered\">                                                                   " +
            				"                     <adin:val>"+ordLine.getUnits()+"</adin:val>                                                                            " +
            				"                  </adin:field>                                                                                        " +
            				"                  <adin:field column=\"QtyEntered\">                                                                   " +
            				"                     <adin:val>"+ordLine.getUnits()+"</adin:val>                                                                            " +
            				"                  </adin:field>                                                                                        " +
            				"               </adin:DataRow>                                                                                         " +
            				"            </adin:ModelCRUD>                                                                                          " +
            				"            <adin:ADLoginRequest>                                                                                      " +
            				"               <adin:user>"+username+"</adin:user>                                                                       " +
            				"               <adin:pass>"+password+"</adin:pass>                                                                       " +
            				"               <adin:lang>"+lang+"</adin:lang>                                                                              " +
            				"               <adin:ClientID>"+clientID+"</adin:ClientID>                                                                       " +
            				"               <adin:RoleID>"+role+"</adin:RoleID>                                                                          " +
            				"               <adin:OrgID>"+organizationId+"</adin:OrgID>                                                                             " +
            				"               <adin:WarehouseID>"+wh+"</adin:WarehouseID>                                                                " +
            				"               <adin:stage>"+stage+"</adin:stage>                                                                              " +
            				"            </adin:ADLoginRequest>                                                                                     " +
            				"         </adin:ModelCRUDRequest>                                                                                      " +
            				"      </adin:createData>                                                                                               " +
            				"   </soapenv:Body>                                                                                                     " +
            				"</soapenv:Envelope>                                                                                                    " ;

            java.net.URL url = new java.net.URL(urlstring+"ModelADService");
            URLConnection conn = url.openConnection();
            //((HttpsURLConnection) conn).setSSLSocketFactory(sslSocketFactory);
            
            // Set the necessary header fields
            conn.setRequestProperty("SOAPAction", urlstring+"ModelADService");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
            conn.setDoOutput(true);
            
            // Send the request
            java.io.OutputStreamWriter wr = new java.io.OutputStreamWriter(conn.getOutputStream());
            wr.write(soapXml);
            wr.flush();
            
            // Read the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String xmlString = "";
            while ((line = rd.readLine()) != null) {
                //System.out.println(line);
            	xmlString += line;
            }
            //parse(xmlString);
            
            //parse
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xmlString));

            Document doc = db.parse(is);
            NodeList count = doc.getElementsByTagName("StandardResponse");
            Element elementCount = (Element) count.item(0);
            recordId = Integer.parseInt(elementCount.getAttributeNode("RecordID").getNodeValue());
		}catch(Exception e){
			return 0;
		}
		return recordId;
	}

	public com.openbravo.ws.externalsales.Order[] getOrders(
			java.lang.String clientID, java.lang.String organizationId,
			com.openbravo.ws.externalsales.OrderIdentifier[] orderIds,
			java.lang.String username, java.lang.String password)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://externalSales.ws.erpCommon.openbravo.org", "getOrders"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientID, organizationId, orderIds, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.externalsales.Order[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.externalsales.Order[]) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.openbravo.ws.externalsales.Order[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
