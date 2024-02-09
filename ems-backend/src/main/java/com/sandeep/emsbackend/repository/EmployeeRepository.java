package com.sandeep.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.emsbackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
