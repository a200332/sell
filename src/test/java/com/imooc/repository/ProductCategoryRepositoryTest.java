package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    /**
     * 查询单个操作
     */
    @Test
    public void findOneTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(1);
        Example<ProductCategory> example = Example.of(productCategory);
        ProductCategory productCategory1 = repository.findOne(example).get();
        System.out.println(productCategory1);
    }

    /**
     * 插入操作
     */
    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("我最爱");
        productCategory.setCategoryType(110);
        repository.save(productCategory);
        System.out.println("插入数据成功");
    }

    /**
     * 插入操作
     */
    @Test
    @Transactional //在测试里面可以直接回滚
    public void saveTest1() {
        ProductCategory productCategory = new ProductCategory("啦啦啦", 19);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        System.out.println("插入数据成功");
    }

    /**
     * 更新操作
     */
    @Test
    public void updateTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(3);
        Example<ProductCategory> example = Example.of(productCategory);
        ProductCategory productCategory1 = repository.findOne(example).get();
        productCategory1.setCategoryType(3);
        repository.save(productCategory1);
        System.out.println("更新数据成功");
    }

    /**
     * 查看类目类为2、3、4的总共有多少
     */
    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}