package com.gxh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品分类
 * </p>
 *
 * @author gxhuanse
 * @since 2023-09-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名
     */
    private String ct_name;

    /**
     * 分类描述
     */
    private String ct_discrip;

    /**
     * 父级分类
     */
    private Integer parent_id;

    /**
     * 是否有父级分类 0：无  1：有
     */
    private Integer parent_flg;

    /**
     * 是否推荐 0：不推荐  1：推荐
     */
    private Integer ct_recom;

    /**
     * 分类状态 0：下架  1：上架
     */
    private Integer ct_status;

    /**
     * 逻辑删除，0：未删除，1：已删除
     */
    @TableLogic
    private Integer deleted;


}
