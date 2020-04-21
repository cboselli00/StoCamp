-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Creato il: Apr 21, 2020 alle 12:12
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

-- --------------------------------------------------------

--
-- Struttura della tabella `evento`
--

DROP TABLE IF EXISTS `evento`;
CREATE TABLE IF NOT EXISTS `evento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomesquadra1` varchar(30) NOT NULL,
  `nomesquadra2` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `gioca`
--

DROP TABLE IF EXISTS `gioca`;
CREATE TABLE IF NOT EXISTS `gioca` (
  `username_utente` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_squadra` int(11) NOT NULL,
  PRIMARY KEY (`username_utente`,`id_squadra`),
  KEY `usernameutente` (`username_utente`),
  KEY `idsquadra` (`id_squadra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `partecipa`
--

DROP TABLE IF EXISTS `partecipa`;
CREATE TABLE IF NOT EXISTS `partecipa` (
  `id_evento` int(11) NOT NULL,
  `id_squadra` int(11) NOT NULL,
  PRIMARY KEY (`id_evento`,`id_squadra`),
  KEY `idevento` (`id_evento`),
  KEY `idsquadra` (`id_squadra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `prenota`
--

DROP TABLE IF EXISTS `prenota`;
CREATE TABLE IF NOT EXISTS `prenota` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `orainizio` double NOT NULL,
  `orafine` double NOT NULL,
  `username_utente` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_campo` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `usernameutente` (`username_utente`),
  KEY `idcampo` (`id_campo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `squadra`
--

DROP TABLE IF EXISTS `squadra`;
CREATE TABLE IF NOT EXISTS `squadra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

DROP TABLE IF EXISTS `utente`;
CREATE TABLE IF NOT EXISTS `utente` (
  `username` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `datanascita` date NOT NULL,
  `email` varchar(30) NOT NULL,
  `numerotelefono` varchar(15) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `cognome` varchar(30) NOT NULL,
  `cittaresidenza` varchar(30) DEFAULT NULL,
  `indirizzo` varchar(30) DEFAULT NULL,
  `eta` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`username`, `password`, `datanascita`, `email`, `numerotelefono`, `nome`, `cognome`, `cittaresidenza`, `indirizzo`, `eta`) VALUES
('AleCriscu', 'admin', '2000-12-27', 'alecris122000@gmail.com', '3890138854', 'Alessandro', 'Criscuoli', 'Cinisello Balsamo', 'via benaco', 19),
('Bose', 'admin', '2000-06-06', 'boselli@gmail.com', '3752058249', 'Christian', 'Boselli', 'Sesto San Giovanni', 'via devastante 2', 20),
('Boselli00', 'cippirimerlo1', '2000-06-26', 'bosellichristian@gmail.com', '3273168034', 'Christian', 'Boselli', 'Milano', 'Via Scheiwiller 12', 19),
('Negri', 'admin', '2000-04-08', 'negri@gmail.com', '3671234567', 'Marco', 'Negri', 'Monza', 'via segreta 3', 20),
('nonriposo', 'admin', '2002-06-10', 'lavoro@hotmail.it', '3316677821', 'Mark', 'Blacks', 'Lacchiarella', 'Via sperduta 20', 18),
('persona1', 'password', '2000-04-14', 'caso@gmail.com', '3459988776', 'Persona', 'Qualsiasi', 'Napoli', 'Via napoli 45', 45),
('pinco', 'pallino', '2000-04-17', 'pincopallino@gmail.com', '3273161681', 'Pinco', 'Pallino', 'Milano', 'Via da qui 12', 18);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `gioca`
--
ALTER TABLE `gioca`
  ADD CONSTRAINT `gioca_ibfk_1` FOREIGN KEY (`id_squadra`) REFERENCES `squadra` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `gioca_ibfk_2` FOREIGN KEY (`username_utente`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Limiti per la tabella `partecipa`
--
ALTER TABLE `partecipa`
  ADD CONSTRAINT `partecipa_ibfk_1` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `partecipa_ibfk_2` FOREIGN KEY (`id_squadra`) REFERENCES `squadra` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Limiti per la tabella `prenota`
--
ALTER TABLE `prenota`
  ADD CONSTRAINT `prenota_ibfk_1` FOREIGN KEY (`username_utente`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `prenota_ibfk_2` FOREIGN KEY (`id_campo`) REFERENCES `campo` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
