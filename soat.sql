-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2022 a las 05:09:25
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `soat`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `identificacion` bigint(20) NOT NULL,
  `nombres` varchar(70) COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `placa` varchar(10) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `id` bigint(10) NOT NULL,
  `identificacion` bigint(20) NOT NULL,
  `nombres` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `placa` varchar(10) COLLATE utf8mb4_bin NOT NULL,
  `tipo` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `clase` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `idclase` int(2) NOT NULL,
  `marca` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `modelo` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `linea` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `cilindraje` int(10) NOT NULL,
  `color` varchar(15) COLLATE utf8mb4_bin NOT NULL,
  `noserie` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `nomotor` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `nochasis` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `nonewsoat` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL,
  `fcomsoat` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL,
  `fvennusoat` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL,
  `valnewsoat` varchar(30) COLLATE utf8mb4_bin DEFAULT '0.0',
  `ocupantes` int(5) NOT NULL,
  `toneladas` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `id` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
