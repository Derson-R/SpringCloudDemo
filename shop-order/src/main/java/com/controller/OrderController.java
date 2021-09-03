package com.controller;

import com.domain.Order;
import com.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/order/{oid}")
    public Order getOrder(@PathVariable("oid") Integer oid){
        log.info("订单查询查询开始");
        Order order = new Order(1l,1,"张三",302,"鞋子",365d,10);
        log.info("订单查询结束");
        return order;

    }

    //下单需求
    @RequestMapping("/order/prod/{pid}")
    public Product createOrder(@PathVariable("pid") Integer pid){
        log.info("下单开始，调用产品服务开始");

        //1、服务提供者的地址发生了变化，不得不修改消费者代码中的地址；
        //2、服务方集群部署情况下，调用方无法实现负载均衡来调用服务方；
        //3、一旦微服务越来越多，服务清单管理也是个问题
        Product product = restTemplate.getForObject("http://localhost:8081/product/2", Product.class);
        log.info("下单结束，调用产品服务结束");
        return product;

    }
}
