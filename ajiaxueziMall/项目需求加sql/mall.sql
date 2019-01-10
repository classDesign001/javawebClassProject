-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: ajiaxuezimall
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ajia_cart_item`
--

DROP TABLE IF EXISTS `ajia_cart_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_cart_item` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_cart_item`
--

LOCK TABLES `ajia_cart_item` WRITE;
/*!40000 ALTER TABLE `ajia_cart_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_cart_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_collect_item`
--

DROP TABLE IF EXISTS `ajia_collect_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_collect_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_collect_item`
--

LOCK TABLES `ajia_collect_item` WRITE;
/*!40000 ALTER TABLE `ajia_collect_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_collect_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_content`
--

DROP TABLE IF EXISTS `ajia_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_content` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_content`
--

LOCK TABLES `ajia_content` WRITE;
/*!40000 ALTER TABLE `ajia_content` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_content_category`
--

DROP TABLE IF EXISTS `ajia_content_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_content_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_content_category`
--

LOCK TABLES `ajia_content_category` WRITE;
/*!40000 ALTER TABLE `ajia_content_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_content_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_item`
--

DROP TABLE IF EXISTS `ajia_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_item`
--

LOCK TABLES `ajia_item` WRITE;
/*!40000 ALTER TABLE `ajia_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_item_cat`
--

DROP TABLE IF EXISTS `ajia_item_cat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_item_cat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_item_cat`
--

LOCK TABLES `ajia_item_cat` WRITE;
/*!40000 ALTER TABLE `ajia_item_cat` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_item_cat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_item_desc`
--

DROP TABLE IF EXISTS `ajia_item_desc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_item_desc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_item_desc`
--

LOCK TABLES `ajia_item_desc` WRITE;
/*!40000 ALTER TABLE `ajia_item_desc` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_item_desc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_item_param`
--

DROP TABLE IF EXISTS `ajia_item_param`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_item_param` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_item_param`
--

LOCK TABLES `ajia_item_param` WRITE;
/*!40000 ALTER TABLE `ajia_item_param` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_item_param` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_item_param_item`
--

DROP TABLE IF EXISTS `ajia_item_param_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_item_param_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_item_param_item`
--

LOCK TABLES `ajia_item_param_item` WRITE;
/*!40000 ALTER TABLE `ajia_item_param_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_item_param_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_order`
--

DROP TABLE IF EXISTS `ajia_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_order`
--

LOCK TABLES `ajia_order` WRITE;
/*!40000 ALTER TABLE `ajia_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_order_item`
--

DROP TABLE IF EXISTS `ajia_order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_order_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_order_item`
--

LOCK TABLES `ajia_order_item` WRITE;
/*!40000 ALTER TABLE `ajia_order_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_shipping`
--

DROP TABLE IF EXISTS `ajia_shipping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_shipping` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_shipping`
--

LOCK TABLES `ajia_shipping` WRITE;
/*!40000 ALTER TABLE `ajia_shipping` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_shipping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ajia_user`
--

DROP TABLE IF EXISTS `ajia_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ajia_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajia_user`
--

LOCK TABLES `ajia_user` WRITE;
/*!40000 ALTER TABLE `ajia_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `ajia_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-10 11:39:53
