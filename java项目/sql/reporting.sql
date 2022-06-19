/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:21:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for reporting
-- ----------------------------
DROP TABLE IF EXISTS `reporting`;
CREATE TABLE `reporting` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `oid` varchar(100) NOT NULL COMMENT '报损报溢主表编号（外键）',
  `gid` int(11) NOT NULL COMMENT '商品编号（外键）',
  `rshu` int(11) NOT NULL COMMENT '数量',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reporting
-- ----------------------------
INSERT INTO `reporting` VALUES ('1', 'bs20210711091244', '35', '12');
INSERT INTO `reporting` VALUES ('2', 'bs20210711091244', '37', '21');
INSERT INTO `reporting` VALUES ('3', 'by20210711091410', '37', '20');
INSERT INTO `reporting` VALUES ('4', 'bs20210712085529', '26', '20');
INSERT INTO `reporting` VALUES ('5', 'by20210712085745', '23', '44');
INSERT INTO `reporting` VALUES ('6', 'bs20210712021232', '23', '33');
INSERT INTO `reporting` VALUES ('7', 'by20210712023859', '35', '3');
INSERT INTO `reporting` VALUES ('8', 'bs20210712023925', '35', '10');
INSERT INTO `reporting` VALUES ('9', 'bs20210713015918', '23', '33');
INSERT INTO `reporting` VALUES ('10', 'bs20210713020821', '2', '22');
INSERT INTO `reporting` VALUES ('11', 'by20210713021332', '2', '22');
INSERT INTO `reporting` VALUES ('12', 'bs20210713021433', '2', '22');
INSERT INTO `reporting` VALUES ('13', 'by20210713022837', '36', '1');
INSERT INTO `reporting` VALUES ('14', 'bs20210713032302', '22', '22');
INSERT INTO `reporting` VALUES ('15', 'by20210713032333', '3', '10');
INSERT INTO `reporting` VALUES ('16', 'bs20210719085400', '29', '22');
INSERT INTO `reporting` VALUES ('17', 'by20210719085615', '39', '44');
INSERT INTO `reporting` VALUES ('18', 'bs20210719094413', '38', '55');
INSERT INTO `reporting` VALUES ('19', 'bs20210719094413', '33', '44');
INSERT INTO `reporting` VALUES ('20', 'bs20210719094413', '25', '22');
INSERT INTO `reporting` VALUES ('21', 'by20210719094536', '36', '55');
INSERT INTO `reporting` VALUES ('22', 'by20210719094536', '33', '44');
INSERT INTO `reporting` VALUES ('23', 'bs20210719102923', '39', '67');
INSERT INTO `reporting` VALUES ('24', 'bs20210719102923', '35', '56');
INSERT INTO `reporting` VALUES ('25', 'by20210719102958', '33', '109');
INSERT INTO `reporting` VALUES ('26', 'bs20210719103038', '38', '66');
INSERT INTO `reporting` VALUES ('27', 'bs20210719110308', '33', '13');
INSERT INTO `reporting` VALUES ('28', 'bs20210719110308', '23', '6');
INSERT INTO `reporting` VALUES ('29', 'by20210719110418', '29', '22');
INSERT INTO `reporting` VALUES ('30', 'bs20210719021254', '39', '100');
INSERT INTO `reporting` VALUES ('31', 'bs20210719021254', '34', '77');
INSERT INTO `reporting` VALUES ('32', 'by20210719021337', '26', '60');
