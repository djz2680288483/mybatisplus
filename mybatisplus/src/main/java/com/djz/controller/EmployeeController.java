package com.djz.controller;

import com.djz.pojo.Employee;
import com.djz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/12 -15:21
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/list")
    public List<Employee> getlist(@ApiIgnore @RequestBody Employee emp){

        return service.listEmps(emp);
    }

    @PostMapping("/one")
    public Employee getOne(@ApiIgnore @RequestBody Employee emp){

        return service.getOnebById(emp);
    }

}
