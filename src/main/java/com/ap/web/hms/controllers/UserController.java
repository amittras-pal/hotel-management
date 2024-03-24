package com.ap.web.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.web.hms.entities.Employee;
import com.ap.web.hms.entities.Guest;
import com.ap.web.hms.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    @GetMapping("employee")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping("guest")
    public Guest createGuest(@RequestBody Guest guest) {
        return service.addGuest(guest);
    }

    @GetMapping("guest")
    public Guest getGuestByPhoneNumber(@RequestParam String mobileNumber) {
        return service.findGuestByPhoneNumber(mobileNumber);
    }

}
