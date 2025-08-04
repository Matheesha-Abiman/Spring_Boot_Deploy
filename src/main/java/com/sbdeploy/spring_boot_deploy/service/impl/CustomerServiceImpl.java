package com.sbdeploy.spring_boot_deploy.service.impl;

import com.sbdeploy.spring_boot_deploy.entity.Customer;
import com.sbdeploy.spring_boot_deploy.repo.CustomerRepo;
import com.sbdeploy.spring_boot_deploy.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    public Customer saveCustomer(Customer customer) {
        // Logic to save customer using customerRepo
        return customerRepo.save(customer);
    }
}
