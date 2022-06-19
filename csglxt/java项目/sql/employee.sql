/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) NOT NULL,
  `epwd` varchar(50) NOT NULL,
  `eposition` varchar(50) NOT NULL,
  `ephone` varchar(11) NOT NULL,
  `eadd` varchar(100) NOT NULL,
  `estate` int(1) NOT NULL DEFAULT '0' COMMENT '0 在职 1不在职',
  PRIMARY KEY (`eid`),
  UNIQUE KEY `eid` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '小伟', '123456', '销售人员', '12346373849', '北京市', '0');
INSERT INTO `employee` VALUES ('2', '小岚', '654321', '采购人员', '16238372837', '上海市', '0');
INSERT INTO `employee` VALUES ('3', '小赖', '000000', '仓库人员', '2735783782', '上课市', '0');
INSERT INTO `employee` VALUES ('4', '小丰', '666666', '系统人员', '18362836285', '北京市', '0');
INSERT INTO `employee` VALUES ('5', '小军', '88888', '采购人员', '12345686321', '长沙市', '0');
