package org.Samsung_Microservice.controller;

import java.util.List;

import org.Samsung_Microservice.entity.Devices;
import org.Samsung_Microservice.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController
{
	@Autowired
	private DeviceService service;
	
	@RequestMapping(value = "/devices", 
			method = RequestMethod.GET)
	public List<Devices> getDevices()
	{
		return service.getDevices();
	}
}
