CREATE DATABASE  IF NOT EXISTS `tesla` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tesla`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: tesla
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `atividades_comportamento`
--

DROP TABLE IF EXISTS `atividades_comportamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atividades_comportamento` (
  `id_atividades_comportamento` int NOT NULL AUTO_INCREMENT,
  `historico_navegacao` text,
  `interesses` varchar(255) DEFAULT NULL,
  `compras_realizadas` varchar(255) DEFAULT NULL,
  `paginas_visitadas` varchar(255) DEFAULT NULL,
  `duracao_sessoes` varchar(255) DEFAULT NULL,
  `cliques_anuncios` varchar(255) DEFAULT NULL,
  `id_dados_identificacao` int NOT NULL,
  PRIMARY KEY (`id_atividades_comportamento`,`id_dados_identificacao`),
  KEY `fk_atividades_comportamento_dados_identificacao1_idx` (`id_dados_identificacao`),
  CONSTRAINT `fk_atividades_comportamento_dados_identificacao1` FOREIGN KEY (`id_dados_identificacao`) REFERENCES `dados_identificacao` (`id_dados_identificacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atividades_comportamento`
--

LOCK TABLES `atividades_comportamento` WRITE;
/*!40000 ALTER TABLE `atividades_comportamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `atividades_comportamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dados_identificacao`
--

