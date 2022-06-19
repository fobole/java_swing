/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2021-07-21 16:19:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for caixaingpurchase
-- ----------------------------
DROP TABLE IF EXISTS `caixaingpurchase`;
CREATE TABLE `caixaingpurchase` (
  `xpid` int(11) NOT NULL AUTO_INCREMENT,
  `podd` varchar(100) NOT NULL,
  `gid` int(11) NOT NULL,
  `xpshu` int(11) NOT NULL,
  PRIMARY KEY (`xpid`),
  UNIQUE KEY `xpid` (`xpid`)
) ENGINE=InnoDB AUTO_INCREMENT=249 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of caixaingpurchase
-- ----------------------------
INSERT INTO `caixaingpurchase` VALUES ('1', 'jin110', '2', '100');
INSERT INTO `caixaingpurchase` VALUES ('2', 'tui120', '1', '200');
INSERT INTO `caixaingpurchase` VALUES ('147', 'CT20210708082139', '3', '1');
INSERT INTO `caixaingpurchase` VALUES ('148', 'CT20210709084222', '23', '15');
INSERT INTO `caixaingpurchase` VALUES ('149', 'CJ20210709084450', '25', '7');
INSERT INTO `caixaingpurchase` VALUES ('150', 'CJ20210709084450', '19', '7');
INSERT INTO `caixaingpurchase` VALUES ('151', 'CJ20210709085139', '0', '44');
INSERT INTO `caixaingpurchase` VALUES ('152', 'CJ20210709102037', '29', '100');
INSERT INTO `caixaingpurchase` VALUES ('153', 'CJ20210709110635', '29', '112');
INSERT INTO `caixaingpurchase` VALUES ('154', 'CJ20210709111415', '29', '100');
INSERT INTO `caixaingpurchase` VALUES ('155', 'CJ20210709111415', '26', '100');
INSERT INTO `caixaingpurchase` VALUES ('156', 'CT20210709011317', '25', '1');
INSERT INTO `caixaingpurchase` VALUES ('157', 'CJ20210709011329', '26', '1');
INSERT INTO `caixaingpurchase` VALUES ('158', 'CJ20210709045423', '35', '100');
INSERT INTO `caixaingpurchase` VALUES ('159', 'CJ20210709100718', '36', '100');
INSERT INTO `caixaingpurchase` VALUES ('160', 'CJ20210709100718', '33', '1');
INSERT INTO `caixaingpurchase` VALUES ('161', 'CJ20210709100718', '26', '1');
INSERT INTO `caixaingpurchase` VALUES ('162', 'CJ20210709100718', '29', '1');
INSERT INTO `caixaingpurchase` VALUES ('163', 'CJ20210709101406', '37', '200');
INSERT INTO `caixaingpurchase` VALUES ('164', 'CJ20210709101406', '35', '2');
INSERT INTO `caixaingpurchase` VALUES ('165', 'CT20210709112319', '25', '1');
INSERT INTO `caixaingpurchase` VALUES ('166', 'CT20210709112319', '19', '1');
INSERT INTO `caixaingpurchase` VALUES ('167', 'CJ20210710022821', '33', '1');
INSERT INTO `caixaingpurchase` VALUES ('168', 'CJ20210710022821', '25', '1');
INSERT INTO `caixaingpurchase` VALUES ('169', 'CJ20210710022927', '35', '1');
INSERT INTO `caixaingpurchase` VALUES ('170', 'CJ20210710022927', '37', '1');
INSERT INTO `caixaingpurchase` VALUES ('171', 'CJ20210710022943', '2', '1');
INSERT INTO `caixaingpurchase` VALUES ('172', 'CJ20210710022943', '34', '1');
INSERT INTO `caixaingpurchase` VALUES ('173', 'CJ20210710023023', '2', '1');
INSERT INTO `caixaingpurchase` VALUES ('174', 'CJ20210710023023', '34', '1');
INSERT INTO `caixaingpurchase` VALUES ('175', 'CJ20210710024223', '35', '1');
INSERT INTO `caixaingpurchase` VALUES ('176', 'CJ20210710024223', '37', '1');
INSERT INTO `caixaingpurchase` VALUES ('177', 'CT20210710024457', '33', '1');
INSERT INTO `caixaingpurchase` VALUES ('178', 'CT20210710024457', '26', '1');
INSERT INTO `caixaingpurchase` VALUES ('179', 'CJ20210710024508', '35', '1');
INSERT INTO `caixaingpurchase` VALUES ('180', 'CJ20210710024508', '37', '1');
INSERT INTO `caixaingpurchase` VALUES ('181', 'CT20210710045004', '37', '1');
INSERT INTO `caixaingpurchase` VALUES ('182', 'CT20210710045004', '35', '2');
INSERT INTO `caixaingpurchase` VALUES ('183', 'CJ20210712084958', '36', '1');
INSERT INTO `caixaingpurchase` VALUES ('184', 'CJ20210712084958', '29', '1');
INSERT INTO `caixaingpurchase` VALUES ('185', 'CT20210712085132', '36', '1');
INSERT INTO `caixaingpurchase` VALUES ('186', 'CT20210712085132', '22', '1');
INSERT INTO `caixaingpurchase` VALUES ('187', 'CJ20210712031402', '3', '1');
INSERT INTO `caixaingpurchase` VALUES ('188', 'CJ20210712031402', '15', '1');
INSERT INTO `caixaingpurchase` VALUES ('189', 'CJ20210712031402', '16', '1');
INSERT INTO `caixaingpurchase` VALUES ('190', 'CT20210713105225', '29', '1');
INSERT INTO `caixaingpurchase` VALUES ('191', 'CT20210713105405', '25', '1');
INSERT INTO `caixaingpurchase` VALUES ('192', 'CJ20210713020317', '38', '100');
INSERT INTO `caixaingpurchase` VALUES ('193', 'CJ20210713021609', '16', '12');
INSERT INTO `caixaingpurchase` VALUES ('194', 'CJ20210713021609', '39', '199');
INSERT INTO `caixaingpurchase` VALUES ('195', 'CJ20210713030634', '36', '17');
INSERT INTO `caixaingpurchase` VALUES ('196', 'CJ20210713030634', '33', '2');
INSERT INTO `caixaingpurchase` VALUES ('197', 'CJ20210713030634', '29', '23');
INSERT INTO `caixaingpurchase` VALUES ('198', 'CJ20210713030634', '22', '1');
INSERT INTO `caixaingpurchase` VALUES ('199', 'CJ20210713030634', '38', '100');
INSERT INTO `caixaingpurchase` VALUES ('200', 'CT20210713030832', '38', '150');
INSERT INTO `caixaingpurchase` VALUES ('201', 'CT20210713030832', '36', '17');
INSERT INTO `caixaingpurchase` VALUES ('202', 'CT20210713030832', '33', '2');
INSERT INTO `caixaingpurchase` VALUES ('203', 'CT20210713030832', '29', '23');
INSERT INTO `caixaingpurchase` VALUES ('204', 'CT20210713030832', '22', '1');
INSERT INTO `caixaingpurchase` VALUES ('205', 'CT20210713043649', '35', '1');
INSERT INTO `caixaingpurchase` VALUES ('206', 'CJ20210713081120', '34', '1');
INSERT INTO `caixaingpurchase` VALUES ('207', 'CT20210714014428', '34', '1');
INSERT INTO `caixaingpurchase` VALUES ('208', 'CJ20210714034929', '2', '10');
INSERT INTO `caixaingpurchase` VALUES ('209', 'CJ20210714034929', '34', '10');
INSERT INTO `caixaingpurchase` VALUES ('210', 'CT20210714035219', '34', '5');
INSERT INTO `caixaingpurchase` VALUES ('211', 'CT20210714035219', '2', '10');
INSERT INTO `caixaingpurchase` VALUES ('212', 'CJ20210715071058', '2', '1');
INSERT INTO `caixaingpurchase` VALUES ('213', 'CJ20210715071058', '34', '23');
INSERT INTO `caixaingpurchase` VALUES ('214', 'CT20210715071200', '34', '13');
INSERT INTO `caixaingpurchase` VALUES ('215', 'CT20210715071200', '2', '21');
INSERT INTO `caixaingpurchase` VALUES ('216', 'CJ20210718021716', '36', '1');
INSERT INTO `caixaingpurchase` VALUES ('217', 'CJ20210718021716', '33', '1');
INSERT INTO `caixaingpurchase` VALUES ('218', 'CJ20210718021716', '29', '1');
INSERT INTO `caixaingpurchase` VALUES ('219', 'CJ20210718104654', '38', '1');
INSERT INTO `caixaingpurchase` VALUES ('220', 'CJ20210718104654', '39', '1');
INSERT INTO `caixaingpurchase` VALUES ('221', 'CJ20210719082458', '16', '12');
INSERT INTO `caixaingpurchase` VALUES ('222', 'CJ20210719082458', '39', '2');
INSERT INTO `caixaingpurchase` VALUES ('223', 'CJ20210719085209', '26', '12');
INSERT INTO `caixaingpurchase` VALUES ('224', 'CJ20210719085209', '25', '11');
INSERT INTO `caixaingpurchase` VALUES ('225', 'CT20210719104346', '39', '12');
INSERT INTO `caixaingpurchase` VALUES ('226', 'CT20210719104346', '29', '13');
INSERT INTO `caixaingpurchase` VALUES ('227', 'CJ20210719104441', '58', '100');
INSERT INTO `caixaingpurchase` VALUES ('228', 'CJ20210719104441', '33', '1');
INSERT INTO `caixaingpurchase` VALUES ('229', 'CJ20210719104441', '29', '1');
INSERT INTO `caixaingpurchase` VALUES ('230', 'CT20210719104830', '58', '100');
INSERT INTO `caixaingpurchase` VALUES ('231', 'CT20210719104830', '33', '1');
INSERT INTO `caixaingpurchase` VALUES ('232', 'CT20210719104830', '29', '1');
INSERT INTO `caixaingpurchase` VALUES ('233', 'CJ20210719105927', '58', '100');
INSERT INTO `caixaingpurchase` VALUES ('234', 'CJ20210719105927', '39', '100');
INSERT INTO `caixaingpurchase` VALUES ('235', 'CJ20210719013143', '58', '100');
INSERT INTO `caixaingpurchase` VALUES ('236', 'CJ20210719013143', '39', '100');
INSERT INTO `caixaingpurchase` VALUES ('237', 'CT20210719013221', '58', '100');
INSERT INTO `caixaingpurchase` VALUES ('238', 'CT20210719013221', '39', '100');
INSERT INTO `caixaingpurchase` VALUES ('239', 'CJ20210719014532', '58', '99');
INSERT INTO `caixaingpurchase` VALUES ('240', 'CJ20210719014532', '39', '99');
INSERT INTO `caixaingpurchase` VALUES ('241', 'CT20210719014644', '58', '99');
INSERT INTO `caixaingpurchase` VALUES ('242', 'CT20210719014644', '39', '99');
INSERT INTO `caixaingpurchase` VALUES ('243', 'CJ20210719015929', '58', '99');
INSERT INTO `caixaingpurchase` VALUES ('244', 'CJ20210719015929', '39', '100');
INSERT INTO `caixaingpurchase` VALUES ('245', 'CT20210719020049', '58', '99');
INSERT INTO `caixaingpurchase` VALUES ('246', 'CT20210719020049', '39', '100');
INSERT INTO `caixaingpurchase` VALUES ('247', 'CJ20210719020147', '60', '100');
INSERT INTO `caixaingpurchase` VALUES ('248', 'CT20210719020300', '58', '50');
