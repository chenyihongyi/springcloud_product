package com.springcloud_product.demo.springcloud_product.controller;

import java.util.concurrent.TimeUnit;
import com.springcloud_product.demo.springcloud_product.domain.Product;
import com.springcloud_product.demo.springcloud_product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/2/14 4:24
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    /**
     * 获取所有商品列表
     * @return
     */
    @RequestMapping("list")
    public Object list(){
        return productService.listProduct();
    }

    /**
     * 根据id查找商品详情
     * @param id
     * @return
     */
    @RequestMapping("find")
    public Object findById(@RequestParam("id") int id){

        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Product product = productService.findById(id);

        Product result = new Product();
        BeanUtils.copyProperties(product, result);
        result.setName(result.getName() + "data from port = "+port);
        return result;
    }

}
