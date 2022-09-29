package com.wenwen.tongdemall.product;

import com.wenwen.tongdemall.product.entity.BrandEntity;
import com.wenwen.tongdemall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {


        System.out.println(brandService.getById(1));
    }

}
