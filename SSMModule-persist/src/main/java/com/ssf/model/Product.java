package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;

public class Product extends BaseEntity implements Serializable {
    /**
     *  商品名称,所属表字段为sys_product.name
     */
    private String name;

    /**
     *  商品描述,所属表字段为sys_product.title
     */
    private String title;

    /**
     *  商品初始价格,所属表字段为sys_product.origin_price
     */
    private BigDecimal originPrice;

    /**
     *  商品初始价格,所属表字段为sys_product.promote_price
     */
    private BigDecimal promotePrice;

    /**
     *  库存,所属表字段为sys_product.stock
     */
    private Integer stock;

    /**
     *  商品状态,所属表字段为sys_product.state
     */
    private Integer state;

    /**
     *  外键 关联商品,所属表字段为sys_product.category_id
     */
    private Long categoryId;

    /**
     *  外键 关联品牌,所属表字段为sys_product.brand_id
     */
    private Long brandId;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(BigDecimal originPrice) {
        this.originPrice = originPrice;
    }

    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", originPrice=").append(originPrice);
        sb.append(", promotePrice=").append(promotePrice);
        sb.append(", stock=").append(stock);
        sb.append(", state=").append(state);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", brandId=").append(brandId);
        sb.append("]");
        return sb.toString();
    }
}