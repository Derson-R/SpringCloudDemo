package com.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 商品
 */
@Entity(name = "shop_product") //实体类跟数据表的对应关系
@Data  //lombok
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id  //表示主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键生成策略
    private Integer pid;
    private String pname;
    private Double pprice;
    private Integer stock;  //库存

}

