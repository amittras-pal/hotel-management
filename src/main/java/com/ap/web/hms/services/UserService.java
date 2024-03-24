package com.ap.web.hms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.web.hms.entities.Employee;
import com.ap.web.hms.entities.Guest;
import com.ap.web.hms.repositories.EmployeeRepository;
import com.ap.web.hms.repositories.GuestRepository;

@Service
public class UserService {
    @Autowired
    EmployeeRepository employeeRepo;
    @Autowired
    GuestRepository guestRepo;

    UserService() {
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Guest addGuest(Guest guest) {
        return guestRepo.save(guest);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Guest findGuestByPhoneNumber(String phoneNumber) {
        return guestRepo.findByPhoneNumber(phoneNumber).orElseThrow();
    }
}
