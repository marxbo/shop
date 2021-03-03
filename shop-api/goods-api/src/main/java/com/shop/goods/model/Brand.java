package com.shop.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 品牌
 *
 * @author marxbo
 * @version 1.0
 * @date 2021/1/9 12:50
 */
@Data // 生成 Get、Set、ToString、hashCode、equals
//@Getter 生成 Get 方法
// @Setter 生成 Set 方法
@NoArgsConstructor // 无参构造方法
@AllArgsConstructor // 所有参数构造方法
// chain: setter方法是否返回当前对象this（true-是false-否）
// fluent：getter和setter方法名为属性名，setter方法返回当前对象this
@Accessors(chain = true, fluent = false)
@Builder // 可使用 类.builer() 创建新对象(建造者模式)
@TableName(value = "brand")
public class Brand {

    /** 主键 */
    @TableId(type = IdType.AUTO)
    private String id;
    /** 品牌名字 */
    private String name;
    /** 品牌图片 */
    private String image;
    /** 品牌首字母 */
    private String initial;
    /** 排序 */
    private String sort;

}
