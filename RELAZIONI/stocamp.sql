-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Creato il: Apr 14, 2020 alle 14:28
-- Versione del server: 8.0.18
-- Versione PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stocamp`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `campo`
--

DROP TABLE IF EXISTS `campo`;
CREATE TABLE IF NOT EXISTS `campo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `indirizzo` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `evento`
--

DROP TABLE IF EXISTS `evento`;
CREATE TABLE IF NOT EXISTS `evento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomesquadra2` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `nomesquadra1` varchar(30) NOT NULL,
  `idprenotazione` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nomesquadra1` (`nomesquadra1`),
  KEY `idprenotazione` (`idprenotazione`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `partecipazione`
--

DROP TABLE IF EXISTS `partecipazione`;
CREATE TABLE IF NOT EXISTS `partecipazione` (
  `nomesquadra` varchar(30) NOT NULL,
  `usernamecliente` varchar(15) NOT NULL,
  PRIMARY KEY (`nomesquadra`,`usernamecliente`),
  KEY `idsquadra` (`nomesquadra`),
  KEY `usernamecliente` (`usernamecliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `prenotazione`
--

DROP TABLE IF EXISTS `prenotazione`;
CREATE TABLE IF NOT EXISTS `prenotazione` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usernamecliente` varchar(15) NOT NULL,
  `idcampo` int(11) NOT NULL,
  `data` date NOT NULL,
  `ora` time NOT NULL,
  `nomesquadra` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `usernamecliente` (`usernamecliente`),
  KEY `idcampo` (`idcampo`),
  KEY `nomesquadra` (`nomesquadra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `squadra`
--

DROP TABLE IF EXISTS `squadra`;
CREATE TABLE IF NOT EXISTS `squadra` (
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

DROP TABLE IF EXISTS `utente`;
CREATE TABLE IF NOT EXISTS `utente` (
  `username` varchar(15) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `cognome` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `datadinascita` date NOT NULL,
  `ntelefono` int(11) NOT NULL,
  `cittaresidenza` varchar(30) DEFAULT NULL,
  `indirizzo` varchar(30) DEFAULT NULL,
  `eta` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `evento_ibfk_1` FOREIGN KEY (`idprenotazione`) REFERENCES `prenotazione` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Limiti per la tabella `partecipazione`
--
ALTER TABLE `partecipazione`
  ADD CONSTRAINT `partecipazione_ibfk_2` FOREIGN KEY (`usernamecliente`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `partecipazione_ibfk_3` FOREIGN KEY (`nomesquadra`) REFERENCES `squadra` (`nome`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Limiti per la tabella `prenotazione`
--
ALTER TABLE `prenotazione`
  ADD CONSTRAINT `prenotazione_ibfk_1` FOREIGN KEY (`usernamecliente`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `prenotazione_ibfk_2` FOREIGN KEY (`idcampo`) REFERENCES `campo` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Limiti per la tabella `squadra`
--
ALTER TABLE `squadra`
  ADD CONSTRAINT `squadra_ibfk_1` FOREIGN KEY (`nome`) REFERENCES `evento` (`nomesquadra1`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
