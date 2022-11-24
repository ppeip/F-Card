-- phpMyAdmin SQL Dump
-- version 4.4.15.10
-- https://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2022-11-23 17:47:18
-- 服务器版本： 8.0.24
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mybatis`
--

-- --------------------------------------------------------

--
-- 表的结构 `card`
--

CREATE TABLE IF NOT EXISTS `card` (
  `ability1` int DEFAULT NULL,
  `ability2` int DEFAULT NULL,
  `ability3` int DEFAULT NULL,
  `ability4` int DEFAULT NULL,
  `ability5` int DEFAULT NULL,
  `cardLevel` int DEFAULT NULL,
  `experience` int DEFAULT NULL,
  `rank` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `cardName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `introduction` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `preferance` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `card`
--

INSERT INTO `card` (`ability1`, `ability2`, `ability3`, `ability4`, `ability5`, `cardLevel`, `experience`, `rank`, `cardName`, `introduction`, `preferance`) VALUES
(5, 5, 5, 5, 5, 1, 0, '副教授', '壮年的栋哥', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 5, 1, 0, '学士', '天才栋哥', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 5, 1, 0, '讲师', '年轻的栋哥', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 5, 1, 0, '教授', '张栋', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 5, 1, 0, '教授', '栋1', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 5, 1, 0, '教授', '栋2', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 4, 1, 0, '教授', '栋哥', '一个很帅的老师', '软件工程'),
(5, 5, 5, 5, 5, 1, 0, '教授', '栋大哥', '一个很帅的老师', '软件工程');

-- --------------------------------------------------------

--
-- 表的结构 `cardinhand`
--

