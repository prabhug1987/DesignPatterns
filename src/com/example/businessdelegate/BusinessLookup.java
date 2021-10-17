package com.example.businessdelegate;

public class BusinessLookup {

	public BusinessService getBusinessService(String serviceType) {
		if(serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		}else {
			return new JMSService();
		}
	}
}
