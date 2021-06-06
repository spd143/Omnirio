-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: product_details
-- ------------------------------------------------------
-- Server version	5.7.21

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
-- Table structure for table `attributes`
--

DROP TABLE IF EXISTS `attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attributes` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `value` varchar(250) NOT NULL,
  `prod_id` bigint(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_prodx_idx` (`prod_id`),
  CONSTRAINT `id_prodx` FOREIGN KEY (`prod_id`) REFERENCES `prod_tab` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attributes`
--

LOCK TABLES `attributes` WRITE;
/*!40000 ALTER TABLE `attributes` DISABLE KEYS */;
INSERT INTO `attributes` VALUES (8,'color','Red',1),(9,'color','White',1),(10,'color','Orange',1),(11,'color','Orange',2);
/*!40000 ALTER TABLE `attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prod_tab`
--

DROP TABLE IF EXISTS `prod_tab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prod_tab` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `prod_id` varchar(100) NOT NULL,
  `prod_name` varchar(250) NOT NULL,
  `cat_id` bigint(11) NOT NULL,
  `cat_name` varchar(250) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `prod_id_UNIQUE` (`prod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prod_tab`
--

LOCK TABLES `prod_tab` WRITE;
/*!40000 ALTER TABLE `prod_tab` DISABLE KEYS */;
INSERT INTO `prod_tab` VALUES (1,'1hy26msd8h9','red stripes pontic shirt',12,'apparels/shirts'),(2,'1hy26msd9g7','red stripes pontic shirt',13,'apparels/shirts');
/*!40000 ALTER TABLE `prod_tab` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-06 17:33:01
