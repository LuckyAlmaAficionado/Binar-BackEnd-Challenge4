-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: bioskop
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES (1,'CGV Central Park',8,3171);
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cinema_hall`
--

LOCK TABLES `cinema_hall` WRITE;
/*!40000 ALTER TABLE `cinema_hall` DISABLE KEYS */;
/*!40000 ALTER TABLE `cinema_hall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cinema_seat`
--

LOCK TABLES `cinema_seat` WRITE;
/*!40000 ALTER TABLE `cinema_seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `cinema_seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (3171,'Jakarta Pusat	','Indonesia','10110'),(3271,'Bogor','Indonesia','16111'),(3322,'Semarang','Indonesia','50111'),(6371,'Banjarmasin','Indonesia','70111');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Laskar Indonesia','Kisah perjuangan sekelompok anak di Belitung untuk mendapatkan pendidikan yang layak','02:00:00','Indonesia','2008-09-25','Indonesia','Drama'),(2,'The Dark Knight','Petualangan Batman melawan Joker di kota Gotham','02:32:00','English','2008-07-18','Amerika Serikat','Action, Crime, Drama'),(3,'Ayat-Ayat Cinta','Cerita cinta seorang pemuda Indonesia dengan tiga wanita berbeda','02:59:00','Indonesia','2008-02-28','Indonesia','Drama, Romance'),(4,'The Godfather','Kepala keluarga mafia yang mengendalikan New York City','02:55:00','English','1972-03-24','Amerika Serikat','Crime, Drama'),(5,'Parasite','Kisah keluarga miskin di Korea Selatan yang berusaha naik kelas','02:12:00','Korean','2019-10-11','Korea Selatan','Comedy, Drama, Thriller'),(6,'Avengers: Endgame','Para Avengers berusaha untuk membalikkan kehancuran yang disebabkan oleh Thanos','03:01:00','English','2019-04-26','Amerika Serikat','Action, Adventure, Drama'),(7,'Gundala','Kisah seorang pria Indonesia yang memiliki kemampuan super dan berjuang melawan kejahatan','02:03:00','Indonesia','2019-08-29','Indonesia','Action, Adventure, Drama'),(8,'Joker','Kisah awal Joker dan bagaimana dia menjadi penjahat','02:02:00','English','2019-10-04','Amerika Serikat','Crime, Drama, Thriller'),(9,'Dilan 1991','Kisah cinta remaja antara Dilan dan Milea di tahun 1991','01:50:00','Indonesia','2019-02-28','Indonesia','Drama, Romance'),(10,'The Shawshank Redemption','Kisah seorang narapidana yang berjuang untuk mendapatkan kebebasannya','02:22:00','English','1994-09-23','Amerika Serikat','Drama'),(11,'The Godfather: Part II','Kisah kelanjutan kepala keluarga mafia yang mengendalikan New York City','03:22:00','English','1974-12-20','Amerika Serikat','Crime, Drama'),(12,'The Lord of the Rings: The Return of the King','Kisah Frodo dan Sam dalam melawan Sauron untuk merebut kembali cincin','03:21:00','English','2003-12-17','Amerika Serikat','Action, Adventure, Drama'),(13,'Crazy Rich Asians','Kisah seorang wanita Amerika yang berkunjung ke Singapura dan terkejut mengetahui kekayaan pacarnya','02:00:00','English','2018-08-15','Amerika Serikat','Comedy, Drama, Romance'),(14,'Midsommar','Sebuah kisah horor tentang kelompok mahasiswa yang mengunjungi festival di Swedia','02:27:00','English','2019-07-03','Swedia','Horror, Mystery, Thriller'),(15,'The Irishman','Kisah seorang pembunuh bayaran yang mengevaluasi kehidupannya dan keterlibatannya dalam pembunuhan Jimmy Hoffa','03:29:00','English','2019-11-01','Amerika Serikat','Biography, Crime, Drama'),(16,'Spider-Man: Into the Spider-Verse','Seorang remaja Brooklyn menemukan bahwa ada Spider-Man lain yang juga eksis di dunia paralel','01:57:00','English','2018-12-14','Amerika Serikat','Animation, Action, Adventure'),(17,'Gone Girl','Kisah seorang wanita yang hilang dan suaminya yang menjadi tersangka utama dalam kasus tersebut','02:29:00','English','2014-10-03','Amerika Serikat','Crime, Drama, Mystery'),(18,'The Grand Budapest Hotel','Seorang manajer hotel berjuang untuk membuktikan bahwa dia tidak bersalah atas pembunuhan seorang tamu','01:40:00','English','2014-03-07','Amerika Serikat','Adventure, Comedy, Drama'),(19,'Train to Busan','Kisah para penumpang kereta yang berjuang melawan zombie saat mereka menuju ke Busan','01:58:00','Korean','2016-07-20','Korea Selatan','Action, Horror, Thriller');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `show`
--

LOCK TABLES `show` WRITE;
/*!40000 ALTER TABLE `show` DISABLE KEYS */;
/*!40000 ALTER TABLE `show` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `show_seat`
--

LOCK TABLES `show_seat` WRITE;
/*!40000 ALTER TABLE `show_seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `show_seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,'Deniz Ghallen Putra Rachmat','Ghallen12345','Denizghallen@gmail.com','087719852357'),(3,'Carlita Maccacio Mauren','CarlitaMM12345','CarlitaMM@gmail.com','0877198523347'),(4,'Carlota Maccacio Mauren','CarlotaMM12345','CarlotaMM@gmail.com','0877459852357');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-03 13:59:29
