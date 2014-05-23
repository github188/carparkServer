package com.dongluhitec.card.model;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;

public class CarparkSetting implements Serializable{
	private static final long serialVersionUID = 1268792761972568870L;
	
	private String ip;
	private String port;
	
	private List<Device> deviceList = Lists.newArrayList();

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}
	
}
