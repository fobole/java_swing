/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for checkf
-- ----------------------------
DROP TABLE IF EXISTS `checkf`;
CREATE TABLE `checkf` (
  `chid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `lid` varchar(100) NOT NULL COMMENT '盘点主编号',
  `gid` int(11) NOT NULL COMMENT '商品编号',
  `chkushu` int(11) NOT NULL COMMENT '库存数量',
  `chpanshu` int(11) NOT NULL COMMENT '盘点数量',
  `chremarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`chid`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checkf
-- ----------------------------
INSERT INTO `checkf` VALUES ('1', 'pd1626009268580', '36', '200', '200', null);
INSERT INTO `checkf` VALUES ('2', 'pd1626009295521', '36', '130', '130', null);
INSERT INTO `checkf` VALUES ('3', 'pd1626051372983', '36', '14', '14', null);
INSERT INTO `checkf` VALUES ('4', 'pd1626051414850', '35', '14', '14', null);
INSERT INTO `checkf` VALUES ('5', 'pd1626052251564', '36', '1', '1', null);
INSERT INTO `checkf` VALUES ('6', 'pd1626052269562', '34', '1', '1', null);
INSERT INTO `checkf` VALUES ('7', 'pd1626052269562', '25', '1', '1', null);
INSERT INTO `checkf` VALUES ('8', 'pd1626063335364', '33', '1', '1', null);
INSERT INTO `checkf` VALUES ('9', 'pd1626063335364', '26', '1', '1', null);
INSERT INTO `checkf` VALUES ('10', 'pd1626070388145', '15', '32', '32', null);
INSERT INTO `checkf` VALUES ('11', 'pd1626070421563', '37', '13', '13', null);
INSERT INTO `checkf` VALUES ('12', 'pd1626070421563', '3', '12', '12', null);
INSERT INTO `checkf` VALUES ('13', 'pd1626072488866', '34', '10000', '10000', null);
INSERT INTO `checkf` VALUES ('14', 'pd1626156535824', '34', '88', '88', null);
INSERT INTO `checkf` VALUES ('15', 'pd1626156548710', '34', '22', '22', null);
INSERT INTO `checkf` VALUES ('16', 'pd1626156641205', '29', '57', '57', null);
INSERT INTO `checkf` VALUES ('17', 'pd1626156907940', '2', '22', '22', null);
INSERT INTO `checkf` VALUES ('18', 'pd1626161080296', '38', '10', '10', null);
INSERT INTO `checkf` VALUES ('19', 'pd1626656095213', '36', '333', '333', null);
INSERT INTO `checkf` VALUES ('20', 'pd1626656095213', '35', '157', '157', null);
INSERT INTO `checkf` VALUES ('21', 'pd1626656095213', '33', '356', '356', null);
INSERT INTO `checkf` VALUES ('22', 'pd1626656095213', '26', '67', '67', null);
INSERT INTO `checkf` VALUES ('23', 'pd1626656095213', '25', '55', '55', null);
INSERT INTO `checkf` VALUES ('24', 'pd1626656095213', '39', '167', '167', null);
INSERT INTO `checkf` VALUES ('25', 'pd1626656279604', '38', '2222', '2222', null);
INSERT INTO `checkf` VALUES ('26', 'pd1626661864327', '37', '66', '66', null);
INSERT INTO `checkf` VALUES ('27', 'pd1626661959294', '34', '55', '55', null);
INSERT INTO `checkf` VALUES ('28', 'pd1626662437600', '34', '77', '77', null);
INSERT INTO `checkf` VALUES ('29', 'pd1626662473512', '16', '44', '44', null);
INSERT INTO `checkf` VALUES ('30', 'pd1626663889156', '26', '80', '80', null);
INSERT INTO `checkf` VALUES ('31', 'pd1626663931232', '25', '100', '100', null);
INSERT INTO `checkf` VALUES ('32', 'pd1626675297821', '60', '200', '200', null);