CREATE TABLE IF NOT EXISTS `cardinhand` (
  `ability1` int DEFAULT NULL,
  `ability2` int DEFAULT NULL,
  `ability3` int DEFAULT NULL,
  `ability4` int DEFAULT NULL,
  `ability5` int DEFAULT NULL,
  `cardName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `rank` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `introduction` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `preferance` varchar(300) DEFAULT NULL,
  `UID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `experience` int DEFAULT NULL,
  `cardLevel` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `cardinhand`
--

INSERT INTO `cardinhand` (`ability1`, `ability2`, `ability3`, `ability4`, `ability5`, `cardName`, `rank`, `introduction`, `preferance`, `UID`, `experience`, `cardLevel`) VALUES
(5, 5, 5, 5, 5, '栋大哥', '教授', '一个很帅的老师', '软件工程', '6666666', 0, 1);

-- --------------------------------------------------------

--
-- 表的结构 `personalcard`
--

CREATE TABLE IF NOT EXISTS `personalcard` (
  `ability1` int DEFAULT NULL,
  `ability2` int DEFAULT NULL,
  `ability3` int DEFAULT NULL,
  `ability4` int DEFAULT NULL,
  `ability5` int DEFAULT NULL,
  `cardLevel` int DEFAULT NULL,
  `experience` int DEFAULT NULL,
  `rank` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `cardName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `introduction` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `preferance` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `situation` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `UID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dateTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `duplicateCards` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `personalcard`
--

INSERT INTO `personalcard` (`ability1`, `ability2`, `ability3`, `ability4`, `ability5`, `cardLevel`, `experience`, `rank`, `cardName`, `introduction`, `preferance`, `situation`, `UID`, `dateTime`, `duplicateCards`) VALUES
(5, 5, 5, 5, 5, 1, 0, '教授', '栋哥', '一个很帅又幽默的老师', '软件工程', '闲置', '6666661', '2022-11-4', 1),
(5, 5, 5, 5, 5, 1, 0, '副教授', '壮年的栋哥', '一个很帅的老师', '软件工程', '闲置', '6666666', '', 1),
(5, 5, 5, 5, 5, 1, 0, '教授', '栋大哥', '一个很帅又幽默的老师', '软件工程', '闲置', '6666666', '2022-11-4', 1);

-- --------------------------------------------------------

--
-- 表的结构 `personaltask`
--

CREATE TABLE IF NOT EXISTS `personaltask` (
  `taskname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `date` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `current` int DEFAULT NULL,
  `end` int DEFAULT NULL,
  `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `reward` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `UID` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `personaltask`
--

INSERT INTO `personaltask` (`taskname`, `date`, `current`, `end`, `type`, `reward`, `UID`) VALUES
('进行1句对局', '2022-11-18', 0, 1, '每日', '500金币', '123456');

-- --------------------------------------------------------

--
-- 表的结构 `question`
--

CREATE TABLE IF NOT EXISTS `question` (
  `questionAbility1` float DEFAULT NULL,
  `questionAbility2` float DEFAULT NULL,
  `questionAbility3` float DEFAULT NULL,
  `questionAbility4` float DEFAULT NULL,
  `questionAbility5` float DEFAULT NULL,
  `questionName` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `preferance` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `question`
--

INSERT INTO `question` (`questionAbility1`, `questionAbility2`, `questionAbility3`, `questionAbility4`, `questionAbility5`, `questionName`, `preferance`) VALUES
(4, 3, 5, 1, 2, 'AI绘画', '机器学习');

-- --------------------------------------------------------

--
-- 表的结构 `rank`
--

CREATE TABLE IF NOT EXISTS `rank` (
  `collegeInfluence` int DEFAULT NULL,
  `grade` int DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `rank` int DEFAULT NULL,
  `college` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `dateTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `rank`
--

INSERT INTO `rank` (`collegeInfluence`, `grade`, `name`, `rank`, `college`, `dateTime`) VALUES
(100, 100, '李福安', 1, '计算机学院', '2022-11-17 12:00:00');

-- --------------------------------------------------------

--
-- 表的结构 `task`
--

CREATE TABLE IF NOT EXISTS `task` (
  `taskname` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `current` int DEFAULT NULL,
  `end` int DEFAULT NULL,
  `type` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `reward` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `date` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `task`
--

INSERT INTO `task` (`taskname`, `current`, `end`, `type`, `reward`, `date`) VALUES
('派遣三次', 0, 3, '每日任务', '金钱100', '2022-10-15'),
('派遣十五次', 0, 3, '每日任务', '金钱100', '2022-10-15'),
('进行10句对局', 3, 5, '每日', '500金币', '2022-11-18'),
('进行1句对局', 0, 1, '每日', '500金币', '2022-11-18');

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `collegeInfluence` int DEFAULT NULL,
  `coin` int DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `college` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `phoneNumber` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `UID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dateTime` datetime(6) DEFAULT NULL,
  `towerNumber` int DEFAULT '0',
  `sex` enum('男','女') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `battle` int NOT NULL DEFAULT '0',
  `win` int NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`collegeInfluence`, `coin`, `name`, `password`, `college`, `phoneNumber`, `UID`, `dateTime`, `towerNumber`, `sex`, `battle`, `win`) VALUES
(100, 1009, '李福安', '123456', '计算机学院', '13110635554', '032002', '2022-11-04 00:00:00.000000', 66, '男', 0, 0),
(100, 999, '李福安', '123456', '计算机学院', '13110635554', '123456', '2022-11-14 00:00:00.000000', 66, '男', 0, 0),
(100, 999, '王一', '123456', '计算机学院', '13110635554', '6666661', '2022-11-14 00:00:00.000000', 66, '男', 0, 0),
(100, 999, '李福安', '123456', '计算机学院', '13110635554', '6666666', '2022-11-14 00:00:00.000000', 66, '男', 0, 0),
(99999999, 99999999, '李福安', '123456', '计算机学院', '13110677554', '667897', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(100, 999, '李福安', '123456', '计算机学院', '13110677554', '668866', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(1000000, 999, '李福安', '123456', '计算机学院', '13110677554', '668867', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(1000000000, 999, '李福安', '123456', '计算机学院', '13110677554', '668877', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(99999999, 99999999, '阿萨德欧昂倒计时拉加德拉康绝地欧文去奇偶丘吉尔', '123456', '计算机学院', '13110677554', '669897', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(99999999, 99999999, '阿萨德欧昂倒计时拉加德拉康绝地欧文去奇尔地欧偶丘吉尔地欧文去奇偶丘吉尔地奇偶丘吉尔地欧文去奇偶丘吉尔', '123456', '计算机学院', '13110677554', '679817', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(99999999, 99999999, '阿萨德欧昂倒计时拉加德拉康绝地欧文去奇尔地欧偶丘吉尔地欧文去奇偶丘吉尔地奇偶丘吉尔地欧文去奇偶丘吉尔', '123456dasdsadsadsaczvcvccxqweqw', '计算机学院', '13110677554', '777017', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(99999999, 99999999, '阿萨德欧昂倒计时拉加德拉康绝地欧文去奇尔地欧偶丘吉尔地欧文去奇偶丘吉尔地奇偶丘吉尔地欧文去奇偶丘吉尔', '123456dasdsadsadsaczvcvccxqweqw', '计算机学院', '13110677554', '77717', '2022-07-04 00:00:00.000000', 99, '男', 0, 0),
(100, 100, '李福安', '123456', '计算机学院', '13110677554', '778077', '2022-12-12 00:00:00.000000', 222, '男', 0, 0),
(100, 100, '李福安', '123456', '计算机学院', '13110677554', '778777', '2022-12-12 00:00:00.000000', 500, '男', 0, 0),
(100, 100, '李福安', '123456', '计算机学院', '13110677554', '778778', '2022-12-12 00:00:00.000000', 50000000, '男', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`cardName`);

--
-- Indexes for table `cardinhand`
--
ALTER TABLE `cardinhand`
  ADD PRIMARY KEY (`UID`,`cardName`),
  ADD KEY `cardinhand_cardName` (`cardName`);

--
-- Indexes for table `personalcard`
--
ALTER TABLE `personalcard`
  ADD PRIMARY KEY (`UID`,`cardName`),
  ADD KEY `personalcard_cardName` (`cardName`);

--
-- Indexes for table `personaltask`
--
ALTER TABLE `personaltask`
  ADD PRIMARY KEY (`type`,`UID`),
  ADD KEY `personaltask_UID` (`UID`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`questionName`);

--
-- Indexes for table `rank`
--
ALTER TABLE `rank`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`taskname`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UID`),
  ADD KEY `name` (`name`);

--
-- 限制导出的表
--

--
-- 限制表 `cardinhand`
--
ALTER TABLE `cardinhand`
  ADD CONSTRAINT `cardinhand_cardName` FOREIGN KEY (`cardName`) REFERENCES `card` (`cardName`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `cardinhand_UID` FOREIGN KEY (`UID`) REFERENCES `user` (`UID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- 限制表 `personalcard`
--
ALTER TABLE `personalcard`
  ADD CONSTRAINT `personalcard_cardName` FOREIGN KEY (`cardName`) REFERENCES `card` (`cardName`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `personalcard_UID` FOREIGN KEY (`UID`) REFERENCES `user` (`UID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- 限制表 `personaltask`
--
ALTER TABLE `personaltask`
  ADD CONSTRAINT `personaltask_UID` FOREIGN KEY (`UID`) REFERENCES `user` (`UID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- 限制表 `rank`
--
ALTER TABLE `rank`
  ADD CONSTRAINT `rank_name` FOREIGN KEY (`name`) REFERENCES `user` (`name`) ON DELETE RESTRICT ON UPDATE RESTRICT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
