package com.example.businessdelegate;

public class BusinessDelegate {
	private BusinessService businessService;
	private BusinessLookup businessLookup = new BusinessLookup();
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = businessLookup.getBusinessService(serviceType);
		businessService.doProcessing();
	}

}
