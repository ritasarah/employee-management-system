-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2015 at 03:43 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `employee_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_bulanan`
--

CREATE TABLE IF NOT EXISTS `data_bulanan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nip_pegawai` int(11) NOT NULL,
  `bulan` varchar(15) NOT NULL,
  `presensi` int(11) NOT NULL,
  `absensi` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nip_pegawai` (`nip_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_pegawai`
--

CREATE TABLE IF NOT EXISTS `jadwal_pegawai` (
  `nip_pegawai` int(11) NOT NULL,
  `id_shift` int(11) NOT NULL,
  `minggu_ke` int(11) NOT NULL,
  KEY `id_shift` (`id_shift`),
  KEY `nip_pegawai` (`nip_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE IF NOT EXISTS `karyawan` (
  `nip` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=36 ;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`nip`) VALUES
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),
(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),
(31),
(32),
(33),
(34),
(35);

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
  `nip` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE IF NOT EXISTS `pegawai` (
  `nip` int(11) NOT NULL AUTO_INCREMENT,
  `no_hp` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `id_rate_gaji` int(11) NOT NULL,
  PRIMARY KEY (`nip`),
  KEY `id_rate_gaji` (`id_rate_gaji`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=36 ;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`nip`, `no_hp`, `nama`, `alamat`, `id_rate_gaji`) VALUES
(11, 899, 'AAA', 'Skagen 21', 21),
(12, 899, 'BBB', 'Bandung', 22),
(13, 899, 'CCC', 'Jakarta', 23),
(14, 899, 'DDD', 'Surabaya', 24),
(15, 899, 'EEE', 'Coblong', 25),
(16, 899, 'FFF', 'Dago', 26),
(17, 899, 'GGG', 'Jl Riau', 27),
(18, 899, 'HHH', 'Jl Merdeka', 28),
(19, 899, 'III', 'Tubagus Ismail', 29),
(20, 899, 'JJJ', 'Kanayakan', 30),
(21, 899, 'KKK', 'Skagen 21', 21),
(22, 899, 'LLL', 'Bandung', 22),
(23, 899, 'MMM', 'Jakarta', 23),
(24, 899, 'NNN', 'Surabaya', 24),
(25, 899, 'OOO', 'Coblong', 25),
(26, 899, 'PPP', 'Dago', 26),
(27, 899, 'QQQ', 'Jl Riau', 27),
(28, 899, 'RRR', 'Jl Merdeka', 28),
(29, 899, 'TTT', 'Tubagus Ismail', 29),
(30, 899, 'UUU', 'Kanayakan', 30),
(31, 899, 'VVV', 'Dago', 26),
(32, 899, 'XXX', 'Jl Riau', 27),
(33, 899, 'YYY', 'Jl Merdeka', 28),
(34, 899, 'ZZZ', 'Tubagus Ismail', 29),
(35, 899, 'WWW', 'Kanayakan', 30);

-- --------------------------------------------------------

--
-- Table structure for table `rate_gaji`
--

CREATE TABLE IF NOT EXISTS `rate_gaji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(10) NOT NULL,
  `nominal` int(11) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Dumping data for table `rate_gaji`
--

INSERT INTO `rate_gaji` (`id`, `status`, `nominal`, `pekerjaan`) VALUES
(21, 'trainee', 200, 'cuci'),
(22, 'trainee', 200, 'masak'),
(23, 'trainee', 200, 'bartender'),
(24, 'trainee', 200, 'hall'),
(25, 'trainee', 200, 'kasir'),
(26, 'fulltime', 400, 'cuci'),
(27, 'fulltime', 400, 'masak'),
(28, 'fulltime', 400, 'bartender'),
(29, 'fulltime', 400, 'hall'),
(30, 'fulltime', 400, 'kasir');

-- --------------------------------------------------------

--
-- Table structure for table `shift_available_pegawai`
--

CREATE TABLE IF NOT EXISTS `shift_available_pegawai` (
  `nip_pegawai` int(11) NOT NULL,
  `id_shift` int(11) NOT NULL,
  KEY `nip_pegawai` (`nip_pegawai`),
  KEY `id_shift` (`id_shift`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shift_available_pegawai`
--

INSERT INTO `shift_available_pegawai` (`nip_pegawai`, `id_shift`) VALUES
(16, 9),
(33, 13),
(13, 7),
(28, 4),
(11, 11),
(32, 7),
(11, 5),
(22, 5),
(28, 2),
(11, 7),
(25, 10),
(12, 7),
(14, 13),
(18, 13),
(31, 13),
(27, 12),
(18, 13),
(24, 7),
(22, 1),
(16, 7),
(30, 10),
(35, 7),
(34, 2),
(14, 9),
(33, 8),
(29, 10),
(25, 5),
(32, 6),
(30, 1),
(28, 4),
(24, 5),
(35, 11),
(22, 11),
(20, 9),
(29, 7),
(30, 4),
(30, 8),
(34, 9),
(21, 3),
(35, 13),
(15, 4),
(18, 1),
(22, 10),
(25, 9),
(27, 10),
(22, 3),
(23, 5),
(15, 13),
(34, 13),
(31, 4),
(12, 1),
(11, 13),
(25, 10),
(27, 5),
(21, 11),
(12, 9),
(35, 5),
(24, 7),
(17, 3),
(21, 7),
(11, 10),
(24, 3),
(26, 8),
(22, 5),
(23, 4),
(11, 11),
(35, 1),
(17, 14),
(19, 6),
(20, 2),
(33, 11),
(28, 10),
(34, 9),
(24, 13),
(29, 2),
(14, 2),
(35, 10),
(12, 1),
(24, 4),
(14, 1),
(35, 7),
(18, 7),
(11, 2),
(14, 9),
(11, 5),
(11, 9),
(30, 7),
(15, 10),
(26, 5),
(34, 12),
(22, 5),
(21, 12),
(25, 4),
(33, 11),
(19, 12),
(24, 6),
(19, 12),
(33, 12),
(21, 9),
(31, 5),
(23, 2),
(22, 1),
(25, 7),
(13, 5),
(16, 5),
(15, 10),
(34, 10),
(27, 7),
(19, 8),
(18, 3),
(24, 7),
(17, 1),
(12, 9),
(34, 8),
(11, 8),
(28, 2),
(29, 8),
(17, 6),
(24, 1),
(29, 9),
(17, 12),
(20, 2),
(17, 4),
(33, 5),
(27, 13);

-- --------------------------------------------------------

--
-- Table structure for table `shift_kerja`
--

CREATE TABLE IF NOT EXISTS `shift_kerja` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hari` varchar(10) NOT NULL,
  `jam` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `shift_kerja`
--

INSERT INTO `shift_kerja` (`id`, `hari`, `jam`) VALUES
(1, 'senin', 'pagi'),
(2, 'senin', 'malam'),
(3, 'selasa', 'pagi'),
(4, 'selasa', 'malam'),
(5, 'rabu', 'pagi'),
(6, 'rabu', 'malam'),
(7, 'kamis', 'pagi'),
(8, 'kamis', 'malam'),
(9, 'jumat', 'pagi'),
(10, 'jumat', 'malam'),
(11, 'sabtu', 'pagi'),
(12, 'sabtu', 'malam'),
(13, 'minggu', 'pagi'),
(14, 'minggu', 'malam');

-- --------------------------------------------------------

--
-- Table structure for table `system_setting`
--

CREATE TABLE IF NOT EXISTS `system_setting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `min_cuci` int(11) NOT NULL,
  `min_masak` int(11) NOT NULL,
  `min_kasir` int(11) NOT NULL,
  `min_bartender` int(11) NOT NULL,
  `min_hall` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `system_setting`
--

INSERT INTO `system_setting` (`id`, `min_cuci`, `min_masak`, `min_kasir`, `min_bartender`, `min_hall`) VALUES
(1, 2, 2, 2, 2, 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_bulanan`
--
ALTER TABLE `data_bulanan`
  ADD CONSTRAINT `data_bulanan_ibfk_1` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`);

--
-- Constraints for table `jadwal_pegawai`
--
ALTER TABLE `jadwal_pegawai`
  ADD CONSTRAINT `jadwal_pegawai_ibfk_1` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`),
  ADD CONSTRAINT `jadwal_pegawai_ibfk_2` FOREIGN KEY (`id_shift`) REFERENCES `shift_kerja` (`id`),
  ADD CONSTRAINT `jadwal_pegawai_ibfk_3` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`);

--
-- Constraints for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD CONSTRAINT `karyawan_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `pegawai` (`nip`);

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `pegawai` (`nip`);

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`id_rate_gaji`) REFERENCES `rate_gaji` (`id`);

--
-- Constraints for table `shift_available_pegawai`
--
ALTER TABLE `shift_available_pegawai`
  ADD CONSTRAINT `shift_available_pegawai_ibfk_1` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`),
  ADD CONSTRAINT `shift_available_pegawai_ibfk_2` FOREIGN KEY (`id_shift`) REFERENCES `shift_kerja` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
