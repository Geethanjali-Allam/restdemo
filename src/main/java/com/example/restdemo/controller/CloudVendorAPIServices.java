package com.example.restdemo.controller;
import com.example.restdemo.model.cloudVendor;
import org.springframework.web.bind.annotation.*;
import com.example.restdemo.service.cloudVendorService;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")

public class CloudVendorAPIServices {
    public CloudVendorAPIServices(com.example.restdemo.service.cloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    cloudVendorService cloudVendorService;

    @GetMapping("/{vendorId}")
    public cloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        /*return new cloudVendor("c1","vendor1" ,
                                "Address1","Phone number1");*/
        return cloudVendorService.getCloudVendor(vendorId);
    }
    @GetMapping()
    public List<cloudVendor> getAllCloudVendorDetails() {

        return cloudVendorService.getAllCloudvendors();
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudVendor cloudVendor){
       cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor created Successfully";
    }
    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody cloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor Deleted Successfully";
    }
}



