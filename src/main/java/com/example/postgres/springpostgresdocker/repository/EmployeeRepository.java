package com.example.postgres.springpostgresdocker.repository;

import com.example.postgres.springpostgresdocker.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
