package com.djz.service.impl;

import com.alibaba.excel.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.djz.mapper.EmployeeMapper;
import com.djz.pojo.Employee;
import com.djz.pojo.SaleOrder;
import com.djz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/12 -15:25
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;

    @Override
    public List<Employee> listEmps(Employee emp) {
        QueryWrapper<Employee> query = new QueryWrapper<>();

        if (emp.getAge() != null) {
            query.eq("age", emp.getAge());
        }
        List<Employee> list = mapper.selectList(query);
        return list;
    }

    @Override
    public Employee getOnebById(Employee employee) {
        QueryWrapper<Employee> query = new QueryWrapper<>();

        if (employee.getId() != null) {
            Employee one = mapper.selectById(employee.getId());
            return one;
        }
       return null;

    }
}
