-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bdmksmq6uktz66sykzpp-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 17, 2023 at 05:50 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdmksmq6uktz66sykzpp`
--
CREATE DATABASE IF NOT EXISTS `bdmksmq6uktz66sykzpp` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `bdmksmq6uktz66sykzpp`;

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `contraseña` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `apellido`, `contraseña`, `nombre`, `usuario`, `email`) VALUES
(4, 'Argento', '12345678', 'Pepe', 'Pepito', 'pepe123@gmail.com'),
(5, 'Santillan', 'Argentina_Programa', 'Miqueas', 'Mique04', 'miqueassantillan2704@gmail.com'),
(6, 'Programa', 'Arg12345Prog', 'Argentina', 'ArgProg_4', 'arg_prog@gmail.com'),
(202, NULL, NULL, NULL, NULL, NULL),
(203, NULL, NULL, NULL, NULL, NULL),
(204, NULL, NULL, NULL, NULL, NULL),
(252, NULL, NULL, NULL, NULL, NULL),
(302, 'Prog', '12345678', 'Arg', 'Arg_4', 'arg@gmail.com'),
(352, 'juarez', NULL, 'pepito', NULL, 'pep@gmail.com'),
(353, 'juarez', NULL, 'pepito', NULL, 'pep@gmail.com'),
(402, 'men', NULL, 'adolfo', NULL, 'men@gmail.com'),
(403, 'men', NULL, 'adolfo', NULL, 'men@gmail.com'),
(404, 'men', NULL, 'adolfo', NULL, 'men@gmail.com'),
(452, 'paredes', 'paredes123456', 'armando', NULL, 'armando@gmail.com'),
(453, 'paredes', 'paredes123456', 'armando', NULL, 'armando@gmail.com'),
(454, 'dea', 'hola1234567', 'ade', NULL, 'dea@gmail.com'),
(455, 'dea', 'hola1234567', 'ade', NULL, 'dea@gmail.com'),
(502, 'Sillas', 'sillas12345678', 'Armando', NULL, 'ar@gmail.com'),
(552, 'gonza', 'hola12345678', 'pepito', NULL, 'gonza@gmail.com'),
(602, 'to', 'hola12345678', 'pepi', NULL, 'pe@gmail.com'),
(652, 'campeon', 'hola12345678', 'argentina', NULL, 'arg@gmail.com'),
(653, 'campeon', 'hola12345678', 'argentina', NULL, 'arg@gmail.com'),
(654, 'campeon', 'hola12345678', 'argentina', NULL, 'miqueassantillan2704@gmail.com'),
(655, '', 'Argentina_Programa', '', NULL, 'miqueassantillan2704@gmail.com'),
(702, 'Messi', 'messi12345678', 'Lionel', 'Messi123', 'messi@gmail.com'),
(703, 'Messi', 'messi12345678', 'Lionel', 'Messi123', 'messi@gmail.com'),
(752, 'sa', 'Argentina_Programa', 'mi', NULL, 'miqueassantillan2704@gmail.com'),
(753, 'sa', 'Argentina_Programa', 'mi', NULL, 'miqueassantillan2704@gmail.com'),
(802, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan2704@gmail.com'),
(852, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan@gmail.com'),
(853, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan@gmail.com'),
(854, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan@gmail.com'),
(855, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan@gmail.com'),
(856, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan04@gmail.com'),
(857, 'Santillán', 'hola12345678', 'Miqueas', NULL, 'santillan04@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `persona_seq`
--

CREATE TABLE `persona_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona_seq`
--

INSERT INTO `persona_seq` (`next_val`) VALUES
(951),
(951),
(951),
(951),
(951),
(1),
(1),
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
