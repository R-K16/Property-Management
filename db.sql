-- MySQL dump 10.13  Distrib 5.5.0-m2, for Win64 (unknown)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.5.0-m2-community

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
-- Table structure for table `paying`
--

DROP TABLE IF EXISTS `paying`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paying` (
  `Name` varchar(20) DEFAULT NULL,
  `Card` varchar(20) DEFAULT NULL,
  `CardNumber` varchar(16) NOT NULL DEFAULT '',
  `ExipryDate` varchar(3) DEFAULT NULL,
  `Year` varchar(4) DEFAULT NULL,
  `CVVNo` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`CardNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paying`
--

LOCK TABLES `paying` WRITE;
/*!40000 ALTER TABLE `paying` DISABLE KEYS */;
INSERT INTO `paying` VALUES ('Raj','Debit','5241639877854231','20','23','451'),('Sonu','Credit','7485120232125698','02','23','254');
/*!40000 ALTER TABLE `paying` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `properties`
--

DROP TABLE IF EXISTS `properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `properties` (
  `OwnerName` varchar(40) DEFAULT NULL,
  `ContactNo` varchar(20) NOT NULL DEFAULT '',
  `PlotArea` varchar(30) DEFAULT NULL,
  `Location` varchar(40) DEFAULT NULL,
  `LandMark` varchar(40) DEFAULT NULL,
  `Floors` varchar(30) DEFAULT NULL,
  `BedRooms` varchar(20) DEFAULT NULL,
  `Furnished` varchar(20) DEFAULT NULL,
  `SalePrice` varchar(10) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ContactNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `properties`
--

LOCK TABLES `properties` WRITE;
/*!40000 ALTER TABLE `properties` DISABLE KEYS */;
INSERT INTO `properties` VALUES ('Rohan','8759641230','5870','House No 87,Sector 19','Behind Post Office','First Floor','Four','Yes','8500000','Jalandhar'),('Pritpal','9814573814','5000','House No 46,Sector 25','Near Nanak Dabha','Single Story','Three','No','6700000','Jalandhar'),('Tanisha','9870073814','9200','House No 686,Sector 23','Near Tagore School','Ground Floor','Three','Yes','4900000','Jalandhar'),('Reetika','9872373814','8800','House No 286,Sector 98','Opposite Ravi Dabha','Top Floor','Three','No','6000000','Jalandhar'),('Kunwar','9877123814','6820','House No 586,Sector 15','Near Sindhi Sweet','Double Story','Five','No','8800000','Jalandhar'),('Shifali','9877173810','8400','House No 986,Sector 55','Near Joshi Hospitsl','Triple Story','Seven','Yes','9999999','Jalandhar'),('Aditi','9877312814','7500','House No 784,Sector 35','Near Jyoti Chownk','Single Story','Three','No','6500000','Kapurthala'),('Rajat','9877313814','7840','House No 86,Sector 43','Near Nanak Sweet','Single Story','Three','No','3500000','Kapurthala'),('Rahul','9877337381','8690','House No 186,Sector 24','Near Mhajan Shop','Double Story','Six',' No','6500000','Kapurthala'),('Akhil','9877373813','6500','House No 30,Sector 41','Near HMV Collage','Triple Story','Seven','No','15500000','Kapurthala'),('Raj ','9877373814','6000','House No 786,Sector 45','Near PIMS','Single Story','Three','Yes','6500000','Kapurthala'),('Ankit','9877373815','6170','House No 71,Sector 14','Near JK Restaurent','Double Story','Five','Yes','25000000','Kapurthala'),('Robin','9877373853','6250','House No 69,Sector 65','Near Dav university','Single Story','Three','Yes','4500000','Kapurthala'),('Rohit','9877375481','9320','House No 76,Sector 37','Near Mini Market','First Floor','Three','Yes','5500000','Chandigarh'),('Monika','9877376814','5860','House No 386,Sector 20','Near DAV Collage','Triple Story','Seven','Yes','8740000','Chandigarh'),('Aina','9877379814','6520','House No 746,Sector 36','Near BMC Chownk','Double Story','Six','Yes','9500000','Chandigarh'),('Sandheer','9877548384','7000','House No 56,Sector 5','Opposite Gulshan Sweet','Top Floor','Three','No','5800000','Chandigarh'),('Gurman','9877563814','7310','House No 486,Sector 17','Near Nayyar Clinic','Double Story','Four','Yes','8000000','Chandigarh'),('Sandy','9877584814','8000','House No 78,Sector 4','Near Guru Bakery','First Floor','Three','Yes','10000000','Chandigarh');
/*!40000 ALTER TABLE `properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetails` (
  `UserName` varchar(20) NOT NULL DEFAULT '',
  `Name` varchar(30) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `PhoneNo` varchar(20) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Address` varchar(70) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `Coins` varchar(10) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetails`
--

LOCK TABLES `userdetails` WRITE;
/*!40000 ALTER TABLE `userdetails` DISABLE KEYS */;
INSERT INTO `userdetails` VALUES ('adit25','Aditi',' Female','9877373824','aditi23325@gmail.com','House No 89,Sector 60,Kapurthala',' Kapurthala','486','Aditi@24'),('aina76','Aina','Female','9877373825','aina325@gmail.com',' House No 164,Sector 70,Kapurthala','Kapurthala','100','Aina@25'),('dee46',' Deepak','Male','9877373817','deepak@gmail.com','House No 69,Sector 29,Chandigarh',' Chandigarh','200','Deepak@17'),('gur87',' Gurman','Male','9877373820','Gurman25@gmail.com','House No 10,Sector 32,Jalandhar','Jalandhar',' 545','Gurman@20'),('kir45',' Kirti',' Female','9877373816','kirti34@gmail.com',' House No 45,Sector 30,Chandigarh',' Chandigarh','500','Kirti@16'),('komal23','Komal','Female','7854963521','komal23@gmail.com','654,Sector 34','Kapurthala','500','4563'),('meh56',' Mehak',' Female','9877373818','mehak325@gmail.com','House No 48,Sector 34,Jalandhar','Jalandhar',' 600','Mehak@18'),('Neha12','Neha','Female','8563297410','Neha123@gmail.com','92,Sector 22,Chandigarh','Chandigarh','0','4321'),('rah23',' Rahul',' Male','9877373822','rahul35@gmail.com',' House No 95,Sector 39,Jalandhar','Jalandhar',' 456','Rahul@22'),('raj16',' Raj Kunwar','Male','9877373814','rajkunwar325@gmail.com','House No 32,Sector 33,Chandigarh',' Chandigarh','500','Raj@14'),('rajn96','Rajni',' Female','9877373845','rajni123@gmail.com','House No 3,Sector 32,Chandigarh','Chandigarh','650','Rajni@45'),('ree21',' Reetika',' Female','9877373819','reetika325@gmail.com','House No 52,Sector 35,Jalandhar','Jalandhar',' 1000','Reet@19'),('roh80',' Rohit',' Male','9877373823','rohit3215@gmail.com',' House No 546,Sector 50,Kapurthala','Kapurthala','857','Rohit@23'),('san45',' Sandy',' Male','9877373821','Sandy6325@gmail.com',' House No 18,Sector 36,Jalandhar','Jalandhar',' 555','Sandy@21'),('shif23','Shifali',' Female','9877373815','shifali98@gmail.com',' House No 54,Sector 31,Chandigarh',' Chandigarh','450','Shifali@15'),('Sonu16','Sonu','Male','7485963210','Sonu123@gmail.com','House No 76,Sector34','Chandigarh','490','1234');
/*!40000 ALTER TABLE `userdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-23  9:32:09
