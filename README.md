UU
==

##数据库设计记到这里吧。


``-- MySQL dump 11.13  Distrib 5.5.23, for Win32 (x86)
--
-- Host: localhost    Database: uuproject
-- ------------------------------------------------------
-- Server version  5.5.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `login_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `adid` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`adid`),
  UNIQUE KEY `login_name` (`login_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `avatar`
--

DROP TABLE IF EXISTS `avatar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `avatar` (
  `uid` bigint(20) NOT NULL,
  `url` varchar(30) NOT NULL,
  `avatar_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`avatar_id`),
  KEY `avatar_uid_idx` (`uid`),
  CONSTRAINT `fk_avatar_userinfo` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avatar`
--

LOCK TABLES `avatar` WRITE;
/*!40000 ALTER TABLE `avatar` DISABLE KEYS */;
/*!40000 ALTER TABLE `avatar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog` (
  `uid` bigint(20) DEFAULT NULL,
  `blog_content` text NOT NULL,
  `blog_type` char(20) NOT NULL,
  `view_count` bigint(20) NOT NULL,
  `comment_count` bigint(20) NOT NULL,
  `visiable` tinyint(1) NOT NULL,
  `time` time NOT NULL,
  `blog_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`blog_id`),
  KEY `FK_blog_userinfo` (`uid`),
  CONSTRAINT `FK_blog_userinfo` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog`
--

LOCK TABLES `blog` WRITE;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_comment`
--

DROP TABLE IF EXISTS `blog_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_comment` (
  `blogcomment_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `blog_id` bigint(20) NOT NULL,
  `content` char(100) NOT NULL,
  `time` time NOT NULL,
  PRIMARY KEY (`blogcomment_id`),
  KEY `uid` (`uid`),
  KEY `blog_id` (`blog_id`),
  CONSTRAINT `blog_comment_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `blog_comment_ibfk_2` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`blog_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_comment`
--

LOCK TABLES `blog_comment` WRITE;
/*!40000 ALTER TABLE `blog_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `blog_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feed`
--

DROP TABLE IF EXISTS `feed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feed` (
  `uid` bigint(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `feed_srcid` bigint(20) NOT NULL,
  `feed_type` varchar(20) NOT NULL,
  `title` varchar(40) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `update_time` time NOT NULL,
  `feed_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`feed_id`),
  KEY `FK_feed_userinfo` (`uid`),
  CONSTRAINT `FK_feed_userinfo` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feed`
--

LOCK TABLES `feed` WRITE;
/*!40000 ALTER TABLE `feed` DISABLE KEYS */;
/*!40000 ALTER TABLE `feed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_info`
--

DROP TABLE IF EXISTS `login_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_info` (
  `password` varchar(10) NOT NULL,
  `login_name` varchar(20) NOT NULL,
  `logininfo_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  PRIMARY KEY (`logininfo_id`),
  UNIQUE KEY `login_name` (`login_name`),
  KEY `login_info_uid_idx` (`uid`),
  CONSTRAINT `FK_login_info_userinfo` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_info`
--

LOCK TABLES `login_info` WRITE;
/*!40000 ALTER TABLE `login_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `login_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status` (
  `uid` bigint(20) NOT NULL,
  `status_message` longtext NOT NULL,
  `time` time NOT NULL,
  `status_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`status_id`),
  KEY `FK_status_userinfo` (`uid`),
  CONSTRAINT `FK_status_userinfo` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_comment`
--

DROP TABLE IF EXISTS `status_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status_comment` (
  `uid` bigint(20) NOT NULL,
  `content` char(100) NOT NULL,
  `time` time NOT NULL,
  `status_id` bigint(20) NOT NULL,
  `statuscomment_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`statuscomment_id`),
  KEY `status_comment_uid_idx` (`uid`),
  KEY `status_comment_status_id_idx` (`status_id`),
  CONSTRAINT `FK_status_comment_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`status_id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_status_comment_userinfo` FOREIGN KEY (`uid`) REFERENCES `userinfo` (`uid`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_comment`
--

LOCK TABLES `status_comment` WRITE;
/*!40000 ALTER TABLE `status_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `status_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userinfo` (
  `name` varchar(30) NOT NULL,
  `sex` tinyint(1) NOT NULL,
  `birthday` date NOT NULL,
  `email` varchar(40) NOT NULL,
  `class_name` varchar(20) NOT NULL,
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userrelation`
--

DROP TABLE IF EXISTS `userrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userrelation` (
  `uid1` bigint(20) NOT NULL,
  `uid2` bigint(20) NOT NULL,
  PRIMARY KEY (`uid1`,`uid2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrelation`
--

LOCK TABLES `userrelation` WRITE;
/*!40000 ALTER TABLE `userrelation` DISABLE KEYS */;
/*!40000 ALTER TABLE `userrelation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-05-26 19:45:39``
