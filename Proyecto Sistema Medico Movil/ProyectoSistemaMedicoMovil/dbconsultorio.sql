-- phpMyAdmin SQL Dump
-- version 4.4.1.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-05-2015 a las 21:55:54
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dbconsultorio`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sprGetAllTMedicamento`()
begin
select * from TMedicamento;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sprGetAllTPaciente`()
begin
select * from TPaciente;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sprGetByNombre`(
inNombre varchar(700)
)
begin
select * from TMedicamento where Nombre=inNombre;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sprGetUsuarioContrasenia`(
inUsuario varchar(100),
inContrasenia varchar(100)
)
begin
select * from TUsuario where Usuario=inUsuario and Contrasenia=inContrasenia;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sprInsertTMedicamento`(
inUsuario char(8),
inNombre varchar(700),
inPrecioCompra decimal(10,2),
inPrecioVenta decimal(10,2),
inFechaVencimiento varchar(15),
inCantidad int
)
begin
declare varCodigo char(10);
declare varNroRegistros varchar(7);
set varNroRegistros=(select count(*) from TMedicamento)+1;
set varCodigo=concat("PRO",repeat('0',7-length(varNroRegistros)),varNroRegistros);
insert into TMedicamento values
(
varCodigo,
inUsuario,
inNombre,
inPrecioCompra,
inPrecioVenta,
inFechaVencimiento,
inCantidad
);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sprUpdateAllTMedicamento`(
inCodProducto char(10),
inUsuario char(8),
inNombre varchar(700),
inPrecioCompra decimal(10,2),
inPrecioVenta decimal(10,2),
inFechaVencimiento varchar(15),
inCantidad int
)
begin
update TMedicamento
set 
Usuario=inUsuario,
Nombre=inNombre,
PrecioCompra=inPrecioCompra,
PrecioVenta=inPrecioVenta,
FechaVencimiento=inFechaVencimiento,
Cantidad=inCantidad
where CodMedicamento=inCodMedicamento;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdomiciliopaciente`
--

CREATE TABLE IF NOT EXISTS `tdomiciliopaciente` (
  `paciente` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `calle` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `colonia` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `pais` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `codigopostal` varchar(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tmedicamento`
--

CREATE TABLE IF NOT EXISTS `tmedicamento` (
  `CodMedicamento` char(10) COLLATE utf8_spanish_ci NOT NULL,
  `Usuario` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Nombre` varchar(700) COLLATE utf8_spanish_ci DEFAULT NULL,
  `PrecioCompra` decimal(10,2) DEFAULT NULL,
  `PrecioVenta` decimal(10,2) DEFAULT NULL,
  `FechaVencimiento` datetime DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Medicamentos en el Stock del doctor';

--
-- Volcado de datos para la tabla `tmedicamento`
--

INSERT INTO `tmedicamento` (`CodMedicamento`, `Usuario`, `Nombre`, `PrecioCompra`, `PrecioVenta`, `FechaVencimiento`, `Cantidad`) VALUES
('PRO0000001', 'HOUSE28', 'COCA', '4.00', '3.00', '2015-12-12 00:00:00', 2),
('PRO0000002', 'HOUSE28', 'PARACETAMOL', '3.00', '5.00', '2016-02-28 00:00:00', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tpaciente`
--

CREATE TABLE IF NOT EXISTS `tpaciente` (
  `apellidopaterno` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `apellidomaterno` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `rfc` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `curp` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_de_nacimiento` date NOT NULL,
  `Edad` int(3) NOT NULL,
  `Estatura` float(10,2) NOT NULL,
  `Peso` float(10,2) NOT NULL,
  `Sexo` char(2) COLLATE utf8_spanish_ci NOT NULL,
  `ocupacion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `estadocivil` char(3) COLLATE utf8_spanish_ci NOT NULL,
  `telefonoparticular` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_oficina` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `celular` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Tabla de datos personales del paciente';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproducto`
--

CREATE TABLE IF NOT EXISTS `tproducto` (
  `CodProducto` char(10) NOT NULL DEFAULT '',
  `Usuario` varchar(100) DEFAULT NULL,
  `Nombre` varchar(700) DEFAULT NULL,
  `PrecioCompra` decimal(10,2) DEFAULT NULL,
  `PrecioVenta` decimal(10,2) DEFAULT NULL,
  `FechaVencimiento` datetime DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tusuario`
--

CREATE TABLE IF NOT EXISTS `tusuario` (
  `Usuario` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Contrasenia` varchar(700) COLLATE utf8_spanish_ci NOT NULL,
  `Nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoPaterno` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoMaterno` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `FechaNacimiento` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Tabla de Inicio de Sesion';

--
-- Volcado de datos para la tabla `tusuario`
--

INSERT INTO `tusuario` (`Usuario`, `Contrasenia`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `FechaNacimiento`) VALUES
('HOUSE28', 'SARCASMO', 'Bernard', 'House', 'Herrera', '1995-01-28 01:00:00'),
('KAAF', '030191', 'Kevin Arnold', 'Arias', 'Figueroa', '1991-01-03 00:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tproducto`
--
ALTER TABLE `tproducto`
  ADD PRIMARY KEY (`CodProducto`),
  ADD KEY `Usuario` (`Usuario`);

--
-- Indices de la tabla `tusuario`
--
ALTER TABLE `tusuario`
  ADD PRIMARY KEY (`Usuario`) USING BTREE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
