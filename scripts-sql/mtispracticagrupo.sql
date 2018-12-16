-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2018 a las 23:03:14
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mtispracticagrupo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `granizo`
--

CREATE TABLE `granizo` (
  `id` int(11) NOT NULL,
  `hora` int(11) NOT NULL,
  `probabilidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=swe7;

--
-- Volcado de datos para la tabla `granizo`
--

INSERT INTO `granizo` (`id`, `hora`, `probabilidad`) VALUES
(1, 9, 'baja'),
(2, 10, 'baja'),
(3, 11, 'media'),
(4, 12, 'alta'),
(5, 13, 'media'),
(6, 14, 'baja');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `intensidadsolar`
--

CREATE TABLE `intensidadsolar` (
  `id` int(11) NOT NULL,
  `hora` int(11) NOT NULL,
  `intensidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=swe7;

--
-- Volcado de datos para la tabla `intensidadsolar`
--

INSERT INTO `intensidadsolar` (`id`, `hora`, `intensidad`) VALUES
(1, 9, 'baja'),
(2, 10, 'media'),
(3, 11, 'media'),
(4, 12, 'alta'),
(5, 13, 'alta'),
(6, 14, 'alta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `posicionpanel`
--

CREATE TABLE `posicionpanel` (
  `id` int(11) NOT NULL,
  `grados` int(11) NOT NULL,
  `rotacion` int(11) NOT NULL,
  `defensa` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=swe7;

--
-- Volcado de datos para la tabla `posicionpanel`
--

INSERT INTO `posicionpanel` (`id`, `grados`, `rotacion`, `defensa`) VALUES
(1, 0, 20, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `posicionsolar`
--

CREATE TABLE `posicionsolar` (
  `id` int(11) NOT NULL,
  `hora` int(11) NOT NULL,
  `grados` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=swe7;

--
-- Volcado de datos para la tabla `posicionsolar`
--

INSERT INTO `posicionsolar` (`id`, `hora`, `grados`) VALUES
(1, 9, 20),
(2, 10, 30),
(3, 11, 50),
(4, 12, 65),
(5, 13, 90),
(6, 14, 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temperatura`
--

CREATE TABLE `temperatura` (
  `id` int(11) NOT NULL,
  `hora` int(11) NOT NULL,
  `temperatura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=swe7;

--
-- Volcado de datos para la tabla `temperatura`
--

INSERT INTO `temperatura` (`id`, `hora`, `temperatura`) VALUES
(1, 9, 18),
(2, 10, 20),
(3, 11, 21),
(4, 12, 24),
(5, 13, 24),
(6, 14, 25);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `granizo`
--
ALTER TABLE `granizo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `intensidadsolar`
--
ALTER TABLE `intensidadsolar`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `posicionpanel`
--
ALTER TABLE `posicionpanel`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `posicionsolar`
--
ALTER TABLE `posicionsolar`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `temperatura`
--
ALTER TABLE `temperatura`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `granizo`
--
ALTER TABLE `granizo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `intensidadsolar`
--
ALTER TABLE `intensidadsolar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `posicionpanel`
--
ALTER TABLE `posicionpanel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `posicionsolar`
--
ALTER TABLE `posicionsolar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `temperatura`
--
ALTER TABLE `temperatura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
