package com.laulee.sell.dao;

import com.laulee.sell.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategory;

    @Test
    public void findOneTest(){
        ProductCategory p = productCategory.findOne(1);
        System.out.println(p);
    }


}