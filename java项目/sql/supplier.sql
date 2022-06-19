/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:22:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sbusiness` varchar(50) NOT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `sphone` varchar(11) DEFAULT NULL,
  `saddress` varchar(100) DEFAULT NULL,
  `sztai` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`sid`),
  UNIQUE KEY `sid` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', '腾讯', '赖春艳', '19898957546', '茶陵', '1');
INSERT INTO `supplier` VALUES ('2', '阿里', '刘伟', '16726376537', '茶陵', '0');
INSERT INTO `supplier` VALUES ('3', '拼西西', '肖航丰', '13465747354', '攸县', '0');
INSERT INTO `supplier` VALUES ('4', '奥西吧', '肖炎', '13762873', '长沙', '0');
INSERT INTO `supplier` VALUES ('6', '普通供货商', '李', '123113', '', '1');
