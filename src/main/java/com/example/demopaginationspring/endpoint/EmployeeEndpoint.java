package com.example.demopaginationspring.endpoint;

import com.example.demopaginationspring.model.Employees;
import com.example.demopaginationspring.repository.EmployeeRepository;
import com.example.demopaginationspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeEndpoint {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employees>> getAllEmployees(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy
    ){
        List<Employees> theEmployees = employeeService.getAllEmployees(pageNo,pageSize,sortBy);
        return new ResponseEntity<List<Employees>>(theEmployees,new HttpHeaders(), HttpStatus.OK);
    }
}
