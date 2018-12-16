-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2018 a las 18:27:53
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proceso_qa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultadoinforme`
--

CREATE TABLE `resultadoinforme` (
  `idInforme` int(11) NOT NULL,
  `prioridad` varchar(100) NOT NULL,
  `error` tinyint(1) NOT NULL,
  `descripcionError` varchar(500) NOT NULL,
  `departamento` varchar(100) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `resultadoinforme`
--

INSERT INTO `resultadoinforme` (`idInforme`, `prioridad`, `error`, `descripcionError`, `departamento`, `categoria`, `fecha`) VALUES
(15, 'prioridad', 0, '', 'Ventas', 'Calidad del software', '2018-05-20 15:11:26'),
(15, 'prioridad', 1, 'El test no se ha completado satisfactoriamentes', 'Ventas', 'Calidad del software', '2018-05-20 15:12:52'),
(15, 'prioridad', 0, '', 'Ventas', 'Calidad del software', '2018-05-20 15:13:26'),
(15, 'prioridad', 1, 'El test no se ha completado satisfactoriamentes', 'Ventas', 'Calidad del software', '2018-05-20 15:17:14'),
(15, 'prioridad', 0, '', 'Ventas', 'Calidad del software', '2018-05-20 15:17:28');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultadotests`
--

CREATE TABLE `resultadotests` (
  `id` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `porcentajeCompletado` int(11) NOT NULL,
  `completado` tinyint(1) NOT NULL,
  `error` tinyint(1) NOT NULL,
  `descripcionError` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `resultadotests`
--

INSERT INTO `resultadotests` (`id`, `fecha`, `porcentajeCompletado`, `completado`, `error`, `descripcionError`) VALUES
(1, '2018-05-20 15:11:25', 92, 1, 0, ''),
(2, '2018-05-20 15:12:52', 22, 0, 1, 'El test no se ha completado satisfactoriamentes'),
(3, '2018-05-20 15:13:26', 64, 1, 0, ''),
(4, '2018-05-20 15:17:14', 56, 0, 1, 'El test no se ha completado satisfactoriamentes'),
(5, '2018-05-20 15:17:28', 61, 1, 0, '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `resultadotests`
--
ALTER TABLE `resultadotests`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `resultadotests`
--
ALTER TABLE `resultadotests`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
