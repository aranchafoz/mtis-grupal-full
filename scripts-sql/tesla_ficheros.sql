-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2018 a las 14:24:27
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.1.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tesla_ficheros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `files`
--

CREATE TABLE `files` (
  `id` int(11) NOT NULL,
  `extension` varchar(20) COLLATE utf8_bin NOT NULL,
  `content` varchar(2500) COLLATE utf8_bin NOT NULL,
  `uploaded_at` date DEFAULT NULL,
  `user_id` int(10) UNSIGNED DEFAULT NULL,
  `destiny_id` int(10) UNSIGNED DEFAULT NULL,
  `sent` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `files`
--

INSERT INTO `files` (`id`, `extension`, `content`, `uploaded_at`, `user_id`, `destiny_id`, `sent`) VALUES
(1, 'txt', 'keasa', '2018-03-23', 1, NULL, 1),
(2, 'txt', 'fary', '2018-03-21', 1, NULL, 0),
(3, 'txt', 'fary', '2018-03-21', 1, NULL, 0),
(4, 'txt', 'fary', '2018-03-21', 1, NULL, 0),
(5, 'txt', 'fary', '2018-03-21', 1, NULL, 1),
(6, 'txt', 'sample', '2018-03-21', 1, NULL, 1),
(7, 'txt', 'sample', '2018-03-21', 1, NULL, 1),
(8, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(9, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(10, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(11, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(12, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(13, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(14, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(15, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(16, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(17, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(18, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(19, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(20, 'txt', 'elfary', '2018-02-01', 1, NULL, 1),
(21, 'txt', 'elfary', '2018-02-01', 1, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `workers`
--

CREATE TABLE `workers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `mail` varchar(255) COLLATE utf8_bin NOT NULL,
  `phone` varchar(50) COLLATE utf8_bin NOT NULL,
  `office_id` int(10) UNSIGNED DEFAULT NULL,
  `department_id` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `workers`
--

INSERT INTO `workers` (`id`, `name`, `mail`, `phone`, `office_id`, `department_id`) VALUES
(1, 'Javier Basilio Martínez', 'javierbasilio@tesla.com', '766958222', 1, 1),
(2, 'Iván Mora', 'ivanelmoro@tesla.com', '655994111', 1, 2),
(3, 'Jaime Sarrión Sahuquillo', 'joimer@tesla.com', '751939333', 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `files`
--
ALTER TABLE `files`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `workers`
--
ALTER TABLE `workers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `files`
--
ALTER TABLE `files`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `workers`
--
ALTER TABLE `workers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
