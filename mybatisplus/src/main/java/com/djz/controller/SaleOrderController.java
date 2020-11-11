package com.djz.controller;

import com.djz.pojo.SaleOrder;
import com.djz.service.SaleOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@RequestMapping("/saleorder")
public class SaleOrderController {

    @Autowired
    private SaleOrderService service;

    @PostMapping("/one")
    public SaleOrder getOne(@ApiIgnore @RequestBody SaleOrder saleOrder){

        return service.getSaleOrderById(saleOrder);
    }

    @PostMapping("/list")
    public List<SaleOrder> getlist(@ApiIgnore @RequestBody SaleOrder saleOrder){

        return service.listSaleOrders(saleOrder);
    }


}
