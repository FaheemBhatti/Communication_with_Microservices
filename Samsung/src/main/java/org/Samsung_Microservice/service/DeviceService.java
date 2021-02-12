package org.Samsung_Microservice.service;

import java.util.ArrayList;
import java.util.List;
import org.Samsung_Microservice.entity.Devices;
import org.springframework.stereotype.Service;

@Service
public class DeviceService 
{
	public List<Devices> getDevices() 
	{
		List<Devices> devices = new ArrayList<>();
		devices.add(new Devices(1, "Note8", "SmartPhone"));
		devices.add(new Devices(2 ,"S10" , "SmartPhone"));
		devices.add(new Devices(3 ,"Fold2" , "SmartPhone"));
		return devices;
	}
}
