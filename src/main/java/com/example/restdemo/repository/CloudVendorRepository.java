package com.example.restdemo.repository;

import com.example.restdemo.model.cloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<cloudVendor, String> {
}
