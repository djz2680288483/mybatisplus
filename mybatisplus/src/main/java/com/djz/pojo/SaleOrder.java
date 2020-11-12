package com.djz.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * @author djz
 * */
@Data
@TableName("sale_order")
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrder implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "销售单号")
    private String saleNo;

    @ApiModelProperty(value = "销售机构(编号)")
    private String saleInstiid;

    @ApiModelProperty(value = "出库机构")
    private String deliveryOrganization;

    @ApiModelProperty(value = "制单机构")
    private String instiId;

    @ApiModelProperty(value = "结算机构")
    private String accountOrganization;

    @ApiModelProperty(value = "审核机构编号")
    private String checkOrganizationId;

    @ApiModelProperty(value = "销售人员编号")
    private String saleUserId;

    @ApiModelProperty(value = "制单人")
    private String billUser;

    @ApiModelProperty(value = "销售日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date saleTime;

    @ApiModelProperty(value = "审核人")
    private String checkUser;

    @ApiModelProperty(value = "审核日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkTime;

    @ApiModelProperty(value = "状态")
    private int status;

    @ApiModelProperty(value = "总销售额")
    private BigDecimal totalSalePrice;

    @ApiModelProperty(value = "销售单价")
    private BigDecimal salePrice;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal totalSaleReturnPrice;

    @ApiModelProperty(value = "销售单收款额/用户实付金额")
    private BigDecimal paidAmount;

    @ApiModelProperty(value = "总税款")
    private BigDecimal totalTax;

    @ApiModelProperty(value = "销售数量")
    private Integer saleNumber;

    @ApiModelProperty(value = "总销售成本")
    private BigDecimal saleCost;

    @ApiModelProperty(value = "备注")
    private String notes;

    @ApiModelProperty(value = "结算方式/付款方式")
    private String  payType;
/**
 * 0，当时付货
 * 1，邮寄
 * 2，本地配送
 * 3，异地配送
 *
*/
    @ApiModelProperty(value = "送货方式")
    private String  transportStyle;

    /**
     * 0，先进先出
     * 1，指定进价出库
     * 2，指定批次出库
     */
    @ApiModelProperty(value = "出库方式")
    private String  deliveryStyle;

    @ApiModelProperty(value = "关联单号")
    private String  refSheetno;

    @ApiModelProperty(value = "最近更新日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "创建日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill =FieldFill.INSERT )
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private String  updateUser;

    @ApiModelProperty(value = "创建人")
    private String  createUser;

    @ApiModelProperty(value = "对账单号")
    private String  accountSheetno;

    /**
     * 0，未生成
     * 1，已生成
     */
    @ApiModelProperty(value = "是否生成营业缴款单")
    private String  businessBill;
    /**
     * 0，未生成
     * 1，已生成
     */
    @ApiModelProperty(value = "是否生成操作员缴款单")
    private String  operatorBill;
    /**
     * 0，未生成
     * 1，已生成
     * 2，不需要生成
     */
    @ApiModelProperty(value = "是否生成存行单")
    private String  saveBill;
    /**
     * 0，销售单
     * 1，退货单
     */
    @ApiModelProperty(value = "单据类型")
    private String  billStyle;
    /**
     * 0，销售型
     * 1，定制性
     */
    @ApiModelProperty(value = "销售类型")
    private String  saleStyle;

    @ApiModelProperty(value = "商品编号")
    private String  cargoNo;

    @ApiModelProperty(value = "商品名称")
    private String  cargoName;

    @ApiModelProperty(value = "商品规格")
    private String  cargoMat;

    @ApiModelProperty(value = "商品数量")
    private Integer cargoNumber;

    @ApiModelProperty(value = "进货单价")
    private BigDecimal purchasePrice;

    @ApiModelProperty(value = "打印机构")
    private String  printInstiid;

    @ApiModelProperty(value = "打印人")
    private String  printUser;

    @ApiModelProperty(value = "打印时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date  printTime;
}
