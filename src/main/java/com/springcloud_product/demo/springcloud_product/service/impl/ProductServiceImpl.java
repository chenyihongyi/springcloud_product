package com.springcloud_product.demo.springcloud_product.service.impl;

import com.springcloud_product.demo.springcloud_product.domain.Product;
import com.springcloud_product.demo.springcloud_product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/2/14 4:08
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> daoMap = new HashMap<>();

    private final Logger logger = LoggerFactory.getLogger(getClass());

    static {
        Product p1 = new Product(1, "iphonex", 9999, 10);
        Product p2 = new Product(2, "冰箱", 5342, 20);
        Product p3 = new Product(3, "洗衣机", 1200, 90);
        Product p4 = new Product(4, "电话", 120, 150);
        Product p5 = new Product(5, "汽车", 98000, 140);
        Product p6 = new Product(6, "椅子", 250, 20);
        Product p7 = new Product(7,"笔记本电脑", 7999, 10);

        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);
        daoMap.put(p7.getId(),p7);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {
        logger.info("service findById");
        return daoMap.get(id);
    }
}
