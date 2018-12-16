-- phpMyAdmin SQL Dump
-- version 4.7.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 19-05-2018 a las 13:59:22
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mtis_grupal_contratar_personal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `candidatos`
--

CREATE TABLE `candidatos` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `surnames` varchar(250) COLLATE utf8_bin NOT NULL,
  `birthdate` date NOT NULL,
  `location` varchar(400) COLLATE utf8_bin NOT NULL,
  `habilities` varchar(2500) COLLATE utf8_bin NOT NULL,
  `apliedJob` int(11) NOT NULL,
  `aplicationMark` int(11) NOT NULL,
  `aplicationComments` varchar(500) COLLATE utf8_bin NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `candidatos`
--

INSERT INTO `candidatos` (`id`, `name`, `surnames`, `birthdate`, `location`, `habilities`, `apliedJob`, `aplicationMark`, `aplicationComments`, `timestamp`) VALUES
(1, 'Joimer', 'Sarrión Sahuquillo', '2000-01-01', 'Barrio de Pobres, Alicante, Spain', '{\"ionic\":7,\"php\":6,\"js\":7}', 1, 5, 'We need an python developer, but it is fine a programmer', '2018-05-19 11:15:54');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ofertas`
--

CREATE TABLE `ofertas` (
  `id` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `category` varchar(100) COLLATE utf8_bin NOT NULL,
  `title` varchar(250) COLLATE utf8_bin NOT NULL,
  `description` varchar(500) COLLATE utf8_bin NOT NULL,
  `minimumRequirements` varchar(2500) COLLATE utf8_bin NOT NULL,
  `published` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `ofertas`
--

INSERT INTO `ofertas` (`id`, `timestamp`, `category`, `title`, `description`, `minimumRequirements`, `published`) VALUES
(1, '2018-05-18 12:12:31', 'PROGRAMMING', 'Senior Python Developer', 'We are looking for a python developer with 4 or more years of experience', '{\"python\":8,\"c\":7}', 1),
(5, '2018-05-18 12:24:54', 'PROGRAMMING', 'Senior Python Developer', 'We are looking for a python developer with 4 or more years of experience', '{\"python\":8,\"c\":7}', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitantes`
--

CREATE TABLE `solicitantes` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `surnames` varchar(250) COLLATE utf8_bin NOT NULL,
  `birthdate` date NOT NULL,
  `location` varchar(250) COLLATE utf8_bin NOT NULL,
  `habilities` varchar(2500) COLLATE utf8_bin NOT NULL,
  `apliedJob` int(11) NOT NULL,
  `via` varchar(250) COLLATE utf8_bin NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `solicitantes`
--

INSERT INTO `solicitantes` (`id`, `name`, `surnames`, `birthdate`, `location`, `habilities`, `apliedJob`, `via`, `timestamp`) VALUES
(4, 'Jaume', 'Moreno Cantó', '1995-04-16', 'Sella, Alicante, Spain', '{\"laravel\":10,\"php\":6,\"go\":7}', 1, 'linkedin', '2018-05-18 13:41:53'),
(5, 'Arancha', 'Ferrero Ortiz de Zárate', '1996-07-27', 'Guardamar del Segura, Alicante, Spain', '{\"react\":10,\"js\":6,\"go\":7}', 1, 'correo', '2018-05-18 13:41:54');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE `trabajadores` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `surnames` varchar(250) COLLATE utf8_bin NOT NULL,
  `birthdate` date NOT NULL,
  `location` varchar(400) COLLATE utf8_bin NOT NULL,
  `habilities` varchar(2500) COLLATE utf8_bin NOT NULL,
  `job` varchar(250) COLLATE utf8_bin NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`id`, `name`, `surnames`, `birthdate`, `location`, `habilities`, `job`, `timestamp`) VALUES
(1, 'Joimer', 'Sarrión Sahuquillo', '2000-01-01', 'Barrio de Pobres, Alicante, Spain', '{\"ionic\":7,\"php\":6,\"js\":7}', 'Python Developer', '2018-05-19 11:49:31');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ofertas`
--
ALTER TABLE `ofertas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `solicitantes`
--
ALTER TABLE `solicitantes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `ofertas`
--
ALTER TABLE `ofertas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `solicitantes`
--
ALTER TABLE `solicitantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
