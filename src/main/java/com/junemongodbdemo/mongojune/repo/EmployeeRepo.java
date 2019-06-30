package com.junemongodbdemo.mongojune.repo;

import com.junemongodbdemo.mongojune.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
