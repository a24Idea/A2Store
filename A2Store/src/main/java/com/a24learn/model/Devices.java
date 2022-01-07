package com.a24learn.model;

import java.util.List;

public class Devices {
    List<Device> devices;
    String brandName = "Samsung";

    public Devices(List<Device> devices) {
        this.devices = devices;
    }

    public Devices() {
    }

    public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "devices=" + devices +
                '}';
    }
}

