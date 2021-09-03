package com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户
 */
@Entity(name = "shop_user") //实体类跟数据表的对应关系
@Data  //lombok
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id  //表示主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键生成策略
    private Integer id;
    private String username;
    private String password;
    private String telephone;
}
