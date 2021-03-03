package com.shop.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.goods.model.Brand;

import java.util.List;

/**
 * 品牌Service接口
 *
 * @author marxbo
 * @version 1.0
 * @date 2021/1/10 10:34
 */
public interface BrandService extends IService<Brand> {

    /****
     * 条件查询
     */
    List<Brand> queryList(Brand brand);

    /****
     * 条件分页查询
     */
    Page<Brand> queryPageList(Long currentPage, Long size, Brand brand);
}
