/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:20:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for purchase
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `podd` varchar(100) NOT NULL,
  `sid` int(11) NOT NULL,
  `pdate` datetime NOT NULL,
  `pztai` int(1) NOT NULL DEFAULT '0' COMMENT '0 审核 1未审核',
  `pcope` decimal(10,2) NOT NULL,
  `ppaid` decimal(10,2) DEFAULT NULL,
  `pagent` varchar(250) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=182 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchase
-- ----------------------------
INSERT INTO `purchase` VALUES ('1', 'jin110', '2', '2021-06-17 18:49:46', '-1', '300.00', '400.00', '小岚');
INSERT INTO `purchase` VALUES ('2', 'tui120', '3', '2021-06-17 18:52:12', '0', '500.00', '450.00', '小岚');
INSERT INTO `purchase` VALUES ('3', 'jin119', '1', '2021-06-30 18:54:05', '0', '600.00', '600.00', '小岚');
INSERT INTO `purchase` VALUES ('4', 'jin1', '1', '2020-01-01 00:00:00', '0', '10.00', '10.00', '小赖');
INSERT INTO `purchase` VALUES ('68', 'CJ20210701101654', '1', '2021-07-01 10:17:16', '0', '40.00', '40.00', '某某某');
INSERT INTO `purchase` VALUES ('69', 'CJ20210701101852', '1', '2021-07-01 10:19:10', '0', '40.00', '40.00', '某某某');
INSERT INTO `purchase` VALUES ('70', 'CJ20210701102336', '1', '2021-07-01 10:23:53', '0', '20.00', '20.00', '某某某');
INSERT INTO `purchase` VALUES ('71', 'CJ20210701102518', '1', '2021-07-01 10:25:58', '0', '200.00', '200.00', '某某某');
INSERT INTO `purchase` VALUES ('72', 'CJ20210701102722', '1', '2021-07-01 10:27:47', '0', '200.00', '200.00', '某某某');
INSERT INTO `purchase` VALUES ('73', 'CJ20210701105522', '1', '2021-07-01 10:55:41', '0', '200.00', '200.00', '某某某');
INSERT INTO `purchase` VALUES ('74', 'CJ20210701112825', '1', '2021-07-01 11:28:43', '0', '200.00', '200.00', '某某某');
INSERT INTO `purchase` VALUES ('75', 'CJ20210701014755', '1', '2021-07-01 13:48:25', '0', '40.00', '40.00', '某某某');
INSERT INTO `purchase` VALUES ('76', 'CJ20210701022836', '1', '2021-07-01 14:28:51', '0', '4.00', '4.00', '某某某');
INSERT INTO `purchase` VALUES ('77', 'CJ20210701022909', '1', '2021-07-01 14:29:23', '0', '4.00', '4.00', '某某某');
INSERT INTO `purchase` VALUES ('147', 'CT20210710024457', '1', '2021-07-10 14:45:08', '1', '13.00', '13.00', '某某某');
INSERT INTO `purchase` VALUES ('148', 'CJ20210710024508', '3', '2021-07-10 14:45:42', '1', '2.00', '2.00', '某某某');
INSERT INTO `purchase` VALUES ('149', 'CT20210710045004', '3', '2021-07-10 16:52:16', '1', '3.00', '3.00', '小岚');
INSERT INTO `purchase` VALUES ('150', 'CJ20210712084958', '1', '2021-07-12 08:50:24', '-1', '3.00', '3.00', '小岚');
INSERT INTO `purchase` VALUES ('151', 'CT20210712085132', '1', '2021-07-12 08:51:57', '0', '4.00', '4.00', '小岚');
INSERT INTO `purchase` VALUES ('152', 'CJ20210712031402', '1', '2021-07-12 15:24:24', '1', '6.00', '6.00', '小岚');
INSERT INTO `purchase` VALUES ('153', 'CT20210713105225', '1', '2021-07-13 10:52:52', '0', '1.00', '1.00', '小岚');
INSERT INTO `purchase` VALUES ('154', 'CT20210713105405', '1', '2021-07-13 10:54:39', '1', '30.00', '30.00', '小岚');
INSERT INTO `purchase` VALUES ('155', 'CJ20210713020317', '1', '2021-07-13 14:06:02', '1', '200.00', '200.00', '小岚');
INSERT INTO `purchase` VALUES ('156', 'CJ20210713021609', '1', '2021-07-13 14:17:55', '1', '1616.00', '1616.00', '某某某');
INSERT INTO `purchase` VALUES ('157', 'CJ20210713030634', '1', '2021-07-13 15:07:49', '-1', '279.00', '279.00', '小岚');
INSERT INTO `purchase` VALUES ('158', 'CT20210713030832', '1', '2021-07-13 15:09:25', '0', '379.00', '379.00', '小岚');
INSERT INTO `purchase` VALUES ('159', 'CT20210713043649', '3', '2021-07-13 16:38:27', '0', '1.00', '1.00', '小岚');
INSERT INTO `purchase` VALUES ('160', 'CJ20210713081120', '2', '2021-07-13 20:11:35', '-1', '1.00', '1.00', '小岚');
INSERT INTO `purchase` VALUES ('161', 'CT20210714014428', '2', '2021-07-14 13:45:11', '0', '1.00', '1.00', '某某某');
INSERT INTO `purchase` VALUES ('162', 'CJ20210714034929', '2', '2021-07-14 15:50:14', '0', '30.00', '30.00', '某某某');
INSERT INTO `purchase` VALUES ('163', 'CT20210714035219', '2', '2021-07-14 15:52:40', '0', '25.00', '25.00', '某某某');
INSERT INTO `purchase` VALUES ('164', 'CJ20210715071058', '2', '2021-07-15 19:11:43', '-1', '25.00', '25.00', '小岚');
INSERT INTO `purchase` VALUES ('165', 'CT20210715071200', '2', '2021-07-15 19:13:11', '0', '55.00', '55.00', '小岚');
INSERT INTO `purchase` VALUES ('166', 'CJ20210718021716', '1', '2021-07-18 14:20:15', '0', '13.00', '13.00', '小岚');
INSERT INTO `purchase` VALUES ('167', 'CJ20210718104654', '1', '2021-07-18 22:47:18', '1', '10.00', '10.00', '小军');
INSERT INTO `purchase` VALUES ('168', 'CJ20210719082458', '1', '2021-07-19 08:25:22', '0', '40.00', '40.00', '小军');
INSERT INTO `purchase` VALUES ('169', 'CJ20210719085209', '1', '2021-07-19 08:52:36', '1', '366.00', '366.00', '小军');
INSERT INTO `purchase` VALUES ('170', 'CT20210719104346', '1', '2021-07-19 10:44:13', '1', '109.00', '109.00', '小军');
INSERT INTO `purchase` VALUES ('171', 'CJ20210719104441', '1', '2021-07-19 10:45:32', '-1', '511.00', '511.00', '小军');
INSERT INTO `purchase` VALUES ('172', 'CT20210719104830', '1', '2021-07-19 10:48:49', '1', '511.00', '511.00', '小军');
INSERT INTO `purchase` VALUES ('173', 'CJ20210719105927', '1', '2021-07-19 10:59:48', '0', '1300.00', '1300.00', '小军');
INSERT INTO `purchase` VALUES ('174', 'CJ20210719013143', '1', '2021-07-19 13:32:07', '-1', '1300.00', '1300.00', '小军');
INSERT INTO `purchase` VALUES ('175', 'CT20210719013221', '1', '2021-07-19 13:32:37', '0', '1300.00', '1300.00', '小军');
INSERT INTO `purchase` VALUES ('176', 'CJ20210719014532', '1', '2021-07-19 13:46:12', '0', '1287.00', '1287.00', '小军');
INSERT INTO `purchase` VALUES ('177', 'CT20210719014644', '1', '2021-07-19 13:47:24', '0', '1287.00', '1287.00', '小军');
INSERT INTO `purchase` VALUES ('178', 'CJ20210719015929', '1', '2021-07-19 14:00:10', '-1', '1295.00', '1295.00', '小军');
INSERT INTO `purchase` VALUES ('179', 'CT20210719020049', '1', '2021-07-19 14:01:19', '0', '1295.00', '1295.00', '小军');
INSERT INTO `purchase` VALUES ('180', 'CJ20210719020147', '1', '2021-07-19 14:02:39', '0', '1000.00', '1000.00', '小军');
INSERT INTO `purchase` VALUES ('181', 'CT20210719020300', '1', '2021-07-19 14:03:45', '0', '250.00', '250.00', '小军');
