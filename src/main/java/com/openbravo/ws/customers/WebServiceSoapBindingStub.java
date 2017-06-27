/**
 * WebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.openbravo.ws.customers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.openbravo.ws.externalsales.Category;
import com.openbravo.ws.externalsales.Product;
import com.openbravo.ws.externalsales.Tax;

public class WebServiceSoapBindingStub extends org.apache.axis.client.Stub
		implements com.openbravo.ws.customers.WebServiceImpl {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[9];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomers");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "clientId"),
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
				"http://localhost:8180/openbravo/services/WebService",
				"ArrayOf_tns1_Customer"));
		oper.setReturnClass(com.openbravo.ws.customers.Customer[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getCustomersReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomer");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "clientId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "customerId"),
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
				"/services/WebService", "Customer"));
		oper.setReturnClass(com.openbravo.ws.customers.Customer.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getCustomerReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomer");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "clientId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "searchKey"),
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
				"/services/WebService", "Customer"));
		oper.setReturnClass(com.openbravo.ws.customers.Customer.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getCustomerReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateCustomer");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "customer"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("/services/WebService",
						"BusinessPartner"),
				com.openbravo.ws.customers.BusinessPartner.class, false, false);
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
				"updateCustomerReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomerAddresses");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "clientId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "customerId"),
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
				"http://localhost:8180/openbravo/services/WebService",
				"ArrayOf_xsd_int"));
		oper.setReturnClass(int[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getCustomerAddressesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomerLocation");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "clientId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "customerId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "locationId"),
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
				"/services/WebService", "Location"));
		oper.setReturnClass(com.openbravo.ws.customers.Location.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getCustomerLocationReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateAddress");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "addr"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("/services/WebService",
						"Location"), com.openbravo.ws.customers.Location.class,
				false, false);
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
				"updateAddressReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomerContact");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "clientId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "customerId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "contactId"),
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
				"/services/WebService", "Contact"));
		oper.setReturnClass(com.openbravo.ws.customers.Contact.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"getCustomerContactReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateContact");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "contact"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("/services/WebService", "Contact"),
				com.openbravo.ws.customers.Contact.class, false, false);
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
				"updateContactReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[8] = oper;

	}

	public WebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public WebServiceSoapBindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public WebServiceSoapBindingStub(javax.xml.rpc.Service service)
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
		qName = new javax.xml.namespace.QName("/services/WebService",
				"BusinessPartner");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.BusinessPartner.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/WebService", "Contact");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.Contact.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/WebService",
				"Customer");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.Customer.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("/services/WebService",
				"Location");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.Location.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/WebService",
				"ArrayOf_tns1_Contact");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.Contact[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/WebService", "Contact");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/WebService",
				"ArrayOf_tns1_Customer");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.Customer[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/WebService",
				"Customer");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/WebService",
				"ArrayOf_tns1_Location");
		cachedSerQNames.add(qName);
		cls = com.openbravo.ws.customers.Location[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("/services/WebService",
				"Location");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://localhost:8180/openbravo/services/WebService",
				"ArrayOf_xsd_int");
		cachedSerQNames.add(qName);
		cls = int[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int");
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

	public com.openbravo.ws.customers.Customer[] getCustomers(
			java.lang.String clientId, java.lang.String username,
			java.lang.String password, java.lang.String organizationId, 
			java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String urlstring) throws java.rmi.RemoteException {
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
				"http://services.ws.erpCommon.openbravo.org", "getCustomers"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientId, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.customers.Customer[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.customers.Customer[]) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.openbravo.ws.customers.Customer[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}*/
		int startRow = 1;
		int endRow = 1000;
		
		Customer[] ret = null;
		Customer[] firstStep = null;
		Customer[] secondStep = null;
		firstStep  = getCustomersWs(clientId, organizationId, username, password, lang, wh, stage, role, urlstring, String.valueOf(startRow), String.valueOf(endRow));
		
		startRow = startRow+1000;
		endRow = endRow+1000;
		secondStep = getCustomersWs(clientId, organizationId, username, password, lang, wh, stage, role, urlstring, String.valueOf(startRow), String.valueOf(endRow));
		
		if (secondStep.length != 0) ret = joinArrayGeneric(firstStep, secondStep);
		while (secondStep.length != 0){
			startRow = startRow+1000;
			endRow = endRow+1000;
			secondStep = getCustomersWs(clientId, organizationId, username, password, lang, wh, stage, role, urlstring, String.valueOf(startRow), String.valueOf(endRow));
			if (secondStep.length != 0) ret = joinArrayGeneric(firstStep, secondStep);
			if (startRow > 10000) break;
		}
		if (secondStep.length != 0) ret = joinArrayGeneric(firstStep, secondStep);
		return ret;
	}
	
	private <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

	com.openbravo.ws.customers.Customer[] getCustomersWs(
			java.lang.String clientID, java.lang.String organizationId,
			java.lang.String username,
			java.lang.String password, java.lang.String lang,
			java.lang.String wh, java.lang.String stage,
			java.lang.String role, java.lang.String urlstring, java.lang.String startRow, java.lang.String endRow) {
		Customer[] customers = null;
		Location[] locations = new Location[1];
		Contact[] contacts = new Contact[1];
		Customer customer = null;
		Contact contact = null;
		Location location = null;
		int arrSize = 0;
        try {

            String soapXml = 
            		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:adin=\"http://3e.pl/ADInterface\"> "+
					"   <soapenv:Header/> "+
					"   <soapenv:Body> "+
					"      <adin:queryData>"+
					"         <adin:ModelCRUDRequest>"+
					"            <adin:ModelCRUD>"+
					"               <adin:serviceType>QueryBPartner</adin:serviceType>"+
					"               <adin:TableName>C_BPARTNER_WS_VT</adin:TableName>"+
					"               <adin:RecordID>0</adin:RecordID>"+
					"               <adin:Action>Read</adin:Action>"+
					"               <adin:Filter>C_BPARTNER_WS_VT_ID BETWEEN #start AND #end</adin:Filter>"+
					"               <!--Optional:-->"+
					"               <adin:DataRow>"+
					"                  <!--Zero or more repetitions:-->"+
					"                  <adin:field column=\"AD_Client_ID\">"+
					"                     <adin:val>"+clientID+"</adin:val>"+
					"                  </adin:field>"+
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
            
            soapXml = soapXml.replace("#start", startRow).replace("#end", endRow);
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
            arrSize = Integer.parseInt(elementCount.getAttributeNode("TotalRows").getNodeValue());
            customers = new Customer[arrSize];
            
            for (int i = 0; i < nodes.getLength(); i++) {
                Element element = (Element) nodes.item(i);

                NodeList name = element.getElementsByTagName("field");
                
                customer = new Customer();
                location = new Location();
                contact = new Contact();
                
                for (int j=0;j<name.getLength();j++){
                    Element lines = (Element) name.item(j);
             
                    Node column = lines.getAttributeNode("column");
                    Node value = lines.getAttributeNode("lval");
                    
                    //general
                    if ("C_BPartner_ID".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setId(value.getNodeValue());
                    	contact.setBusinessPartnerId(value.getNodeValue());
                    	location.setBusinessPartnerId(value.getNodeValue());
                    }
                    if ("AD_Client_ID".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setClientId(column.getNodeValue());
                    	contact.setClientId(value.getNodeValue());
                    	location.setClientId(value.getNodeValue());
                    }                    
                    //location
                    if ("Address1".equalsIgnoreCase(column.getNodeValue())){
                    	location.setAddress1(value.getNodeValue());	
                    }   
                    if ("Address2".equalsIgnoreCase(column.getNodeValue())){
                    	location.setAddress2(value.getNodeValue());	
                    }    
                    if ("City".equalsIgnoreCase(column.getNodeValue())){
                    	location.setCity(value.getNodeValue());	
                    }                     
                    if ("COUNTRY".equalsIgnoreCase(column.getNodeValue())){
                    	location.setCountry(value.getNodeValue());	
                    }
                    if ("Postal".equalsIgnoreCase(column.getNodeValue())){
                    	location.setPostal(value.getNodeValue());	
                    }
                    if ("RegionName".equalsIgnoreCase(column.getNodeValue())){
                    	location.setRegion(value.getNodeValue());	
                    }
                    if ("C_Location_ID".equalsIgnoreCase(column.getNodeValue())){
                    	location.setId(value.getNodeValue());	
                    }
                    //contact
                    if ("EMail".equalsIgnoreCase(column.getNodeValue())){
                    	contact.setEmail(value.getNodeValue());	
                    }
                    if ("Fax".equalsIgnoreCase(column.getNodeValue())){
                    	contact.setFax(value.getNodeValue());	
                    }
                    if ("FirstName".equalsIgnoreCase(column.getNodeValue())){
                    	contact.setFirstName(value.getNodeValue());	
                    	contact.setLastName("");
                    }
                    if ("Phone".equalsIgnoreCase(column.getNodeValue())){
                    	contact.setPhone(value.getNodeValue());	
                    }
                    if ("Phone2".equalsIgnoreCase(column.getNodeValue())){
                    	contact.setPhone2(value.getNodeValue());	
                    }
                    if ("AD_User_ID".equalsIgnoreCase(column.getNodeValue())){
                    	contact.setId(value.getNodeValue());	
                    }
                    //customer
                    if ("COMPLETE".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setComplete(Boolean.valueOf(value.getNodeValue()));
                    }
                    if ("IsCustomer".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setCustomer(Boolean.valueOf(value.getNodeValue()));
                    }
                    if ("Description".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setDescription(value.getNodeValue());	
                    }
                    if ("Name".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setName(value.getNodeValue());	
                    }
                    if ("Value".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setSearchKey(value.getNodeValue());	
                    }
                    if ("IsVendor".equalsIgnoreCase(column.getNodeValue())){
                    	customer.setVendor(Boolean.valueOf(value.getNodeValue()));	
                    }
                    locations[0] = location;
                    contacts[0] = contact;
                    customer.setLocations(locations);
                    customer.setContacts(contacts);
                }
                //System.out.println("-------------------");
                customers[i] = customer;
             }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /*
        if (arrSize != 0){
        	Customer[] toBeMerged = getCustomersWs(clientID, organizationId, username, password, lang, wh, stage, role, urlstring, String.valueOf(Integer.parseInt(endRow)+1), String.valueOf(Integer.parseInt(endRow)+1000));
        	List list = new ArrayList(Arrays.asList(customers));
        	list.addAll(Arrays.asList(toBeMerged));
        	customers = (Customer[]) list.toArray();
        }
        */
        return customers;
    }
	
	public com.openbravo.ws.customers.Customer getCustomer(
			java.lang.String clientId, java.lang.String customerId,
			java.lang.String username, java.lang.String password)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org", "getCustomer"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientId, customerId, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.customers.Customer) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.customers.Customer) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.openbravo.ws.customers.Customer.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.openbravo.ws.customers.Customer getCustomer(
			java.lang.String clientId, java.lang.String name,
			java.lang.String searchKey, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org", "getCustomer"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientId, name, searchKey, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.customers.Customer) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.customers.Customer) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.openbravo.ws.customers.Customer.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public boolean updateCustomer(
			com.openbravo.ws.customers.BusinessPartner customer,
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
				"http://services.ws.erpCommon.openbravo.org", "updateCustomer"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					customer, username, password });

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
	}

	public int[] getCustomerAddresses(java.lang.String clientId,
			java.lang.String customerId, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org",
				"getCustomerAddresses"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientId, customerId, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (int[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (int[]) org.apache.axis.utils.JavaUtils.convert(
							_resp, int[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.openbravo.ws.customers.Location getCustomerLocation(
			java.lang.String clientId, java.lang.String customerId,
			java.lang.String locationId, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org",
				"getCustomerLocation"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientId, customerId, locationId, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.customers.Location) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.customers.Location) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.openbravo.ws.customers.Location.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public boolean updateAddress(com.openbravo.ws.customers.Location addr,
			java.lang.String username, java.lang.String password)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org", "updateAddress"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					addr, username, password });

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
	}

	public com.openbravo.ws.customers.Contact getCustomerContact(
			java.lang.String clientId, java.lang.String customerId,
			java.lang.String contactId, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org",
				"getCustomerContact"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					clientId, customerId, contactId, username, password });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.openbravo.ws.customers.Contact) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.openbravo.ws.customers.Contact) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.openbravo.ws.customers.Contact.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public boolean updateContact(com.openbravo.ws.customers.Contact contact,
			java.lang.String username, java.lang.String password)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://services.ws.erpCommon.openbravo.org", "updateContact"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					contact, username, password });

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
	}

}
