package com.chaocharliehuang.employeesjpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chaocharliehuang.employeesjpa.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
