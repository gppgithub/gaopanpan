/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50543
Source Host           : 127.0.0.1:3306
Source Database       : mybatis01

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2019-04-13 16:28:28
*/
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis01` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis01`;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '男', '2019-04-13 00:43:57', '不知道');
INSERT INTO `user` VALUES ('2', '李四', '女', '2019-04-13 00:43:57', '也不知道');
INSERT INTO `user` VALUES ('3', '1', '1', '2019-04-13 00:43:57', '1');
INSERT INTO `user` VALUES ('4', '2', '2', '2019-04-13 00:45:24', '2');
INSERT INTO `user` VALUES ('5', '3', '3', '2019-04-13 00:48:05', '3');
INSERT INTO `user` VALUES ('6', '4', '4', '2019-04-13 00:51:39', '4');
INSERT INTO `user` VALUES ('9', '5', '5', '2019-04-13 00:00:00', '5');
INSERT INTO `user` VALUES ('10', '6', '6', '2019-04-13 00:00:00', '6');
INSERT INTO `user` VALUES ('11', '7', '7', '2019-04-13 00:00:00', '7');
INSERT INTO `user` VALUES ('12', '8', '8', '2019-04-13 00:00:00', '8');
INSERT INTO `user` VALUES ('13', '9', '9', '2019-04-13 00:00:00', '9');
INSERT INTO `user` VALUES ('14', '10', '10', '2019-04-13 00:00:00', '10');
INSERT INTO `user` VALUES ('15', '11', '11', '2019-04-13 00:00:00', '11');
