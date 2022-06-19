/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for overflow
-- ----------------------------
DROP TABLE IF EXISTS `overflow`;
CREATE TABLE `overflow` (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `oodd` varchar(100) NOT NULL COMMENT '报损单号/报溢单号',
  `odate` datetime NOT NULL COMMENT '报损报溢日期',
  `saztai` int(1) NOT NULL DEFAULT '0' COMMENT '0 报损1报溢',
  `oagent` varchar(100) NOT NULL,
  `obeizhu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of overflow
-- ----------------------------
INSERT INTO `overflow` VALUES ('1', 'bs20210711091244', '2021-07-11 21:12:57', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('2', 'bs20210711091244', '2021-07-11 21:14:00', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('3', 'by20210711091410', '2021-07-11 21:14:19', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('4', 'bs20210712082646', '2021-07-12 08:27:00', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('5', 'bs20210712085529', '2021-07-12 08:55:50', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('6', 'by20210712085745', '2021-07-12 08:58:20', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('7', 'bs20210712021232', '2021-07-12 14:12:52', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('8', 'by20210712023859', '2021-07-12 14:39:14', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('9', 'bs20210712023925', '2021-07-12 14:39:36', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('10', 'bs20210713015918', '2021-07-13 13:59:47', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('11', 'bs20210713020821', '2021-07-13 14:08:39', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('12', 'by20210713021332', '2021-07-13 14:14:04', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('13', 'bs20210713021433', '2021-07-13 14:14:48', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('14', 'by20210713022837', '2021-07-13 14:28:46', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('15', 'bs20210713032302', '2021-07-13 15:23:19', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('16', 'by20210713032333', '2021-07-13 15:23:44', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('17', 'bs20210719085400', '2021-07-19 08:54:26', '0', '小军', '');
INSERT INTO `overflow` VALUES ('18', 'by20210719085615', '2021-07-19 08:56:30', '1', '小军', '');
INSERT INTO `overflow` VALUES ('19', 'bs20210719094413', '2021-07-19 09:44:43', '0', '小军', '');
INSERT INTO `overflow` VALUES ('20', 'bs20210719094413', '2021-07-19 09:45:03', '0', '小军', '');
INSERT INTO `overflow` VALUES ('21', 'by20210719094536', '2021-07-19 09:45:54', '1', '小军', '');
INSERT INTO `overflow` VALUES ('22', 'bs20210719102923', '2021-07-19 10:29:46', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('23', 'by20210719102958', '2021-07-19 10:30:14', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('24', 'bs20210719103038', '2021-07-19 10:30:52', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('25', 'bs20210719110308', '2021-07-19 11:04:00', '0', '小赖', '');
INSERT INTO `overflow` VALUES ('26', 'by20210719110418', '2021-07-19 11:04:32', '1', '小赖', '');
INSERT INTO `overflow` VALUES ('27', 'bs20210719021254', '2021-07-19 14:13:20', '0', '小军', '');
INSERT INTO `overflow` VALUES ('28', 'by20210719021337', '2021-07-19 14:13:50', '1', '小军', '');
