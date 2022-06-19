/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:21:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for saletdatails
-- ----------------------------
DROP TABLE IF EXISTS `saletdatails`;
CREATE TABLE `saletdatails` (
  `sdid` int(11) NOT NULL AUTO_INCREMENT,
  `saodd` varchar(100) NOT NULL,
  `gid` int(11) NOT NULL,
  `sdshu` int(11) NOT NULL,
  PRIMARY KEY (`sdid`),
  UNIQUE KEY `sdid` (`sdid`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of saletdatails
-- ----------------------------
INSERT INTO `saletdatails` VALUES ('1', '2', '2', '200');
INSERT INTO `saletdatails` VALUES ('26', 'xs1626656572049', '29', '1');
INSERT INTO `saletdatails` VALUES ('27', 'xs20210719093559', '37', '1');
INSERT INTO `saletdatails` VALUES ('28', 'xs20210719093559', '35', '1');
INSERT INTO `saletdatails` VALUES ('29', 'xs20210719093559', '33', '1');
INSERT INTO `saletdatails` VALUES ('30', 'xs20210719093631', '23', '1');
INSERT INTO `saletdatails` VALUES ('31', 'xs20210719093631', '22', '1');
INSERT INTO `saletdatails` VALUES ('32', 'xs20210719093631', '16', '1');
INSERT INTO `saletdatails` VALUES ('33', 'xs20210719093649', '35', '1');
INSERT INTO `saletdatails` VALUES ('34', 'xs20210719093649', '33', '1');
INSERT INTO `saletdatails` VALUES ('35', 'xs1626658641246', '35', '1');
INSERT INTO `saletdatails` VALUES ('36', 'xs20210719125600', '35', '1');
INSERT INTO `saletdatails` VALUES ('37', 'xs20210719125651', '35', '1');
INSERT INTO `saletdatails` VALUES ('38', 'xs1626670659610', '36', '1');
INSERT INTO `saletdatails` VALUES ('39', 'xs20210719020513', '58', '21');
INSERT INTO `saletdatails` VALUES ('40', 'xs20210719020513', '0', '32');
INSERT INTO `saletdatails` VALUES ('41', 'xs20210719020611', '0', '2');
INSERT INTO `saletdatails` VALUES ('42', 'xs20210719020624', '58', '12');
INSERT INTO `saletdatails` VALUES ('43', 'xs20210719020712', '0', '32');
INSERT INTO `saletdatails` VALUES ('44', 'xs20210719020753', '58', '21');
INSERT INTO `saletdatails` VALUES ('45', 'xs20210719020828', '58', '3');
INSERT INTO `saletdatails` VALUES ('46', 'xs20210719020828', '36', '3');
INSERT INTO `saletdatails` VALUES ('47', 'xs20210719020828', '33', '3');
INSERT INTO `saletdatails` VALUES ('48', 'xs20210719020904', '58', '12');
INSERT INTO `saletdatails` VALUES ('49', 'xs1626675052668', '37', '1');
INSERT INTO `saletdatails` VALUES ('50', 'xs1626675086415', '60', '101');
