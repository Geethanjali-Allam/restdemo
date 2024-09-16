package com.example.restdemo.service.impl;

import com.example.restdemo.model.cloudVendor;
import com.example.restdemo.repository.CloudVendorRepository;
import com.example.restdemo.service.cloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceimpl implements cloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(cloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(cloudVendor cloudVendor) {
       cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted Successfully";
    }

    @Override
    public cloudVendor getCloudVendor(String cloudVendorId) {

        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<cloudVendor> getAllCloudvendors() {
        return cloudVendorRepository.findAll();
    }
}
