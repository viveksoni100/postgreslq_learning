package com.example.postgresql.repository;

import com.example.postgresql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author viveksoni100
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
