package com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 订单
 */

@Entity(name = "shop_order") //实体类跟数据表的对应关系
@Data  //lombok
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id  //表示主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键生成策略
    private Long oid;  //订单id

    private Integer uid; //用户id
    private String username; //用户名


    private Integer pid; //商品id
    private String pname; //商品名称
    private Double pprice;  //商品价格

    private Integer number; //购买数量


}
