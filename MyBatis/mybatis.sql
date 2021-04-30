/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 30/04/2021 14:49:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '博客id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客标题',
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客作者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `views` int(30) NULL DEFAULT NULL COMMENT '浏览量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1c4b58fbeadc4365913f95907200c93a', 'MyBatis如此简单', '狂胜说', '2021-04-07 17:16:39', 9999);
INSERT INTO `blog` VALUES ('3cffea4e1e1e4096a2b5051dbc41248f', 'Spring如此简单', '狂胜说', '2021-04-07 17:20:36', 1000);
INSERT INTO `blog` VALUES ('74928bcd8dcf4dbda32ace95f4599e8e', '微服务如此简单', '狂胜说', '2021-04-07 17:20:36', 9999);
INSERT INTO `blog` VALUES ('a1630ab87d1c4d72b8ba452551317094', 'Java如此简单1', '狂胜说', '2021-04-07 17:20:36', 9999);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(20) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tid` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '小明', 1);
INSERT INTO `student` VALUES (2, '小红', 1);
INSERT INTO `student` VALUES (3, '小张', 2);
INSERT INTO `student` VALUES (4, '小李', 1);
INSERT INTO `student` VALUES (5, '小王', 1);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(20) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '秦老师');
INSERT INTO `teacher` VALUES (2, 'li');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(20) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pwd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '刘一', 'liuyi');
INSERT INTO `user` VALUES (2, '二', 'er');
INSERT INTO `user` VALUES (3, '张三', 'zhangsan');
INSERT INTO `user` VALUES (4, '李四', 'lisi');
INSERT INTO `user` VALUES (5, '王五', 'wangwu');
INSERT INTO `user` VALUES (6, '六子', 'liuzi');
INSERT INTO `user` VALUES (7, '刘', 'liu');

SET FOREIGN_KEY_CHECKS = 1;
