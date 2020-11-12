package com.djz.service;

import com.djz.pojo.Employee;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/12 -15:23
 */
public interface EmployeeService {
    List<Employee> listEmps(Employee emp);
    Employee getOnebById(Employee employee);

}
