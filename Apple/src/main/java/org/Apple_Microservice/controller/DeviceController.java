package org.Apple_Microservice.controller;

import java.util.List;

import org.Apple_Microservice.entity.Devices;
import org.Apple_Microservice.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController 
{
	@Autowired
	DeviceService service;
	
	@RequestMapping(value = "/devices", method = RequestMethod.GET)
	public List<Devices> getDevices()
	{
		return service.getDevices();
	}

}
