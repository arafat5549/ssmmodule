/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50612
Source Host           : 127.0.0.1:3306
Source Database       : mybatistest

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2016-04-25 10:35:52
*/

SET FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS `mabytistest`;
CREATE DATABASE IF NOT EXISTS `mabytistest` DEFAULT CHARSET=utf8 COLLATE utf8_general_ci;
USE `mabytistest`;

-- ----------------------------
-- Table structure for `base_location`
-- ----------------------------
DROP TABLE IF EXISTS `base_location`;
CREATE TABLE `base_location` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标记',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',

  `nameCN` varchar(50) DEFAULT NULL COMMENT '中文名称',
  `nameEN` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `inputCode` varchar(20) DEFAULT NULL COMMENT '快速录入码',
  `languageType` varchar(10) DEFAULT NULL COMMENT '语言类型',
  `level` int(8) DEFAULT NULL COMMENT '地点级别',
  `longName` varchar(50) DEFAULT NULL COMMENT '全拼',
  `parentId` int(32) DEFAULT NULL COMMENT '上级代码',
  `zipCode` varchar(20) DEFAULT NULL COMMENT '邮编',
  `shortName` varchar(10) DEFAULT NULL COMMENT '首字母',
  `orderNo` varchar(12) DEFAULT NULL COMMENT '排序号',
  `substr1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `substr2` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `subdouble1` double(10,2) DEFAULT NULL COMMENT '预留字段',
  `subdouble2` double(10,2) DEFAULT NULL COMMENT '预留字段',
  `subdate1` datetime DEFAULT NULL COMMENT '预留字段',
  `subdate2` datetime DEFAULT NULL COMMENT '预留字段',
  `creator` varchar(36) DEFAULT NULL COMMENT '创建人ID',
  `createName` varchar(255) DEFAULT NULL COMMENT '创建人',
  `modifier` varchar(36) DEFAULT NULL COMMENT '修改人ID',
  `modifyName` varchar(255) DEFAULT NULL COMMENT '修改人',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `isOften` varchar(2) DEFAULT NULL COMMENT '是否常用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=502000027 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `classss`
-- ----------------------------
DROP TABLE IF EXISTS `classss`;
CREATE TABLE `classss` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标记',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',

  `namess` varchar(300) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classss
-- ----------------------------
INSERT INTO `classss` VALUES ('1', '0', '2015-08-14', '班级1');

-- ----------------------------
-- Table structure for `demo`
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标记',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `name` varchar(300) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES ('54', '1','2015-08-03',  '上的发生的');
INSERT INTO `demo` VALUES ('55', '1','2015-08-03',  '[\"a\",\"alexgaoyh2\",\"alexgaoyh3\"]');
INSERT INTO `demo` VALUES ('56', '0','2015-08-04',  'asdfqqqq');
INSERT INTO `demo` VALUES ('57', '0','2015-08-04',  'adsf');
INSERT INTO `demo` VALUES ('58', '0','2015-08-04',  'asdf12');
INSERT INTO `demo` VALUES ('59', '0','2015-10-19',  'alexgaoyh');
INSERT INTO `demo` VALUES ('60', '0','2015-10-19',  'alexgaoyh');
INSERT INTO `demo` VALUES ('76', '0','2015-10-19',  'Dubbo分布式客户端参数');
INSERT INTO `demo` VALUES ('84', '0','2015-10-28',  'Wed Oct 28 16:55:59 CST 2015');
INSERT INTO `demo` VALUES ('85', '0','2015-10-28',  'Wed Oct 28 16:56:26 CST 2015');
INSERT INTO `demo` VALUES ('86', '0','2015-10-28', 'Wed Oct 28 16:56:29 CST 2015');
INSERT INTO `demo` VALUES ('87', '0','2015-10-28', 'Wed Oct 28 17:04:21 CST 2015');
INSERT INTO `demo` VALUES ('88', '0','2015-10-28',  'Wed Oct 28 17:06:20 CST 2015');
INSERT INTO `demo` VALUES ('89', '0','2015-10-28',  'Wed Oct 28 17:08:39 CST 2015');
INSERT INTO `demo` VALUES ('90', '0','2015-10-28',  'Wed Oct 28 17:18:47 CST 2015');
INSERT INTO `demo` VALUES ('91', '0','2015-10-28',  'Wed Oct 28 17:22:18 CST 2015');
INSERT INTO `demo` VALUES ('92', '0','2015-10-29',  'Thu Oct 29 14:14:44 CST 2015');
INSERT INTO `demo` VALUES ('93', '0','2015-10-29',  'Thu Oct 29 14:14:46 CST 2015');
INSERT INTO `demo` VALUES ('94', '0','2015-10-29',  'Thu Oct 29 14:15:40 CST 2015');
INSERT INTO `demo` VALUES ('95', '0','2015-10-29',  'Thu Oct 29 14:15:42 CST 2015');
INSERT INTO `demo` VALUES ('96', '0','2015-10-29',  'Thu Oct 29 14:15:43 CST 2015');

-- ----------------------------
-- Table structure for `mutidatabase`
-- ----------------------------
DROP TABLE IF EXISTS `mutidatabase`;
CREATE TABLE `mutidatabase` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '唯一标示ID，主键',
  `delete_flag` INT(1) NOT NULL COMMENT '删除标示，是否删除状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  

  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mutidatabase
-- ----------------------------
INSERT INTO `mutidatabase` VALUES (1,0, 'Mon Nov 09 12:22:03 CST 2015','663572233758838784');
INSERT INTO `mutidatabase` VALUES (2,0, 'Mon Nov 09 12:23:28 CST 2015','663572591155482624');
INSERT INTO `mutidatabase` VALUES (3,0, 'Thu Nov 12 11:18:40 CST 2015','664643446325252096');
INSERT INTO `mutidatabase` VALUES (4,0, 'Thu Nov 12 11:18:49 CST 2015','664643483470008320');
INSERT INTO `mutidatabase` VALUES (5,0, 'Thu Nov 12 11:36:36 CST 2015','664647959677374464');
INSERT INTO `mutidatabase` VALUES (6,0, 'Thu Nov 12 13:35:15 CST 2015','664677815878291456');
INSERT INTO `mutidatabase` VALUES (7,0, 'Fri Nov 13 10:03:00 CST 2015','664986789525721088');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '唯一标示ID，主键',
  `delete_flag` INT(1) NOT NULL COMMENT '删除标示，是否删除状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',

  `namess` varchar(300) NOT NULL COMMENT '名称',
  `classID` int(32) NOT NULL COMMENT '所属班级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1','0',  '2015-08-14', 'stu1', '1');
INSERT INTO `student` VALUES ('2','0',  '2015-08-14', 'stu2', '1');
INSERT INTO `student` VALUES ('3','0',  '2015-08-14', 'stu3', '1');

-- ----------------------------
-- Table structure for `sys_resource`
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '唯一标示ID，主键',
  `delete_flag` INT(1) NOT NULL COMMENT '删除标示，是否删除状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',

  `name` varchar(32) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `href` varchar(100) DEFAULT NULL,
  `resourceType` int(1) DEFAULT NULL,
  `parentId` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8 COMMENT='后台资源权限表';

-- ----------------------------
-- Records of sysmanresource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '0', '2015-05-23', '系统管理', 'alexgaoyh', '', null, null);
INSERT INTO `sys_resource` VALUES ('2', '0', '2015-05-23', '权限管理', '权限管理', '/sysmanUser/welcome', null, '1');
INSERT INTO `sys_resource` VALUES ('3', '0', '2015-05-23', '后台用户管理', '后台用户管理', '/sysmanUser/list', null, '2');
INSERT INTO `sys_resource` VALUES ('4', '0', '2015-05-23', '后台用户组管理', 'alexgaoyh', '/sysmanRole/list', null, '2');
INSERT INTO `sys_resource` VALUES ('5', '0', '2015-05-23', '后台资源管理', 'alexgaoyh', '/sysmanResource/list', null, '2');
INSERT INTO `sys_resource` VALUES ('82', '0', '2015-06-01', 'kindeditor相关功能测试', 'kindeditor相关功能测试', '/kindEditor/list', null, '83');
INSERT INTO `sys_resource` VALUES ('83', '0', '2015-07-27', '基础信息管理', '基础信息管理', '/sysmanUser/welcome', null, '1');
INSERT INTO `sys_resource` VALUES ('84', '0', '2015-07-27', '省市区管理', '省市区管理啊啊', '/base/baseLocation/list', null, '83');
INSERT INTO `sys_resource` VALUES ('85', '0', '2015-08-04', '测试代码', '测试代码', '/', null, '1');
INSERT INTO `sys_resource` VALUES ('86', '0', '2015-08-04', 'CRUD新开页面', 'CRUD新开页面', '/demo/_blank/list', null, '85');
INSERT INTO `sys_resource` VALUES ('87', '0', '2015-09-28', 'CMS测试', 'CMS测试', '/', null, null);
INSERT INTO `sys_resource` VALUES ('88', '0', '2015-09-28', '模块管理', '模块管理', '/page/module/index', null, '90');
INSERT INTO `sys_resource` VALUES ('89', '0', '2015-09-28', '页面管理', '页面管理', '/page/page/index', null, '90');
INSERT INTO `sys_resource` VALUES ('90', '0', '2015-09-28', 'CMS', 'CMS', '/', null, '87');
INSERT INTO `sys_resource` VALUES ('91', '0', '2015-10-30', 'springmvc表单重复提交', 'springmvc表单重复提交', '/demo/springmvcFormToken/add', null, '85');

-- ----------------------------
-- Table structure for `sysmanrole`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '唯一标示ID，主键',
  `delete_flag` INT(1) NOT NULL COMMENT '删除标示，是否删除状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',

  `name` varchar(32) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';

-- ----------------------------
-- Records of sysmanrole
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '1', '2015-05-23', 'alexgaoyh', 'alexgaoyh');
INSERT INTO `sys_role` VALUES ('2', '0', '2015-05-23', 'alexgaoyh1', 'alexgaoyh111设定');
INSERT INTO `sys_role` VALUES ('3', '0', '2015-05-23', 'alexgaoyh', 'alexgaoyh中文');

-- ----------------------------
-- Table structure for `sys_role_resource_rel`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource_rel`;
CREATE TABLE `sys_role_resource_rel` (
  `role_id` BIGINT NOT NULL,
  `resource_id` BIGINT NOT NULL,
  PRIMARY KEY (`role_id`,`resource_id`),
  KEY `idx_resource` (`resource_id`)
  -- CONSTRAINT `FK_Reference_sysmanRoleResourceRel_sysmanResource` FOREIGN KEY (`resource_id`) REFERENCES `sys_resource` (`id`),
  -- CONSTRAINT `FK_Reference_sysmanRoleResourceRel_sysmanRole` FOREIGN KEY (`sysmanRoleId`) REFERENCES `sysmanrole` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理用户角色-资源-关系表';

-- ----------------------------
-- Records of sys_role_resource_rel
-- ----------------------------
INSERT INTO `sys_role_resource_rel` VALUES ('1', '1');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '2');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '3');
INSERT INTO `sys_role_resource_rel` VALUES ('2', '3');
INSERT INTO `sys_role_resource_rel` VALUES ('3', '3');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '4');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '5');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '82');
INSERT INTO `sys_role_resource_rel` VALUES ('2', '82');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '83');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '84');
INSERT INTO `sys_role_resource_rel` VALUES ('3', '84');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '85');
INSERT INTO `sys_role_resource_rel` VALUES ('3', '85');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '86');
INSERT INTO `sys_role_resource_rel` VALUES ('3', '86');
INSERT INTO `sys_role_resource_rel` VALUES ('1', '91');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '唯一标示ID，主键',
  `delete_flag` INT(1) NOT NULL COMMENT '删除标示，是否删除状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',

  `name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='后台用户表结构';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '0', '2015-05-23', 'alexgaoyh', '21232f297a57a5a743894a0e4a801fc3');
INSERT INTO `sys_user` VALUES ('2', '0', '2015-05-23', 'alexgaoyh1', '21232f297a57a5a743894a0e4a801fc3');
INSERT INTO `sys_user` VALUES ('3', '0', '2015-05-23', 'admin', '21232f297a57a5a743894a0e4a801fc3');
INSERT INTO `sys_user` VALUES ('4', '1', '2015-05-23', 'testtest中文', 'alexgaoyh4');
INSERT INTO `sys_user` VALUES ('5', '1', '2015-05-23', 'alexgaoyh', 'alexgaoyh5');
INSERT INTO `sys_user` VALUES ('6', '1', '2015-05-23', 'tes中文', 'alexgaoyh6');

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role_rel`;
CREATE TABLE `sys_user_role_rel` (
  `user_id` BIGINT NOT NULL,
  `role_id` BIGINT NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `idx_roleid` (`role_id`)
  -- CONSTRAINT `FK_Reference_sysmanUserRoleRel_sysmanRole` FOREIGN KEY (`sysmanRoleId`) REFERENCES `sysmanrole` (`id`),
  -- CONSTRAINT `FK_Reference_sysmanUserRoleRel_sysmanUser` FOREIGN KEY (`sysmanUserId`) REFERENCES `sysmanuser` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户-角色-关联表';

-- ----------------------------
-- Records of sys_user_role_rel
-- ----------------------------
INSERT INTO `sys_user_role_rel` VALUES ('1', '1');
INSERT INTO `sys_user_role_rel` VALUES ('3', '1');
INSERT INTO `sys_user_role_rel` VALUES ('1', '2');
INSERT INTO `sys_user_role_rel` VALUES ('2', '2');
INSERT INTO `sys_user_role_rel` VALUES ('3', '2');
INSERT INTO `sys_user_role_rel` VALUES ('1', '3');
INSERT INTO `sys_user_role_rel` VALUES ('2', '3');
INSERT INTO `sys_user_role_rel` VALUES ('3', '3');
INSERT INTO `sys_user_role_rel` VALUES ('4', '3');
INSERT INTO `sys_user_role_rel` VALUES ('6', '3');

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `sys_test`;
CREATE TABLE `sys_test` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '唯一标示ID，主键',
  `delete_flag` INT(1) NOT NULL COMMENT '删除标示，是否删除状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

