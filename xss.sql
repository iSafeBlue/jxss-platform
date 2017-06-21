/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : xss

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2017-06-21 11:58:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `xss_admin`
-- ----------------------------
DROP TABLE IF EXISTS `xss_admin`;
CREATE TABLE `xss_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminname` varchar(255) NOT NULL,
  `adminpass` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xss_admin
-- ----------------------------
INSERT INTO `xss_admin` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e');

-- ----------------------------
-- Table structure for `xss_content`
-- ----------------------------
DROP TABLE IF EXISTS `xss_content`;
CREATE TABLE `xss_content` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xss_content
-- ----------------------------

-- ----------------------------
-- Table structure for `xss_invite`
-- ----------------------------
DROP TABLE IF EXISTS `xss_invite`;
CREATE TABLE `xss_invite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `invitecode` varchar(255) NOT NULL,
  `credate` date NOT NULL,
  `isuse` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xss_invite
-- ----------------------------
INSERT INTO `xss_invite` VALUES ('1', '123456', '2017-06-20', '1');
INSERT INTO `xss_invite` VALUES ('2', '35b2386b792ce67cb13c971b354e83f0', '2017-06-21', '0');
INSERT INTO `xss_invite` VALUES ('3', '8d70de529561d764a6acb2625a025480', '2017-06-21', '0');

-- ----------------------------
-- Table structure for `xss_project`
-- ----------------------------
DROP TABLE IF EXISTS `xss_project`;
CREATE TABLE `xss_project` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) NOT NULL,
  `pdescription` varchar(255) NOT NULL,
  `createdate` varchar(255) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xss_project
-- ----------------------------

-- ----------------------------
-- Table structure for `xss_user`
-- ----------------------------
DROP TABLE IF EXISTS `xss_user`;
CREATE TABLE `xss_user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xss_user
-- ----------------------------
INSERT INTO `xss_user` VALUES ('9', 'test@qq.com', 'root', 'e10adc3949ba59abbe56e057f20f883e');
