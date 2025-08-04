package com.sbdeploy.spring_boot_deploy.repo;

import com.sbdeploy.spring_boot_deploy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
