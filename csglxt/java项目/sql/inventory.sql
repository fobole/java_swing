/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for inventory
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `lid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `lodd` varchar(100) NOT NULL COMMENT '盘点单号',
  `ldate` datetime NOT NULL COMMENT '盘点日期',
  `lopera` varchar(50) NOT NULL COMMENT '操作人',
  `ldates` datetime NOT NULL COMMENT '操作时间',
  `ltiao` int(11) NOT NULL COMMENT '盘点条数',
  `lshu` int(11) NOT NULL COMMENT '盘点数量',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inventory
-- ----------------------------
INSERT INTO `inventory` VALUES ('1', 'pd1626009268580', '2021-07-11 21:14:44', '小赖', '2021-07-11 21:14:44', '-1', '200');
INSERT INTO `inventory` VALUES ('2', 'pd1626009295521', '2021-07-11 21:15:05', '小赖', '2021-07-11 21:15:05', '-1', '130');
INSERT INTO `inventory` VALUES ('3', 'pd1626051372983', '2021-07-12 08:56:27', '小赖', '2021-07-12 08:56:27', '-1', '14');
INSERT INTO `inventory` VALUES ('4', 'pd1626051414850', '2021-07-12 08:57:00', '小赖', '2021-07-12 08:57:00', '-1', '14');
INSERT INTO `inventory` VALUES ('5', 'pd1626052251564', '2021-07-12 09:11:03', '小赖', '2021-07-12 09:11:03', '-1', '1');
INSERT INTO `inventory` VALUES ('6', 'pd1626052269562', '2021-07-12 09:11:17', '小赖', '2021-07-12 09:11:17', '-1', '2');
INSERT INTO `inventory` VALUES ('7', 'pd1626063335364', '2021-07-12 12:15:41', '小赖', '2021-07-12 12:15:42', '-1', '2');
INSERT INTO `inventory` VALUES ('8', 'pd1626070388145', '2021-07-12 14:13:29', '小赖', '2021-07-12 14:13:29', '-1', '32');
INSERT INTO `inventory` VALUES ('9', 'pd1626070421563', '2021-07-12 14:13:59', '小赖', '2021-07-12 14:14:00', '-1', '25');
INSERT INTO `inventory` VALUES ('10', 'pd1626072488866', '2021-07-12 14:48:18', '小赖', '2021-07-12 14:48:18', '-1', '10000');
INSERT INTO `inventory` VALUES ('11', 'pd1626156535824', '2021-07-13 14:09:06', '小赖', '2021-07-13 14:09:06', '-1', '88');
INSERT INTO `inventory` VALUES ('12', 'pd1626156548710', '2021-07-13 14:09:32', '小赖', '2021-07-13 14:09:32', '-1', '22');
INSERT INTO `inventory` VALUES ('13', 'pd1626156641205', '2021-07-13 14:10:51', '小赖', '2021-07-13 14:10:52', '-1', '57');
INSERT INTO `inventory` VALUES ('14', 'pd1626156907940', '2021-07-13 14:15:22', '小赖', '2021-07-13 14:15:23', '-1', '22');
INSERT INTO `inventory` VALUES ('15', 'pd1626161080296', '2021-07-13 15:24:53', '小赖', '2021-07-13 15:24:53', '-1', '10');
INSERT INTO `inventory` VALUES ('16', 'pd1626656095213', '2021-07-19 08:55:42', '小军', '2021-07-19 08:55:43', '-1', '1135');
INSERT INTO `inventory` VALUES ('17', 'pd1626656279604', '2021-07-19 08:58:13', '小军', '2021-07-19 08:58:13', '-1', '2222');
INSERT INTO `inventory` VALUES ('18', 'pd1626661864327', '2021-07-19 10:31:15', '小赖', '2021-07-19 10:31:15', '-1', '66');
INSERT INTO `inventory` VALUES ('19', 'pd1626661959294', '2021-07-19 10:32:48', '小赖', '2021-07-19 10:32:49', '1', '55');
INSERT INTO `inventory` VALUES ('20', 'pd1626662437600', '2021-07-19 10:40:48', '小赖', '2021-07-19 10:40:48', '1', '77');
INSERT INTO `inventory` VALUES ('21', 'pd1626662473512', '2021-07-19 10:41:21', '小赖', '2021-07-19 10:41:21', '1', '44');
INSERT INTO `inventory` VALUES ('22', 'pd1626663889156', '2021-07-19 11:05:01', '小赖', '2021-07-19 11:05:01', '1', '80');
INSERT INTO `inventory` VALUES ('23', 'pd1626663931232', '2021-07-19 11:06:51', '小赖', '2021-07-19 11:06:51', '1', '100');
INSERT INTO `inventory` VALUES ('24', 'pd1626675297821', '2021-07-19 14:15:09', '小军', '2021-07-19 14:15:09', '1', '200');
