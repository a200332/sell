package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 注：jpa会通过解析方法名来生成相应的sql语句，只要符合规范，基本不会报错.
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
