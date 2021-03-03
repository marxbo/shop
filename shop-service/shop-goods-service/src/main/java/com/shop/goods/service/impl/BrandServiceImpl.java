package com.shop.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.goods.mapper.BrandMapper;
import com.shop.goods.model.Brand;
import com.shop.goods.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 品牌Service实现类
 *
 * @author marxbo
 * @version 1.0
 * @date 2021/1/10 10:37
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /****
     * 条件查询
     */
    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(brand.getName())) {
            queryWrapper.like("name", brand.getName());
        }
        if (StringUtils.isNotBlank(brand.getInitial())) {
            queryWrapper.like("initial", brand.getName());
        }
        return brandMapper.selectList(queryWrapper);
    }

    /****
     * 条件分页查询
     */
    @Override
    public Page<Brand> queryPageList(Long currentPage, Long size, Brand brand) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(brand.getName())) {
            queryWrapper.like("name", brand.getName());
        }
        Page<Brand> page = brandMapper.selectPage(
                new Page<Brand>(currentPage, size),
                queryWrapper);
        return page;
    }
}
