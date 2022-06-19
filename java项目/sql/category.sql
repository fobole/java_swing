/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:19:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `ctype` varchar(100) NOT NULL,
  `cstate` int(1) NOT NULL DEFAULT '0' COMMENT '0 存在 1不存在',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '食品类', '0');
INSERT INTO `category` VALUES ('2', '饮料类', '0');
INSERT INTO `category` VALUES ('3', '水果类', '0');
INSERT INTO `category` VALUES ('4', '蔬菜类', '0');
