-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Creato il: Apr 24, 2020 alle 09:04
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
  `indirizzo` varchar(30) NOT NULL,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`nome`),
  KEY `nome` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `campo`
--

INSERT INTO `campo` (`indirizzo`, `nome`) VALUES
('Via Manchester 11', 'Old Trafford'),
('Via ladroni 30', 'Rubentus stadium'),
('Via napoli 33', 'San Paolo'),
('Via Milano 10', 'San Siro'),
('Via madrid 7', 'Santiago Bernabeu');

-- --------------------------------------------------------

--
-- Struttura della tabella `evento`
--

DROP TABLE IF EXISTS `evento`;
CREATE TABLE IF NOT EXISTS `evento` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(23),
(23),
(23),
(23),
(23);

-- --------------------------------------------------------

--
-- Struttura della tabella `partecipazioni`
--

DROP TABLE IF EXISTS `partecipazioni`;
CREATE TABLE IF NOT EXISTS `partecipazioni` (
  `id` bigint(20) NOT NULL,
  `evento_id` int(11) DEFAULT NULL,
  `squadra_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo9usylma0ddp13w7h1gdwb1vp` (`evento_id`),
  KEY `squadra_id` (`squadra_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `prenota`
--

DROP TABLE IF EXISTS `prenota`;
CREATE TABLE IF NOT EXISTS `prenota` (
  `id` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `orafine` double NOT NULL,
  `orainizio` double NOT NULL,
  `partecipante_username` varchar(255) DEFAULT NULL,
  `nomecampo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK113q1rhgw1hi8kf23ol3tu2do` (`partecipante_username`),
  KEY `nomecampo` (`nomecampo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `prenota`
--

INSERT INTO `prenota` (`id`, `data`, `orafine`, `orainizio`, `partecipante_username`, `nomecampo`) VALUES
(17, '2020-04-24', 10, 9, 'Boselli00', 'Rubentus Stadium'),
(18, '2020-09-12', 11, 10, 'Boselli00', 'Old Trafford'),
(19, '2020-12-17', 11, 10, 'Boselli00', 'San Paolo'),
(20, '2020-06-26', 13, 12, 'Boselli00', 'Santiago Bernabeu');

-- --------------------------------------------------------

--
-- Struttura della tabella `squadra`
--

DROP TABLE IF EXISTS `squadra`;
CREATE TABLE IF NOT EXISTS `squadra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `partecipante1` varchar(15) NOT NULL,
  `partecipante2` varchar(15) NOT NULL,
  `partecipante3` varchar(15) NOT NULL,
  `partecipante4` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `partecipante1` (`partecipante1`),
  KEY `partecipante2` (`partecipante2`),
  KEY `partecipante3` (`partecipante3`),
  KEY `partecipante4` (`partecipante4`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `squadra`
--

INSERT INTO `squadra` (`id`, `nome`, `partecipante1`, `partecipante2`, `partecipante3`, `partecipante4`) VALUES
(21, 'Scarsenal', 'Boselli00', 'AleCriscu', 'Negri00', 'VanBasty'),
(22, 'Ac Picchia', 'tizicrudeli', 'carletto', 'redmario', 'tramonto');

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

DROP TABLE IF EXISTS `utente`;
CREATE TABLE IF NOT EXISTS `utente` (
  `username` varchar(15) NOT NULL,
  `cittaresidenza` varchar(30) DEFAULT NULL,
  `cognome` varchar(30) NOT NULL,
  `datanascita` date NOT NULL,
  `email` varchar(30) NOT NULL,
  `eta` int(11) NOT NULL,
  `indirizzo` varchar(30) DEFAULT NULL,
  `nome` varchar(30) NOT NULL,
  `numerotelefono` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `squadra_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `squadra_id` (`squadra_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`username`, `cittaresidenza`, `cognome`, `datanascita`, `email`, `eta`, `indirizzo`, `nome`, `numerotelefono`, `password`, `squadra_id`) VALUES
('AleCriscu', 'Cinisello Balsamo ', 'Criscuoli', '2000-12-27', 'alessandro.criscuoli@eng.it', 19, 'Via benagol 15', 'Alessandro', '1234567891', 'alessandro', NULL),
('Boselli00', 'Milano', 'Boselli', '2000-06-26', 'bosellichristian@gmail.com', 19, 'Via Scheiwiller 12', 'Christian', '3273168034', 'cippirimerlo', NULL),
('carletto', 'Milano', 'Pellegatti', '1950-04-11', 'pellegatti.carlo@gmail.com', 70, 'Via Milan 125', 'Carlo', '3273168037', 'sempremilan', NULL),
('Negri00', 'Lacchiarella', 'Negri', '2000-07-03', 'marco.negri@eng.it', 19, 'Via Turati 7', 'Marco', '3924074436', 'password', NULL),
('redmario', 'Roma', 'Rossi', '1986-12-25', 'mario.rossi@gmail.com', 33, 'Via Colosseo 18', 'Mario', '3314678912', 'ciaociao', NULL),
('tizicrudeli', 'Forli', 'Crudeli', '1943-06-24', 'crudeli.tiziano@gmail.com', 76, 'Via forzamilan 120', 'Tiziano', '3273168035', 'dimenticata', NULL),
('tramonto', 'Milano', 'Tramontana', '1979-03-25', 'tramontana.filippo@gmail.com', 41, 'Via internazionale 15', 'Filippo', '3273168036', 'interschifo', NULL),
('VanBasty', 'Amsterdam', 'Van Basten', '1964-12-10', 'marco.vanbasten@milan.it', 56, 'Via ajax 9', 'Marco', '1122334455', 'acmilan', NULL);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `partecipazioni`
--
ALTER TABLE `partecipazioni`
  ADD CONSTRAINT `FKo9usylma0ddp13w7h1gdwb1vp` FOREIGN KEY (`evento_id`) REFERENCES `evento` (`id`),
  ADD CONSTRAINT `partecipazioni_ibfk_1` FOREIGN KEY (`squadra_id`) REFERENCES `squadra` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Limiti per la tabella `prenota`
--
ALTER TABLE `prenota`
  ADD CONSTRAINT `FK113q1rhgw1hi8kf23ol3tu2do` FOREIGN KEY (`partecipante_username`) REFERENCES `utente` (`username`),
  ADD CONSTRAINT `prenota_ibfk_1` FOREIGN KEY (`nomecampo`) REFERENCES `campo` (`nome`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Limiti per la tabella `squadra`
--
ALTER TABLE `squadra`
  ADD CONSTRAINT `squadra_ibfk_1` FOREIGN KEY (`partecipante1`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `squadra_ibfk_2` FOREIGN KEY (`partecipante2`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `squadra_ibfk_3` FOREIGN KEY (`partecipante3`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `squadra_ibfk_4` FOREIGN KEY (`partecipante4`) REFERENCES `utente` (`username`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Limiti per la tabella `utente`
--
ALTER TABLE `utente`
  ADD CONSTRAINT `utente_ibfk_1` FOREIGN KEY (`squadra_id`) REFERENCES `squadra` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
