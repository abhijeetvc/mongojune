package com.junemongodbdemo.mongojune.controller;

import com.junemongodbdemo.mongojune.model.Employee;
import com.junemongodbdemo.mongojune.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveData(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Data saved";
    }
}
