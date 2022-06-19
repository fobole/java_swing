/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for details
-- ----------------------------
DROP TABLE IF EXISTS `details`;
CREATE TABLE `details` (
  `deid` int(11) NOT NULL AUTO_INCREMENT,
  `coid` int(11) NOT NULL,
  `gid` int(11) NOT NULL,
  `deshu` int(11) NOT NULL,
  PRIMARY KEY (`deid`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of details
-- ----------------------------
INSERT INTO `details` VALUES ('1', '1', '1', '100');
INSERT INTO `details` VALUES ('2', '1', '3', '1');
INSERT INTO `details` VALUES ('3', '0', '3', '3');
INSERT INTO `details` VALUES ('46', '34', '14', '199');
INSERT INTO `details` VALUES ('47', '35', '15', '400');
INSERT INTO `details` VALUES ('48', '36', '3', '100');
INSERT INTO `details` VALUES ('49', '37', '15', '11');
INSERT INTO `details` VALUES ('50', '39', '15', '400');
INSERT INTO `details` VALUES ('51', '40', '3', '2');
INSERT INTO `details` VALUES ('52', '41', '15', '100');
INSERT INTO `details` VALUES ('53', '42', '15', '22333');
INSERT INTO `details` VALUES ('54', '43', '15', '20000');
INSERT INTO `details` VALUES ('55', '43', '15', '3000');
INSERT INTO `details` VALUES ('56', '45', '15', '900');
INSERT INTO `details` VALUES ('57', '46', '15', '1');
INSERT INTO `details` VALUES ('58', '46', '3', '1');
INSERT INTO `details` VALUES ('59', '47', '15', '1');
INSERT INTO `details` VALUES ('60', '47', '3', '1');
INSERT INTO `details` VALUES ('61', '1', '34', '1');
INSERT INTO `details` VALUES ('62', '1', '29', '1');
INSERT INTO `details` VALUES ('63', '1', '22', '1');
INSERT INTO `details` VALUES ('64', '1', '35', '1');
INSERT INTO `details` VALUES ('65', '1', '33', '1');
INSERT INTO `details` VALUES ('66', '1', '29', '1');
INSERT INTO `details` VALUES ('67', '1', '23', '1');
INSERT INTO `details` VALUES ('68', '1', '22', '1');
INSERT INTO `details` VALUES ('69', '1', '16', '1');
INSERT INTO `details` VALUES ('70', '1', '35', '1');
INSERT INTO `details` VALUES ('71', '1', '33', '1');
INSERT INTO `details` VALUES ('72', '1', '35', '1');
INSERT INTO `details` VALUES ('73', '1', '35', '1');
INSERT INTO `details` VALUES ('74', '1', '0', '32');
INSERT INTO `details` VALUES ('75', '1', '58', '21');
INSERT INTO `details` VALUES ('76', '1', '58', '3');
INSERT INTO `details` VALUES ('77', '1', '36', '3');
INSERT INTO `details` VALUES ('78', '1', '33', '3');
INSERT INTO `details` VALUES ('79', '1', '58', '12');
