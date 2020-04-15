-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Creato il: Apr 15, 2020 alle 10:26
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `campo`
--

INSERT INTO `campo` (`id`, `nome`, `indirizzo`) VALUES
(1, 'Scirea', 'via arturito 4'),
(2, 'Benitello', 'via dei fasci 3'),
(3, 'Reale', 'via mozart 12'),
(4, 'Rizzoli', 'via devastante 1'),
(5, 'Nordico', 'via segreta 2'),
(6, 'Tennis', 'via miseria 5'),
(7, 'Fifa', 'via incredibile 3'),
(8, 'Skating', 'via ruota 7'),
(9, 'Coraggio', 'via d\'acqua 1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
