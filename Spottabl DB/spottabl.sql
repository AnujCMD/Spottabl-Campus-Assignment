-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: spottabl
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientuserinvites`
--

DROP TABLE IF EXISTS `clientuserinvites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientuserinvites` (
  `email` varchar(255) DEFAULT NULL,
  `clientcode` varchar(255) DEFAULT NULL,
  `userType` varchar(255) DEFAULT NULL,
  `accepted` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `inviter` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientuserinvites`
--

LOCK TABLES `clientuserinvites` WRITE;
/*!40000 ALTER TABLE `clientuserinvites` DISABLE KEYS */;
INSERT INTO `clientuserinvites` VALUES ('user4@flexmoney.in','flexmoney','CLIENT_USER','FALSE','ADMIN','user1@flexmoney.in'),('user2@flexmoney.in','flexmoney','CLIENT_USER','TRUE','ADMIN','user1@flexmoney.in'),('user4@flexmoney.in','flexmoney','CLIENT_USER','TRUE','ADMIN','satheesh@spottabl.com'),('user6@flexmoney.in','flexmoney','CLIENT_USER','TRUE','JOB_MANAGER','satheesh@spottabl.com'),('user7@flexmoney.in','flexmoney','CLIENT_USER','FALSE','ADMIN','priyanka@spottabl.com'),('user5@flexmoney.in','flexmoney','CLIENT_USER','TRUE','ADMIN','user1@flexmoney.in'),('user8@flexmoney.in','flexmoney','CLIENT_USER','FALSE','ADMIN','priyanka@spottabl.com'),('user3@flexmoney.in','flexmoney','CLIENT_USER','TRUE','ADMIN','priyanka@spottabl.com'),('user9@flexmoney.in','flexmoney','CLIENT_USER','FALSE','ADMIN','priyanka@spottabl.com');
/*!40000 ALTER TABLE `clientuserinvites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registrations`
--

DROP TABLE IF EXISTS `registrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registrations` (
  `email` varchar(255) DEFAULT NULL,
  `enabled` varchar(255) DEFAULT NULL,
  `registrationtype` varchar(255) DEFAULT NULL,
  `usertype` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registrations`
--

LOCK TABLES `registrations` WRITE;
/*!40000 ALTER TABLE `registrations` DISABLE KEYS */;
INSERT INTO `registrations` VALUES ('user1@flexmoney.in','TRUE','NORMAL','CLIENT_USER'),('user4@flexmoney.in','TRUE','INVITE','CLIENT_USER'),('user5@flexmoney.in','TRUE','INVITE','CLIENT_USER'),('user6@flexmoney.in','TRUE','INVITE','CLIENT_USER'),('user2@flexmoney.in','TRUE','INVITE','CLIENT_USER'),('user3@flexmoney.in','TRUE','INVITE','CLIENT_USER');
/*!40000 ALTER TABLE `registrations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-14 17:34:33
