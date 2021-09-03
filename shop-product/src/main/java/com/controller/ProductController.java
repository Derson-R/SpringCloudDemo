package com.controller;

import com.domain.Product;
import com.service.ProductService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j  //这两个日志类都是lombok包下面的

public class ProductController {
    //商品信息查询

    @Autowired
    private ProductService productService;

    //private Logger log;

    @RequestMapping("/product/{pid}")
    public Product getProduct(@PathVariable("pid") Integer pid){
        log.info("商品查询开始");
        Product product = productService.getProduct(pid);
        product = new Product(1,"鞋子",265d,10);
        log.info("商品查询结束");
        return product;

    }


}
