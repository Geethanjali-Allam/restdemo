package com.example.restdemo.service;
import com.example.restdemo.model.cloudVendor;

import java.util.List;

public interface cloudVendorService {
    public String createCloudVendor(cloudVendor CloudVendor);
    public String updateCloudVendor(cloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public cloudVendor getCloudVendor(String cloudVendorId);
    public List<cloudVendor> getAllCloudvendors();

}
