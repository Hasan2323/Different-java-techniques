-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: wordpress
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

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
-- Table structure for table `bank_entity_config`
--

DROP TABLE IF EXISTS `bank_entity_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank_entity_config` (
  `id` int(11) NOT NULL,
  `bank_name` varchar(255) NOT NULL,
  `host` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `port` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `user` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_entity_config`
--

LOCK TABLES `bank_entity_config` WRITE;
/*!40000 ALTER TABLE `bank_entity_config` DISABLE KEYS */;
INSERT INTO `bank_entity_config` VALUES (5,'CityBank','192.168.0.1','/home/saimon/','inflack@645','22',1,'saimon'),(23,'ChittagongBank','192.168.0.102','/home/saimon/','inflack@645','22',1,'hasan'),(24,'Mutual Bank','192.168.0.104','/home/saimon/','inflack@645','22',0,'saimon'),(25,'Dhaka Bank','10.32.12.69','/home/saimon/','inflack@645','22',1,'saimon'),(26,'Standard bank','10.12.13.89','/home/saimon/','inflack@645','22',0,'hasan'),(27,'CtgBank','192.168.0.102','/home/saimon/','inflack@645','22',0,'saimon');
/*!40000 ALTER TABLE `bank_entity_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank_sftp_info`
--

DROP TABLE IF EXISTS `bank_sftp_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank_sftp_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(100) NOT NULL,
  `sftp_host` varchar(100) NOT NULL,
  `sftp_username` varchar(100) NOT NULL,
  `sftp_password` varchar(255) NOT NULL,
  `sftp_port` int(11) NOT NULL,
  `sftp_location` varchar(255) NOT NULL,
  `sftp_status` int(11),
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_sftp_info`
--

LOCK TABLES `bank_sftp_info` WRITE;
/*!40000 ALTER TABLE `bank_sftp_info` DISABLE KEYS */;
INSERT INTO `bank_sftp_info` VALUES (1,'City Bank','192.168.0.101','saimon','inflack@645',22,'/home/saimon/multibank_sftp_check/',0,0);
/*!40000 ALTER TABLE `bank_sftp_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Java'),(2,'Node'),(3,'PHP'),(4,'Python'),(5,'PHP');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `salary` int(11) NOT NULL,
  `City` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Sahib','Mahbub',150000,'Mirossorai',35),(2,'Yousha','Farokey',50000,'Chittagong',29),(3,'Sunny','Chowdhury',60000,'Habiganj',28),(4,'Shadman','Siam',45000,'Dhaka',28),(5,'Tanvir','Ahmed',45000,'Noakhali',28),(6,'Mehedi','Hasan',40000,'Chapainobabganj',29),(7,'Towfiqul','Islam',27500,'Mirossorai',23),(8,'Irfanul','Karim',28000,'Chittagong',26),(9,'Ashik','Js',22000,'Dhaka',24),(11,'Muhammad','Saimon',7000,'Chittagong',25);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (28);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mail_config`
--

DROP TABLE IF EXISTS `mail_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mail_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email_body` text NOT NULL,
  `email_cc` varchar(500) DEFAULT NULL,
  `email_footer` varchar(500) NOT NULL,
  `email_subject` varchar(500) NOT NULL,
  `email_to` varchar(500) NOT NULL,
  `event_name` varchar(255) NOT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `reason` text NOT NULL,
  `reply_to` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mail_config`
--

LOCK TABLES `mail_config` WRITE;
/*!40000 ALTER TABLE `mail_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `mail_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) NOT NULL,
  `order_name` varchar(255) NOT NULL,
  `Amount` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `employee_id` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,1,'Laptop',50000),(2,7,'Shoe',13000),(3,4,'Bike',230000),(4,9,'Laptop',30000),(7,11,'Earphone',220),(8,1,'Car',2000000),(9,11,'Digital Watch',2500);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_info`
--

DROP TABLE IF EXISTS `patient_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_info` (
  `patient_id` int(11) NOT NULL,
  `patient_name` varchar(255) NOT NULL,
  `patient_address` varchar(255) NOT NULL,
  `patient_age` int(11) NOT NULL,
  `patient_contact_no` varchar(255) NOT NULL,
  `patient_email` varchar(255) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_info`
--

LOCK TABLES `patient_info` WRITE;
/*!40000 ALTER TABLE `patient_info` DISABLE KEYS */;
INSERT INTO `patient_info` VALUES (15,'Haji Modasser','Sandwip',63,'+8801748444','Mah@yahoo.com'),(16,'Shaha Banu','Sandwip, Chittagong',55,'+8801748444','shah@outlook.com'),(17,'Abul Hashem Bhuiyan','Chittagong',64,'+8801748444','ahb@live.com'),(20,'Sheikh Mujibur Rahman','Bangladesh',63,'+8801748444','sm@bd.gov.bd'),(21,'Bir Sreshtho Motiur Rahman','Bangladesh',63,'+8801748444','moti@bd.gov.bd');
/*!40000 ALTER TABLE `patient_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_info`
--

DROP TABLE IF EXISTS `product_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `brand` varchar(255) NOT NULL,
  `made_in` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_info`
--

LOCK TABLES `product_info` WRITE;
/*!40000 ALTER TABLE `product_info` DISABLE KEYS */;
INSERT INTO `product_info` VALUES (20,'Hashem Hasina','','Saimon',800000),(2,'Xioami Inc.','China','Redmi Note 5 AI',14500),(3,'Samsung Inc.','Vietnam','Galaxy S 2',15000),(4,'Apple Inc.','China Republic.','iPhone 10 pro',80000),(5,'Walton Ltd.','Bangladesh.','Walton prime Pro',19500),(7,'Dell Inc.','Malaysia','Dell inspiron 555',52000),(19,'laravel','Bd','Farokey',50000);
/*!40000 ALTER TABLE `product_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `senior_dev`
--

DROP TABLE IF EXISTS `senior_dev`;
/*!50001 DROP VIEW IF EXISTS `senior_dev`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `senior_dev` AS SELECT 
 1 AS `FirstName`,
 1 AS `salary`,
 1 AS `City`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `shajguj`
--

DROP TABLE IF EXISTS `shajguj`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shajguj` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `salary` int(11) NOT NULL,
  `City` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shajguj`
--

LOCK TABLES `shajguj` WRITE;
/*!40000 ALTER TABLE `shajguj` DISABLE KEYS */;
INSERT INTO `shajguj` VALUES (1,'Tuhin','Chowdhury',50000,'Dhaka'),(2,'Milky','Rahman',200000,'Dhaka');
/*!40000 ALTER TABLE `shajguj` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `senior_dev`
--

/*!50001 DROP VIEW IF EXISTS `senior_dev`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`saimon`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `senior_dev` AS select `employees`.`FirstName` AS `FirstName`,`employees`.`salary` AS `salary`,`employees`.`City` AS `City` from `employees` where (`employees`.`salary` >= 40000) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-25 17:15:16
