-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 07-Nov-2022 às 20:13
-- Versão do servidor: 5.6.13
-- versão do PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `bd_barbearia`
--
CREATE DATABASE IF NOT EXISTS `bd_barbearia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bd_barbearia`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda`
--

CREATE TABLE IF NOT EXISTS `agenda` (
  `Cod_Agendam` int(2) NOT NULL AUTO_INCREMENT,
  `Cod_Func` int(2) NOT NULL,
  `Dta_Agendam` varchar(15) NOT NULL,
  `Cod_Cli` int(11) NOT NULL,
  `Hora_Agendam` varchar(15) NOT NULL,
  `Cod_Usuario` int(2) NOT NULL,
  PRIMARY KEY (`Cod_Agendam`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `agenda`
--

INSERT INTO `agenda` (`Cod_Agendam`, `Cod_Func`, `Dta_Agendam`, `Cod_Cli`, `Hora_Agendam`, `Cod_Usuario`) VALUES
(1, 1, '10/12/2022', 2, '3:00 PM', 1),
(2, 1, '5/01/2022', 2, '9:00 AM', 1),
(3, 1, '03/20/2022', 3, '10:00 AM', 3),
(4, 4, '11/21/2021', 4, '5:00 PM', 4),
(5, 6, '01/31/2022', 1, '1:00 PM', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `Cod_Cli` int(2) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `RG` varchar(20) NOT NULL,
  `Cod_TelefoneCli` int(2) NOT NULL,
  `DataNasc` varchar(20) NOT NULL,
  PRIMARY KEY (`Cod_Cli`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`Cod_Cli`, `Nome`, `CPF`, `RG`, `Cod_TelefoneCli`, `DataNasc`) VALUES
(1, 'Lívia Márcia Raquel Santos', '103.687.989-50', '43.465.623-9', 1, '6/22/1905'),
(2, 'Nina Malu das Neves', '930.185.178-49', '40.897.420-5', 2, '2/8/1904'),
(3, 'Leonardo Lucas Luiz Ferreira', '586.797.563-00', '11.392.315-6', 3, '9/26/1902'),
(4, 'Amanda Débora Rosângela Almada', '309.522.859-75', '28.704.301-0', 4, '7/31/1909'),
(5, 'César Daniel Enzo Dias', '706.079.096-92', '49.671.362-0', 5, '6/22/1905');

-- --------------------------------------------------------

--
-- Estrutura da tabela `servicos`
--

CREATE TABLE IF NOT EXISTS `servicos` (
  `Cod_Servico` int(2) NOT NULL AUTO_INCREMENT,
  `Cod_TipoServico` int(2) NOT NULL,
  `Cod_Agendam` int(2) NOT NULL,
  `Nome_Servico` varchar(100) NOT NULL,
  PRIMARY KEY (`Cod_Servico`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `servicos`
--

INSERT INTO `servicos` (`Cod_Servico`, `Cod_TipoServico`, `Cod_Agendam`, `Nome_Servico`) VALUES
(1, 1, 2, 'Corte de Cabelo'),
(2, 2, 3, 'Sombrancelha'),
(3, 3, 4, 'Barba'),
(4, 4, 5, 'Pintura de Cabelo'),
(5, 5, 6, 'Corte de Cabelo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_servico`
--

CREATE TABLE IF NOT EXISTS `tipo_servico` (
  `Cod_TipoServico` int(11) NOT NULL AUTO_INCREMENT,
  `Descricao_Tipo` varchar(100) NOT NULL,
  PRIMARY KEY (`Cod_TipoServico`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `tipo_servico`
--

INSERT INTO `tipo_servico` (`Cod_TipoServico`, `Descricao_Tipo`) VALUES
(1, 'Corte de Cabelo Cacheado'),
(2, 'Sombrancelha'),
(3, 'Barba'),
(4, 'Pintura de cabelo'),
(5, 'Corte de cabelo Liso');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `Cod_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(150) NOT NULL,
  PRIMARY KEY (`Cod_Usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`login`, `senha`, `Cod_Usuario`, `nome`, `email`) VALUES
('A', '123', 1, '', ''),
('ab', '123', 3, '', ''),
('B', '456', 4, '', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
