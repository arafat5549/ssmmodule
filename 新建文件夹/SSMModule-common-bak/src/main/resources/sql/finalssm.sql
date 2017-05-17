-- 需要 MySQL 5.6.5以上的版本

DROP DATABASE IF EXISTS `finalssm`;
CREATE DATABASE IF NOT EXISTS `finalssm` DEFAULT CHARSET=utf8 COLLATE utf8_general_ci;
USE `finalssm`;

-- 用户表
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE sys_user(
`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
`name` VARCHAR(50) NOT NULL COMMENT '用户名',
`password` VARCHAR(50) NOT NULL COMMENT '密码',
`phone` BIGINT NOT NULL COMMENT '手机号',
`score` INT NOT NULL COMMENT '积分',
`create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
`update_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '更新时间',
`DELETE_FLAG` varchar(50) NOT NULL DEFAULT '0' COMMENT '删除标记',
PRIMARY KEY (`id`),
KEY `idx_user_phone`(`phone`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';

INSERT INTO `sys_user` VALUES(1,"wang","123456",18768128888,0,now(),now(),'0');
INSERT INTO `sys_user` VALUES(99,"lisi","45678",18768128887,0,now(),now(),'0');
-- 分类表
DROP TABLE IF EXISTS `sys_category`;
CREATE TABLE `sys_category` (
  `id`	    BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `name`		VARCHAR(50) NOT NULL COMMENT '分类名称',
  `parent_id`	BIGINT NOT NULL  COMMENT '外键 父分类ID',
  `parent_ids` VARCHAR(100) NOT NULL COMMENT '记录所有父分类的ID',
  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  `update_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '更新时间',
  PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分类表';

-- 商品表
DROP TABLE IF EXISTS `sys_product`;
CREATE TABLE `sys_product` (
  `id`	    BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `name`		VARCHAR(50) NOT NULL COMMENT '商品名称',
  `title`  VARCHAR(150) NOT NULL COMMENT '商品描述',
  `origin_price`  decimal(10,2) NOT NULL COMMENT '商品初始价格',
  `promote_price` decimal(10,2) NOT NULL COMMENT '商品初始价格',
  `stock`       INT(15) DEFAULT 0 COMMENT '库存',
  `state`       INT(11) DEFAULT 0 COMMENT '商品状态',
  `category_id` BIGINT NOT NULL COMMENT '外键 关联商品',
  `brand_id`    BIGINT DEFAULT NULL COMMENT '外键 关联品牌',
  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  `update_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '更新时间',
  `DELETE_FLAG` INT(1) NOT NULL DEFAULT 0 COMMENT '删除标记',
  PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';


-- 订单表
DROP TABLE IF EXISTS `sys_order`;
CREATE TABLE `sys_order` (
  `id`	    BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `ordercode` VARCHAR(255) NOT NULL COMMENT '唯一ID 订单号',
  `address` VARCHAR(255) NOT NULL  COMMENT '收获地址',
  `post` VARCHAR(50) DEFAULT NULL  COMMENT '邮编区号',
  `receiver` VARCHAR(50) NOT NULL COMMENT '收件人',
  `mobile` VARCHAR(50) NOT NULL COMMENT '手机',
  `message` VARCHAR(255) DEFAULT NULL  COMMENT '用户信息-备注信息',
  `user_id` BIGINT NOT NULL COMMENT '外键 用户ID',
  `status` VARCHAR(50) DEFAULT NULL COMMENT '订单状态',

  `pay_date` datetime DEFAULT NULL   COMMENT '订单付款时间',
  `delivery_date` datetime DEFAULT NULL COMMENT '订单发货时间',
  `confirm_date` datetime DEFAULT NULL  COMMENT '订单确认到货时间',

  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  `update_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '更新时间',
  PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';


-- 订单项目表
DROP TABLE IF EXISTS `sys_order_item`;
CREATE TABLE `sys_order_item` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `product_id` BIGINT NOT NULL COMMENT '外键 商品id',
  `order_id` BIGINT NOT NULL COMMENT '外键 订单id',
  `user_id` BIGINT NOT NULL COMMENT '外键 用户id',
  `count` INT(15) NOT NULL  COMMENT '订单商品数量',
  `create_time`  VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  `update_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单项目表';

-- 品牌表
DROP TABLE IF EXISTS `sys_brand`;
CREATE TABLE `sys_brand` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `name` VARCHAR(50) DEFAULT NULL COMMENT '品牌名称',
  `describe` text DEFAULT NULL COMMENT '品牌介绍',
  `logo` VARCHAR(100) DEFAULT NULL COMMENT '品牌Logo',
  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  `update_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '品牌表';

-- 商品图片表
DROP TABLE IF EXISTS `sys_product_image`;
CREATE TABLE `sys_product_image` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `product_id` BIGINT DEFAULT NULL COMMENT '外键 对应商品',
  `type` VARCHAR(255) DEFAULT NULL  COMMENT '图片类型',
  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品图片表';

-- 商品属性表
DROP TABLE IF EXISTS `sys_product_property`;
CREATE TABLE `sys_product_property` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `category_id` BIGINT DEFAULT NULL COMMENT '主键自增长',
  `name` VARCHAR(255) DEFAULT NULL COMMENT '属性名称',
  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品属性表';

-- 商品属性值表
DROP TABLE IF EXISTS `sys_product_property_value`;
CREATE TABLE `sys_product_property_value` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `product_id` BIGINT DEFAULT NULL  COMMENT '外键 关联商品',
  `property_id` BIGINT DEFAULT NULL COMMENT '外键 关联商品属性',
  `name` varchar(255) DEFAULT NULL  COMMENT '属性值名称',
  `create_time` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品属性值表';