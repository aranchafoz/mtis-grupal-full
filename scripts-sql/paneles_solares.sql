-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2018 a las 13:19:37
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `paneles_solares`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

CREATE TABLE `materiales` (
  `id` int(11) NOT NULL,
  `nombre` varchar(300) NOT NULL,
  `cantidadDisponible` int(11) NOT NULL,
  `cantidadFabricacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materiales`
--

INSERT INTO `materiales` (`id`, `nombre`, `cantidadDisponible`, `cantidadFabricacion`) VALUES
(1, 'Metal', 1, 3),
(2, 'Cable', 121, 8),
(3, 'Celda solar', 150, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id` int(11) NOT NULL,
  `panelesEncargados` int(11) NOT NULL,
  `estado` varchar(500) NOT NULL,
  `cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id`, `panelesEncargados`, `estado`, `cliente`) VALUES
(1, 4, 'En construcción', 23),
(2, 5, 'Listo', 10),
(3, 45, 'En construcción', 105),
(4, 405, 'Listo', 105777),
(5, 7, 'Materiales insuficientes para construcción, esperando pedido a proveedores', 40000),
(6, 74, 'En construcción', 65),
(7, 400, 'Nuevo', 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos_materiales`
--

CREATE TABLE `pedidos_materiales` (
  `id` int(11) NOT NULL,
  `material` varchar(300) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos_materiales`
--

INSERT INTO `pedidos_materiales` (`id`, `material`, `cantidad`) VALUES
(5, 'Metal', 9),
(6, 'Metal', 9),
(7, 'Metal', 9),
(9, 'Metal', 9),
(10, 'Metal', 30),
(11, 'Cable', 80),
(12, 'Celda solar', 250),
(13, 'Metal', 50),
(14, 'Metal', 30),
(15, 'Celda solar', 250),
(16, 'Cable', 112),
(17, 'Metal', 70);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `materiales`
--
ALTER TABLE `materiales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedidos_materiales`
--
ALTER TABLE `pedidos_materiales`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `materiales`
--
ALTER TABLE `materiales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pedidos_materiales`
--
ALTER TABLE `pedidos_materiales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