DROP TABLE IF EXISTS `dados_identificacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dados_identificacao` (
  `id_dados_identificacao` int NOT NULL AUTO_INCREMENT,
  `nome_completo` varchar(120) NOT NULL,
  `email` varchar(120) NOT NULL,
  `nome_usuario` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `data_nascimento` varchar(10) NOT NULL,
  `numero_telefone` varchar(45) NOT NULL,
  `endereco` varchar(120) NOT NULL,
  `informacoes_cartao` varchar(255) NOT NULL,
  PRIMARY KEY (`id_dados_identificacao`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `nome_usuario_UNIQUE` (`nome_usuario`),
  UNIQUE KEY `numero_telefone_UNIQUE` (`numero_telefone`),
  KEY `nome_usuario` (`nome_usuario`) /*!80000 INVISIBLE */,
  KEY `senha` (`senha`) /*!80000 INVISIBLE */,
  KEY `informacoes_cartao` (`informacoes_cartao`) /*!80000 INVISIBLE */,
  KEY `data_nascimento` (`data_nascimento`) /*!80000 INVISIBLE */
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados_identificacao`
--

LOCK TABLES `dados_identificacao` WRITE;
/*!40000 ALTER TABLE `dados_identificacao` DISABLE KEYS */;
INSERT INTO `dados_identificacao` VALUES (1,'Ribamar da Silva Flamengo','ribamar10@gmail.com','riba10','123456789','21/05/1997','+5511999999999','Avenida Central, Limoeiros, 456, Rio de Janeiro, RJ, Brasil','4111 1111 1111 1111, 12/25, 123'),(2,'Ronaldinho Gaucho','ronaldo10@gmail.com','bruxo10','bruxaria123','21/03/1980','+5541988888888','Rua Sete de Setembro, Rosas, 5050, Curitiba, PR, Brasil','5500 0000 0000 0004, 11/24, 456'),(3,'Cleiton Vasco da Gama','cleitongama07@r7.com','cleitinho07','123456','23/07/1999','+5514977777777','Rua Sete de Setembro, Centro, 77, Rio de Janeiro, RJ, Brasil','3400 0000 0000 009, 10/23, 789'),(9,'Augusto Tosgua Souza','Akein07@hotmail.com','AugustoGNS','asfasfsaf','12/08/2004','+5566967564321','Caverna do Homo Sapiens Sapiens','5500 1111 0000 0004, 11/24, 456'),(11,'Bruno Lima Santos','brunozo123@gmail.com','GeniusDesign','brunozo123','30/03/2005','+5566978978908','Alpes Suíços','8787 8888 0000 0001, 10/27, 545'),(12,'Roberto Gabriel Barcelos','robertobarc@gmail.com','robertin','6ff43f3f234','06/11/2000','+5566934545676','Jaboticabeiras, Celeste, 890, Sinop, MT, Brasil','8222 2222 2222 2222, 12/27, 899'),(13,'Mariele Almeida Mendes','marimendes@gmail.com','marimendes01','2343673547','12/01/1995','+5566975876487','Rua Jucelino, Rosas, 787, Xique-Xique, BA, Brasil','0200 3000 1000 0040, 12/24, 123'),(15,'Tayna Radiohead da Silva','taynaradiohead@hotmail.com','meiko','1234567','26/10/2004','+5566988888888','Rua Macedonia, Pericles, 777, Xique-Xique, BA, Brasil','4545 4545 4545 4000, 12/27, 642');
/*!40000 ALTER TABLE `dados_identificacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dados_localizacao`
--

DROP TABLE IF EXISTS `dados_localizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dados_localizacao` (
  `id_dados_localizacao` int NOT NULL AUTO_INCREMENT,
  `localizacao_geografica` varchar(255) DEFAULT NULL,
  `historico_locais_visitados` text,
  `id_dados_identificacao` int NOT NULL,
  PRIMARY KEY (`id_dados_localizacao`,`id_dados_identificacao`),
  KEY `fk_dados_localizacao_dados_identificacao1_idx` (`id_dados_identificacao`),
  CONSTRAINT `fk_dados_localizacao_dados_identificacao1` FOREIGN KEY (`id_dados_identificacao`) REFERENCES `dados_identificacao` (`id_dados_identificacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados_localizacao`
--

LOCK TABLES `dados_localizacao` WRITE;
/*!40000 ALTER TABLE `dados_localizacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `dados_localizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informacoes_conta`
--

DROP TABLE IF EXISTS `informacoes_conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informacoes_conta` (
  `id_informacoes_conta` int NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(45) NOT NULL,
  `data_nascimento` varchar(10) NOT NULL,
  `genero` varchar(20) DEFAULT NULL,
  `foto_de_perfil` varchar(45) DEFAULT NULL,
  `id_dados_identificacao` int NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`id_informacoes_conta`,`id_dados_identificacao`),
  UNIQUE KEY `nome_usuario_UNIQUE` (`nome_usuario`),
  KEY `fk_informacoes_conta_dados_identificacao_idx` (`id_dados_identificacao`),
  KEY `fk.data_nascimento` (`data_nascimento`),
  KEY `fk.senha` (`senha`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk.data_nascimento` FOREIGN KEY (`data_nascimento`) REFERENCES `dados_identificacao` (`data_nascimento`),
  CONSTRAINT `fk.nome_usuario` FOREIGN KEY (`nome_usuario`) REFERENCES `dados_identificacao` (`nome_usuario`),
  CONSTRAINT `fk.senha` FOREIGN KEY (`senha`) REFERENCES `dados_identificacao` (`senha`),
  CONSTRAINT `fk_informacoes_conta_dados_identificacao` FOREIGN KEY (`id_dados_identificacao`) REFERENCES `dados_identificacao` (`id_dados_identificacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informacoes_conta`
--

LOCK TABLES `informacoes_conta` WRITE;
/*!40000 ALTER TABLE `informacoes_conta` DISABLE KEYS */;
/*!40000 ALTER TABLE `informacoes_conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informacoes_pagamento`
--

DROP TABLE IF EXISTS `informacoes_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informacoes_pagamento` (
  `id_informacoes_pagamento` int NOT NULL AUTO_INCREMENT,
  `historico_transacoes` text,
  `id_dados_identificacao` int NOT NULL,
  `informacoes_cartao` varchar(255) NOT NULL,
  PRIMARY KEY (`id_informacoes_pagamento`,`id_dados_identificacao`),
  KEY `fk.informacoes_cartao` (`informacoes_cartao`),
  CONSTRAINT `fk.informacoes_cartao` FOREIGN KEY (`informacoes_cartao`) REFERENCES `dados_identificacao` (`informacoes_cartao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informacoes_pagamento`
--

LOCK TABLES `informacoes_pagamento` WRITE;
/*!40000 ALTER TABLE `informacoes_pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `informacoes_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informacoes_sociais`
--

DROP TABLE IF EXISTS `informacoes_sociais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informacoes_sociais` (
  `id_informacoes_sociais` int NOT NULL AUTO_INCREMENT,
  `interacoes_redes_sociais` text,
  `lista_amigos_seguidores` varchar(255) DEFAULT NULL,
  `id_dados_identificacao` int NOT NULL,
  PRIMARY KEY (`id_informacoes_sociais`,`id_dados_identificacao`),
  KEY `fk_informacoes_sociais_dados_identificacao1_idx` (`id_dados_identificacao`),
  CONSTRAINT `fk_informacoes_sociais_dados_identificacao1` FOREIGN KEY (`id_dados_identificacao`) REFERENCES `dados_identificacao` (`id_dados_identificacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informacoes_sociais`
--

LOCK TABLES `informacoes_sociais` WRITE;
/*!40000 ALTER TABLE `informacoes_sociais` DISABLE KEYS */;
/*!40000 ALTER TABLE `informacoes_sociais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informacoes_tecnicas`
--

DROP TABLE IF EXISTS `informacoes_tecnicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informacoes_tecnicas` (
  `id_informacoes_tecnicas` int NOT NULL AUTO_INCREMENT,
  `tipo_dispositivo` varchar(50) DEFAULT NULL,
  `sistema_operacional` varchar(50) DEFAULT NULL,
  `navegador_app` varchar(50) DEFAULT NULL,
  `endereco_ip` varchar(45) DEFAULT NULL,
  `id_dados_identificacao` int NOT NULL,
  PRIMARY KEY (`id_informacoes_tecnicas`,`id_dados_identificacao`),
  KEY `fk_informacoes_tecnicas_dados_identificacao1_idx` (`id_dados_identificacao`),
  CONSTRAINT `fk_informacoes_tecnicas_dados_identificacao1` FOREIGN KEY (`id_dados_identificacao`) REFERENCES `dados_identificacao` (`id_dados_identificacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informacoes_tecnicas`
--

LOCK TABLES `informacoes_tecnicas` WRITE;
/*!40000 ALTER TABLE `informacoes_tecnicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `informacoes_tecnicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preferencias_configuracao`
--

DROP TABLE IF EXISTS `preferencias_configuracao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preferencias_configuracao` (
  `id_preferencias_configuracao` int NOT NULL AUTO_INCREMENT,
  `idioma` varchar(50) DEFAULT NULL,
  `configuracoes_privacidade` text,
  `preferencias_notificacoes` varchar(255) DEFAULT NULL,
  `id_dados_identificacao` int NOT NULL,
  PRIMARY KEY (`id_preferencias_configuracao`,`id_dados_identificacao`),
  KEY `fk_preferencias_configuracao_dados_identificacao1_idx` (`id_dados_identificacao`),
  CONSTRAINT `fk_preferencias_configuracao_dados_identificacao1` FOREIGN KEY (`id_dados_identificacao`) REFERENCES `dados_identificacao` (`id_dados_identificacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preferencias_configuracao`
--

LOCK TABLES `preferencias_configuracao` WRITE;
/*!40000 ALTER TABLE `preferencias_configuracao` DISABLE KEYS */;
/*!40000 ALTER TABLE `preferencias_configuracao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-10 13:21:43
