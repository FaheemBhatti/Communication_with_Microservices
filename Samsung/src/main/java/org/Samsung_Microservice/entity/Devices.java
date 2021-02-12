package org.Samsung_Microservice.entity;

public class Devices 
{
	private int deviceId;
	private String model;
	private String category;
	
	public Devices(int deviceId , String model, String category)
	{
		this.category = category;
		this.deviceId = deviceId;
		this.model = model;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
	public int getDeviceId() {
		return deviceId;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Devices [deviceId=" + deviceId + ", model=" + model + ", category=" + category + "]";
	}
	
	
	
}
