package org.Apple_Microservice.services;

import java.util.ArrayList;
import java.util.List;

import org.Apple_Microservice.entity.Devices;
import org.springframework.stereotype.Service;

@Service
public class DeviceService 
{
	public List<Devices> getDevices() 
	{
		List<Devices> devices = new ArrayList<>();
		devices.add(new Devices(1, "IphoneX", "SmartPhone"));
		devices.add(new Devices(2 ,"MacBookpro" , "NoteBook"));
		devices.add(new Devices(3 ,"Ipod" , "MusicDevice"));
		return devices;
	}
	

}
