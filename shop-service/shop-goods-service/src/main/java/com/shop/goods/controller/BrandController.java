package com.shop.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.goods.model.Brand;
import com.shop.goods.service.BrandService;
import com.shop.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌业务控制层
 *
 * @author marxbo
 * @version 1.0
 * @date 2021/1/10 10:41
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /***
     * 增加品牌
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        // 增加品牌
        brandService.save(brand);
        return RespResult.ok();
    }

    /****
     * 修改
     */
    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        //修改品牌
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /****
     * 删除品牌
     */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") Integer id){
        //删除品牌
        brandService.removeById(id);
        return RespResult.ok();
    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/list")
    public RespResult<List<Brand>> list(@RequestBody(required = false) Brand brand){
        // 查询
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    /****
     * 条件分页查询
     */
    @PostMapping(value = "/list/{page}/{size}")
    public RespResult<Page<Brand>> list(
            @PathVariable(value = "page") Long currentPage,
            @PathVariable(value = "size") Long size,
            @RequestBody(required = false) Brand brand){
        // 分页查询
        Page<Brand> brandPage = brandService.queryPageList(currentPage,size,brand);
        return RespResult.ok(brandPage);
    }

}
