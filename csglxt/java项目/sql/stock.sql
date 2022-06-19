/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:21:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `stid` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL,
  `stshu` int(11) NOT NULL,
  `stmax` int(11) NOT NULL,
  `stmin` int(11) NOT NULL,
  `stopera` varchar(50) NOT NULL,
  `stdate` datetime NOT NULL,
  PRIMARY KEY (`stid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('1', '2', '2', '500', '100', '小赖', '2021-06-23 16:06:59');
INSERT INTO `stock` VALUES ('2', '3', '12', '1000', '10', '小赖', '2021-06-17 16:07:54');
INSERT INTO `stock` VALUES ('4', '15', '31', '1000', '100', '小伟', '2021-06-29 10:32:29');
INSERT INTO `stock` VALUES ('5', '16', '44', '1000', '100', '某某某', '2021-07-01 16:39:38');
INSERT INTO `stock` VALUES ('6', '17', '100', '1000', '100', '某某某', '2021-07-01 17:02:42');
INSERT INTO `stock` VALUES ('7', '19', '3', '1000', '100', '某某某', '2021-07-04 19:46:52');
INSERT INTO `stock` VALUES ('8', '21', '123', '1000', '100', '某某某', '2021-07-06 08:26:43');
INSERT INTO `stock` VALUES ('9', '22', '48', '1000', '100', '某某某', '2021-07-06 14:10:38');
INSERT INTO `stock` VALUES ('10', '23', '20', '1000', '100', '某某某', '2021-07-06 18:33:14');
INSERT INTO `stock` VALUES ('11', '25', '100', '1000', '100', '某某某', '2021-07-09 08:46:23');
INSERT INTO `stock` VALUES ('12', '26', '80', '1000', '100', '某某某', '2021-07-09 08:52:37');
INSERT INTO `stock` VALUES ('13', '29', '37', '1000', '1', '某某某', '2021-07-09 10:21:14');
INSERT INTO `stock` VALUES ('14', '33', '303', '1000', '10', '某某某', '2021-07-09 15:37:21');
INSERT INTO `stock` VALUES ('15', '34', '0', '1000', '10', '某某某', '2021-07-09 15:38:40');
INSERT INTO `stock` VALUES ('16', '35', '102', '1000', '10', '某某某', '2021-07-09 16:55:32');
INSERT INTO `stock` VALUES ('17', '36', '335', '1000', '10', '某某某', '2021-07-09 22:13:37');
INSERT INTO `stock` VALUES ('18', '37', '65', '1000', '10', '某某某', '2021-07-09 22:18:05');
INSERT INTO `stock` VALUES ('19', '38', '2101', '1000', '10', '小岚', '2021-07-13 14:05:54');
INSERT INTO `stock` VALUES ('20', '39', '200', '1000', '10', '某某某', '2021-07-13 14:17:50');
INSERT INTO `stock` VALUES ('21', '58', '53', '1000', '10', '小军', '2021-07-19 10:45:11');
INSERT INTO `stock` VALUES ('22', '60', '200', '1000', '10', '小军', '2021-07-19 14:02:27');
