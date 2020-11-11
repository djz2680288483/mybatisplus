package com.djz.service.impl;

import com.alibaba.excel.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.djz.mapper.SaleOrderMapper;
import com.djz.pojo.SaleOrder;
import com.djz.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 销售单 Service层
 * @author djz
 * */
@Service
public class SaleOrderServiceImpl implements SaleOrderService {
    @Autowired
    private SaleOrderMapper mapper;

    @Override
    public SaleOrder getSaleOrderById(SaleOrder saleOrder) {
        QueryWrapper<SaleOrder>  query=new QueryWrapper<>();
        if(!StringUtils.isEmpty(saleOrder.getId())){
            query.eq("id",saleOrder.getId());
        }
        if(!StringUtils.isEmpty(saleOrder.getSaleNo())){
            query.eq("saleno",saleOrder.getSaleNo());
        }
        if(!StringUtils.isEmpty(saleOrder.getBillStyle())){
            query.eq("bill_style",saleOrder.getBillStyle());
        }
        SaleOrder one= mapper.selectOne(query);
        return one;
    }

    @Override
    public List<SaleOrder> listSaleOrders(SaleOrder saleOrder) {
        QueryWrapper<SaleOrder>  query=new QueryWrapper<>();
        if(!StringUtils.isEmpty(saleOrder.getId())){
            query.eq("id",saleOrder.getId());
        }
        if(!StringUtils.isEmpty(saleOrder.getSaleNo())){
            query.eq("saleno",saleOrder.getSaleNo());
        }
        if(!StringUtils.isEmpty(saleOrder.getBillStyle())){
            query.eq("bill_style",saleOrder.getBillStyle());
        }
        List<SaleOrder> list= mapper.selectList(query);
        return list;
    }


}
