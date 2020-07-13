package com.example.demopaginationspring.repository;

import com.example.demopaginationspring.model.Employees;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employees, Long> {
}
