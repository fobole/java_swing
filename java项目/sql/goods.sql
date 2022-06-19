/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(50) NOT NULL,
  `gbid` decimal(10,2) NOT NULL,
  `gprice` decimal(10,2) NOT NULL,
  `gspec` varchar(10) NOT NULL,
  `cid` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `sztai` int(1) NOT NULL DEFAULT '0' COMMENT '0 上架 1 下架',
  `gopera` varchar(50) NOT NULL,
  `gdate` datetime NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '农夫山沟', '1.50', '3.00', '箱', '2', '2', '0', '小赖', '2021-06-17 09:58:58');
INSERT INTO `goods` VALUES ('2', '六个核弹', '2.00', '8.50', '箱', '1', '2', '1', '小赖', '2021-06-17 10:01:22');
INSERT INTO `goods` VALUES ('3', '雷碧', '2.00', '4.00', '瓶', '2', '1', '0', '小赖', '2021-06-17 10:02:02');
INSERT INTO `goods` VALUES ('15', '奥利月', '2.00', '10.00', '米', '1', '1', '0', '小伟', '2021-06-29 10:32:29');
INSERT INTO `goods` VALUES ('16', '奥里给', '2.00', '10.00', '盒', '1', '1', '0', '小军', '2021-07-01 16:39:38');
INSERT INTO `goods` VALUES ('18', '动脉', '2.00', '4.00', '瓶', '2', '1', '0', '小军', '2021-07-01 17:14:19');
INSERT INTO `goods` VALUES ('22', '土豆', '2.00', '4.00', '斤', '1', '1', '0', '小军', '2021-07-13 15:28:46');
INSERT INTO `goods` VALUES ('23', '火龙果', '5.00', '10.00', '斤', '1', '1', '0', '小军', '2021-07-06 18:33:14');
INSERT INTO `goods` VALUES ('24', '方便面', '2.00', '5.00', '包', '1', '2', '0', '小军', '2021-07-09 08:41:21');
INSERT INTO `goods` VALUES ('25', '可乐', '30.00', '60.00', '箱', '1', '1', '0', '小军', '2021-07-09 08:46:23');
INSERT INTO `goods` VALUES ('26', '雪碧', '3.00', '6.00', '瓶', '1', '1', '0', '小军', '2021-07-09 08:52:37');
INSERT INTO `goods` VALUES ('27', '旺仔', '3.00', '6.00', '瓶', '1', '3', '0', '小军', '2021-07-09 08:53:48');
INSERT INTO `goods` VALUES ('28', '乐视', '2.00', '7.00', '包', '1', '2', '0', '小军', '2021-07-09 10:05:14');
INSERT INTO `goods` VALUES ('29', '白菜', '1.00', '4.50', '斤', '1', '1', '0', '小军', '2021-07-09 10:21:14');
INSERT INTO `goods` VALUES ('30', '小白菜', '2.00', '6.00', '斤2', '1', '2', '0', '小军', '2021-07-09 10:22:09');
INSERT INTO `goods` VALUES ('31', '白茶', '2.00', '4.00', '瓶', '1', '2', '0', '小军', '2021-07-09 14:11:40');
INSERT INTO `goods` VALUES ('32', '白茶', '2.00', '4.00', '瓶', '1', '2', '0', '小军', '2021-07-09 14:17:34');
INSERT INTO `goods` VALUES ('33', '开心果', '10.00', '20.00', '斤', '1', '1', '0', '小军', '2021-07-09 15:37:20');
INSERT INTO `goods` VALUES ('34', '怡宝', '1.00', '3.00', '瓶', '1', '2', '0', '小军', '2021-07-09 15:38:40');
INSERT INTO `goods` VALUES ('35', '西瓜', '1.00', '4.00', '斤', '3', '3', '0', '小军', '2021-07-09 16:55:32');
INSERT INTO `goods` VALUES ('36', 'AB丐', '2.00', '5.00', '箱', '1', '1', '0', '小军', '2021-07-09 22:13:37');
INSERT INTO `goods` VALUES ('37', '魔域', '1.00', '5.00', '斤', '1', '3', '0', '小军', '2021-07-09 22:18:05');
INSERT INTO `goods` VALUES ('38', '旺仔牛逼糖', '2.00', '23.00', '给', '1', '1', '0', '小岚', '2021-07-13 14:05:54');
INSERT INTO `goods` VALUES ('39', '葡萄', '8.00', '18.00', '斤', '3', '1', '0', '小军', '2021-07-13 14:17:50');
INSERT INTO `goods` VALUES ('40', '魔域', '1.50', '5.00', '斤', '1', '1', '0', '小岚', '2021-07-17 21:13:53');
INSERT INTO `goods` VALUES ('41', '开心果', '10.00', '20.00', '斤', '1', '1', '0', '小岚', '2021-07-18 13:37:10');
INSERT INTO `goods` VALUES ('42', '魔域', '1.00', '5.00', '斤', '1', '1', '0', '小军', '2021-07-19 08:58:45');
INSERT INTO `goods` VALUES ('57', '苹果', '20.00', '35.00', '箱', '2', '1', '0', '小丰', '2021-07-19 09:18:07');
INSERT INTO `goods` VALUES ('58', '辣椒', '5.00', '18.00', '斤', '4', '1', '0', '小军', '2021-07-19 10:45:11');
INSERT INTO `goods` VALUES ('59', '江小白', '14.80', '16.00', '瓶', '2', '1', '0', '小丰', '2021-07-19 13:26:04');
INSERT INTO `goods` VALUES ('60', '江小白', '10.00', '18.00', '瓶', '1', '1', '0', '小军', '2021-07-19 14:02:27');
INSERT INTO `goods` VALUES ('61', '苹果', '25.00', '35.00', '箱', '2', '1', '1', '小丰', '2021-07-19 14:18:24');
