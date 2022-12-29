package com.ust.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
