/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:22:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `vname` varchar(50) NOT NULL,
  `vphone` varchar(11) NOT NULL,
  `vpwd` varchar(20) NOT NULL,
  `vgrade` varchar(20) NOT NULL,
  `vstate` int(1) NOT NULL DEFAULT '0',
  `vopera` varchar(20) NOT NULL,
  `vdate` datetime NOT NULL,
  PRIMARY KEY (`vid`),
  UNIQUE KEY `vid` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vip
-- ----------------------------
INSERT INTO `vip` VALUES ('1', '刘小唯', '17336648363', '1234', '普通客户', '0', '兰凯军', '2021-06-17 19:18:11');
INSERT INTO `vip` VALUES ('2', '兰小军', '12341243122', '2323', '普通会员', '0', '兰凯军', '2021-06-26 19:20:24');
INSERT INTO `vip` VALUES ('3', '肖小丰', '15352432424', '2424', '普通客户', '0', '兰凯军', '2021-06-18 19:21:01');
INSERT INTO `vip` VALUES ('4', '赖小艳', '12313143221', '1519', 'vip会员', '0', '兰凯军', '2021-06-18 19:21:31');
INSERT INTO `vip` VALUES ('7', '小夕', '13222222222', '12345', '普通会员', '1', '肖涵丰', '2021-07-19 10:19:59');
INSERT INTO `vip` VALUES ('8', '信息', '1233333333', '2222', '普通会员', '1', '肖涵丰', '2021-07-19 10:23:49');
