package com.djz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.djz.pojo.SaleOrder;

import java.util.List;

public interface SaleOrderService {


    SaleOrder getSaleOrderById(SaleOrder saleOrder);

    List<SaleOrder> listSaleOrders(SaleOrder saleOrder);

}
