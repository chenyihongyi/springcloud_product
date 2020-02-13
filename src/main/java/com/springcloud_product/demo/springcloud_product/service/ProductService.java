package com.springcloud_product.demo.springcloud_product.service;

import com.springcloud_product.demo.springcloud_product.domain.Product;

import java.util.List;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/2/14 4:06
 */
public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);
}
